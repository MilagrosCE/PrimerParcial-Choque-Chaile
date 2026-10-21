/*
Ejercicio 8: Notas de un Alumno por Materia
● Consigna:
● Crear una clase Equipo con los atributos privados: nombre (String),
partidosJugados (int), puntos (int), golesAFavor (int) y golesEnContra (int).
● Implementar un constructor que reciba solo el nombre; el resto de los atributos
comienzan en 0.
● Implementar registrarPartido(int golesFavor, int golesContra), que
actualice los goles y los partidos jugados, y sume los puntos: 3 por victoria, 1 por
empate y 0 por derrota. No debe aceptar goles negativos.
● Implementar int diferenciaDeGol() y mostrarDatos().
*/
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del equipo:");
        String nombre = sc.nextLine();

        Equipo e1 = new Equipo(nombre);

        System.out.println("Ingrese los goles a favor:");
        int golesFavor = sc.nextInt();

        System.out.println("Ingrese los goles en contra:");
        int golesContra = sc.nextInt();

        e1.registrarPartido(golesFavor, golesContra);

        System.out.println("\nDatos del equipo:");
        e1.mostrarDatos();

        sc.close();
    }
}
