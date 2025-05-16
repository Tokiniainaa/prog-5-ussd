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
            mvola.showMvolaFirstMenu();
        } else if (page == 2) {
            mvola.showMvolaNextMenu();
        }
        handleChoice(scanner.nextLine(), page);
    }

    private void handleChoice(String input, int currentPage) {
        switch (input) {
            case "1" -> {
                if (currentPage == 1)  {System.out.println(" Acheter Crédit ou Offre Yas");
                displayMenuMvola(1);}
                else {displayMenuMvola(2);}
            }
            case "2" -> {
                if (currentPage == 1) {System.out.println(" Transférer argent");
                displayMenuMvola(1);}
                else {displayMenuMvola(2);}
            }
            case "3" -> {
                if (currentPage == 1) {System.out.println(" MVola Crédit ou Épargne");
                displayMenuMvola(1);}
                else {displayMenuMvola(2);}
            }
            case "4" -> {
                if (currentPage == 1) { System.out.println(" Retrait d'argent");
                    displayMenuMvola(1);
                } else {displayMenuMvola(2);}
            }
            case "#" -> displayMenuMvola(2);
            case "5" -> {
                if (currentPage == 2) {System.out.println("Paiement Factures & Partenaires");
                displayMenuMvola(2);}
                else {displayMenuMvola(1);}
            }
            case "6" -> {
                if (currentPage == 2){System.out.println(" Mon compte");
                displayMenuMvola(2);}
                else {displayMenuMvola(1);}
            }
            case "7" -> {
                if (currentPage == 2) {System.out.println(" Recevoir de l'argent");
                displayMenuMvola(2);}
                else {displayMenuMvola(1);}
            }
            case "8" -> {
                if (currentPage == 2){System.out.println(" Banques et Micro-Finances");
                displayMenuMvola(2);}
                else {displayMenuMvola(1);}
            }
            case "*" -> {
                if (currentPage == 2) displayMenuMvola(1);
                else {displayMenuMvola(2);}
            }
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
