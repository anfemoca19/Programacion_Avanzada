/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Beans.Profesor;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Andres
 */
public class controladorProfesor extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String cedula = request.getParameter("txtCedula");
        String nombres = request.getParameter("txtNombreP");
        String apellidos = request.getParameter("txtApellidosP");
        String especialidad = request.getParameter("txtEspecialidad");
        String jornada = request.getParameter("txtJornada");
        
       Profesor profesor = new Profesor();
        
        //Validar inputs obligatory
        
        profesor.setCedula(cedula);
        profesor.setNombres(nombres);
        profesor.setapellidos(apellidos);
        profesor.setespecialidad(especialidad);
        profesor.setJornada(jornada);
        
        boolean inputsNotEmpty = profesor.inputEmpty();
        
        
        /*creation object main
        
        exampler
        { 
         "data
         */
        
        //Create object for the students
        JSONObject dataTeachers = new JSONObject();
        
        try{
           dataTeachers.put("id", cedula);
            dataTeachers.put("nombres", nombres);
           dataTeachers.put("apellidos", apellidos);
            dataTeachers.put("especialidad",especialidad);
           dataTeachers.put("jornada", jornada);
        }catch(JSONException ex){
            System.out.print(ex);
        }
       /* // Creation array for objects
        JSONArray dataArray = new JSONArray();
        dataArray.put(json);
        
        JSONObject data = new JSONObject();
        try{ 
            data.put("data", dataArray);
        }catch(JSONException ex){
            System.out.print(ex);
        }*/
        //dispatch
        RequestDispatcher dispatch = null;
        
        if(inputsNotEmpty){
            dispatch = request.getRequestDispatcher("succes.jsp");
            request.setAttribute("dataTeachers",dataTeachers);
        } else {
            dispatch = request.getRequestDispatcher("error.jsp");
        }
        //dispatch of response(rutes the response
        dispatch.forward(request, response);
    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
