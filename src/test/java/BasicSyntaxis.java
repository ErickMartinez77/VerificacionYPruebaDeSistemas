import org.junit.jupiter.api.*;

public class BasicSyntaxis {
    @BeforeAll
    public static void beforeClass(){
        System.out.println("INICIO>>> Esto se ejecuta 1 vez");
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("FINAL>>> Esto se ejecuta 1 vez");
    }

    @BeforeEach
    public void setup(){
        System.out.println("BEFORE> Esto se ejecuta antes de CADA test");
    }

    @AfterEach
    public void cleanup(){
        System.out.println("AFTER> Esto se ejecuta despues de CADA test");
    }

    @Test
    public void verifyThing(){
        System.out.println("Pruebita 1");
    }

    @Test
    public void verifyThing2(){
        System.out.println("Pruebita 2");
    }
}
