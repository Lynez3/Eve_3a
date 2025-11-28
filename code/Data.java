/**
 * Program Assignment: PSP 3A
 * Name: Evelyn Aguilar Sánchez
 * Date: 27 12 2023
 * Description: Clase para manejar y procesar datos de archivos
 */

/**
 * Clase para manejar y procesar datos
 */
public class Data {

    /**
     * Convierte un String en un array de líneas separadas
     * @param data String con contenido a dividir
     * @return array de Strings con cada línea del contenido
     */
    public String[] saveData(String data) {
        // Dividir el string usando el salto de línea como separador
        return data.split("\n");
    }
}