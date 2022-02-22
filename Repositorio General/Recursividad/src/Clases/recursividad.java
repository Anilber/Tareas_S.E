/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author anilb
 */
public class recursividad {
    
    public static void main(String[] args) {
              
        int x = 0;
        while(x!=9) {
            
            
            System.out.println(Ejer_recursividad(x));
            x++;
        }
        
    }
    
            
    public static  int Ejer_recursividad(int x){
    
        if (x==0 || x==1) {
            
            return 1;
        }else{
        
        return Ejer_recursividad(x-1) + Ejer_recursividad(x-2);
        }
    
    }
    
    
}
