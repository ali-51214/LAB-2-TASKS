/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Ali
 */
import java.util.Scanner;


 public class Lab2{
     
     public static void main(String[] arg ){
         Scanner scanner = new Scanner(System.in);
         int N = scanner.nextInt();
        
        int[] A = new int[N];
        for(int i=0;i<N; i++){
            A[i]= scanner.nextInt();
            
        }
         
         int count = 0;
         for(int i=0;i<N;i++){
             int sum=0;
             for(int j=i; j<N;j++){
                 sum += A[j];
                 if(sum<0){
                     count++;
                 }
             }
         }
         
         System.out.println(count);
         scanner.close();
     }
 }