package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateAmount() {
        CashbackHackService amount = new CashbackHackService();
        int purchase = 1500;
        int expected = 500;
        int actual = amount.remain(purchase);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldNotCalculateAmountWhen1000() {
        CashbackHackService amount = new CashbackHackService();
        int purchase = 1000;
        int expected = 0;
        int actual = amount.remain(purchase);
        assertEquals(actual, expected);


    }
}