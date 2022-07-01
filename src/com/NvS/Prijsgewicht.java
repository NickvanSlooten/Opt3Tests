package com.NvS;


public class Prijsgewicht {

    private static double Gewicht;

    public Prijsgewicht(double Gewicht) {
        this.Gewicht = Gewicht;
    }

    public static int GetPrijs() {

        if (Gewicht < 1000) {
            return 100;
        } else if (Gewicht >= 1000 && Gewicht <= 5000) {
            return 500;
        } else {
            return 2500;
        }
    }
}