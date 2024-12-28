import java.util.Scanner;

public class ticketVenta {
    public static void main(String[] args) {
        //sistema de tickets
        final double IMPUESTO = 0.21;
        System.out.println("GENERACION DE TICKETS DE VENTA");
        var consola = new Scanner(System.in);

        System.out.println("Precio producto 1");
        var prod1 = Double.parseDouble(consola.nextLine());
        System.out.println("Precio producto 2");
        var prod2 = Double.parseDouble(consola.nextLine());
        System.out.println("Precio producto 3");
        var prod3 = Double.parseDouble(consola.nextLine());
        System.out.println("aplicar algun descuento(%)?");
        var descuentoPorcentaje = Integer.parseInt(consola.nextLine());

        
        var subtotal = prod1+prod2+prod3;
        //aplicar descuento

        var descuento = subtotal*(descuentoPorcentaje/100.0);
        var subtotalConDescuento = subtotal - descuento;
        //System.out.println("subtotalConDescuento = " + subtotalConDescuento);
        //System.out.println("subtotal = " + subtotal);
        var impuestos = subtotal*IMPUESTO;
        //System.out.println("impuestos = " + impuestos);
        var precioFinal = subtotalConDescuento + impuestos;
        System.out.printf("""
                Subtotal: $%.2f
                Descuento: %.2f (%d%%)
                impuesto (21%%): $%.2f
                Costo total: $%.2f
                """,subtotal,descuento,descuentoPorcentaje,impuestos,precioFinal);

                
        
    }
}
