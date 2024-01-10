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
public class PresFileHandler {
      public void delete(Prescription p1){
        ArrayList <Prescription> p = read();
        for(Prescription i: p)
        {
            if(p1.equals(i)){
                p.remove(i);
                break;
            }
        }
        
            writeNew(p);
    }
    
    public ArrayList<Prescription> read(){
        ArrayList <Prescription> p = new <Prescription> ArrayList();
        try{
            FileReader fr = new FileReader("Prescription.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line !=null)
            {
                String pid = line;
                line = br.readLine();
                String pres = line;
                line = br.readLine();
                String date = line;
                line = br.readLine();
                p.add(new Prescription(pid,pres,date));
            }
            
        }catch(IOException e){
            
        }
        for(Prescription i: p)
            System.out.println(i);
        return p;
    }
    
    public void write(Prescription p){
        try{
            FileWriter fw = new FileWriter("Prescription.txt",true);
            //fw.write("\n");
            fw.write(p.pat_id+"\n");
            fw.write(p.prescription+"\n");
            fw.write(p.date+"\n");
            fw.close();
        }catch(IOException e){
            
        }
    }
    
    public void update(Prescription p){
        //compare with file data on the basis of id
        //update in array list
        //write new arraylist
        ArrayList <Prescription> pp = read();
        for(Prescription i:pp){
        if(p.pat_id.equals(i.getPat_id())){
            i.setPrescription(p.getPrescription());
            i.setDate(p.getDate());
            break;
        }
      }
        writeNew(pp);
    }
    public String compare(String pr){
        //compare with file data on the basis of id
        //update in array list
        //write new arraylist
        String m = null;
        ArrayList <Prescription> pp = read();
        for(Prescription p: pp)
        if(pr.equals(p.getPat_id()))
        {
            m=p.getPrescription();
        }
        return m;
    }
    public void writeNew(ArrayList <Prescription> p1){
        //Student s;
        FileWriter fw;
        try{
                fw = new FileWriter("Prescription.txt");
                //fw.write("\n");
            
        for(Prescription p: p1){
                fw.write(p.pat_id+"\n");
                fw.write(p.prescription+"\n");
                fw.write(p.date+"\n");
        
            }
                fw.close();
        }catch(IOException e){


            }
        }
}
