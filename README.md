# LibreriaCSVManager

La libreria esta hecha para la manipulacion de archivos CSV, leer, sobreescribir, ordenar y guardar datos.

##Variables

datos: Una variable de tipo arrayList<String []>, aqui es donde se guardaran todas las lineas que conforman la tabla.

headers: Una variable con 
direccion:

##Metodos
readCSV(LeerCSV): Se encarga de guardar los datos en un arrayList de arreglos de string.

getData(Obtener datos): Entrega todo el arrayList

getHeaders(Obtener indices): Obtiene un arreglo con los primeros datos de cada columna.

addLine(Añadir Linea): Pide un arreglo de STRINGS y lo guarda en el arrayList.

overWriteLine(Sobreescribir linea):  Pide un arreglo de STRINGS y lo guarda en una posicion ya establecida del array 

ordenar(sort): Ordena los objetos alfabeticamente.

search(buscar): Busca un string en todo el arrayList y devuelve un ArrayList de todas las posiciones donde se encontro ese string.

writeToFile(sobreescribir en el archivo): Guarda el string manipulado en el CSV.
