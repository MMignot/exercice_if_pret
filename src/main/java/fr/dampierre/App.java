package fr.dampierre;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        // Définir le salaire minimum demandé et le minimum d'années requises
        int salaireAnnuelDemandé = 30000;
        int minimumAnnée = 2;
        Scanner clavier = new Scanner(System.in);

        // Demander le salaire annuel et le nombre d'années travaillés
        System.out.print("Entrez votre salaire annuel : ");

        int salaire = clavier.nextInt();
        
        System.out.print("Entrez le nombre d'années travaillées : ");

        int annéesTravaillées = clavier.nextInt();

        // Comparer les données renseignées avec les données requises
        if (salaire >= salaireAnnuelDemandé && annéesTravaillées >= minimumAnnée) {
            System.out.println("Vous pouvez obtenir un prêt");
        } else {
            System.out.println("Vous ne pouvez pas obtenir de prêt");
        }
    }
    
}
