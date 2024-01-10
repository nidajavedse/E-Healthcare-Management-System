/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eheathcaremanagementsystem;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author Hira Shazad
 */
public class AdminFileHandler {
   
    
    public ArrayList<Admin> read(){
        ArrayList <Admin> a = new <Admin> ArrayList();
        try{
            FileReader fr = new FileReader("Admin.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line !=null)
            {
                String id = line;
                line = br.readLine();
                String pas = line;
                line = br.readLine();
                a.add(new Admin(id,pas));
            }
            
        }catch(IOException e){
            
        }
        for(Admin i: a)
            System.out.println(i);
        return a;
    }
    
    public void write(Admin a){
        try{
            FileWriter fw = new FileWriter("Admin.txt",true);
            fw.write("\n");
            fw.write(a.a_id+"\n");
            fw.write(a.a_password+"\n");

            fw.close();
        }catch(IOException e){
            
        }
    }
    
    public void writeNew(ArrayList <Admin> a1){
        //Student s;
        FileWriter fw;
        try{
                fw = new FileWriter("Admin.txt");
                fw.write("\n");
            
        for(Admin a: a1){
                fw.write(a.a_id+"\n");
                fw.write(a.a_password+"\n");
        
            }
                fw.close();
        }catch(IOException e){


            }
        }
}
