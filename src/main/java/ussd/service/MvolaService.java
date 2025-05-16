package ussd.service;

import ussd.model.InvalidChoice;
import ussd.model.Mvola;

import java.util.Scanner;

public class MvolaService {
    private  final Scanner scanner = new Scanner(System.in);
    private final InvalidChoice invalidChoice = new InvalidChoice();
    private final Mvola mvola=new Mvola();

    public void displayMenuMvola(int page) {
        if (page == 1) {
            mvola.mvolaFirstMenu();
        } else if (page == 2) {
            mvola.mvolaNextMenu();
        }
        handleChoice(scanner.nextLine(), page);
    }

    private void handleChoice(String input, int currentPage) {
        switch (input) {
            case "1" -> System.out.println("Vous avez choisi : Acheter Crédit ou Offre Yas");
            case "2" -> System.out.println("Vous avez choisi : Transférer argent");
            case "3" -> System.out.println("Vous avez choisi : MVola Crédit ou Épargne");
            case "4" -> System.out.println("Vous avez choisi : Retrait d'argent");
            case "#" -> displayMenuMvola(2);
            case "5" -> System.out.println("Vous avez choisi : Paiement Factures & Partenaires");
            case "6" -> System.out.println("Vous avez choisi : Mon compte");
            case "7" -> System.out.println("Vous avez choisi : Recevoir de l'argent");
            case "8" -> System.out.println("Vous avez choisi : Banques et Micro-Finances");
            case "*" -> displayMenuMvola(1);
            case "**" -> {
                if (currentPage == 2) {
                    new MainMenuService().showMenuYasEtMvola();
                } else {
                    displayMenuMvola(currentPage);
                }
            }
            default -> {
                invalidChoice.invalidChoice();
                displayMenuMvola(currentPage);
            }
        }
    }
}
