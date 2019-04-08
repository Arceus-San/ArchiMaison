package archimaison;


import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ngarric
 */
public class JPiece extends JFrame {

    private JLabel jEtat;
    private JLabel jOccupee;

    public JPiece(int num, String nom, String lieu) {
        super(nom);
        //fermeture avec croix rouge
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        // creation des composants
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        jEtat = new JLabel("");
        add(jEtat);
        jOccupee = new JLabel("Inoccupée");
        add(jOccupee);
        getContentPane().setBackground(Color.red);

        pack();
        setSize(160, 60);

        setLocation(100 + 170 * num, 200);
        setVisible(true);
    }

    public void setOccupee(String occupant) {
        if (occupant != "") {
            jOccupee.setText("Occupée par : " + occupant);
        } else {
            jOccupee.setText("Inoccupée");
        }
    }


    public void electrifier() {
        getContentPane().setBackground(Color.orange);
    }

    public void platrer() {
        getContentPane().setBackground(Color.green);
    }

}
