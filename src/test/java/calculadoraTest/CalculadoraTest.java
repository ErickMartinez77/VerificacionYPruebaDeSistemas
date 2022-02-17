package calculadoraTest;

import basicCalculator.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class CalculadoraTest {
    @Test
    public void sumarTest(){
        Calculadora calculadora = new Calculadora();
        int expectedResult=15;
        int actualResult=calculadora.suma(7,8);;
        //tiene que existir verificacion
        Assertions.assertEquals(expectedResult, actualResult,"ERROR! la suma es incorrecta");
    }

    @Test
    @Disabled
    public void restarTest(){
        Calculadora calculadora = new Calculadora();
        int expectedResult=0;
        int actualResult=calculadora.resta(2,2);
        //tiene que existir verificacion
        Assertions.assertEquals(expectedResult, actualResult,"ERROR! la suma es incorrecta");
    }

    @Test
    @Timeout(value = 2) //segundos por defecto
    public void multiplicarTest(){
        Calculadora calculadora = new Calculadora();
        int expectedResult=6;
        int actualResult=calculadora.multi(3,2);
        //tiene que existir verificacion
        Assertions.assertEquals(expectedResult, actualResult,"ERROR! la multiplicacion es incorrecta");
    }

    @Test
    public void dividirTest(){
        Calculadora calculadora = new Calculadora();
        //int expectedResult=4;
        //int actualResult=calculadora.division(8,0);
        //tiene que existir verificacion
        Assertions.assertThrows(ArithmeticException.class, ()-> {calculadora.division(8,0);});
    }
}
