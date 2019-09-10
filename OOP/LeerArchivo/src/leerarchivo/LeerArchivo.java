/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package leerarchivo;

import java.io.FileReader;

/**
 *
 * @author Andres
 */
public class LeerArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            FileReader leerArchivo = new FileReader("/Users/Andres/Desktop/CUARTO_SEMESTRE_2019/JAVA/archivo1.txt");
            int valor = leerArchivo.read();
            while(valor != -1){
                 System.out.print((char)valor);
                 valor = leerArchivo.read();
            }
            leerArchivo.close();
        } catch(Exception e){
            System.out.println("Error E/S"+ e);
        }

    }

}
