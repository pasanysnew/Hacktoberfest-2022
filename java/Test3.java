/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicalalgorithms;

import java.util.Iterator;

/**
 *
 * @author Pasan Yasara
 */
public class Test3 {
    
    public static void main(String[] args) {
        String str="psan";
        for(int i=0; i<str.length(); i++)
        {
            for(int j=i+1; j<str.length(); j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    System.out.println("Not unique charactors");
                    break;
                }
            }
        }
        
        System.out.println("Unique"); //this is always printing. This is true,if only this one prints
    }
    
}
