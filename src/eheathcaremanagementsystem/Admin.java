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
public class Admin {
    
     String a_id;
     String a_password;
    
    //default constructor
   
   public Admin(){
       a_id="oop565";
       a_password="123";
       
   }
   
   //parametrized constructor

    public Admin(String a_id, String a_password) {
        this.a_id = a_id;
        this.a_password = a_password;
    }
  
   
   
   //Setters:

    public void setA_id(String a_id) {
        this.a_id = a_id;
    }

    public void setA_password(String a_password) {
        this.a_password = a_password;
    }
    
   //Getters:

   public String getA_password() {
        return a_password;
    }

    public String getA_id() {
        return a_id;
    }
      @Override
    public String toString(){
       
       String temp = "Id :"+this.a_id+"\nPassword : "+ this.a_password;
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
        final Admin other = (Admin) obj;
        if (!Objects.equals(this.a_id, other.a_id)) {
            return false;
        }
        if (!Objects.equals(this.a_password, other.a_password)) {
            return false;
        }
        return true;
    }
    
}
