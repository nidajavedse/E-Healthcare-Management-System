/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eheathcaremanagementsystem;

/**
 *
 * @author Hira Shazad
 */
public class Appointment {
   
    String p_id;
    String d_id;
    String time;
    
    //default constructor
   
   public Appointment(){
       p_id=null;
       d_id=null;
       time = null;
   }
   
    //parametrized constructor
  
   public Appointment(String p_id,String d_id,String a_time){
       this.p_id=p_id;
       this.d_id=d_id;
       this.time=a_time;
   }
  
   //setters
   
   public void setp_Id(String p_id){
       this.p_id=p_id;
   }
   
   public void setd_Id(String d_id){
       this.d_id=d_id;
   }
   
   public void seta_Time(String time){
       this.time=time;
   }
   
   // getters
   
   public String getp_Id(){
       return p_id;
   } 
   
   public String getd_Id(){
       return d_id;
   }
   
   public String getTime(){
       return time;
   }

    @Override
    public String toString() {
        return  "Patient's Id : " + p_id + "\nDoctor's ID : " + d_id + "\nAppointment Time : " + time ;
    }
}
