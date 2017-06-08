
package practica9;

import java.util.Scanner;

public class ejercicios2 {
    public static void main(String[] args) {
      Scanner datos= new Scanner (System.in);
     //Declarar variables:
     int i,j,n;
     // pedir al usuario que ingrese valores.
     System.out.print("INGRESE UN LIMITE: ");
     n=datos.nextInt();
     int [][] matriz = new int [n][n];
       for (i=0;i<n;i++){
           for (j=0;j<n;j++){
             System.out.print(" ["+i+ "]["+j+"] = ");
             matriz [i][j]=datos.nextInt();
           }
        } 
       // para presentar la matriz con los numeros ingresados por teclado.
        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
                System.out.print(matriz [i][j]+ " ");
            } 
              System.out.println("");
        }   
         
   
   } 
}
