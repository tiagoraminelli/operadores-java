import java.util.Scanner;

public class biblioteca {
    public static void main(String[] args) {
        //condiciones una de las 2
        //el usuario tiene credencial de estudiante
        //el usuario vive a no mas de 3km a la redonda
        System.out.println("prestamos biblotecarios");
        final int DISTANCIA_MAXIMA_PERMITIDA = 3;
        int distancia;
        boolean credencial;
        boolean permiso;
        System.out.print("Tienes credencial de la escuela (true/false)");
        credencial = Boolean.parseBoolean(new Scanner(System.in).nextLine());
        System.out.print("A cuantos Kms vives de la escuela?: ");
        distancia = Integer.parseInt(new Scanner(System.in).nextLine());
        permiso = distancia<=DISTANCIA_MAXIMA_PERMITIDA || credencial;
        System.out.println("Estado de solicitud: " + permiso);






    }
}
