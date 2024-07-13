public class Arquero extends Personaje {
    public  int precision;

    public Arquero(String nombre, int puntosVida, int nivel, int precision) {
        super(nombre, puntosVida, nivel);
        this.precision = precision;
    }

    @Override
    public int atacar() {
        return precision * nivel;
    }

    @Override
    public void defender(int puntosAtaque) {
        puntosVida -= puntosAtaque / 3; 
    }
}