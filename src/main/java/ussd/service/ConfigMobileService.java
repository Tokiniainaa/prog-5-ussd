package ussd.service;

import ussd.model.ConfigMobile;
import ussd.model.InvalidChoice;
import ussd.model.MonIdentite;

import java.util.Scanner;

public class ConfigMobileService {
    private final Scanner scanner = new Scanner(System.in);
    private final ConfigMobile configMobile = new ConfigMobile();

    public void displayConfigMobile(){
        while (true) {
            configMobile.showConfigMobile();
            String input = scanner.nextLine();
            switch (input) {
                case "1" -> System.out.println("1 (Des-) Activer INTERNET sur compte principal");
                default -> displayConfigMobile();
            }
        }
    }
}
