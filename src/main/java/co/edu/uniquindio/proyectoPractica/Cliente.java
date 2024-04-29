package co.edu.uniquindio.proyectoPractica;

public class Cliente {
    private String nombre;
    private int edad;
    private String id;

    public  Cliente(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", id='" + id + '\'' +
                '}';
    }
}
