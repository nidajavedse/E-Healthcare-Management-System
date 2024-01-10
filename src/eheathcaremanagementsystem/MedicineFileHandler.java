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
public class MedicineFileHandler {
      public void delete(Medicine m1){
        ArrayList <Medicine> m = read();
        for(Medicine i: m)
        {
            if(m1.equals(i)){
                m.remove(i);
                break;
            }
        }
        
            writeNew(m);
    }
    
    public ArrayList<Medicine> read(){
        ArrayList <Medicine> m = new <Medicine> ArrayList();
        try{
            FileReader fr = new FileReader("Medicines.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line !=null)
            {
                String name = line;
                line = br.readLine();
                int price = Integer.parseInt(line);
                line = br.readLine();
                String e_date = line;
                line = br.readLine();
                m.add(new Medicine(name,price,e_date));
            }
            
        }catch(IOException e){
            
        }
        for(Medicine i: m)
            System.out.println(i);
        return m;
    }
    
    public void write(Medicine m){
        try{
            FileWriter fw = new FileWriter("Medicines.txt",true);
            //fw.write("\n");
            fw.write(m.m_name+"\n");
            fw.write(m.m_price+"\n");
            fw.write(m.m_expiryDate+"\n");
            fw.close();
        }catch(IOException e){
            
        }
    }
    
    public void update(Medicine m){
        //compare with file data on the basis of id
        //update in array list
        //write new arraylist
        ArrayList <Medicine> mm = read();
        for(Medicine i:mm){
        if(m.m_name.equals(i.getm_Name())){
            i.setm_Price(m.getm_Price());
            i.setm_ExpiryDate(m.getm_ExpiryDate());
            break;
        }
      }
        writeNew(mm);
    }
    public void writeNew(ArrayList <Medicine> m1){
        //Student s;
        FileWriter fw;
        try{
                fw = new FileWriter("Medicines.txt");
                //fw.write("\n");
            
        for(Medicine m: m1){
                fw.write(m.m_name+"\n");
                fw.write(m.m_price+"\n");
                fw.write(m.m_expiryDate+"\n");
            }
                fw.close();
        }catch(IOException e){


            }
        }
}
