/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.phild.javainput;

/**
 *
 * @author owner
 */
public class JavaInput {

    public static void main(String[] args)
    throws java.io.IOException{
        char ch;
        System.out.print("Press a key followd by ENTER:" );
        ch = (char)System.in.read();  // get a char
        System.out.println("Your key is: " + ch);
        
        
        
    }
}
