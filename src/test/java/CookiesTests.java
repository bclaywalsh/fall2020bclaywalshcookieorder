import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CookiesTests {
    @Test
    public void shouldReturnTotalBoxes1(){
        MasterOrder underTest = new MasterOrder();
        CookieOrder cookieOrderTest = new CookieOrder("",1);
        underTest.addOrder(cookieOrderTest);
        int check = underTest.getTotalBoxes();

        assertEquals(1,check);
    }

    @Test
    public void shouldReturnTotalBoxes2(){
        MasterOrder underTest = new MasterOrder();
        CookieOrder cookieOrderTest = new CookieOrder("",2);

        underTest.addOrder(cookieOrderTest);
        int check = underTest.getTotalBoxes();

        assertEquals(2,check);
    }

    @Test
    public void shouldReturnTotalBoxesAs1AfterRemoval(){
        MasterOrder underTest = new MasterOrder();
        CookieOrder cookieOrderTest = new CookieOrder("somoas",1);
        CookieOrder cookieOrderTest2 = new CookieOrder("thin mints",1);
        underTest.addOrder(cookieOrderTest);
        underTest.addOrder(cookieOrderTest2);

        underTest.removeVariety("somoas");
        int check = underTest.getTotalBoxes();

        assertEquals(1,check);

    }

    @Test
    public void shouldReturnTotalBoxesAs1WithSameVariety(){
        MasterOrder underTest = new MasterOrder();
        CookieOrder cookieOrderTest = new CookieOrder("somoas",1);
        CookieOrder cookieOrderTest2 = new CookieOrder("thin mints",1);
        CookieOrder cookieOrderTest3 = new CookieOrder("thin mints",1);
        underTest.addOrder(cookieOrderTest);
        underTest.addOrder(cookieOrderTest2);
        underTest.addOrder(cookieOrderTest3);

        underTest.removeVariety("thin mints");
        int check = underTest.getTotalBoxes();

        assertEquals(1,check);
    }
    @Test
    public void shouldReturnTotalOf2ForThinMints(){
        MasterOrder underTest = new MasterOrder();
        CookieOrder cookieOrderTest = new CookieOrder("somoas",1);
        CookieOrder cookieOrderTest2 = new CookieOrder("thin mints",1);
        CookieOrder cookieOrderTest3 = new CookieOrder("thin mints",1);
        underTest.addOrder(cookieOrderTest);
        underTest.addOrder(cookieOrderTest2);
        underTest.addOrder(cookieOrderTest3);

        int check = underTest.getVarietyBoxes("thin mints");

        assertEquals(2,check);
    }

    @Test
    public void shouldReturnTotalOf3ForThinMints(){
        MasterOrder underTest = new MasterOrder();
        CookieOrder cookieOrderTest = new CookieOrder("somoas",1);
        CookieOrder cookieOrderTest2 = new CookieOrder("thin mints",2);
        CookieOrder cookieOrderTest3 = new CookieOrder("thin mints",1);
        underTest.addOrder(cookieOrderTest);
        underTest.addOrder(cookieOrderTest2);
        underTest.addOrder(cookieOrderTest3);

        int check = underTest.getVarietyBoxes("thin mints");

        assertEquals(3,check);
    }






}
