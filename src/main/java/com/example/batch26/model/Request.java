package com.example.batch26.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_request")
public class Request{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "employeeid", nullable=false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "assetid", nullable=false)
    private Asset asset;

    @Column(name = "requestdate")
    private String requestDate;

    @Column(name = "startdate")
    private String startDate;

    @Column(name = "enddate")
    private String endDate;

    @ManyToOne
    @JoinColumn(name = "approveby", nullable=false)
    private Employee approveBy;

    @Column(name = "returndate")
    private String returnDate;

    @Column(name = "UpdateOn")
    private String updateOn;

    @OneToMany(mappedBy="requestId")
    private Set<Progress> progress;

    public Set<Progress> getProgress(){
        return progress;
    }

    public void setProgress(Set<Progress> progress){
        this.progress = progress;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Employee getEmployeeId(){
        return employee;
    }

    public void setEmployeeId(Employee employee){
        this.employee = employee;
    
    }

    public Asset getAssetId(){
        return asset;
    }

    public void setAssetId(Asset asset){
        this.asset = asset;
    }

    public String getRequestDate(){
        return requestDate;
    }

    public void setRequestDate(String requestDate){
        this.requestDate = requestDate;
    }

    public String getStartDate(){
        return startDate;
    }

    public void setStartDate(String startDate){
        this.startDate = startDate;
    }

    public String getEndDate(){
        return endDate;
    }

    public void setEndDate(String endDate){
        this.endDate = endDate;
    }

    public Employee getApproveBy(){
        return approveBy;
    }

    public void setApproveBy(Employee approveBy){
        this.approveBy = approveBy;
    }

    public String getReturnDate(){
        return returnDate;
    }

    public void setReturnDate(String returnDate){
        this.returnDate = returnDate;
    }

    public String getUpdateOn(){
        return updateOn;
    }

    public void setUpdateOn(String updateOn){
        this.updateOn = updateOn;
    }

}