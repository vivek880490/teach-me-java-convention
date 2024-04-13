package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PowerFinderTest {

    @Test
    public void PowerOfNumberRaisedToOne(){

        Powerfinder PowerFinderObject = new Powerfinder();
        PowerFinderObject.setFindPower(2,1);
        assertEquals(2, PowerFinderObject.getFindPower());
    }


    @Test
    public void PowerOfNumberRaisedToZero(){

        Powerfinder PowerFinderObject = new Powerfinder();
        PowerFinderObject.setFindPower(2,0);
        assertEquals(1, PowerFinderObject.getFindPower());
    }

    @Test
    public void PowerOfTwoRaisedToThree(){

        Powerfinder PowerFinderObject = new Powerfinder();
        PowerFinderObject.setFindPower(2,3);
        assertEquals(8, PowerFinderObject.getFindPower());
    }

    @Test
    public void PowerOfFiveRaisedToFour(){

        Powerfinder PowerFinderObject = new Powerfinder();
        PowerFinderObject.setFindPower(5,4);
        assertEquals(625, PowerFinderObject.getFindPower());
    }

}