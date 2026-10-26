import java.util.ArrayList;
import java.util.List;

public class Mision {
    private Reto reto;
    private String estado = "activa";
    private int errores = 0;
    private boolean recompensaAcreditada = false;
    private List<Dificultad> dificultades = new ArrayList<>();

    public Mision(Reto reto) {
        this.reto = reto;
    }

    public boolean procesarIntento(String respuesta) {
        // TODO: Implementar lógica de validación
        // TODO: Invocar reto.evaluar(respuesta)
        // TODO: Aumentar errores si falla y bloquear en el 3er error
        return false;
    }

    public void agregarDificultad(Dificultad dificultad) {
        // TODO: Implementar
    }
}
