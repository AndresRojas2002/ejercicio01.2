import java.util.Scanner;

public class AreaYPerimetro8 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.println("HOLA!!! VAMOS A CALCULAR EL AREA Y EL PERIMETRO DE UN RECTANGULO");

        System.out.println("por favor ingresar la longitud del rectangulo");
        var longitud = entrada.nextInt();
        
        System.out.println("por favor ingresar el ancho del rectangulo");
        var ancho = entrada.nextInt();

        var area = longitud * ancho;
        var perimetro = 2 * (longitud + ancho);

        System.out.println(" el area del rectangulo es " + area );

        System.out.println(" el perimetro del rectangulo es " + perimetro );

    }
}
