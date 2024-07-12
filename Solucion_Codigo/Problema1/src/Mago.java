public class Mago extends Personaje {
    private int poderMagico;

    public Mago(String nombre, int puntosVida, int nivel, int poderMagico) {
        super(nombre, puntosVida, nivel);
        this.poderMagico = poderMagico;
    }

    @Override
    public int atacar() {
        return poderMagico * nivel;
    }

    @Override
    public void defender(int puntosAtaque) {
        puntosVida -= puntosAtaque; 
    }
}