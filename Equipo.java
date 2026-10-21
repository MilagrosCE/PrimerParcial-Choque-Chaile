
public class Equipo {
    private String nombre;
    private int partidosJugados;
    private int puntos;
    private int golesAFavor;
    private int golesEnContra;
    
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.partidosJugados = 0;
        this.puntos = 0;
        this.golesAFavor = 0;
        this.golesEnContra = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getGolesAFavor() {
        return golesAFavor;
    }

    public int getGolesEnContra() {
        return golesEnContra;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void registrarPartido(int golesFavor, int golesContra) {

        if (golesFavor < 0 || golesContra < 0) {
            System.out.println("No se aceptan goles negativos.");
            return;
        }

        this.golesAFavor += golesFavor;
        this.golesEnContra += golesContra;
        this.partidosJugados++;

        if (golesFavor > golesContra) {
            puntos += 3;
        } else if (golesFavor == golesContra) {
            puntos += 1;
        }
        
    }

    public int diferenciaDeGol() {
        return golesAFavor - golesEnContra;
    }

    public void mostrarDatos() {
        System.out.println("Nombre del equipo: " + nombre);
        System.out.println("Partidos jugados: " + partidosJugados);
        System.out.println("Puntos: " + puntos);
        System.out.println("Goles a favor: " + golesAFavor);
        System.out.println("Goles en contra: " + golesEnContra);
        System.out.println("Diferencia de goles: " + diferenciaDeGol());
    }
}
