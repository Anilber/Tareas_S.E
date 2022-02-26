/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialrecursividad;

import java.util.Scanner;

/**
 *
 * @author anilb
 */
public class FactorialRecursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para calcular su factorial, este debe ser mayor que 0");
        n = sc.nextInt();
      
        System.out.println("El facorial de "+n+" es "+factorial(n));
        
    }
    
    
    
     public static int factorial(int n){
        
            if (n>0) {
                
                int resultado= n*factorial(n-1);
                
            return resultado;
        }else{
                
                return 1;
            }
       
         }
    
    
    
}
    
    
    

