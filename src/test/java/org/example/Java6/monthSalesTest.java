package org.example.Java6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class monthSalesTest {
    @Test

    public void minSalesMonth () {
        monthSales service = new monthSales();

        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void summarySalesAllMonth () {
        monthSales service = new monthSales();

        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.summarySales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void salesMonthMiddle () {
        monthSales service = new monthSales();

        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.monthSalesMiddle(sales);

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void maxSaleMonth () {
        monthSales service = new monthSales();

        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.maxMonthSale(sales);

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void monthSaleHigherMiddle () {
        monthSales service = new monthSales();

        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.monthHigherMiddle(sales);

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void monthSaleUnderMiddle () {
        monthSales service = new monthSales();

        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthUnderMiddle(sales);

        Assertions.assertEquals(expected, actual);
    }
}
