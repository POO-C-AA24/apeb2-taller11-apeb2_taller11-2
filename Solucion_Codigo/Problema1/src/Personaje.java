public abstract class Personaje {
    protected String nombre;
    protected int puntosVida;
    protected int nivel;

    public Personaje(String nombre, int puntosVida, int nivel) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.nivel = nivel;
    }

    public abstract int atacar();

    public abstract void defender(int puntosAtaque);

    public void subirNivel() {
        nivel++;
        puntosVida += 10;
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Puntos de Vida: " + puntosVida);
        System.out.println("Nivel: " + nivel);
    }
}