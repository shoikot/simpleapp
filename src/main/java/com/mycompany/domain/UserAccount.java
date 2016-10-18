/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Saikot
 */
@Entity
public class UserAccount implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    private UserType userType;

    private String mobileNo;

    /**
     * Get the value of mobileNo
     *
     * @return the value of mobileNo
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * Set the value of mobileNo
     *
     * @param mobileNo new value of mobileNo
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    private String emailAddress;

    /**
     * Get the value of emailAddress
     *
     * @return the value of emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Set the value of emailAddress
     *
     * @param emailAddress new value of emailAddress
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Get the value of userType
     *
     * @return the value of userType
     */
    public UserType getUserType() {
        return userType;
    }
    private String avatarFileName;

    /**
     * Get the value of avatarFileName
     *
     * @return the value of avatarFileName
     */
    public String getAvatarFileName() {
        return avatarFileName;
    }

    /**
     * Set the value of avatarFileName
     *
     * @param avatarFileName new value of avatarFileName
     */
    public void setAvatarFileName(String avatarFileName) {
        this.avatarFileName = avatarFileName;
    }


    /**
     * Set the value of userType
     *
     * @param userType new value of userType
     */
    public void setUserType(UserType userType) {
        this.userType = userType;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
    private String address;

    /**
     * Get the value of address
     *
     * @return the value of address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set the value of address
     *
     * @param address new value of address
     */
    public void setAddress(String address) {
        this.address = address;
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
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserAccount)) {
            return false;
        }
        UserAccount other = (UserAccount) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.domain.UserAccount[ id=" + id + " ]";
    }
    
    public enum UserType{
        STUDENT,
        TEACHER,
        EMPLOYEE,
        ADMIN
    }
}
