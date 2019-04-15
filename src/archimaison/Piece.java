/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archimaison;

/**
 *
 * @author pedago
 */
public class Piece {
    
    private JPiece frame;
    private Boolean electrifiee=false;
    private Boolean platree=false;
    private Boolean occupee=false;
    private String nom;
    
    
    public Piece(String s, int i){
        this.frame=new JPiece(i,s,s);
        this.nom=s;
    }
    
    public void electrifier(){
        this.frame.electrifier();
        this.electrifiee=true;
    }
    
    public void platrer(){
        this.frame.platrer();
        this.platree=true;
    }
    
    public void occupee(String s){
        if (s != "") {
            this.frame.setOccupee(s);
            this.occupee=true;
        } else {
            this.frame.setOccupee(s);
            this.occupee=false;
        }
    }
    
    public JPiece getFrame(){
        return this.frame;
    }
    
    public Boolean getOccupee(){
        return this.occupee;
    }
    
    public Boolean getPlat(){
        return this.platree;
    }
    
    public Boolean getElec(){
        return this.electrifiee;
    }
    
    public String getNom(){
        return this.nom;
    }
}
