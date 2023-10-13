/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

import animales.AnimalG;

public class Perro extends AnimalG{
    
    protected String nivelEntrenamiento;

    public Perro(String nivelEntrenamiento, String tipoAnimal, String nombre, String raza, String color, int edad) {
        super(tipoAnimal, nombre, raza, color, edad);
        this.nivelEntrenamiento = nivelEntrenamiento;
    }

    public Perro(){
        
    }

    public String getNivelEntrenamiento() {
        return nivelEntrenamiento;
    }

    public void setNivelEntrenamiento(String nivelEntrenamiento) {
        this.nivelEntrenamiento = nivelEntrenamiento;
    }
    
    //busca los datos para imprimir en una tabla
    public String datos(){
        
        return "<tr><td>" + tipoAnimal + "</td>" +
               "<td>" + nombre + "</td>" +
               "<td>" + raza + "</td>" +
               "<td>" + color + "</td>" +
               "<td>" + edad + "</td>" +
               "<td> No aplica" + "</td>" +
               "<td>" + nivelEntrenamiento + "</td></tr>";
        
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

