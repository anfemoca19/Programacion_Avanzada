/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creararchivos;
import java.io.FileWriter;

/**
 *
 * @author Andres
 */
public class CrearArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String carta = "Esta es tu carta";
        String nomArchivo = "archivo1.txt";
        String rutaArchivo = "/Users/Andres/Desktop/CUARTO_SEMESTRE_2019/JAVA/";
                                

     /*Vamos a crear una insrucciones*/
     try{
        FileWriter archivo = new FileWriter(rutaArchivo+nomArchivo);
        archivo.write(carta);
        archivo.close();
     }catch(Exception e){
        
      }

    }

}
