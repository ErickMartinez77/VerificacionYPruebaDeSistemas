package fechasTest;

import ejercicio1Fechas.DateUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FechasTest {
    @ParameterizedTest
    @CsvSource({
            "31,junio,2020, 1 julio 2020",
            "5,febrero,2012, 6 febrero 2012",
            "0,septiembre,2011, dia incorrecto",
            "1,eneroo,2013, mes incorrecto",
            "5,octubre,3001, gestion incorrecta",
            "0,octubreeeee,2020, ingresar nuevos datos"
    })
    public void verifyDate(int day, String month, int year, String expectedResult){
        DateUtils dateUtils = new DateUtils();
        String actualResult = dateUtils.obtenerFecha(day, month, year);
        Assertions.assertEquals(expectedResult,actualResult,"ERROR el mensaje es incorrecto");
    }
}
