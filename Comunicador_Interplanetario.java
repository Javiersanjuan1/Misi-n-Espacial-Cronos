public class Comunicador_Interplanetario {

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

    public static String invertirMensaje(String mensaje) {
        StringBuilder invertido = new StringBuilder();
        for (int i = mensaje.length() - 1; i >= 0; i--) {
            invertido.append(mensaje.charAt(i));
        }
        return invertido.toString();
    }

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

        int numVocales = contarVocales(mensaje);
        System.out.println("Número de vocales en el mensaje: " + numVocales);

        String mensajeInvertido = invertirMensaje(mensaje);
        System.out.println("Mensaje invertido: " + mensajeInvertido);

        boolean esPalindromo = esPalindromo(mensaje);
        if (esPalindromo) {
            System.out.println("El mensaje es un palíndromo.");
        } else {
            System.out.println("El mensaje no es un palíndromo.");
        }
    }
}
