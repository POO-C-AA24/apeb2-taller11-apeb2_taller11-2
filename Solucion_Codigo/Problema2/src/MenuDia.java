public class MenuDia extends Menu {
    public double valorPostre;
    public double valorBebida;

    public MenuDia(String nombrePlato, double valorMenu, double valorInicialMenu,
                   double valorPostre, double valorBebida) {
        super(nombrePlato, valorMenu, valorInicialMenu);
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;
    }

    @Override
    public double calcularSubtotal() {
        return valorMenu + valorPostre + valorBebida;
    }

    @Override
    public String toString() {
        return "Menu del Dia: " + nombrePlato + "\n" +
               "Valor: " + valorMenu + "\n" +
               "Subtotal: " + calcularSubtotal();
    }
}