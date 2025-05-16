package ussd.model;

public class ServiceYas {
    public void serviceYasMenu(){
        System.out.println("\n--- Service YAS  ---");
        System.out.println("1. Info credit");
        System.out.println("2. Recharge");
        System.out.println("3. Gerer Friends and Family");
        System.out.println("4. Envoyer Credit/Offre/Mega");
        System.out.println("5. Ajouter des jours de validite");
        System.out.println("6. Acheter une offre");
        System.out.println("7. Mon numero");
        System.out.println("0. Page suivante");
        System.out.print("Choisissez une option : ");
    }
    public void serviceYasNextMenu(){
        System.out.println("8. Changement de Langue");
        System.out.println("9. Recuperer mon Numero");
        System.out.println("00. Page précédente");
        System.out.print("Choisissez une option : ");
    }
}
