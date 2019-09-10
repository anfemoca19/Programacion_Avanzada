/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operacionesaritmeticas;

/**
 *
 * @author Andres
 */
public class operacionSuma {
    //Atributos
    public short numUno, numDos;

    //Metodos
    public void sumar(short numeroUno, short numeroDos){
        short rSuma = 0;
        rSuma = (short)(numeroUno + numeroDos);
        System.out.println("La suma es : " + rSuma);
    }
}
