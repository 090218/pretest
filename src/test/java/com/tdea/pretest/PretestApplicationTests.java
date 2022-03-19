package com.tdea.pretest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PretestApplicationTests {

    @Test
    void contextLoads() {

        String dbpasword;
        String pasword;
        dbpasword = "fer";
        pasword = "fer2";


        boolean result = UserUtils.isPasswordEqual(dbpasword, pasword);

        assertFalse(result);


    }
    @Test
    void contextLoads2() {

        String dbpasword;
        String pasword;
        dbpasword = "fer";
        pasword = "fer";


        boolean result = UserUtils.isPasswordEqual(dbpasword, pasword);

        assertTrue(result);


    }

}
