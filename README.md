# LibreriaCSVManager

La libreria esta hecha para la manipulacion de archivos CSV, leer, sobreescribir, ordenar y guardar datos.

## Variables

datos: Una variable de tipo arrayList<String []>, aqui es donde se guardaran todas las lineas que conforman la tabla.

headers: Una variable con 
direccion:

## Metodos

readCSV(LeerCSV): Se encarga de guardar los datos en un arrayList de arreglos de string.

getData(Obtener datos): Entrega todo el arrayList

getHeaders(Obtener indices): Obtiene un arreglo con los primeros datos de cada columna.

addLine(Añadir Linea): Pide un arreglo de STRINGS y lo guarda en el arrayList.

overWriteLine(Sobreescribir linea):  Pide un arreglo de STRINGS y lo guarda en una posicion ya establecida del array 



ordenar(sort): Ordena los objetos alfabeticamente.

search(buscar): Busca un string en todo el arrayList y devuelve un ArrayList de todas las posiciones donde se encontro ese string.

writeToFile(sobreescribir en el archivo): Guarda el string manipulado en el CSV.

## Como importar el .jar
### Link tutorial de youtube: https://youtu.be/wR05GOsXqJU

### Paso 1: Crear el .jar (Si no lo tienes)

<img width="740" height="916" alt="image" src="https://github.com/user-attachments/assets/3b66329f-3a43-4b22-96e3-4f77366fb96c" />

#### Paso 1.1: Clickear en el proyecto con click derecho y en la opcion clean and build.

<img width="527" height="564" alt="image" src="https://github.com/user-attachments/assets/7411172c-71ef-45c6-a8c9-bc4eefa06f5f" />

### Paso 2: Buscas la carpeta donde guardas tus proyectos de netBeans.

<img width="1248" height="408" alt="image" src="https://github.com/user-attachments/assets/ff233d9f-738e-4814-b0a3-4dcda438fd34" />

### Paso 3: Entras a la carpeta del nombre del proyecto y en su carpeta dist esta el .jar

<img width="1105" height="414" alt="image" src="https://github.com/user-attachments/assets/65fb45da-b5d7-4ecf-84c5-d8519dc0674d" />

### Paso 5: En netbeans en el proyecto al que quieras importar la libreria das click derecho y elijes la opcion propiedades

<img width="561" height="1228" alt="image" src="https://github.com/user-attachments/assets/e554b5cd-c475-4f76-ac4d-b5573debfc43" />

### Paso 6: Seleccionas el menu librerias y donde dice Classpath clickeas la opcion del "+"

<img width="1563" height="1115" alt="image" src="https://github.com/user-attachments/assets/27d5560f-c6e5-4292-93d1-166d62a3d7ad" />

### Paso 7: Vas hasta la carpeta donde tienes el .jar de tu libreria, lo seleccionas y clickeas en la opcion open

<img width="1464" height="735" alt="image" src="https://github.com/user-attachments/assets/0e6c7549-710d-4064-b6b1-442da9edf5b7" />

### Paso 7: Ahora desde la clase puedes importar la libreria con el nombre del paquete.nombre de la clase despues de un import (import Manager.CSVManager).

<img width="1219" height="220" alt="image" src="https://github.com/user-attachments/assets/6542fe84-8a12-4832-a1c7-6099b30003cb" />

## Ejemplo de implementacion en un JFrame

<img width="1120" height="538" alt="Screenshot 1" src="https://github.com/user-attachments/assets/3f890f85-98d2-43d3-99b7-8fa35ea7ecfe" />

<img width="944" height="656" alt="Screenshot 2" src="https://github.com/user-attachments/assets/fc81aad2-d4ae-4e92-9866-01feef7ecd36" />

<img width="1132" height="554" alt="Screenshot 3" src="https://github.com/user-attachments/assets/b3ed17e2-ebb9-46f6-ae97-7282f9901be3" />

<img width="1124" height="548" alt="Screenshot 4" src="https://github.com/user-attachments/assets/a7174ef7-7d66-420f-bd29-a5a30f2e1ffc" />

<img width="1130" height="564" alt="Screenshot 5" src="https://github.com/user-attachments/assets/2e3227e8-9b3b-4332-a7ea-ec87ead4ee6c" />

<img width="884" height="406" alt="Screenshot 6" src="https://github.com/user-attachments/assets/4aa537f0-a045-4b7d-9a63-0fd828dea56a" />
