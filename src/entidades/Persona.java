
package entidades;

/* Clase persona */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    private String fechaNac;
    
//Constructores
    
public Persona(){
    this.nombre = " ";
    this.apellido = " ";
    this.edad = 0;
    this.documento = 0;
    this.fechaNac= " ";  
}

public Persona(String nom, String ape, int dni){
    this.nombre = nom;
    this.apellido = ape;
    this.documento = dni;
}

public Persona(String nom, String ape, int edad, int dni, String fechaNac){
    this.nombre = nom;
    this.apellido = ape;
    this.edad = edad;
    this.documento = dni;
    this.fechaNac = fechaNac;
}
    
//getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    //metodo toString que me devuelve la concatenacion de los atributos
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", fechaNac=" + fechaNac + '}';
    }

    
}





