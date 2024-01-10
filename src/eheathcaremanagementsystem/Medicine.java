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
public class Medicine {
    String m_name;
    int m_price;
    String m_expiryDate;
    double bill=0;
    //Default Constructor:
    
    public Medicine(){
        
        m_name="no";
        m_price=0;
        m_expiryDate="no";
        
    }
    
    //Parameterized Constructor:
    
    public Medicine(String m_name,int m_price, String m_expiryDate){
    
    this.m_name=m_name;
    this.m_price=m_price;
    this.m_expiryDate=m_expiryDate;
    
}
    //Setters:
    
    public void setm_Name(String m_name){
        this.m_name=m_name;
    }
    public void setm_Price(int m_price){
        this.m_price=m_price;
    }
    public void setm_ExpiryDate(String m_expiryDate){
        this.m_expiryDate=m_expiryDate;
    }
    
    //Getters:
    
    public String getm_Name(){
    return m_name;
    }
    public int getm_Price(){
    return m_price;
    }
    public String getm_ExpiryDate(){
    return m_expiryDate;
    }
      @Override
    public String toString(){
       
       String temp = "Name :"+this.m_name+"\nPrice : "+ this.m_price+"\nExpiry date : "+m_expiryDate;
       return temp;
       
   }
    
    public double Bill(double price,int count){
        bill=bill+(price*count); 
        return bill;
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
        final Medicine other = (Medicine) obj;
        if (this.m_price != other.m_price) {
            return false;
        }
        if (!Objects.equals(this.m_name, other.m_name)) {
            return false;
        }
        if (!Objects.equals(this.m_expiryDate, other.m_expiryDate)) {
            return false;
        }
        return true;
    }
    
}
