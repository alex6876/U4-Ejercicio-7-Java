public class Main {
    public static void main(String[] args) {

        ClienteRegular clienteRegular = new ClienteRegular("Juan", "47.585.155");
        ClienteCorporativo clienteCorporativo = new ClienteCorporativo("Mirta", "45.784.254");
        ClientePremium clientePremium = new ClientePremium("Juan", "46.001.245");

        Factura factura = new Factura();

        factura.procesarVenta(clienteRegular, 12000);
        factura.procesarVenta(clienteCorporativo, 240000);
        factura.procesarVenta(clientePremium, 1800000);
    }
}