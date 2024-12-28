import java.util.Scanner;

public class rangoDefinido {
    public static void main(String[] args) {
        //definir los limites
        final var MAXIMO = 5;
        final var MINIMO = 0;
        //solicitar un valor entre 0 y 5
        System.out.println("Proporciona un valor de 0 y 5: ");
        var data = Integer.parseInt(new Scanner(System.in).nextLine());
        //verificar si es dato esta dentro del rango
        var estaDentroDelRango = data>=MINIMO && data<=MAXIMO;
        System.out.println("estaDentroDelRango = " + estaDentroDelRango);

    }
}
