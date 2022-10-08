/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicalalgorithms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Pasan Yasara
 */
public class Test {
    
     public static boolean QuestionsMarks(String str) {
    // code goes here  
    Pattern p = Pattern.compile("([0-9])([?])([?])([?]+)([0-9])");
    Matcher m = p.matcher(str);
    
    return m.find();
  }
    
    public static void main(String[] args) {
        
        //String str = "a______b_________555555555555aaaa";
        String tr = "fsdf3234@#!@#";
        
        tr = tr.replaceAll("[a-zA-Z]", "");
        System.out.println(tr);
        
        //Scanner s = new Scanner(System.in);
        //System.out.println(QuestionsMarks(s.nextLine()));
        
    }
    
}
