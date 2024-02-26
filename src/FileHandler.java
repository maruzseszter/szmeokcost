/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refakotárlás: Szőllősi-Maruzs Eszter, 2024-02-26
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandler {

    public void writeCostsToFile(Cost cost) {
        try {
            FileWriter fileWriter = new FileWriter("adat.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.printf("%.2f:%.2f:%.2f%n", cost.shipping, cost.store, cost.repair);
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
