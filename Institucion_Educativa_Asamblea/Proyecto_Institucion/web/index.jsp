<%-- 
    Document   : index
    Created on : 28/08/2019, 06:39:52 PM
    Author     : Andres
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" crossorigin="anonymous">
        <title>Formulario</title>
    </head>
    <body>
        
         <div class="container">
              <h1 class="display-4 text-center mt-3"> Institución Educativa AM </h1>
              <hr>
            <div class="row">
                <div class="col-12 col-md-12 offset-lg-4 col-lg-4">
                  <form action="Login" method="post" class="container mt-3 border p-4">
                    <div class="form-group">
                      <label for="u">Usuario</label>
                      <input type="text" class="form-control" name="txtUser" id="u" placeholder="Usuario">
                    </div>
                    <div class="form-group">
                      <label for="p">Contraseña</label>
                      <input type="password" name="txtPass" class="form-control" id="p" placeholder="Password">
                    </div>
                    <div class="form-group">
                      <button type="submit" class="btn btn-secondary btn-block">Ingresar</button>
                    </div>
                  </form>
                </div>
             </div>
        </div>
  
    </body>
</html>
