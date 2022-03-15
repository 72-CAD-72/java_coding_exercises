package com.techreturners.exercise003;

import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;

public class Exercise003Test {

    private Exercise003 ex003;

    @Before
    public void setup() {
        ex003 = new Exercise003();
    }

    /*
            I added 2 tests as per 'Extension', all other functionality was covered by the other tests.
            Although the exercise didn't mention it, I thought it would be useful enough to return a -1
            should key not be found, and produce 2 tests for that.
     */
    @Test
    public void checkGetIceCreamCodeForBlank() {
        String iceCreamFlavour = "";
        int expected = -1;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    @Test
    public void checkGetIceCreamCodeForMisSpell() {
        String iceCreamFlavour = "Christian";
        int expected = -1;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    @Test
    public void checkGetIceCreamCodeForMintChocolateChip() {
        String iceCreamFlavour = "Mint Chocolate Chip";
        int expected = 3;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }


    @Test
    public void checkGetIceCreamCodeForMangoSorbet() {
        String iceCreamFlavour = "Mango Sorbet";
        int expected = 5;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }


    @Test
    public void checkGetIceCreamCodeForRaspberryRipple() {
        String iceCreamFlavour = "Raspberry Ripple";
        int expected = 1;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }


    @Test
    public void checkPickMultipleIceCreamFlavours() {

        String[] expected = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };

        assertEquals(expected, ex003.iceCreamFlavours());
    }


}
