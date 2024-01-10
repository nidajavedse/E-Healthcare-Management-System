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
 * @author Hira Shahzad and Nida javed
 */
public class AppointmentFileHandler {
     
     public void delete(Appointment a1){
        ArrayList <Appointment> a = read();
        for(Appointment i: a)
        {
            if(a1.equals(i)){
                a.remove(i);
                break;
            }
        }
        
            writeNew(a);
    }
    
    public ArrayList<Appointment> read(){
        ArrayList <Appointment> a = new <Appointment> ArrayList();
        try{
            FileReader fr = new FileReader("Appointments.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line !=null)
            {
                String p_id = line;
                line = br.readLine();
                String d_id = line;
                line = br.readLine();
                String time = line;
                line = br.readLine();
                a.add(new Appointment(p_id,d_id,time));
            }
            
        }catch(IOException e){
            
        }
        for(Appointment i: a)
            System.out.println(i);
        return a;
    }
    
    public void write(Appointment a){
        try{
            FileWriter fw = new FileWriter("Appointments.txt",true);
            //fw.write("\n");
            fw.write(a.p_id+"\n");
            fw.write(a.d_id+"\n");
            fw.write(a.time+"\n");
            fw.close();
        }catch(IOException e){
            
        }
    }
    
     public String search(String id){
        ArrayList <Appointment> a = read();
        
         String m=null;
         
          for(Appointment i: a)
        {
            if(id.equals(i.p_id)){
             
              m="\n Hi! Welcome to HN Health Care Management System.\n"+i.toString()+"\nYou'r appointment is confirmed. \nThanks for visting HN online hospital ";
                
                break;
            }
        }
        return m;
    }
    public void writeNew(ArrayList <Appointment> a1){
        //Student s;
        FileWriter fw;
        try{
                fw = new FileWriter("Medicines.txt");
                //fw.write("\n");
            
        for(Appointment a: a1){
                fw.write(a.p_id+"\n");
                fw.write(a.d_id+"\n");
                fw.write(a.time+"\n");
            }
                fw.close();
        }catch(IOException e){


            }
        }

}
