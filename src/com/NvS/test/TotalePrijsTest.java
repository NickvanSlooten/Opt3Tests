package com.NvS.test;

import com.NvS.TotalePrijs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TotalePrijsTest {


    //Pairwise Testing
    //
    @Test
    void getPrijsMetAfhandelen() {


        Assertions.assertEquals(900, TotalePrijs.getTotaalPrijs(100,1,true,false));
        Assertions.assertEquals(181.5, TotalePrijs.getTotaalPrijs(100,3,false,true));
        Assertions.assertEquals(605, TotalePrijs.getTotaalPrijs(500,1,false,true));
        Assertions.assertEquals(1550, TotalePrijs.getTotaalPrijs(500,3,true,false));
        Assertions.assertEquals(3993, TotalePrijs.getTotaalPrijs(2500,1,true,true));
        Assertions.assertEquals(3750, TotalePrijs.getTotaalPrijs(2500,3,false,false));

    }

}