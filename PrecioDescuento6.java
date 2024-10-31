public class PrecioDescuento6 {
    public static void main(String[] args) {
        var precioPagado = 34;
        var Descuento = 0.15;

        /*el 1 equivale al 100 % del producto */

        var precioOriginal = precioPagado /(1 - Descuento);

        System.out.println("el precio que tenia los pantalones antes de pagar era de  " + precioOriginal + " Euros ");
    }
}
