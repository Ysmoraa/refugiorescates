
package animales;

import animales.AnimalG;

public class Gato extends AnimalG{
    
    protected String toxoplasmosis;

    public Gato() {
        
    }
    
    public Gato(String toxoplasmosis, String tipoAnimal, String nombre, String raza, String color, int edad) {
        super(tipoAnimal, nombre, raza, color, edad);
        this.toxoplasmosis = toxoplasmosis;
    }

    public String getToxoplasmosis() {
        return toxoplasmosis;
    }

    public void setToxoplasmosis(String toxoplasmosis) {
        this.toxoplasmosis = toxoplasmosis;
    }
    
    //busca los datos de gato para ponerlos en una tabla
    public String datosG(){
        
        return "<tr> <td>" + tipoAnimal + "</td>" +
               "<td>" + nombre + "</td>" +
               "<td>" + raza + "</td>" +
               "<td>" + color + "</td>" +
               "<td>" + edad + "</td>" +
               "<td>" + toxoplasmosis + "</td>" +
               "<td>No Aplica</td></tr>";
    }

    @Override
    public double promedioEdad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int nFelinos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int nCaninos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

