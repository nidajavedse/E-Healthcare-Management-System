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
public class DoctorFileHandler {
     
    public void delete(Doctor d1){
        ArrayList <Doctor> d = read();
        for(Doctor i: d)
        {
            if(d1.equals(i)){
                d.remove(i);
                break;
            }
        }
        
            writeNew(d);
    }
    
    public ArrayList<Doctor> read(){
        ArrayList <Doctor> d = new <Doctor> ArrayList();
        try{
            FileReader fr = new FileReader("Doctors.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line !=null)
            {
                String id = line;
                line = br.readLine();
                String name = line;
                line = br.readLine();
                String gender= line;
                line = br.readLine();
                String Spec= line;
                line = br.readLine();
                String phNo= line;
                line = br.readLine();
                int fee = Integer.parseInt(line);
                line = br.readLine();
                int t1= Integer.parseInt(line);
                line = br.readLine();
                int t2= Integer.parseInt(line);
                line = br.readLine();
                String pass= line;
                line = br.readLine();
                d.add(new Doctor(id,name,gender,Spec,phNo,fee,t1,t2,pass));
            }
            
        }catch(IOException e){
            
        }
        for(Doctor i: d)
            System.out.println(i);
        return d;
    }
    
    public void write(Doctor d){
        try{
            FileWriter fw = new FileWriter("Doctors.txt",true);
            //fw.write("\n");
            fw.write(d.d_id+"\n");
            fw.write(d.d_name+"\n");
            fw.write(d.d_gender+"\n");
            fw.write(d.d_specialize+"\n");
            fw.write(d.d_phoneNo+"\n");
            fw.write(d.d_fee+"\n");
            fw.write(d.d_time1+"\n");
            fw.write(d.d_time2+"\n");
            fw.write(d.password+"\n");
            fw.close();
        }catch(IOException e){
            
        }
    }       
    public void update(Doctor d){
        //compare with file data on the basis of id
        //update in array list
        //write new arraylist
          ArrayList <Doctor> dd = read();
        for(Doctor i:dd){
        if(d.d_id.equals(i.getd_Id())){
            i.setd_Name(d.getd_Name());
            i.setD_gender(d.getD_gender());
            i.setd_Specialize(d.getd_Specialize());
            i.setd_PhoneNo(d.getd_PhoneNo());
            i.setd_Fee(d.getd_Fee());
            i.setd_Time1(d.getd_Time1());
            i.setd_Time2(d.getd_Time2());
            i.setPassword(d.getPassword());
            break;
        }
      }
        writeNew(dd);
    }
    public void writeNew(ArrayList <Doctor> d1){
        //Student s;
        FileWriter fw;
        try{
                fw = new FileWriter("Doctors.txt");
                //fw.write("\n");
            
        for(Doctor d: d1){
            fw.write(d.d_id+"\n");
            fw.write(d.d_name+"\n");
            fw.write(d.d_gender+"\n");
            fw.write(d.d_specialize+"\n");
            fw.write(d.d_phoneNo+"\n");
            fw.write(d.d_fee+"\n");
            fw.write(d.d_time1+"\n");
            fw.write(d.d_time2+"\n");
            fw.write(d.password+"\n");
        
            }
                fw.close();
        }catch(IOException e){


            }
        }
}
