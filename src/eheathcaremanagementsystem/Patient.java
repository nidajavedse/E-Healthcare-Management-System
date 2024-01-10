/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eheathcaremanagementsystem;

import java.util.Objects;

/**
 *
 * @author Hira Shazad
 */
public class Patient {
     String p_id;
     String p_name;
     String p_gender;
     int p_age;
     String p_disease;
     String p_phone_No; 
     String p_prescription;
    
    //default constructor
   
   public Patient(){
       p_id="no";
       p_name ="no";
       p_gender = "no";
       p_age = 0;
       p_disease="no";
       p_phone_No="no";
       p_prescription="not added yet";
   }
   
    //parametrized constructor
  
   public Patient(String p_id,String p_name, String p_gender, int p_age,String p_disease,String p_phone_No,String p_prescription){
       this.p_id=p_id;
       this.p_name=p_name;
       this.p_gender=p_gender;
       this.p_age=p_age;
       this.p_disease=p_disease;
       this.p_phone_No=p_phone_No;
       this.p_prescription=p_prescription;
   }
    public Patient(String p_id,String p_name, String p_gender, int p_age,String p_disease,String p_phone_No){
       this.p_id=p_id;
       this.p_name=p_name;
       this.p_gender=p_gender;
       this.p_age=p_age;
       this.p_disease=p_disease;
       this.p_phone_No=p_phone_No;
       this.p_prescription="no";
   }
    
   //setters
   
   public void setP_id(String p_id){
       this.p_id=p_id;
   }
   
   public void setP_name(String p_name){
       this.p_name=p_name;
   }
   
   public void setP_gender(String p_gender){
       this.p_gender=p_gender;
   }
   
   public void setP_age(int p_age){
       this.p_age=p_age;
   }
   
   public void setP_disease(String p_disease){
       this.p_disease=p_disease;
   }
   
   public void setP_phone_No(String p_phone_No){
       this.p_phone_No=p_phone_No;
   }
   
   public void setP_prescriptipn(String p_prescription){
       this.p_prescription=p_prescription;
   }
   
   
   // getters
   
   public String getP_id(){
       return p_id;
   } 
   
   public String getP_name(){
       return p_name;
   }
   
   public String getP_gender(){
       return p_gender;
   } 
   
   public int getP_age(){
       return p_age;
   }
   
   public String getP_disease(){
       return p_disease;
   } 
   
   public String getP_phone_No(){
       return p_phone_No;
   }

   public String getP_prescription(){
       return p_prescription;
   }

   
   //Methods
    
    @Override
    public String toString(){
       
       String temp = "ID : "+this.p_id+"\nName : "+this.p_name+"\nGender : "+ this.p_gender+"\nAge : " + this.p_age+"\nPhone no : "+this.p_phone_No+"\nDisease : "+this.p_disease+
               "\nPrescription: "+this.p_prescription;
       return temp;
       
   }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Patient other = (Patient) obj;
        if (!Objects.equals(this.p_id, other.p_id)) {
            return false;
        }
        if (!Objects.equals(this.p_name, other.p_name)) {
            return false;
        }
        if (!Objects.equals(this.p_gender, other.p_gender)) {
            return false;
        }
        if (this.p_age != other.p_age) {
            return false;
        }
        if (!Objects.equals(this.p_disease, other.p_disease)) {
            return false;
        }
        if (!Objects.equals(this.p_phone_No, other.p_phone_No)) {
            return false;
        }
        return true;
    }
}
