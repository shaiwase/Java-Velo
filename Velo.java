import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de début de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        
        if ((debut > 24 || debut < 0) || (fin > 24 || fin < 0) ) {
            System.out.println("Les heures doivent être comprises entre 0 et 24 !"); }
           
           if (fin == debut){
           System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");}
           
           if ( debut > fin ) {
           System.out.println("Bizarre, le début de la location est après la fin ...");}
           
           
           int debutHeurePleine = 7;
           int finHeurePleine = 17;
           int prixBas = 1;
           int prixHaut = 2;
           int totalHeurePleine = 0;
           int totalHeureCreuse=0;
           
                     
           
           for (int heure = debut; heure < fin; heure++) {
        	              
                if (debut >= debutHeurePleine &&  fin < finHeurePleine) {
            	
            	totalHeurePleine++;
                } else {
                	
                	totalHeureCreuse++;   
                	 
                }
           }
                
           if (totalHeurePleine !=0) {
                int payTotal1 = prixHaut * totalHeurePleine;
                
            	System.out.println("Vous avez loué votre vélo pendant");
            	System.out.println(totalHeurePleine + " " + "heure(s)" + "au tarif horaire de" + " " + prixHaut +".0" + " " + "francs");
                System.out.print("Le montant total à payer est de " + payTotal1 + ".0");
                System.out.println(" francs.");
           
           } else {
                
               	int payTotal2 = prixBas * totalHeureCreuse;
              
               	System.out.println("Vous avez loué votre vélo pendant");
               	System.out.println(totalHeureCreuse + " " + "heure(s)" + "au tarif horaire de" + " "  + prixBas + ".0" + " " +"francs");
                System.out.print("Le montant total à payer est de " + payTotal2 + ".0");
                System.out.println(" francs.");
           }
            
        
           
           
 
      
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}