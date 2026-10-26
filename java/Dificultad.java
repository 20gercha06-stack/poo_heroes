public interface Dificultad {
    /**
     * Aplica el obstáculo al reto.
     * @return false si la modificación deja el reto sin solución posible.
     */
    boolean aplicar(Reto reto);
}
