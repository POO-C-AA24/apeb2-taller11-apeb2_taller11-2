
public class JuegoRoles {
   public static void main(String[] args) {
        Guerrero guerrero = new Guerrero("Henry", 1000, 10, 20);
        Mago mago = new Mago("Potter", 100, 11, 30);
        Arquero arquero = new Arquero("Grace", 500, 8, 25);

        
        int ataqueGuerrero = guerrero.atacar();
        mago.defender(ataqueGuerrero);
        arquero.defender(ataqueGuerrero);

        int ataqueMago = mago.atacar();
        guerrero.defender(ataqueMago);
        arquero.defender(ataqueMago);

        int ataqueArquero = arquero.atacar();
        guerrero.defender(ataqueArquero);
        mago.defender(ataqueArquero);

        
        guerrero.mostrarEstado();
        mago.mostrarEstado();
        arquero.mostrarEstado();
    }
}