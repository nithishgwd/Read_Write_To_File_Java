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
            
            //FileWriter f1w = new FileWriter("read.txt");
            //f1w.write("welcome to java program");
            //f1w.close();
            
            String s = "";
            LocalTime i;
            int j;
            FileReader f1r = new FileReader("Input.txt");
            while((j=f1r.read())!=-1) {
                s += (char)j;
            }
            System.out.println(s);
            FileWriter fw = new FileWriter("Output.txt",true);
            fw.write("\n\n");
            
            i=java.time.LocalTime.now();
            
            fw.write(i.toString());
            fw.write("\n");
            fw.write(s);
            f1r.close();
            fw.close();
        }
        catch(IOException exception){
            System.out.println(" Unfortunately an error has been occurred. ");  
            exception.printStackTrace();
        }



   }
}