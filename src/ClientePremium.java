public class ClientePremium extends Cliente{

    public ClientePremium(String nombre, String dni) {
        super(nombre, dni);
    }

    @Override
    public double aplicarDescuento(double subtotal) {
        double descuento = subtotal * 0.20;

        return descuento;
    }
}
