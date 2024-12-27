public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("Operadores Unarios");
        int a = 4,  b = 2, resultado;
        //operadores de incremento
        resultado = ++a;
        System.out.println("incrementada = " + a);
        //post incremento
        a = 4;
        resultado = a++; //se incrementa cuando se llama otra vez
        System.out.println("a = " + a);

        //pre decremento
        System.out.println("pre decremento");
        b = -2;
        resultado = --b;
        System.out.println("b = " + resultado);

        //post decremento
        System.out.println("post decremento");
        b = -2;
        resultado = b--;
        System.out.println("resultado = " + resultado);
        System.out.println("b = " + b);

    }
}
