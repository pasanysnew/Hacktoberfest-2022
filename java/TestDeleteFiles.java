/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicalalgorithms;

//import java.io.File;

import java.io.File;

//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;

/**
 *
 * @author Pasan Yasara
 */
public class TestDeleteFiles {
    public static void main(String[] args)  {
//        Files.walk(Paths.get("E:\\SasiaNet\\TASKS\\JB15092021-14891 - Upload Method Change\\2022.02.07 - Modification - text file upload\\temp - Copy\\"))
//                .filter(Files::isRegularFile)
//                .map(Path::toFile)
//                .forEach(File::delete);

        try
        {
            File f = new File("E:\\SasiaNet\\TASKS\\JB15092021-14891 - Upload Method Change\\2022.02.07 - Modification - text file upload\\temp - Copy\\test.txt");
            f.delete();
        }
        catch(Exception e)
        {
        }

        boolean test=true;
        
        if(test==true)
        {
            System.out.println("tested");
        }


    }
    
}
