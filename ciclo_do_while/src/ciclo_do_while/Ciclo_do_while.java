
package ciclo_do_while;

import java.util.Scanner;


public class Ciclo_do_while {

   
    public static void main(String[] args) {
        
        /*int a = 0;
        
        do{
            
            System.out.println(a);
            a++;
            
        }while(a < 5);*/
        
        String dato="";
        
        do{
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Escriba un dato");
            dato = sc.next();
            
            
        }while(!dato.equalsIgnoreCase("andres"));
        
        
    }
    
}
