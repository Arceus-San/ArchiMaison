/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archimaison;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedago
 */
public class Th1 extends Thread {
    
    private JElectricien elec;
    private JPlatrier plat;
    private String type;
    private JPiece piece;
    
    public Th1(JElectricien e, JPiece pie){
        this.elec=e;
        this.piece=pie;
        this.type="elec";
        this.piece.setOccupee(this.elec.getName());
        this.piece.electrifier();
    }
    
    public Th1(JPlatrier p, JPiece pie){
        this.plat=p;
        this.piece=pie;
        this.type="plat";
        this.piece.setOccupee(this.plat.getName());
        this.piece.platrer();
    }
    
    public void run(){
        
        if(this.type.equals("elec")){        
            
            int prog=0;
            
            for(int i=0;i<11;i++){
                try {
                    this.elec.setProgression(prog);
                    Thread.sleep(500);
                    prog=prog+10;
                } catch (InterruptedException ex) {
                    Logger.getLogger(Th1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            this.elec.setLieu("");
            this.piece.setOccupee("");
            
        }else{
            
            int prog=0;
            
                for(int i=0;i<10;i++){
                    try {
                        this.plat.setProgression(prog);
                        Thread.sleep(1000);
                        prog=prog+10;
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Th1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            this.plat.setLieu("");
            this.piece.setOccupee("");
        }
        
    }
    
    
}
