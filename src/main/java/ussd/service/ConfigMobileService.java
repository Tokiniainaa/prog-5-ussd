package ussd.service;

import ussd.model.ConfigMobile;

import java.util.Scanner;

public class ConfigMobileService {
    private final Scanner scanner = new Scanner(System.in);
    private final ConfigMobile configMobile = new ConfigMobile();

    public void displayConfigMobile(){
        while (true) {
            configMobile.showConfigMobile();
            String input = scanner.nextLine();
            if (input.equals("1")) {
                System.out.println("1 (Des-) Activer INTERNET sur compte principal");
            } else {
                displayConfigMobile();
            }
        }
    }
}
