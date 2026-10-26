public class Joker extends Villano {

    public Joker() {
        super("Joker", "RetoSecuencia");
    }

    @Override
    public void complicarReto(Reto r) {
        if (r instanceof RetoSecuencia) {
            r.aumentarDificultad();
            System.out.println("El Joker ha aumentado la dificultad de la secuencia!");
        }
    }
}
