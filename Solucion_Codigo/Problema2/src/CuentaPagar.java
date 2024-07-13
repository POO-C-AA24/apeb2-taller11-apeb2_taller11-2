import java.util.ArrayList;

public class CuentaPagar {
    public String nombreCliente;
    public ArrayList<Menu> listaMenus;

    public CuentaPagar(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        this.listaMenus = new ArrayList<>();
    }

    public void agregarMenu(Menu menu) {
        listaMenus.add(menu);
    }

    public double calcularSubtotal() {
        double subtotal = 0;
        for (Menu menu : listaMenus) {
            subtotal += menu.calcularSubtotal();
        }
        return subtotal;
    }

    public double calcularIva() {
        return calcularSubtotal() * 0.12; 
    }

    public double calcularTotal() {
        return calcularSubtotal() + calcularIva();
    }

    @Override
    public String toString() {
        System.out.println("Cuenta por Pagar\n");
        System.out.println("Cliente: " + nombreCliente + "\n");
        System.out.println("Subtotal: $" +
                String.format("%.2f", calcularSubtotal()) + "\n");
        System.out.println("IVA (12%): $" + 
                String.format("%.2f", calcularIva()) + "\n");
        System.out.println("Total a Pagar: $" +
                String.format("%.2f", calcularTotal()) + "\n");
        System.out.println("Detalles de Menus:\n");
        for (Menu menu : listaMenus) {
            System.out.println(menu + "\n");
        }
        return ""; 
    }
}
