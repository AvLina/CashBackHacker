package service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackerTest {

    CashBackHacker service = new CashBackHacker();

    @Test
    public void shouldBelowLimit() {

        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @Test
    public void Limit() {

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAboveLimit() {

        int amount = 1600;
        int actual = service.remain(amount);
        int expected = 400;

        assertEquals(actual, expected);
    }
}