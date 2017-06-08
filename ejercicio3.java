
package practica9;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
      Scanner datos= new Scanner (System.in); 
       //Declararvariables.
       int n,j,i;
       // pedir al usuario que ingrese valiables
         System.out.print("INGRESE EL LIMITE DE LA MATRIZ: ");
         n=datos.nextInt();
        int [][]matriz= new int [n][n];
        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
                System.out.print("["+i+"]["+j+"] = ");
                matriz [i][j]= datos.nextInt();
            }
        }
        // para presentar la matriz.
        System.out.println("PRESENTACION DE LA MATRIZ:");
        System.out.println();
        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
                System.out.print(matriz[i][j]+ " ");
            }
               System.out.println();
        }
        //procedimiento para sacar la diagonal principal:
        System.out.println();
        System.out.println("LA DIAGONAL PRINCIPAL: ");
        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
                if (i==j){
                    System.out.println( matriz [i][j] +" ");
                }
              System.out.print("");
            }
        }
        // para sacar la diagonal secundaria.
       
        System.out.println("LA DIAGONAL SECUNDARIA: ");
        for (i=0;i<n;i++){
            for(j=0;j<n;j++){
                if (i+j==n-1){
                    System.out.println(matriz [i][j]+ " ");
                }
                 System.out.print("");
            }
        }
        // para sacar los numeros sobre la diagonal principal.
        System.out.println("LOS NUMEROS SOBRE LA DIAGONAL PRINCIPAL: ");
        for(i=0;i<n;i++){
            for (j=0;j<n;j++){
                if (i<j){
                    System.out.println(matriz[i][j]+ " ");
                }
                System.out.print(""); 
            }
        }
        // para sacar los numeros sobre la diagonal secundaria.
        System.out.println("LOS NUMEROS SOBRE LA DIAGONAL SECUNDARIA: ");
        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
                if (i+j<n-1){
                    System.out.println(matriz [i][j]+ " ");
                }
                System.out.print("");
            }
        }
        // para sacar los numeros bajo la diagonal principal.
        System.out.println("LOS NUMEROS BAJO LA DIAGONAL PRINCIPAL: ");
        for(i=0;i<n;i++){
            for (j=0;j<n;j++){
                if (i>j){
                    System.out.println(matriz[i][j]+" ");
                }
                System.out.print("");
            }
        }
        // para sacar los numeros bajo la diagonal secundaria.
        System.out.println("LOS NUMEROS BAJO LA DIAGONAL SECUNDARIA: ");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if (i+j>n-1){
                    System.out.println(matriz[i][j]+ " ");
                }
                System.out.print("");
            }
        }
        // para sacar los numeros en zic zac de una matriz.
        System.out.println(" LOS NUMEROS EN ZIC ZAC DE LA MATRIZ: ");
        for (j=0;j<n;j++){
            if (j % 2==0){
                for (i=0;i<n;i++){
                   System.out.println(matriz [i][j]+" ");  
                }
                   System.out.println(" -->");
            }else{
                  for (i=n-1;i>=0;i--){
                     System.out.println(matriz [i][j]+ " ");
                      }
                     System.out.println("-->");
                    }    
        }
               
    }
}
   
    

