package ussd.service;

import ussd.model.InvalidChoice;
import ussd.model.ServiceYas;

import java.util.Scanner;

public class ServiceYasService {
    private final Scanner scanner = new Scanner(System.in);
    private final InvalidChoice invalidChoice = new InvalidChoice();
    private final ServiceYas serviceYas = new ServiceYas();
    public void showMenuServiceYas () {
        int page = 1;
        while (true) {
            if (page == 1) {
                serviceYas.serviceYasMenu();
            } else if (page == 2) {
                serviceYas.serviceYasNextMenu();
            }
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("1. Info credit");
                    break;
                case "2":
                    System.out.println("2. Recharge");
                    break;
                case "3":
                    System.out.println("3. Gerer Friends and Family");
                    break;
                case "4":
                    System.out.println("4. Envoyer Credit/Offre/Mega");
                    break;
                case "5":
                    System.out.println("5. Ajouter des jours de validite");
                    break;
                case "6":
                    System.out.println("6. Acheter une offre");
                    break;
                case "7":
                    System.out.println("7. Mon numero");
                    break;
                case "8":
                    if (page == 2) System.out.println("8. Changement de Langue");
                    else System.out.println("Option invalide sur cette page.");
                    break;
                case "9":
                    if (page == 2) System.out.println("9. Recuperer mon Numero");
                    else System.out.println("Option invalide sur cette page.");
                    break;
                case "0":
                    page=2;
                    break;
                case "00":
                    showMenuServiceYas();
                    break;

                default:
                    invalidChoice.invalidChoice();
            }
        }

    }
}
