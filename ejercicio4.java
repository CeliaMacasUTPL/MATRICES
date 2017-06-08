
package practica9;

import java.util.Scanner;

public class ejercicio4 {
  private int [][]mat;
    private Scanner entrada;
    public static void main(String[] args) {
        //FUNCIONES
   // creo un objeto para acceder a cada uno de los elementos de la matriz
   ejercicio4 ma= new ejercicio4();   
    ma.llenar ();
    ma.imprimir ();
    ma.diagonalprincipal();
    ma.diagonalsecundaria();
    ma.sobreladiagonalprincipal();
    ma.sobreladiagonalsecundaria();
    ma.bajoladiagonalprincipal();
    ma.bajoladiagonalsecundaria();
    ma.ziczacmatriz();
    }
    public void llenar(){
        entrada=new Scanner(System.in);
        System.out.println("INGRESE EL LIMITE DE LA MATRIZ: "); 
       int lim = entrada.nextInt();

        mat = new int[lim][lim];
          //llenar la matriz
        System.out.println("LLENADO DE LA MATRIZ");
        for(int i=0;i <lim;i++){
            for(int j=0;j <lim;j++){
              mat[i][j] = entrada.nextInt();
            }
        }
    }
    public void imprimir(){
           //recorrer la matriz
        System.out.println("PRESENTACION DE LA MATRIZ");  
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
              System.out.print(mat[i][j]+" ");  
            }
            System.out.println("");
        }
    }
    
    public void diagonalprincipal(){
         System.out.println("PRESENTACION DE LA DIAGONAL  PRINCIPAL DE LA MATRIZ: ");
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
               if (i==j){
                   System.out.print(mat[i][j]+" ");
              }
            }
            System.out.println();
        }
    }
    
    public void diagonalsecundaria(){
        //recorrer la matriz
        System.out.println("PRESENTACION DE LA DIAGONAL  SECUNDARIA DE LA MATRIZ: ");
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                int lim = 0;
               if (i+j==lim+2){
                   System.out.print(mat[i][j]+" ");
               } 
            }
            System.out.println();
        }
    }
    
    public void sobreladiagonalprincipal(){
        System.out.println("LOS NUMEROS SOBRE LA DIAGONAL PRINCIPAL DE LA MATRIZ: ");
        for (int i=0;i<mat.length;i++){
           for (int j=0;j<mat[i].length;j++){
               if (i<j){
                   System.out.print(mat[i][j]+" ");
               } 
            }
            System.out.println();
        }  
    }
    
    public void sobreladiagonalsecundaria(){
        System.out.println("LOS NUMEROS SOBRE LA DIAGONAL SECUNDARIA DE LA MATRIZ: ");
       for (int i=0;i<mat.length;i++){
           for (int j=0;j<mat[i].length;j++){
                int lim = 0;
               if (i+j<lim+2){
                   System.out.print(mat[i][j]+" ");
               } 
            }
           System.out.println();
        }
    }
    
    public void bajoladiagonalprincipal(){
        System.out.println("LOS NUMEROS BAJO LA DIAGONAL PRINCIPAL DE LA MATRIZ: ");
        for (int i=0;i<mat.length;i++){
           for (int j=0;j<mat[i].length;j++){
               if (i>j){
                   System.out.print(mat[i][j]+" ");
               }
            }
            System.out.println();
        }
    }
    
    public void bajoladiagonalsecundaria(){
        System.out.println("LOS NUMEROS BAJO LA DIAGONAL SECUNDARIA DE LA MATRIZ: ");
        for (int i=0;i<mat.length;i++){
           for (int j=0;j<mat[i].length;j++){
                int lim = 0;
               if (i+j>lim+2){
                   System.out.print(mat[i][j]+" ");
               } 
            }
            System.out.println();
        }
    }
    
    public void ziczacmatriz(){
        System.out.println("LOS NUMEROS EN ZIC ZAC DE LA MATRIZ: ");
      int lim = 0;
        for (int j=0;j<mat.length;j++){
            if (j%2==0){
                for (int i=0;i<mat.length;i++){
                     System.out.println(mat[i][j]+" ");
                }
                System.out.println(" --> ");
               
            }else {
               
                for (int i=mat.length-1;i>=0;i--){
                    System.out.println(mat[i][j]+" ");
                }
                System.out.println(" --> ");
                
            }
            
        }
        System.out.println("FIN");
    }
}
    
