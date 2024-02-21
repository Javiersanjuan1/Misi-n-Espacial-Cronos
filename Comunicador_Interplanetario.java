public class Comunicador_Interplanetario {

    // Función para contar vocales en un mensaje
    public static int contarVocales(String mensaje) {
        int contador = 0;
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < mensaje.length(); i++) {
            if (vocales.contains(String.valueOf(mensaje.charAt(i)))) {
                contador++;
            }
        }
        return contador;
    }

    // Función para invertir un mensaje
    public static String invertirMensaje(String mensaje) {
        StringBuilder invertido = new StringBuilder();
        for (int i = mensaje.length() - 1; i >= 0; i--) {
            invertido.append(mensaje.charAt(i));
        }
        return invertido.toString();
    }

    // Función para verificar si un mensaje es un palíndromo
    public static boolean esPalindromo(String mensaje) {
        String limpio = mensaje.replaceAll("\\s+", "").toLowerCase();
        int longitud = limpio.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (limpio.charAt(i) != limpio.charAt(longitud - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String mensaje = "Anita lava la tina";

        // Contar vocales en el mensaje
        int numVocales = contarVocales(mensaje);
        System.out.println("Número de vocales en el mensaje: " + numVocales);

        // Invertir el mensaje
        String mensajeInvertido = invertirMensaje(mensaje);
        System.out.println("Mensaje invertido: " + mensajeInvertido);

        // Verificar si el mensaje es un palíndromo
        boolean esPalindromo = esPalindromo(mensaje);
        if (esPalindromo) {
            System.out.println("El mensaje es un palíndromo.");
        } else {
            System.out.println("El mensaje no es un palíndromo.");
        }
    }
}
