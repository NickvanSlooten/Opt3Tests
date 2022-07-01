package com.NvS.test;



import com.NvS.Vliegtuig;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VliegtuigTest {


        //Test: Check of vliegtuig mag gaan vliegen
    @Test
    void CheckVliegtuig() {
        Vliegtuig cessnaVliegtuig = new Vliegtuig(true,1000,50);


        assertFalse(cessnaVliegtuig.CheckVliegtuigMagVliegen(false,1100,40));
        assertFalse(cessnaVliegtuig.CheckVliegtuigMagVliegen(true,1500,40));
        assertTrue(cessnaVliegtuig.CheckVliegtuigMagVliegen(true,900,40));
        assertTrue(cessnaVliegtuig.CheckVliegtuigMagVliegen(true,1100,50));
    }
}