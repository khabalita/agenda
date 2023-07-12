
package agenda;

import java.util.Scanner;
import java.util.ArrayList;
import entidades.Persona;

public class Menu {
    Scanner sc = new Scanner(System.in);
    Persona per = new Persona();
    ArrayList <Persona> personas = new ArrayList<>();
    public int opcion;
    
    public void mostrarMenu(){ //método que no devuelve nada para el menu
        do{
            int opcion = sc.nextInt(); //método para mostrar la variable entera
            
            switch(opcion){
                        //Invoco la función ingresar personas        
                case 1: ingresarPersona();
                    break;  
                        //Invoco la función mostrar personas
                case 2: mostrarPersonas();
                    break;
                        //Invoco la función buscar documento
                case 3: buscaDocumento(per, buscarDoc);
                    break;
                case 4: System.out.println("Gracias, vuelva pronto's");
                    break;   
                default: System.out.println("Opcion Incorrecta\n");
            }
        }while(opcion != 4);
    }
    //METODOS public static void ingresarPersonas(ArrayList <Persona> personas){
    public void ingresarPersona(){
        int cantPer = sc.nextInt();
        //Ciclo for para ingresar personas a un ArrayList
        for (int i=0; i < cantPer ; i++) {
            sc.nextLine();
            System.out.println("Persona "+(i+1));
            System.out.println("Nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Apellido: ");
            String apellido = sc.nextLine();
            System.out.println("Edad: ");
            int edad = sc.nextInt();
            System.out.println("Documento: ");
            int documento = sc.nextInt();
            sc.nextLine();
            System.out.println("Fecha nac: ");
            String fechaNac = sc.next(); 
      
            //Uso el metodo .add de ArrayList para agregar a la persona
            personas.add(new Persona(nombre, apellido, edad, documento, fechaNac));
        }
        
    }
    
    public void mostrarPersonas(){
     for(Persona persona: personas){
         System.out.println(persona.toString());
     } 
        
    }
        
}
