package codigo;

// Clase principal para probar el patron

public class Main {
    public static void main(String[] args) {
        // Director construyendo una Computadora de Oficina
        Director directorOficina = new Director(new ComputadoraOficinaBuilder());
        Computadora computadoraOficina = directorOficina.construirComputadora();
        System.out.println("Computadora de Oficina: " + computadoraOficina);

        // Director construyendo una Computadora Gamer
        Director directorGamer = new Director(new ComputadoraGamerBuilder());
        Computadora computadoraGamer = directorGamer.construirComputadora();
        System.out.println("Computadora Gamer: " + computadoraGamer);
    }
}