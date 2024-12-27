public class OperadoresDeAsignacion {
    public static void main(String[] args) {
        System.out.println("Operadores de asignacion");
        // asignacion simple
        var miNumero = 10;
        int miNumero2;
        miNumero2 = 15;
        //System.out.println("miNumero2 = " + miNumero2);

        //operadores de asignacion compuesto
        // +=
        miNumero +=5; // minumero = minumero + 5;
        System.out.println("miNumero = " + miNumero);
        // -=
        miNumero -=5; // minumero = minumero + 5;
        System.out.println("miNumero = " + miNumero);
        // *=
        miNumero *=5; // minumero = minumero + 5;
        System.out.println("miNumero = " + miNumero);
        // /=
        miNumero /=5; // minumero = minumero + 5;
        System.out.println("miNumero = " + miNumero);

        //asignacion de variables multiples
        int a = 1, b = 15, c = 20;
        System.out.printf("a = %d,b = %d,c = %d, ",a,b,c);



    }
}
