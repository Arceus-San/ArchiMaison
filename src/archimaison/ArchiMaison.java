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
public class ArchiMaison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        travailler();
        System.out.println("Tous les ouvriers ont terminé");
    }
    
    public static void ouvriers(){
        JElectricien elec1 = new JElectricien(1,"Pascal","");
        JElectricien elec2 = new JElectricien(2,"Emile","");
        JElectricien elec3 = new JElectricien(3,"Euegene","");
        JElectricien elec4 = new JElectricien(4,"Etienne","");
        
        JPlatrier plat1 = new JPlatrier(5,"Paul","");
        JPlatrier plat2 = new JPlatrier(6,"Pierre",""); 
    }
    
    public static void travailler() throws InterruptedException{
        JPiece p1 = new JPiece(1,"Cuisine","Cuisine");
        JPiece p2 = new JPiece(5,"Salle de bain","Salle de bain");
        JElectricien elec1 = new JElectricien(1,"Pascal","Cuisine");
        Th1 t1 = new Th1(elec1,p1);
        JPlatrier plat1 = new JPlatrier(5,"Paul","Salle de bain");
        Th1 t2 = new Th1(plat1,p2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
    
    
    
}
