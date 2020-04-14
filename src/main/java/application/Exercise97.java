/* Fazer um programa para ler dois números inteiros M e N, e depois ler uma ma-
 * triz de M linhas por N colunas, contendo números inteiros, podendo haver repeti-
 * ções. Em seguida, ler um número inteiro X que pertence a matriz. Para cada ocor-
 * rência de X, mostrar os valores a esquerda, acima, a direita e abaixo de X, quando
 * houver, conforme exemplo.
 */
package application;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author andressa-est
 */
public class Exercise97 {
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("%n%n");
        // Lendo o numero de linhas e colunas da matriz
        System.out.print("Enter number of lines: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();
        
        int [][] mat = new int[m][n];
        System.out.printf("%n%n");
        
        // Lendo os elementos da matriz
        for(int i=0; i<mat.length; i++){
            
            for(int j=0; j<mat[i].length; j++){
                
                System.out.printf("Enter element line %d column %d: ", i, j);
                mat[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        
        // exibindo os elementos da matriz
        System.out.println("Matrix: ");
        for(int i=0; i<mat.length; i++){
            
            for(int j=0; j<mat[i].length; j++){
                
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.printf("%n%n");
        
        System.out.print("Enter number to be found: ");
        int number = sc.nextInt();
        
       
        for(int i=0; i<mat.length; i++){
            
            for(int j=0; j<mat[i].length; j++){
                
                if(number == mat[i][j]){
                    
                    System.out.printf("Line %d Column %d",  i, j);
                    System.out.println();
                    
                    if(j > 0){
                        System.out.printf("Left: %d", mat[i][j-1]);
                    }
                    
                    if (i > 0){
                        System.out.printf("Above: %d", mat[i-1][j]);
                    } 
                    
                    if (j < mat[i].length-1){
                        System.out.printf("Right: %d", mat[i][j+1]); 
                    }
                    
                    if(i < mat.length-1){
                        System.out.printf("Down %d", mat[i+1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}