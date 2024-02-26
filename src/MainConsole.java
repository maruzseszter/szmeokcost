/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refakotárlás: Szőllősi-Maruzs Eszter, 2024-02-26
 */

import java.util.Scanner;

public class MainConsole {
    String shipping;
    String store;
    String repair;
    Scanner scanner;

    public MainConsole() {
        drawHeader();
        scanner = new Scanner(System.in);
        startInput();
        handleCosts(new Cost(shipping, store, repair));
    }

    private void drawHeader() {
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.printf("║%17s%25s\n", "Projekt költsége", "║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

    private void startInput() {
        shipping = input("Szállítási költség: ");
        store = input("Üzleti költség: ");
        repair = input("Javítási költség: ");
    }

    private String input(String msg) {
        System.out.println("──────────────────────────────────────────");
        System.out.print(msg);
        return scanner.nextLine();
    }

    private void handleCosts(Cost cost) {
        FileHandler fileHandler = new FileHandler();
        fileHandler.writeCostsToFile(cost);
        scanner.close();
    }
    
}
