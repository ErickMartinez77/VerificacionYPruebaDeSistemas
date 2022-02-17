package mockTest;

import ejemploMock.CalculadoraMock;
import ejemploMock.MultiplicarServicio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CalculadoraMockTest {
    //PASO 2
    MultiplicarServicio servicioMock = Mockito.mock(MultiplicarServicio.class);

    @Test
    public void verifyFactorial(){
        //PASO 3
        Mockito.when(servicioMock.multi(1,1)).thenReturn(1);
        Mockito.when(servicioMock.multi(1,2)).thenReturn(2);
        Mockito.when(servicioMock.multi(2,3)).thenReturn(6);
        Mockito.when(servicioMock.multi(6,4)).thenReturn(24);

        //PASO 4 ENVIAR el objeto mockeado en el constructor
        CalculadoraMock calculadoraMock = new CalculadoraMock(servicioMock);
        int expectedResult=24;
        int actualResult=calculadoraMock.getFactorial(4);
        Assertions.assertEquals(expectedResult,actualResult,"El factorial es incorrecto");

        //verificacion mocks
    }
}
