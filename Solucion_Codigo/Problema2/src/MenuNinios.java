public class MenuNinios extends Menu {
    public double valorPorcionHelado;
    public double valorPorcionPastel;

    public MenuNinios(String nombrePlato, double valorMenu, double valorInicialMenu,
                     double valorPorcionHelado, double valorPorcionPastel) {
        super(nombrePlato, valorMenu, valorInicialMenu);
        this.valorPorcionHelado = valorPorcionHelado;
        this.valorPorcionPastel = valorPorcionPastel;
    }

    @Override
    public double calcularSubtotal() {
        return valorMenu + valorPorcionHelado + valorPorcionPastel;
    }

    @Override
    public String toString() {
        return "Menu de Ninios: " + nombrePlato + "\n" +
               "Valor: " + valorMenu + "\n" +
               "Subtotal: " + calcularSubtotal();
    }
}