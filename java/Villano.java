public abstract class Villano extends Personaje {
    protected String tipoRetoEspecialidad;

    public Villano(String nombre, String tipoRetoEspecialidad) {
        super(nombre);
        this.tipoRetoEspecialidad = tipoRetoEspecialidad;
    }

    public abstract void complicarReto(Reto r);

    public Mision plantearMision(String id, Reto r) {
        complicarReto(r);
        return new Mision(id, r);
    }
}
