
package animales;

import animales.AnimalG;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayMet extends AnimalG{

    ArrayList listaP = new ArrayList();
    
    //crea un metodo para llenar un objeto de tipo perro o  gato
    public void adArray(String tipo, String nombre, String raza, String color, int edad, String agregado) {

        if(tipo.equals("Perro")){
            Perro perro = new Perro();
            perro.setTipoAnimal(tipo);
            perro.setNombre(nombre);
            perro.setRaza(raza);
            perro.setColor(color);
            perro.setEdad(edad);
            perro.setNivelEntrenamiento(agregado);
            listaP.add(perro);
            
        }else if(tipo.equals(tipo)){
            Gato gato = new Gato();
            gato.setTipoAnimal(tipo);
            gato.setNombre(nombre);
            gato.setRaza(raza);
            gato.setColor(color);
            gato.setEdad(edad);
            gato.setToxoplasmosis(agregado);
            listaP.add(gato);
            
        }
        
    }
    
    //hace la consulta del array para luego imprimir
    public String consultaArray(){
        String data = "";
        Iterator itera = listaP.iterator();
        while (itera.hasNext()) {
            Object obj = itera.next();
            AnimalG animal = (AnimalG) obj;
            String tipos = animal.getTipoAnimal();
            if (tipos.equals("Perro")){
                Perro perro = (Perro) obj;
                data += perro.datos();
                
            }else{
                Gato gato = (Gato) obj;
                data += gato.datosG();
            }   
        }
        
        if (listaP.isEmpty()){
            
            String vacioo = "";
            int vac = 0;
            Gato noLleno = new Gato();
            noLleno.setTipoAnimal(vacioo);
            noLleno.setNombre(vacioo);
            noLleno.setRaza(vacioo);
            noLleno.setColor(vacioo);
            noLleno.setEdad(vac);
            noLleno.setToxoplasmosis(vacioo);
            listaP.add(noLleno);
            data = noLleno.datosG();
            
        }
        
        return data;
    }
    
    //elimina la posicion que se le indica en arraylist
    public void delArray(int indice){
        
        listaP.remove(indice);
    }

    //hace el promedio de las edades de todos lo animales
    @Override
    public double promedioEdad() {
        int promEdad = 0;
        int iCon = 0;
        Iterator itera = listaP.iterator();
        while (itera.hasNext()) {
            iCon++;
            Object obj = itera.next();
            AnimalG animal = (AnimalG) obj;
            String tipos = animal.getTipoAnimal();
            if (tipos.equals("Perro")){
                Perro perro = (Perro) obj;
                promEdad += Integer.parseInt(perro.getEdad());
                
            }else{
                Gato gato = (Gato) obj;
                promEdad += Integer.parseInt(gato.getEdad());
            }
        }
        
        if (promEdad == 0){
            
            return 0;
        }
        return promEdad/iCon;
    }

    //Calcula el numero de caninos
    @Override
    public int nCaninos() {
        int nCaninos = 0;
        Iterator itera = listaP.iterator();
        while (itera.hasNext()) {
            Object obj = itera.next();
            AnimalG animal = (AnimalG) obj;
            String tipos = animal.getTipoAnimal();
            
            if (tipos.equals("Perro")){
                
                nCaninos++;
            }
        }
        return nCaninos;
    }

    //Calcula el numero de felinos
    @Override
    public int nFelinos() {
        int nFelinos = 0;
        Iterator itera = listaP.iterator();
        while (itera.hasNext()) {
            Object obj = itera.next();
            AnimalG animal = (AnimalG) obj;
            String tipos = animal.getTipoAnimal();
            
            if (tipos.equals("Gato")){
                
                nFelinos++;
            }
        }
        return nFelinos;
        
    }
}
