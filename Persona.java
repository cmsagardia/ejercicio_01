public class Persona {
    
    public Persona(String nom, int ed){
        nombre=nom;
        edad=ed;
        dni=1;
        descripcion="Persona";
    }
    
public String getNombre(){
    
    return nombre;
}    

public int getEdad(){
    
    return edad;
}

public double getdni(){
    
    return dni;
}

public String getDescripcion(){
    
    return descripcion;
}
    
public String mostrarDatos(){
    
    return "Nombre: "+nombre+", Edad: "+edad+" ,DNI: "+dni+" ,Descripción: "+descripcion;
}

private String nombre;
private int edad;
private double dni;
private String descripcion;
    
}
