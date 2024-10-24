import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Verificar que se han pasado al menos dos argumentos
        if (args.length >= 2) {
            // Obtener el número de caras del dado y el número de dados
            int numCaras = Integer.parseInt(args[0]);
            int numDados = Integer.parseInt(args[1]);

            // Crear un objeto Random para generar números aleatorios
            Random random = new Random();

            // Bucle para tirar cada dado
            System.out.println("Tirando " + numDados + " dados de " + numCaras + " caras:");
            for (int i = 1; i <= numDados; i++) {
                // Generar un número aleatorio entre 1 y numCaras
                int resultado = random.nextInt(numCaras) + 1;
                // Mostrar el resultado de la tirada
                System.out.println("Dado " + i + ": " + resultado);
            }
        } else {
            System.out.println("Debes proporcionar el número de caras y el número de dados.");
        }
    }
}
