/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.Serializable;

/**
 *
 * @author Andres
 */
public class Login  implements Serializable{
    private String user;
     private String pass;

    public Login() {
    }

    public String getUser() {
        return user;
    }

    public void setEmail(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
     //Metodo de validacion de datos de la autenticacion (password)
    public boolean autenticacion(){
     return (pass.equals("123"))?true:false; 
    }
     
}
