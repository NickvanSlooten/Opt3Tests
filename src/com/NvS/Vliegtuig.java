package com.NvS;

public class Vliegtuig {

    public static double MaximaalGewicht;
    private Boolean Toestemmingtoren;
    private int Snelheid;


    public Vliegtuig (Boolean Toestemmingtoren,double MaximaalGewicht, int Snelheid) {
        this.MaximaalGewicht = MaximaalGewicht;
        this.Snelheid = Snelheid;
        this.Toestemmingtoren = Toestemmingtoren;
    }

    public boolean CheckVliegtuigMagVliegen(Boolean Toestemmingtoren,double Gewicht, double Snelheid) {

        return Toestemmingtoren && Gewicht <= 1000 ^ Snelheid >= 50;

    }


}