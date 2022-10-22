package nithish_221047018;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;




public class File_Copy_Write_To_Another_File{



   public static void main(String[] args) {
        
        try {
            
            File f2 = new File("output.txt");
            if(f2.createNewFile()) {
                System.out.println("File "+f2.getName()+" is successfully created");
            }
            else {
                System.out.println("File exist");
            }
            
            String s = "",c="";
            LocalTime i;
            int j,h;
            FileReader f1r = new FileReader("Input.txt");
            while((j=f1r.read())!=-1) {
                s += (char)j;
            }
            
            f1r.close();
            System.out.println("\n-> Data Copied From Input File\n\n"+ s);
            FileWriter fw = new FileWriter("Output.txt",true);
            fw.write("\n");
            
            i=java.time.LocalTime.now();
            
            fw.write(i.toString());
            fw.write("\n");
            fw.write(s);
            fw.close();
            
            FileReader ro = new FileReader("Output.txt");
            while((h=ro.read())!=-1) {
                c += (char)h;
            }
            System.out.println("\n->Data present in Output File\n\n");
            System.out.println(c);
            ro.close();
            
        }
        catch(IOException exception){
            System.out.println(" Unfortunately an error has been occurred. ");  
            exception.printStackTrace();
        }



   }
}
