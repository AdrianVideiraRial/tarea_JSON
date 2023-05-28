import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;

import com.google.gson.Gson;


public class Main {
       public static void main(String[] args) throws IOException {
           //Creamos objeto para trabajar con JSON
           Gson gson = new Gson();
           //Cadena JSON
           String json_original;

           //Partimos de un objeto JAVA y lo convertimos en un objeto JSON.

           //Creamos nuestro objeto coche inicial e imprimimos en pantalla para comprobarlo.
           Coche coche_original = new Coche();
           System.out.println("Objeto JAVA");
           System.out.println(coche_original);

           //Lo pasamos JSON e imprimimos en consola para comprobarlo.
           json_original = gson.toJson(coche_original, Coche.class);
           System.out.println("************************************");
           System.out.println("Pasamos JAVA a JSON");
           System.out.println(json_original);

           //Creamos un fichero y guardamos json
           try {
               FileWriter file = new FileWriter("coche_guardado.json"); //Fichero guardado con JSON
               file.write(json_original);
               file.close();
           } catch (IOException e){
               System.out.println("Error en escritura coche_guardado.json");
           }

           //********************************************************************************************//

           //Proceso inverso: Partimos de un JSON y lo convertimos en un objeto JAVA.

           //Leemos el fichero y creamos una cadena vacía para almacenar el contenido del archivo JSON.
           String json_recuperado = ""; //Creamos objeto json

           FileReader fileReader = new FileReader("coche_guardado.json"); //Leemos este fichero JSON guardado previamente en el paso anteior
           int valor= fileReader.read();
           while (valor != -1) { //-1 indica que no hay más caracteres en archivo que se está leyendo.
               json_recuperado += (char) valor;
               valor = fileReader.read();
           }
           fileReader.close();


           // Pasamos el string JSON a un nuevo objeto coche.
           Coche coche_recuperado = gson.fromJson(json_recuperado, Coche.class);
           System.out.println("************************************");
           System.out.println("Pasamos de JSON a JAVA");
           System.out.println(coche_recuperado);

       }

}
