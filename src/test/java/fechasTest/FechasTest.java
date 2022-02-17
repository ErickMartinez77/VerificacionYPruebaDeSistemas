package fechasTest;

import ejemplo1.Nota;
import ejercicio1Fechas.DateUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FechasTest {
    @ParameterizedTest
    @CsvSource({
            "5,febrero,2012, 6 febrero 2012",
            "1,eneroo,2013, mes incorrecto"
    })
    public void verifyDate(int day, String month, int year, String expectedResult){
        DateUtils dateUtils = new DateUtils();
        String actualResult = dateUtils.obtenerFecha(day, month, year);
        Assertions.assertEquals(expectedResult,actualResult,"ERROR el mensaje es incorrecto");
    }
}
