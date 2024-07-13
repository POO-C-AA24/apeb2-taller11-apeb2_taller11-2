public class Guerrero extends Personaje {
    public int fuerza;

    public Guerrero(String nombre, int puntosVida, int nivel, int fuerza) {
        super(nombre, puntosVida, nivel);
        this.fuerza = fuerza;
    }

    @Override
    public int atacar() {
        return fuerza * nivel;
    }

    @Override
    public void defender(int puntosAtaque) {
        puntosVida -= puntosAtaque / 2; 
    }
}