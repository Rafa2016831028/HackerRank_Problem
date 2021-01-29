/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warm_Up_Challange;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Sales_By_March {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        int[] container = new int[n];
        for(int i=0; i<n ;i++){
            container[i]= sc.nextInt();
        }
        Arrays.sort(container);
        int count =0;
        for(int i=1; i<n ; i++){
            if(container[i-1]==container[i]){
                count++;
                i+=1;
                continue;
                
            } else {
                continue;
            }
        }
        System.out.println(count);
//        for(int i=0; i<n ;i++){
//            System.out.print(container[i]+"  ");
//        }
    }
    
}
