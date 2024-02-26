/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refakotárlás: Szőllősi-Maruzs Eszter, 2024-02-26
 */

public class Cost {
    Double shipping;
    Double store;
    Double repair;

    public Cost(String shipping, String store, String repair) {
        this.shipping = Double.parseDouble(shipping);
        this.store = Double.parseDouble(store);
        this.repair = Double.parseDouble(repair);
    }
}
