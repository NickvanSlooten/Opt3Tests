package com.NvS;

public class TotalePrijs {

    private static boolean BagageAfhandelen =false;
    private static boolean NederlandsVliegtuig = false;


    public TotalePrijs ( boolean BagageAfhandelen, boolean NederlandsVliegtuig, double BasisPrijs) {
        this.BagageAfhandelen = BagageAfhandelen;
        this.NederlandsVliegtuig = NederlandsVliegtuig;

    }
    public static double getTotaalPrijs (int BasisPrijs,int passagier, boolean Afhandelen, boolean NLVliegtuig) {

        double prijs = BasisPrijs;

        if (passagier > 2) {
            prijs = prijs * 1.5;
        }
        if (Afhandelen) {
            prijs = prijs + 800;
        }
        if (NLVliegtuig) {
            prijs = prijs * 1.21;
        }
        return prijs;
    }
}