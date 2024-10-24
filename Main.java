import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            Random random = new Random();

            if (args.length == 1) {
                int numTiradas = Integer.parseInt(args[0]);
                if (numTiradas > 0) {
                    System.out.println("Tirando " + numTiradas + " veces un dado de 6 caras:");
                    for (int i = 1; i <= numTiradas; i++) {
                        int resultado = random.nextInt(6) + 1;
                        System.out.println("Tirada " + i + ": " + resultado);
                    }
                } else {
                    System.out.println("El número de tiradas debe ser mayor que 0.");
                }

            } else if (args.length == 2) {
                int numDados = Integer.parseInt(args[0]);
                int numTiradas = Integer.parseInt(args[1]);

                if (numDados > 0 && numTiradas > 0) {
                    System.out.println("Tirando " + numDados + " dados de 6 caras " + numTiradas + " veces:");
                    for (int tirada = 1; tirada <= numTiradas; tirada++) {
                        System.out.print("Tirada " + tirada + ": ");
                        for (int dado = 1; dado <= numDados; dado++) {
                            int resultado = random.nextInt(6) + 1;
                            System.out.print("Dado " + dado + ": " + resultado + " ");
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("El número de dados y el número de tiradas deben ser mayores que 0.");
                }

            } else {
                System.out.println("Debes proporcionar uno o dos argumentos.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingresa números válidos para la cantidad de dados y tiradas.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }
}
