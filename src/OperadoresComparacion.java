public class OperadoresComparacion {
    public static void main(String[] args) {
        System.out.println("Operadores de comparacion");
        int a = 3, b = 3;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //operador de igualdad ==
        var resultado = (a == b);
        System.out.println("resultado == = " + resultado);
        // operador de distinto
        resultado = a != b;
        System.out.println("resultado != = " + resultado);
        // operador de mayor
        resultado = a>b;
        System.out.println("resultado > = " + resultado);
        // operador de mayor o igual
        resultado = a>=b;
        System.out.println("resultado >= = " + resultado);
        // operador de menor
        resultado = a<b;
        System.out.println("resultado < = " + resultado);
        // operador de menor o igual
        resultado = a<=b;
        System.out.println("resultado <= = " + resultado);
    }
}
