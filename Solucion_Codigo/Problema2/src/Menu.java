public abstract class Menu {
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicialMenu;

    public Menu(String nombrePlato, double valorMenu, double valorInicialMenu) {
        this.nombrePlato = nombrePlato;
        this.valorMenu = valorMenu;
        this.valorInicialMenu = valorInicialMenu;
    }

    public abstract double calcularSubtotal();

    @Override
    public abstract String toString();
}