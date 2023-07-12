
package agenda;

import java.util.Scanner;

public class Consola {
    private Scanner sc;
    
    public Consola(){
    this.sc = new Scanner(System.in);
    }
    
    public String leerString(String msg){
        System.out.println(msg);
        return this.sc.nextLine();
    }
    
    public int leerInt(String msg){
        System.out.println(msg);
        return this.sc.nextInt();
    }
    
    public float leerFloat(String msg){
        System.out.println(msg);
        return this.sc.nextFloat();
    }
    
    public boolean leerBoolean(String msg){
        System.out.println(msg);
        return this.sc.nextBoolean();
    }
}
