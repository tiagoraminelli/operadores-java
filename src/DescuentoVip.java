import java.util.Scanner;

public class DescuentoVip {
    public static void main(String[] args) {
        //ofrecer un descuento cuando compres 10 o mas unidades por dia y ademas sean miembros de la tienda
        System.out.println("Sistema de Descuentos:");
        final var COMPRAMINIMA = 10;
        final var VIP = true;
        boolean esMiembro;
        System.out.println("Cuantos articulos compro: ");
        var compra = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("analizando la compra");
        System.out.println("Es miembro de la tienda: ");
        esMiembro = Boolean.parseBoolean(new Scanner(System.in).nextLine());
        var data = compra>=COMPRAMINIMA && esMiembro == VIP;
        System.out.println("ACCESO AL DESCUENTO: " + data);



    }
}
