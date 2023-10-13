
package controlador;

import animales.ArrayMet;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(name = "miServlet", urlPatterns = {"/miServlet"})
public class miServlet extends HttpServlet {
    ArrayMet lista = new ArrayMet();
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        //si hay un daro para eliminar datos del arraylist
        if (request.getParameter("btn1") != null){
            
            //toma el numero del formulario a eliminar
            int numL = Integer.parseInt(request.getParameter("btn1"));
            
            //le resta uno para acomodar lo que se ve con el arrayList iniciado en 0
            lista.delArray((numL-1));

            //envio de los datos al jsp
            request.getSession().setAttribute("lista", lista.consultaArray());
            request.getSession().setAttribute("promedio", lista.promedioEdad());
            request.getSession().setAttribute("caninos", lista.nCaninos());
            request.getSession().setAttribute("felinos", lista.nFelinos());
            
            RequestDispatcher rd = request.getRequestDispatcher("datos.jsp");
            rd.forward( request, response);
            
        }else{
            //añade y muestra los datos del arraylist
            String agregado = "";
            String tipoAnimal = request.getParameter("tipoAnimal");
            String nombre = request.getParameter("nombre");
            String raza = request.getParameter("raza");
            String color = request.getParameter("color");
            int edad = Integer.parseInt(request.getParameter("edad"));
            
            //condicion setear la caracteristica gato o perro
            if (tipoAnimal.equals("Perro")) {
                
                agregado = request.getParameter("adiestramiento");
            }else if(tipoAnimal.equals("Gato")){
            
                agregado = request.getParameter("toxoplasmosis");
            }
            
            //añade el objeto con los parametros intgresados 
            lista.adArray(tipoAnimal, nombre, raza, color, edad, agregado);
            
            //envio al jsp la info de servlet
            request.getSession().setAttribute("promedio", lista.promedioEdad());
            request.getSession().setAttribute("caninos", lista.nCaninos());
            request.getSession().setAttribute("felinos", lista.nFelinos());
            request.getSession().setAttribute("lista", lista.consultaArray());
            RequestDispatcher rd = request.getRequestDispatcher("");
            rd.forward( request, response);
            }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

