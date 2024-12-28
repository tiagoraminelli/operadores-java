import java.util.Scanner;

public class autenticacion {
    public static void main(String[] args) {
        /*Crea un programa para validar el usuario y password proporcionados por el usuario

        crear 2 constantes que sean las que se usaran como refencia

        */
        var consola = new Scanner(System.in);
        final String USER = "admin";
        final String PASS = "1234";
        System.out.print("Cual es tu usuario?: ");
        var usuario = consola.nextLine();
        System.out.print("Cual es tu password?: ");
        var contra = consola.nextLine();
        var data = (usuario.equals(USER)) && (contra.equals(PASS));
        System.out.print("Datos son correctos?: " + data);

    }
}
