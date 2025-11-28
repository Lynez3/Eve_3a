/**
 * Program Assignment: PSP 3A
 * Name: Evelyn Aguilar Sánchez
 * Date: 27 12 2023
 * Description: Clase para realizar cálculos de estimación y correlación lineal
 */

/**
 * Clase para leer datos de archivos
 */
public class Input {

    /**
     * Lee el contenido de un archivo y lo retorna como String
     * @param inFile nombre del archivo a leer
     * @return contenido del archivo como String, o string vacío en caso de error
     */
    public String readData(String inFile) {
        // StringBuilder para acumular el contenido del archivo
        StringBuilder data = new StringBuilder();
        
        // Usar try-with-resources para asegurar que el BufferedReader se cierre automáticamente
        try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(inFile))) {
            String line; // Variable para almacenar cada línea leída
            
            // Leer el archivo línea por línea hasta llegar al final (null)
            while ((line = br.readLine()) != null) {
                // Agregar la línea al StringBuilder con salto de línea
                data.append(line).append("\n");
            }
        } catch (java.io.IOException e) {
            // Manejar excepciones de entrada/salida mostrando el error
            e.printStackTrace();
            return "";  // Retornar string vacío en caso de error
        }
        
        // Convertir el StringBuilder a String y retornarlo
        return data.toString();
    }
}