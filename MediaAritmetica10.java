import java.util.Scanner;

public class MediaAritmetica10 {
    public static void main(String[] args) {
        var entrada = new Scanner (System.in);
        System.out.println("HOLA, por favor ingresar tres numeros para hallar la media aritmetica");

        System.out.println("ingrese el primer numero ");
        var num1 = entrada.nextInt();

        System.out.println("ingresar el segundo numero ");
        var num2 = entrada.nextInt();

        System.out.println("ingresar el tercer numero ");
        var num3 = entrada.nextInt();

        var mediaArit = (num1 + num2 + num3)/3;

        System.out.println("la media aritmetica de " + num1+ ", " + num2 +", " + num3 +", " + " es " + mediaArit );


     
    }
}
