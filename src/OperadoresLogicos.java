public class OperadoresLogicos {
    public static void main(String[] args) {
        System.out.println("Operadores logicos");
        // ! , || , &&
        boolean a = true, b = true;
        //operador and &&
        System.out.println("operador and");
        var resultado = a && b;
        System.out.println("resultado = " + resultado);
        System.out.println("operador or");
        var resultado2 = a || b;
        System.out.println("resultado2 = " + resultado2);
        System.out.println("operador Not");
        var resultado3 = !a;
        System.out.println("resultado3 = " + resultado3);

    }
}
