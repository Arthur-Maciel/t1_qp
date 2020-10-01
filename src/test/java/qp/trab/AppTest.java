package qp.trab;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testCalculaCommisaoWithSuccess(){
        assertEquals(App.calculaComissao(100), 15, 0);
        assertEquals(App.calculaComissao(50), 7.5, 0);
        assertEquals(App.calculaComissao(33), 4.95, 0);
        assertEquals(App.calculaComissao(70), 10.5, 0);
    }

    @Test(expected = AssertionError.class)
    public void testCalculaCommisaoWithoutSuccess(){
        assertEquals(App.calculaComissao(100), 20, 0);
        assertEquals(App.calculaComissao(50), 8, 0);
        assertEquals(App.calculaComissao(33), 4.956, 0);
        assertEquals(App.calculaComissao(70), 10.4, 0);
    }

    @Test
    public void testCalculaSalarioFinalWithSuccess(){
        assertEquals(App.calculaSalarioFinal(2300, 100), 2315.0, 0);
        assertEquals(App.calculaSalarioFinal(1000, 50), 1007.5, 0);
        assertEquals(App.calculaSalarioFinal(5000, 33), 5004.95, 0);
        assertEquals(App.calculaSalarioFinal(1950, 70), 1960.5, 0);
    }

    @Test(expected = AssertionError.class)
    public void testCalculaSalarioFinalWithoutSuccess(){
        assertEquals(App.calculaSalarioFinal(2300, 70), 2315.0, 0);
        assertEquals(App.calculaSalarioFinal(1000, 33), 1007.5, 0);
        assertEquals(App.calculaSalarioFinal(5000, 50), 5004.95, 0);
        assertEquals(App.calculaSalarioFinal(1950, 100), 1960.5, 0);
    }

}