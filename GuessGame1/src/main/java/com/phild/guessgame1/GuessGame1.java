/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.phild.guessgame1;

/**
 *
 * @author owner
 */
public class GuessGame1 {

    public static void main(String[] args)
    throws  java.io.IOException{
        char ch, answer = 'K';
        System.out.println("I'm thinking of a letter betwen A and Z.");
        System.out.println("Can you guess it: ");
        
        ch = (char)System.in.read(); // get a char
        
        if(ch == answer)
            System.out.println("** Right **");
        else
            System.out.println("...Sorry, you're wrong.");
                
     
    }
}
