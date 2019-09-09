/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Beans.Estudiantes;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONException;
import org.json.JSONObject;


/**
 *
 * @author Andres
 */
public class controladorEstudiante extends HttpServlet {
   
   

   
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
        
        
        String identificacion = request.getParameter("txtIdentificacion");
        String nombres = request.getParameter("txtNombre");
        String apellidos = request.getParameter("txtApellidos");
        String cursos = request.getParameter("txtCurso");
        String jornada = request.getParameter("txtJornada");
        
        Estudiantes estudiantes = new Estudiantes();
        
        //Validar inputs obligatory
        
        estudiantes.setIdentificacion(identificacion);
        estudiantes.setNombres(nombres);
        estudiantes.setApellidos(apellidos);
        estudiantes.setCursos(cursos);
        estudiantes.setJornada(jornada);
        
        boolean inputsNotEmpty = estudiantes.inputEmpty();
        
        
       
        
        //Create object for the students
        JSONObject dataStudent = new JSONObject();
        
        try{
            dataStudent.put("id", identificacion);
           dataStudent.put("nombres", nombres);
            dataStudent.put("apellidos", apellidos);
           dataStudent.put("cursos",cursos);
            dataStudent.put("jornada", jornada);
        }catch(JSONException ex){
            System.out.print(ex);
        }
        
        
      /*// Creation array for objects
        JSONArray dataArray = new JSONArray();
        dataArray.put(json);
        
        JSONObject data = new JSONObject();
        try{ 
            data.put("data", dataArray);
        }catch(JSONException ex){
            System.out.print(ex);
            
            
        }*/
        
        //dispatch response to method
        RequestDispatcher dispatch = null;
        
        if(inputsNotEmpty){
            dispatch = request.getRequestDispatcher("succes.jsp");
            request.setAttribute("dataStudent",dataStudent);
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
