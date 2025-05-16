package ussd.service;

import ussd.model.InvalidChoice;
import ussd.model.MonIdentite;

import java.util.Scanner;

public class MonIdentiteService {
    private final Scanner scanner = new Scanner(System.in);
    private final MonIdentite monIdentite = new MonIdentite();
    private final InvalidChoice invalidChoice= new InvalidChoice();

    public void displayMonIdentite(){
        while (true) {
            monIdentite.showMonIdentiteMenu();
            String input = scanner.nextLine();

            switch (input) {
                case "1" -> {
                    System.out.println("Votre compte est identifie et certifie Mvola mais enrollement biometrique en cours");
                }
                default -> displayMonIdentite();
            }
        }
    }
}
