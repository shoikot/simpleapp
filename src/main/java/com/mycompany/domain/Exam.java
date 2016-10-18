/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Saikot
 */
@Entity
public class Exam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }
    private double passMarks;

    /**
     * Get the value of passMarks
     *
     * @return the value of passMarks
     */
    public double getPassMarks() {
        return passMarks;
    }

    /**
     * Set the value of passMarks
     *
     * @param passMarks new value of passMarks
     */
    public void setPassMarks(double passMarks) {
        this.passMarks = passMarks;
    }

    
    private double totalMarks;

    /**
     * Get the value of totalMarks
     *
     * @return the value of totalMarks
     */
    public double getTotalMarks() {
        return totalMarks;
    }

    /**
     * Set the value of totalMarks
     *
     * @param totalMarks new value of totalMarks
     */
    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }


    public void setId(Long id) {
        this.id = id;
    }

    private String name;

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
    private Timestamp date;

    /**
     * Get the value of date
     *
     * @return the value of date
     */
    public Timestamp getDate() {
        return date;
    }

    /**
     * Set the value of date
     *
     * @param date new value of date
     */
    public void setDate(Timestamp date) {
        this.date = date;
    }


    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Exam)) {
            return false;
        }
        Exam other = (Exam) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.domain.Exam[ id=" + id + " ]";
    }
    
}
