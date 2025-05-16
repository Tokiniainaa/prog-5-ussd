package ussd.model;

public class Mvola {
    public void showMvolaFirstMenu(){
        System.out.println("MVOLA");
        System.out.println("1 Acheter Crédit ou Offre Yas");
        System.out.println("2 Transférer argent (vers toute destination)");
        System.out.println("3 MVola Crédit ou Épargne");
        System.out.println("4 Retrait d'argent");
        System.out.println("# Page suivante");
        System.out.print("Choisissez une option : ");
    }
    public void showMvolaNextMenu(){
        System.out.println("MVOLA");
        System.out.println("5 Paiement Factures & Partenaires");
        System.out.println("6 Mon compte");
        System.out.println("7 Recevoir de l'argent");
        System.out.println("8 Banques et Micro-Finances");
        System.out.println("* Page précédente");
        System.out.println("** Menu Principal");
        System.out.print("Choisissez une option : ");
    }
}
