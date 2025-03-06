public class CalculadoraDescuento {
    public static void main(String[] args) {
        int cantidadProductos = 75;
        double precioTotal = 1000.0;
        double precioFinal = new CalculadoraDescuento().calcularDescuento(cantidadProductos, precioTotal);
        System.out.println("Precio final: " + precioFinal);
    }

    /**
     * @author Jiaxin Zhang
     */


    /**
     * Este metodo calcula el precio final luego de aplicar un descuento. donde le pasan por parametro
     * la cantidad de productos y el precio total
     * tambien dependiendo de cuantos productos se compra se aplica un descuento distinto u otro
     * @param cantidadProductos
     * @param precioTotal
     * @exception IllegalArgumentException si la cantidad o el precio son negativos
     * @return
     */
    /* Calcula el precio final después de aplicar un descuento según la cantidad de productos.*/

    public double calcularDescuento(int cantidadProductos, double precioTotal) {
        if (cantidadProductos < 0 || precioTotal < 0) {
            throw new IllegalArgumentException("La cantidad y el precio deben ser positivos.");
        }

        double descuento;

        if (cantidadProductos > 100) {
            descuento = 0.3; // 30% de descuento
        } else if (cantidadProductos > 50) {
            descuento = 0.2; // 20% de descuento
        } else if (cantidadProductos > 10) {
            descuento = 0.1; // 10% de descuento
        } else {
            descuento = 0; // Sin descuento
        }
        return precioTotal - (precioTotal * descuento);
    }
}