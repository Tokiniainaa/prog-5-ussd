package ussd.model;

public class MainMenu {
    public void menuFirstPage(){
        System.out.println("\n--- YAS et Mvola  ---");
        System.out.println("1. Mvola");
        System.out.println("2. Rappelle moi");
        System.out.println("3. Sos Credit");
        System.out.println("4. Service YAS");
        System.out.println("5. Promotion");
        System.out.println("6. Produits et Divertissement");
        System.out.println("7. Banques et Micro-Finances");
        System.out.println("0. Page suivante");
        System.out.print("Choisissez une option : ");
    }
    public void nextPage(){
        System.out.println("8. Mon identite");
        System.out.println("9. Configurer mon mobile");
        System.out.println("00. Page précédente");
        System.out.print("Choisissez une option : ");
    }

}
