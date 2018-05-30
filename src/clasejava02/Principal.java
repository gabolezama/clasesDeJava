/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasejava02;

/**
 *
 * @author educacionit
 */
import java.util.Scanner;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean error=false;
        
        Scanner ingresoPalabra=new Scanner(System.in);
        
        System.out.println("inserte primera palabra");
        String palabra=ingresoPalabra.nextLine();
        
                     
        int hasta = palabra.length()/2;
                              
        
        for(int i=0,j=palabra.length()-1;i<hasta;i++,j--)
        {          
         if(palabra.toUpperCase().charAt(i)!=palabra.toUpperCase().charAt(j)){error = true;break;}         
        }
        
        if (error == false){
            System.out.println("La palabras es palindromo");
        }else{
            System.out.println("La palabras NO es palindromo");
        }
        
    }
    
}
