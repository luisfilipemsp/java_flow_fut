public class Equipo implements Comparable<Equipo> {
    private String nombre;
    private String pais;
    private String liga;
    private long dinero;

    public Equipo(String nombre, String pais, String liga) {
        this.nombre = nombre;
        this.pais = pais;
        this.liga = liga;
        this.dinero = 100000000;
    }

    public long getDinero() {
        return dinero;
    }

    public void setDinero(long dinero) {
        this.dinero = dinero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getPais() {
        return this.pais;
    }

    public String getLiga() {
        return this.liga;
    }

    public int compareTo(Equipo o) {
        return this.getNombre().compareTo(o.getNombre());
    }

}
