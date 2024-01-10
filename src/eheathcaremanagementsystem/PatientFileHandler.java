/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eheathcaremanagementsystem;
import java.util.ArrayList;
import java.io.*;
/**
 *
* @author Hira Shahzad and Nida javed
 */
public class PatientFileHandler {
    public void delete(Patient p1){
        ArrayList <Patient> p = read();
        for(Patient i: p)
        {
            if(p1.equals(i)){
                p.remove(i);
                break;
            }
        }
        
            writeNew(p);
    }
    public ArrayList<Patient> read(){
        ArrayList <Patient> p = new <Patient> ArrayList();
        try{
            FileReader fr = new FileReader("Patients.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line !=null)
            {
                String id = line;
                line = br.readLine();
                String name = line;
                line = br.readLine();
                String gender = line;
                line = br.readLine();
                int age = Integer.parseInt(line);
                line = br.readLine();
                String disease = line;
                line = br.readLine();
                String phoneNo = line;
                line = br.readLine();
                p.add(new Patient(id,name,gender,age,disease,phoneNo));
            }
            
        }catch(IOException e){
            
        }
        for(Patient i: p)
            System.out.println(i);
        return p;
    }
    public void update(Patient p){
        //compare with file data on the basis of id
        //update in array list
        //write new arraylist
        ArrayList <Patient> pp = read();
        for(Patient i:pp){
        if(p.p_id.equals(i.getP_id())){
            i.setP_name(p.getP_name());
            i.setP_gender(p.getP_gender());
            i.setP_age(p.getP_age());
            i.setP_disease(p.getP_disease());
            i.setP_phone_No(p.getP_phone_No());
            break;
        }
      }
        writeNew(pp);
    }
    
    public void write(Patient s){
        try{
            FileWriter fw = new FileWriter("Patients.txt",true);
            //fw.write("\n");
            fw.write(s.p_id+"\n");
            fw.write(s.p_name+"\n");
            fw.write(s.p_gender+"\n");
            fw.write(s.p_age+"\n");
            fw.write(s.p_disease+"\n");
            fw.write(s.p_phone_No+"\n");
            fw.close();
        }catch(IOException e){
            
        }
    }
    public void writeNew(ArrayList <Patient> p1){
        //Student s;
        FileWriter fw;
        try{
                fw = new FileWriter("Patients.txt");
                //fw.write("\n");
            
        for(Patient s: p1){
                 fw.write(s.p_id+"\n");
                 fw.write(s.p_name+"\n");
                 fw.write(s.p_gender+"\n");
                 fw.write(s.p_age+"\n");
                 fw.write(s.p_disease+"\n");
                 fw.write(s.p_phone_No+"\n");
        
            }
                fw.close();
        }catch(IOException e){


            }
        }
   
}
