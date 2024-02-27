package com.example.batch26.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_employees")
public class Employee{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "birthdate")
    private String birthDate;

    @Column(name = "address")
    private String address;

    @Column(name = "phonenumber")
    private String phoneNumber;

    @Column(name = "joindate")
    private String joinDate;

    @OneToMany(mappedBy="borrowedBy")
    private Set<Asset> asset;

    public Set<Asset> getAsset(){
        return asset;
    }

    public void setAsset(Set<Asset> asset){
        this.asset = asset;
    }

    @OneToMany(mappedBy="employee")
    private Set<Request> requestEmployee;

    public Set<Request> getRequestEmployee(){
        return requestEmployee;
    }

    public void setRequestEmployee(Set<Request> requestEmployee){
        this.requestEmployee = requestEmployee;
    }

    @OneToMany(mappedBy="approveBy")
    private Set<Request> requestApprove;

    public Set<Request> getRequestApprove(){
        return requestApprove;
    }

    public void setRequest(Set<Request> requestApprove){
        this.requestApprove = requestApprove;
    }

    @OneToMany(mappedBy="progressBy")
    private Set<Progress> progress;

    public Set<Progress> getProgress(){
        return progress;
    }

    public void setProgress(Set<Progress> progress){
        this.progress = progress;
    }

    @OneToOne(mappedBy="employee")
    private User user;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getBirthDate(){
        return birthDate;
    }

    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getJoinDate(){
        return joinDate;
    }

    public void setJoinDate(String joinDate){
        this.joinDate = joinDate;
    }

}