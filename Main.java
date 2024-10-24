import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Verificar que se ha pasado al menos un argumento
        if (args.length != 0) {
            // Obtener el número de caras del dado a partir del argumento
            int numCaras = Integer.parseInt(args[0]);

            // Generar un número aleatorio entre 1 y numCaras
            Random random = new Random();
            int resultado = random.nextInt(numCaras) + 1;

            // Mostrar el resultado de la tirada
            System.out.println("Tiraste un dado de " + numCaras + " caras y salió: " + resultado);
        } else {
            System.out.println("Debes proporcionar el número de caras del dado.");
        }
    }
}
