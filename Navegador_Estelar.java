public class public class Navegador_Estelar {

    // Método para multiplicar dos matrices
    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas1 = matriz1.length;
        int columnas1 = matriz1[0].length;
        int columnas2 = matriz2[0].length;

        int[][] resultado = new int[filas1][columnas2];

        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                for (int k = 0; k < columnas1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        // Ejemplo de matrices para representar terreno y construcciones
        int[][] terreno = {
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {1, 0, 0, 1}
        };

        int[][] construcciones = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };

        // Multiplicar matrices para optimizar rutas y recursos
        int[][] resultado = multiplicarMatrices(terreno, construcciones);

        // Visualizar el result
        System.out.println("Resultado de la multiplicación de matrices:");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[0].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
