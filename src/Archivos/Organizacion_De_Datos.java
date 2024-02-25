package Archivos;

import Interfaces.Extra.Menu_Salir;
import Interfaces.Principal.Opciones;
import Interfaces.Puntaje;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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
            System.out.println("Error al leer el archivo");
        }
    }
    
    private void SepararToken(){
        String[] palabras = Idioma.split(",");
        Variables variables = new Variables();
        ColocarDatosSet(palabras,variables);
    }

    private void ColocarDatosSet(String[] palabras, Variables variables) {
        Menu_Salir.informacion = palabras[0];
        Menu_Salir.aceptar = palabras[1];
        Menu_Salir.cancelar = palabras[2];
        Opciones.configuracion = palabras[3];
        Opciones.lenguaje = palabras[4];
        Puntaje.Puntaje = palabras[5];
    }
}
