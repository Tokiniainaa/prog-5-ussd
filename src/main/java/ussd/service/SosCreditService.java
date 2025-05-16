package ussd.service;

import ussd.model.InvalidChoice;
import ussd.model.SosCredit;

import java.util.Scanner;

public class SosCreditService {
    private  final Scanner scanner = new Scanner(System.in);
    private final InvalidChoice invalidChoice = new InvalidChoice();
    private final SosCredit sosCredit = new SosCredit();
    public void displayMenuSosCredit(){
        while (true) {
            sosCredit.sosCreditMenu();
            String input = scanner.nextLine();

            switch (input) {
                case "1" -> System.out.println("SOS credit a un ami");
                case "2" -> System.out.println("Aide sur le service Rappelle moi...");
                case "3" -> System.out.println("Aide sur le service Rappelle moi...");
                case "4" -> System.out.println("Aide sur le service Rappelle moi...");
                case "5" -> System.out.println("Aide sur le service Rappelle moi...");
                default -> invalidChoice.invalidChoice();
            }
        }
    }
}
