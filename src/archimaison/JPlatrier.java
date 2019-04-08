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
public class JPlatrier extends JFrame {

    private JLabel jLieu;
    private JLabel jNom;
    private JLabel jProgression;

    public JPlatrier(int num, String nom, String lieu) {
        super("Platrier");
        //fermeture avec croix rouge
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        // creation des composants
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        jNom = new JLabel("Nom = " + nom);
        add(jNom);
        jLieu = new JLabel(lieu);
        add(jLieu);
        if (lieu != "") {
            jProgression = new JLabel("0%");
            getContentPane().setBackground(Color.red);
        } else {
            jProgression = new JLabel("");
            getContentPane().setBackground(Color.green);
        }
        add(jProgression);
        pack();
        setSize(160, 100);
        setLocation(100 + 170 * num, 100);

        setVisible(true);
    }

    public void setLieu(String lieu) {
        jLieu.setText(lieu);
        if (lieu!=""){
            jProgression.setText("0%");            
            getContentPane().setBackground(Color.red);
        }
        else{
            getContentPane().setBackground(Color.green);
            jProgression.setText("");            

        }
    }

    public void setProgression(int progression) {
        jProgression.setText("" + (progression) + "%");
    }
}
