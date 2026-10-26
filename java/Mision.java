import java.util.ArrayList;
import java.util.List;

public class Mision {
    private String id;
    private String estado;
    private Reto reto;
    private List<String> pistas;

    public Mision(String id, Reto reto) {
        this.id = id;
        this.reto = reto;
        this.estado = "activa";
        this.pistas = new ArrayList<>();
    }

    public boolean procesarIntento(String respuesta) {
        if (reto.evaluarRespuesta(respuesta)) {
            completar();
            return true;
        }
        return false;
    }

    public void completar() {
        this.estado = "completada";
    }

    public String getEstado() {
        return estado;
    }

    public Reto getReto() {
        return reto;
    }
}
