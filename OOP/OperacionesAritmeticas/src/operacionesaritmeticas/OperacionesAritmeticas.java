/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operacionesaritmeticas;

import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class OperacionesAritmeticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dato = new Scanner(System.in);
        System.out.println("Numero Uno: ");
        short nUno = dato.nextShort();
        
        System.out.println("Numero Dos: ");
        short nDos = dato.nextShort();
        
        //Programacion estructurada
        /* short resultado = (short)(nUno + Ndos);
         System.out.prinln("Resultado :" + resultaado);*/

         //Programacion orientada a objetos
         //Instanciar la clase par ausar sus atributos o su metodos
         operacionSuma operSuma = new operacionSuma();

         //Una manera de como usar los atributos
         
         operSuma.numUno = nUno;
         operSuma.numDos = nDos;
         
         //Imprimir o mostrar los atributos
         System.out.println(operSuma.numUno + " y " + operSuma.numDos);
         
         //Invocar los  metodos
         operSuma.sumar(operSuma.numUno, operSuma.numDos);
    }

}
