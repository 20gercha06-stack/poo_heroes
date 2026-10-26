import java.util.List;

public class RetoSecuencia extends Reto {
    private List<Integer> patronNumerico;

    public RetoSecuencia(NivelDificultad dificultad) {
        super("Completar la secuencia numérica", dificultad);
    }

    @Override
    public boolean evaluarRespuesta(String respuesta) {
        // TODO: Implementar la lógica para validar la respuesta del alumno
        return false;
    }

    @Override
    public void generarProblema() {
        // TODO: Generar patrón numérico según el nivel de dificultad
    }
}
