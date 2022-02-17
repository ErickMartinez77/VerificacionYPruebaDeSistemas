package ejemploMock;

public class CalculadoraMock {
    MultiplicarServicio multiplicarServicio;
    //Paso 1 Crear constructor parametrizado
    public CalculadoraMock(MultiplicarServicio multiplicarServicio){
        this.multiplicarServicio = multiplicarServicio;
    }

    public int getFactorial(int number){
        int fact=1;
        for (int i=0; i<=number; i++){
            fact=multiplicarServicio.multi(fact,i);
        }
        return fact;
    }
}
