
public class MenuCarta extends Menu {

    public double valorPorcionGuarnicion;
    public double valorBebida;
    public double porcentajeAdicionalServicio;

    public MenuCarta(String nombrePlato, double valorMenu,
            double valorInicialMenu,
            double valorPorcionGuarnicion,
            double valorBebida, double porcentajeAdicionalServicio) {
        super(nombrePlato, valorMenu, valorInicialMenu);
        this.valorPorcionGuarnicion = valorPorcionGuarnicion;
        this.valorBebida = valorBebida;
        this.porcentajeAdicionalServicio = porcentajeAdicionalServicio;
    }

    @Override
    public double calcularSubtotal() {
        double subtotal = valorMenu + valorPorcionGuarnicion + valorBebida;
        double servicio = (porcentajeAdicionalServicio / 100) * valorInicialMenu;
        return subtotal + servicio;
    }

    @Override
    public String toString() {
        return "Menu a la Carta: " + nombrePlato + "\n"
                + "Valor: " + valorMenu + "\n"
                + "Subtotal: " + calcularSubtotal();
    }
}
