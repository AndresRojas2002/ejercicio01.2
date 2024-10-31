import java.util.Scanner;

public class Conversion9 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.println("HOLA, VAMOS A CONVERTIR GRADOS CELSIUS  A  GRADOS FAHRENHEIT Y KELVIN ");
        System.out.println("por favor ingresar grados celsius");
        var celsius = entrada.nextDouble();

        var fahrenheit = celsius * 9/5 + 32;
        var kelvin = celsius + 273.15;

        System.out.println("grados a  fahrenheit " + fahrenheit);
        System.out.println("grados a kelvin " + kelvin);
    }
    
}
