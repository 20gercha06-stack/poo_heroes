public abstract class Reto {
    protected String descripcion;
    protected NivelDificultad dificultad;

    public Reto(String descripcion, NivelDificultad dificultad) {
        this.descripcion = descripcion;
        this.dificultad = dificultad;
    }

    public abstract boolean evaluarRespuesta(String respuesta);
    public abstract void generarProblema();

    public void aumentarDificultad() {
        if (this.dificultad == NivelDificultad.FACIL) {
            this.dificultad = NivelDificultad.MEDIO;
        } else if (this.dificultad == NivelDificultad.MEDIO) {
            this.dificultad = NivelDificultad.DIFICIL;
        }
    }

    public NivelDificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(NivelDificultad dificultad) {
        this.dificultad = dificultad;
    }
}
