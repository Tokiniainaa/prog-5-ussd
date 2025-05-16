package ussd.service;

import ussd.model.InvalidChoice;
import ussd.model.Promotion;

import java.util.Scanner;

public class PromotionService {
    private final Scanner scanner = new Scanner(System.in);
    private final InvalidChoice invalidChoice = new InvalidChoice();
    private final Promotion promotion = new Promotion();
    public void displayMenuPromotion(){
        while (true) {
            promotion.showPromotionMenu();
            String input = scanner.nextLine();
            switch (input) {
                case "1" -> System.out.println("Mvola");
                case "2" -> System.out.println("MORA (VOIX-SMS-INTERNET)");
                case "3" -> System.out.println("FIRST(VOIX-SMS-INTERNET)");
                case "4" -> System.out.println("YELLOW (SMS-INTERNET)");
                case "5" -> System.out.println("YAS Net (INTERNET)");
                case "6" -> System.out.println("ROAMING (DATA - SMS)");
                default -> invalidChoice.invalidChoice();
            }
        }
    }
}
