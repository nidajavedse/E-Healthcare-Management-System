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
public class Doctor {
     String d_id;
     String d_name;
     String d_gender;
     String d_specialize;
     String d_phoneNo;
     int d_fee;
     int d_time1;
     int d_time2;
     String password;
    
    //default constructor:
    
    public Doctor(){
        
        d_id=null;
        d_name=null;
        d_gender=null;
        d_specialize=null;
        d_phoneNo=null;
        d_fee=0;
        d_time1=0;
        d_time2=0;
        password="123";
    }
    
    //Parameterized constructor:
    
    public Doctor(String d_id, String d_name, String d_gender, String d_specialize, String d_phoneNo, int d_fee,int d_time1,int d_time2, String password){
        this.d_id=d_id;
        this.d_name = d_name;
        this.d_gender=d_gender;
        this.d_specialize = d_specialize;
        this.d_phoneNo = d_phoneNo;
        this.d_fee = d_fee;
        this.d_time1=d_time1;
        this.d_time2=d_time2;
        this.password=password;
    }

    //Setters:
    
    public void setd_Id(String d_id) {
        this.d_id=d_id;
    }
    
    public void setd_Name(String d_name){
        this.d_name=d_name;
    }

    public void setD_gender(String d_gender) {
        this.d_gender = d_gender;
    }
    
    public void setd_Specialize(String d_specialize){
        this.d_specialize=d_specialize;
    }
    
    public void setd_PhoneNo(String d_phoneNo){
        this.d_phoneNo=d_phoneNo;
    }
    
    public void setd_Fee(int d_fee){
        this.d_fee=d_fee;
    }
    public void setd_Time1(int d_time1) {
        this.d_time1=d_time1;
    }
    public void setd_Time2(int d_time2) {
        this.d_time2=d_time2;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    //Getters:
    
    public String getd_Id(){
    return d_id;
    }
    
    public String getd_Name(){
    return d_name;
    }

    public String getD_gender() {
        return d_gender;
    }
    
    public String getd_Specialize(){
    return d_specialize;
    }
    
    public String getd_PhoneNo(){
    return d_phoneNo;
    }
    
    public int getd_Fee(){
    return d_fee;
    }
    
    public int getd_Time1(){
    return d_time1;
    }
    
    public int getd_Time2(){
    return d_time2;
    }

    public String getPassword() {
        return password;
    }
    
    //Methods:
    
     @Override
   public String toString(){
       
       String temp = "ID : "+d_id+"\nName : "+this.d_name+"\nGender : "+this.d_gender+"\nSpecialization : " + this.d_specialize+"\nPhone no : "+this.d_phoneNo+"\nFee : "+this.d_fee+"\nAvailablity Time : \nFrom : "+d_time1+"\nTo : "+d_time2 +"\npassword : "+this.password;
       return temp;
       
   }
   @Override
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
        final Doctor other = (Doctor) obj;
        if (!Objects.equals(this.d_id, other.d_id)) {
            return false;
        }
        if (!Objects.equals(this.d_name, other.d_name)) {
            return false;
        }
        if (!Objects.equals(this.d_gender, other.d_gender)) {
            return false;
        }
        if (!Objects.equals(this.d_specialize, other.d_specialize)) {
            return false;
        }
        if (!Objects.equals(this.d_phoneNo, other.d_phoneNo)) {
            return false;
        }
        if (this.d_fee != other.d_fee) {
            return false;
        }
        if (this.d_time1 != other.d_time1) {
            return false;
        }
        if (this.d_time2 != other.d_time2) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return true;
    }
}
