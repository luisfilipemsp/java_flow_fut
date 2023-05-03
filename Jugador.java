import java.util.Random;

public class Jugador {
    private String nombre;
    private int edad;
    private String nacionalidad;
    private int overall;
    private int potential;
    private int velocidad;
    private int controlBalon;
    private int finalizacion;
    private int regates;
    private int defensa;
    private String posicion;
    private String equipo;
    private boolean seVende;
    private long valor;

    public Jugador(String nombre, int edad, String nacionalidad, int overall, int potential, int velocidad,
            int controlBalon, int finalizacion, int regates, int defensa, String posicion, String equipo, long valor) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.overall = overall;
        this.potential = potential;
        this.velocidad = velocidad;
        this.controlBalon = controlBalon;
        this.finalizacion = finalizacion;
        this.regates = regates;
        this.defensa = defensa;
        this.posicion = posicion;
        this.equipo = equipo;
        this.seVende = (new Random()).nextBoolean();
        this.valor = valor;
    }

    public long getValor() {
        return valor;
    }
    public void setValor(long valor) {
        this.valor = valor;
    }
    public void setSeVende(boolean seVende) {
        this.seVende = seVende;
    }

    public boolean getSeVende() {
        return this.seVende;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getOverall() {
        return this.overall;
    }

    public void setOverall(int overall) {
        this.overall = overall;
    }

    public int getPotential() {
        return this.potential;
    }

    public void setPotential(int potential) {
        this.potential = potential;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getControlBalon() {
        return this.controlBalon;
    }

    public void setControlBalon(int controlBalon) {
        this.controlBalon = controlBalon;
    }

    public int getFinalizacion() {
        return this.finalizacion;
    }

    public void setFinalizacion(int finalizacion) {
        this.finalizacion = finalizacion;
    }

    public int getRegates() {
        return this.regates;
    }

    public void setRegates(int regates) {
        this.regates = regates;
    }

    public int getDefensa() {
        return this.defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public String getPosicion() {
        return this.posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

}
