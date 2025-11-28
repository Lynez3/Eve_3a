/**
 * Program Assignment: PSP 3A
 * Name: Evelyn Aguilar Sánchez
 * Date: 27 12 2023
 * Description: Clase principal que inicia el análisis de regresión lineal
 */

/**
 * Clase principal de la aplicación
 */
public class App {

    /**
     * Método principal que inicia la aplicación
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        // Verificar que se haya pasado el nombre del archivo de entrada y salida como argumentos
        if (args.length < 2) {
            System.out.println("Uso: java App <archivo_entrada> <archivo_salida>");
            return;
        }

        // Crear una instancia de Logic para ejecutar el análisis de regresión lineal
        Logic3a logic = new Logic3a();
        // Llamar al método que realiza el análisis de regresión lineal pasando archivo entrada y salida
        logic.logic3a(args[0], args[1]);
    }
}
