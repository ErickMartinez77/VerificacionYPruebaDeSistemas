package basicCalculator;

public class Calculadora {
    public int suma(int a, int b){ return a+b; }

    public int resta(int a, int b){ return a-b; }

    public int multi(int a, int b){ return a*b; }

    public int division(int a, int b){
        if (b==0){
            throw new ArithmeticException("El segundo valor no puede ser cero");
        }
        return a/b;
    }
}
