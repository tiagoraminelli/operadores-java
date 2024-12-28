import java.util.Scanner;

public class rangoDeVaraible {
    public static void main(String[] args) {
        //valores entre 1 - 10
        var consola = new Scanner(System.in);
        System.out.print("Ingresa un valor numero: ");
        var dato = Integer.parseInt(consola.nextLine());
        System.out.println("dato = " + dato);
        //revisar si el dato esta dentro del rango

        var estaDentroDelRango = dato >=1 && dato<=10;
        System.out.println("Esta dentro del rango?: " + estaDentroDelRango);

        var estaFueraDeRango = !(dato >=1 && dato<=10);
        System.out.println("Esta fuera del rango (1/10)?: " + estaFueraDeRango);



    }
}
