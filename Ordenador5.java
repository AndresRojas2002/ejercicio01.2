public class Ordenador5 {
    public static void main(String[] args) {
        var precioInicial = 660;
        var descuentoEnPorcentaje = 10;

        var precioFinal = precioInicial - (precioInicial * descuentoEnPorcentaje / 100);

        System.out.println("se debe pagar por el ordenador " + precioFinal + "Euros");
    }
}
