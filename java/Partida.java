import java.util.ArrayList;
import java.util.List;

public class Partida {
    private List<Mision> misiones;
    private int recompensasGlobales;

    public Partida() {
        this.misiones = new ArrayList<>();
        this.recompensasGlobales = 0;
    }

    public void agregarMision(Mision m) {
        misiones.add(m);
    }

    public void iniciarJuego() {
        // TODO: Implementar inicio del juego
    }
}
