public class Factura {

    public void procesarVenta(Cliente cliente, double subtotal) {

        double descuento = cliente.aplicarDescuento(subtotal);

        double total = subtotal - descuento;

        System.out.println("===== FACTURA =====");

        System.out.println("Cliente: " + cliente.nombre);
        System.out.println("DNI: " + cliente.dni);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total: " + total);

        System.out.println("===================");
    }
}
