package ussd.service;

import ussd.model.InvalidChoice;
import ussd.model.RapelleMoi;

import java.util.Scanner;

public class RappelleMoiService {
    private final Scanner scanner = new Scanner(System.in);
    private final InvalidChoice invalidChoice = new InvalidChoice();
    private final RapelleMoi rapelleMoi = new RapelleMoi();

    public void displayMenuRappelleMoi() {
        while (true) {
            rapelleMoi.rappelleMoiMenu();
            String input = scanner.nextLine();

            switch (input) {
                case "1" -> System.out.println("Fonctionnalité : Envoyer un rappelle moi...");
                case "2" -> System.out.println("Aide sur le service Rappelle moi...");
                default -> invalidChoice.invalidChoice();
            }
        }
    }
}
