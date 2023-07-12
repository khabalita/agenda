
package agenda;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/* EJERCICIO AGENDA 2.0 CON IMPLEMENTACION DE ARRAYLIST, POLIMORFISMO Y HERENCIA */
public class TestMain {
    
    //programa principal
    public static void main(String[] args) {
        //Instancia de clases
        Scanner sc = new Scanner(System.in); 
        ArrayList <Persona> personas = new ArrayList<>();
        
        System.out.println("Ingrese la cantidad de personas: ");
        int cantPer = sc.nextInt();
        
        
        
        for(Persona persona: personas){
            if(!personas.isEmpty()){
                System.out.println(persona.toString());
            }
            else System.out.println("El arreglo está vacio");
        }
    }
    
}
