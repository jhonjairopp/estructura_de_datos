import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEjemplo {
    public static void main(String[] args) {

        Properties conexion = new Properties();
        /* Obtener los datos mediante la lectura */
        try{
            FileInputStream input = new FileInputStream("src/conexion.properties");
            conexion.load(input);
        } catch (IOException e) {
            System.out.println("Error en lectura");
        }

        /* Obtener los valores de las propiedades*/
        String server = conexion.getProperty("server");
        int port = Integer.parseInt(conexion.getProperty("port"));
        String username = conexion.getProperty("username");

        System.out.println("Configuración cargada:");
        System.out.println("Servidor: " + server);
        System.out.println("Puerto: " + port);
        System.out.println("Nombre de usuario: " + username);

        conexion.setProperty("password", "1234");
        
        try {
            /* Guardar las propiedades en un archivo*/
            FileOutputStream fileOutputStream = new FileOutputStream("src/conexion.properties");
            conexion.store(fileOutputStream, "Informacion de servidor");
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println("Error en guardado");
        }
    }

}

