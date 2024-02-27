package com.example.batch26.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_progress")
public class Progress{
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "requestid", nullable=false)
    private Request requestId;

    @ManyToOne
    @JoinColumn(name = "statusid", nullable=false)
    private Status statusId;

    @ManyToOne
    @JoinColumn(name = "progressby", nullable=false)
    private Employee progressBy;

    @Column(name = "progressdate")
    private String progressDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Request getRequestId(){
        return requestId;
    }

    public void setRequestId(Request requestId){
        this.requestId = requestId;
    }

    public Status getStatusId(){
        return statusId;
    }

    public void setStatusId(Status statusId){
        this.statusId = statusId;
    }

    public Employee getProgressBy(){
        return progressBy;
    }

    public void setProgressBy(Employee progressBy){
        this.progressBy = progressBy;
    }

    public String getProgressDate(){
        return progressDate;
    }

    public void setProgressDate(String progressDate){
        this.progressDate = progressDate;
    }

}