public class MenuEconomico extends Menu {
    public double porcentajeDescuento;

    public MenuEconomico(String nombrePlato, double valorMenu,
            double valorInicialMenu,
                         double porcentajeDescuento) {
        super(nombrePlato, valorMenu, valorInicialMenu);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double calcularSubtotal() {
        double descuento = (porcentajeDescuento / 100) * valorInicialMenu;
        return valorMenu - descuento;
    }

    @Override
    public String toString() {
        return "Menu Economico: " + nombrePlato + "\n" +
               "Valor: " + valorMenu + "\n" +
               "Subtotal: " + calcularSubtotal();
    }
}
