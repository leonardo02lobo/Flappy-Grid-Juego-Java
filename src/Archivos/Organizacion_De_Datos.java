package Archivos;

import Interfaces.Extra.*;
import Interfaces.*;
import Interfaces.Principal.*;
import java.io.*;

public class Organizacion_De_Datos {
    
    String Idioma = "";
    public void Organizar(File archivo) {
        try {
            FileReader lectura = new FileReader(archivo);
            BufferedReader br = new BufferedReader(lectura);
            String linea = br.readLine();
            while (linea  != null) {
                Idioma += linea + ",";
                linea = br.readLine();
            }
            SepararToken();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: "+e.getMessage());
        }
    }
    
    private void SepararToken(){
        String[] palabras = Idioma.split(",");
        ColocarDatosSet(palabras);
    }

    private void ColocarDatosSet(String[] palabras) {
        Menu_Salir.informacion = palabras[0];
        Menu_Salir.aceptar = palabras[1];
        Menu_Salir.cancelar = palabras[2];
        Opciones.configuracion = palabras[3];
        Opciones.lenguaje = palabras[4];
        Puntaje.Puntaje = palabras[5];
    }
}
