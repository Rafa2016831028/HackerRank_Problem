/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warm_Up_Challange;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
 class Sollution {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String str = new String();
        str = sc.next();
        int cnt=0;
        int seaLevel=0;
        for(int i=0; i<n ;i++){
            if(str.charAt(i)=='U' && (seaLevel+1)==0){
                cnt++;
                seaLevel++;
                
            }else if(str.charAt(i)=='U'){
                seaLevel++;
            } else if (str.charAt(i)=='D') {
                seaLevel--;
            }
        }
        System.out.println(cnt);
    }
}
