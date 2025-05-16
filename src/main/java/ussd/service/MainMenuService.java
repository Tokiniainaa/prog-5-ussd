package ussd.service;

import ussd.model.InvalidChoice;
import ussd.model.MainMenu;

import java.util.Scanner;

public class MainMenuService {
    private final MainMenu mainMenu = new MainMenu();
    private  final Scanner scanner = new Scanner(System.in);
    private final InvalidChoice invalidChoice = new InvalidChoice();
    private final MvolaService mvolaService = new MvolaService();
    private final  RappelleMoiService rappelleMoiService = new RappelleMoiService();


    public void showMenuYasEtMvola () {
        int page = 1;
        while (true) {
            if (page == 1) {
                mainMenu.menuFirstPage();
            } else if (page == 2) {
                mainMenu.nextPage();
            }
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    mvolaService.displayMenuMvola(1);
                    break;
                case "2":
                    rappelleMoiService.displayMenuRappelleMoi();
                    break;
                case "3":
                    System.out.println("Service SOS Crédit...");
                    break;
                case "4":
                    System.out.println("Accès aux services YAS...");
                    break;
                case "5":
                    System.out.println("Promotions actuelles...");
                    break;
                case "6":
                    System.out.println("Produits et divertissement...");
                    break;
                case "7":
                    System.out.println("Banques et Micro-Finances...");
                    break;
                case "8":
                    if (page == 2) System.out.println("Mon identité...");
                    else System.out.println("Option invalide sur cette page.");
                    break;
                case "9":
                    if (page == 2) System.out.println("Configurer mon mobile...");
                    else System.out.println("Option invalide sur cette page.");
                    break;
                case "0":
                    page=2;
                    break;
                case "00":
                    showMenuYasEtMvola();
                    break;

                default:
                    invalidChoice.invalidChoice();
            }
        }

    }

}
