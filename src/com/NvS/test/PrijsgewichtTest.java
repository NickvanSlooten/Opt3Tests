package com.NvS.test;

import com.NvS.Prijsgewicht;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrijsgewichtTest {

    //Test: if correct price is returned
    // gewicht < 1000 = 100,  1000 < gewicht > 5000 = 500, gewicht > 5000 = 2500
    @Test
    void PrijsGewichtTest() {

        Assertions.assertEquals(100, new Prijsgewicht(999).GetPrijs());
        assertEquals(500, new Prijsgewicht(1000).GetPrijs());
        assertEquals(500, new Prijsgewicht(1001).GetPrijs());
        assertEquals(500, new Prijsgewicht(4999).GetPrijs());
        assertEquals(500, new Prijsgewicht(5000).GetPrijs());
        assertEquals(2500, new Prijsgewicht(5001).GetPrijs());

    }
}