package Manager;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * CSVManager es una clase utilitaria final que proporciona métodos estáticos para manipular archivos CSV.
 * Permite leer, modificar, ordenar, buscar y guardar datos en formato CSV.
 * 
 * @author jarqu
 * @version 1.0
 */
final public class CSVManager {
    private static ArrayList<String[]> datos;
    private static String[] headers;
    private static String direccion;
    private static BufferedReader lector;
    
    /**
     * Método main de ejemplo. Inicializa la estructura de datos.
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        datos = new ArrayList<String[]>(); 
    }
    
    /**
     * Lee un archivo CSV y carga sus datos en memoria.
     * La primera línea del archivo se considera como los encabezados de columna.
     * 
     * @param filePath Ruta del archivo CSV a leer
     * @throws IOException Si ocurre un error al leer el archivo
     */
    public static void readCSV(String filePath) throws IOException {
        direccion = filePath;
        datos = new ArrayList<>();

        try (BufferedReader lector = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean firstLine = true;

            while ((line = lector.readLine()) != null) {
                if (firstLine) {
                    headers = line.split(",");
                    firstLine = false;
                } else {
                    datos.add(line.split(","));
                }
            }
        }
    }
    
    /**
     * Devuelve los datos leídos del archivo CSV.
     * 
     * @return ArrayList con los datos del CSV donde cada elemento es un array de Strings que representa una fila
     */
    public static ArrayList<String[]> getData() {
        return datos;
    }
    
    /**
     * Devuelve los encabezados de las columnas del CSV.
     * 
     * @return Array de Strings con los nombres de las columnas
     */
    public static String[] getHeaders() {
        return headers;
    }
    
    /**
     * Añade una nueva línea de datos al archivo CSV en memoria.
     * 
     * @param linea Array de Strings con los valores de la nueva línea
     * @throws IllegalArgumentException Si el número de columnas no coincide con los encabezados
     */
    public static void addLine(String[] linea) {
        if (linea.length == headers.length) {
            datos.add(linea);
        } else {
            throw new IllegalArgumentException("El numero de columnas no coincide con el encabezado");
        }
    }
    
    /**
     * Sobrescribe una línea específica en los datos del CSV.
     * 
     * @param linea Array de Strings con los nuevos valores
     * @param index Índice de la línea a sobrescribir (basado en 0)
     */
    public static void overWriteLine(String[] linea, int index) {
        datos.set(index, linea);
    }
    
    /**
     * Ordena los datos según una columna específica.
     * 
     * @param columna Índice de la columna por la cual ordenar (basado en 0)
     * @param ascendente true para orden ascendente, false para descendente
     */
    public static void ordenar(int columna, boolean ascendente) {
        Collections.sort(datos, new Comparator<String[]>() {
            @Override
            public int compare(String[] fila1, String[] fila2) {
                int resultado = fila1[columna].compareTo(fila2[columna]);
                return ascendente ? resultado : -resultado;
            }
        });
    }
    
    /**
     * Busca un valor específico en todos los datos y devuelve los índices de las filas donde aparece.
     * 
     * @param b Valor a buscar (comparación exacta)
     * @return ArrayList de enteros con los índices de las filas donde se encontró el valor
     */
    public static ArrayList<Integer> search(String b) {
        ArrayList<Integer> encontrados = new ArrayList<>();
        for (int i = 0; i < datos.size(); i++) {
            for (int j = 0; j < headers.length; j++) {
                if (b.equals(datos.get(i)[j])) {
                    encontrados.add(i);
                    break;
                }
            }
        }
        return encontrados;
    }
    
    /**
     * Guarda los datos actuales en el archivo CSV original.
     * 
     * @throws IOException Si ocurre un error al escribir en el archivo
     */
    public static void writeToFile() throws IOException {
        try (PrintWriter escritor = new PrintWriter(new FileWriter(direccion))) {
            escritor.println(String.join(",", headers));
            for (String[] row : datos) {
                escritor.println(String.join(",", row));
            }
        }
    }
}