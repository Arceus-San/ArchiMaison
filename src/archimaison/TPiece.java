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
public class TPiece extends Thread {
    
    private String nom;
    private int num;
    private JPiece p;
    
    public TPiece(String n, int i){
        nom=n;
        num=i;
    }
    
    public void run(){
        synchronized(p){
            JPiece piece = new JPiece(this.num,this.nom,this.nom);
            p=piece;
        }
    }
}
