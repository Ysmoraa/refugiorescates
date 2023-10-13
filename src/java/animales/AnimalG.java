package animales;

public abstract class AnimalG {
    
    protected String tipoAnimal;
    protected String nombre;
    protected String raza;
    protected String color;
    protected String edad;
    
    public AnimalG () {
    
    }

    public AnimalG(String tipoAnimal, String nombre, String raza, String color, int edad) {
        
        this.tipoAnimal = tipoAnimal;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = ""+edad;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = String.valueOf(edad);
    }
    public abstract double promedioEdad();
    public abstract int nFelinos();
    public abstract int nCaninos();
}