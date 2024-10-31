import java.util.Scanner;

public class Calculadora7 {
    public static void main(String[] args) {
      var entrada = new Scanner(System.in);
      System.out.println("por favor ingresar 2 nuemros para realizar las operaciones");

      System.out.println("primer numero");
      var num1 =entrada.nextInt();

      System.out.println("segundo numero");
      var num2 = entrada.nextInt();

      var suma = num1 + num2;
      var resta = num1 - num2;
      var multiplcacion = num1 * num2;
      var divicion = num1 / num2;

      System.out.println("el resultado de la suma es: " + suma);
      System.out.println("el resultado de la resta es: " + resta);
      System.out.println("el resultado de la multiplicacio es: " + multiplcacion);
      System.out.println("el resultado de la divicion es: " + divicion);
      

   


    }
}
