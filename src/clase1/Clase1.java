/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;
import java.util.Scanner;
/**
 *
 * @author fernando
 */
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*System.out.println("Hola Mundo");
        
        System.out.print("CESUN");*/
        
     
        
       /* Scanner a = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");
        n = a.nextInt();
        System.out.println("Tabla del " + n);
        for(int i = 1; i<=10; i++){
        System.out.println(n + " * " + i + " = " + n*i);*/
        
        
        int numero;
        System.out.print("Ejercicio3: ");
        Scanner ejercicio2 = new Scanner(System.in);
        numero=ejercicio2.nextInt();
        if(numero<0)
        {
            numero= numero*-1;
        }        
        System.out.println(numero); 
        
        
        
       Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Ejercicio4: ");
        System.out.print("Introduzca primer número: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca segundo número: ");
        n2 = sc.nextInt();
        System.out.print("Introduzca tercer número: ");
        n3 = sc.nextInt();
          if(n1 > n2)
             if(n1>n3)
                System.out.println("El mayor es: " + n1);
               else
                System.out.println("el mayor es: " + n3);
          else if(n2>n3)
                System.out.println("el mayor es: " + n2);
                  else
                System.out.println("el mayor es: " + n3);
          if(n1 < n2)
             if(n1<n3)
                System.out.println("El menor es: " + n1);
               else
                System.out.println("el mmenor es: " + n3);
          else if(n2<n3)
                System.out.println("el menor es: " + n2);
                  else
                System.out.println("el menor es: " + n3);
        
       
        System.out.print("Ejercicio 5:");
        Scanner ejercicio5 = new Scanner(System.in);
        int par;
        par=ejercicio5.nextInt();
        
        if(par==0){
            System.out.println("el numero es 0");
        }
        
        if(par%2==0){
            System.out.println("el numero es par");     
        }
        else{
           System.out.println("el numero es impar"); 
        }
    }
    
    
}
