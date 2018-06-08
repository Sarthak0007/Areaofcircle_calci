/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaofcircle_calci;

import java.util.Scanner;


public class Areaofcircle_calci {

   
    public static void main(String[] args) {
       
         double r ,a ;
        
        Scanner scn  =new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        r =scn.nextDouble();
        
        a =3.14*r*r;
        
        System.out.println("Area of circle is :" + a);
    }
    
}
