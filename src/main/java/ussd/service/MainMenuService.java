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
    private final SosCreditService sosCreditService = new SosCreditService();
    private final ServiceYasService serviceYasService = new ServiceYasService();
    private final PromotionService promotionService = new PromotionService();
    private final MonIdentiteService monIdentiteService = new MonIdentiteService();


    public void showMenuYasEtMvola () {
        int page = 1;
        while (true) {
            if (page == 1) {
                mainMenu.menuFirstPage();
            } else if (page == 2) {
                mainMenu.nextPage();
            }
            String choice = TimeOutInput.getUserInputWithTimeout(20);
            if (choice == null) {
                System.exit(0);
            }

            switch (choice) {
                case "1" -> {
                    if (page == 1) mvolaService.displayMenuMvola(1);
                }
                case "2" -> {
                    if (page == 1) rappelleMoiService.displayMenuRappelleMoi();
                }
                case "3" -> {
                    if (page == 1) sosCreditService.displayMenuSosCredit();
                }
                case "4" -> {
                    if (page == 1) serviceYasService.showMenuServiceYas();
                }
                case "5" -> {
                    if (page == 1) promotionService.displayMenuPromotion();
                }
                case "6" -> {
                    if (page == 1) System.out.println("Produits et divertissement...");
                }
                case "7" -> {
                    if (page == 1) System.out.println("Banques et Micro-Finances...");
                }
                case "8" -> {
                    if (page == 2) monIdentiteService.displayMonIdentite();
                    else System.out.println("Option invalide sur cette page.");
                }
                case "9" -> {
                    if (page == 2) System.out.println("Configurer mon mobile...");
                    else System.out.println("Option invalide sur cette page.");
                }
                case "0" -> page = 2;
                case "00" -> showMenuYasEtMvola();
                default -> invalidChoice.invalidChoice();
            }
        }

    }

}
