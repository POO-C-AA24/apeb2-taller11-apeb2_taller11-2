
public class Restaurant {

    public static void main(String[] args) {

        Menu menu1 = new MenuCarta("alitas BBQ", 5.50, 3.5, 1.0, 1.50, 10.0);
        Menu menu2 = new MenuDia("Pizza mediana con cola", 7.0, 12.0, 2.0, 1.50);
        Menu menu3 = new MenuNinios("Hamburguesa Infantil", 3.50, 5.0, 2.0, 1.5);
        Menu menu4 = new MenuEconomico("Sopa de Verduras", 8.0, 7.0, 20.0);

        CuentaPagar cuenta = new CuentaPagar("Henry Jaya");

        cuenta.agregarMenu(menu1);
        cuenta.agregarMenu(menu2);
        cuenta.agregarMenu(menu3);
        cuenta.agregarMenu(menu4);

        System.out.println(cuenta);
    }
}
