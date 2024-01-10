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
public class Prescription {
    String pat_id;
    String prescription;
    String date;

    // Defult constructor
    
     public Prescription() {
        this.pat_id = "no";
        this.prescription = "no";
        this.date = "no";
    }
    
    //Parametrized constructor
    
    public Prescription(String pat_id, String prescription, String date) {
        this.pat_id = pat_id;
        this.prescription = prescription;
        this.date = date;
    }

    // getters
    
    public String getPat_id() {
        return pat_id;
    }

    public String getPrescription() {
        return prescription;
    }

    public String getDate() {
        return date;
    }

    //setters
    
    public void setPat_id(String pat_id) {
        this.pat_id = pat_id;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Prescription{" + "pat_id=" + pat_id + ", prescription=" + prescription + ", date=" + date + '}';
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
        final Prescription other = (Prescription) obj;
        if (!Objects.equals(this.pat_id, other.pat_id)) {
            return false;
        }
        if (!Objects.equals(this.prescription, other.prescription)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }
    
}
