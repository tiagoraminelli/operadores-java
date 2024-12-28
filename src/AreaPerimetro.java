import java.util.Scanner;

public class AreaPerimetro {
    public static void main(String[] args) {
        //area = base * altura
        //perimetro = 2 * (base + altura)
        var consola = new Scanner(System.in);
        System.out.print("base: ");
        var base =  Integer.parseInt(consola.nextLine());
        System.out.print("altura: ");
        var altura = Integer.parseInt(consola.nextLine());
        //calculos
        var area = base * altura;
        var perimetro = 2 * (base + altura);
        System.out.println("perimetro = " + perimetro);
        System.out.println("area = " + area);

    }
}
