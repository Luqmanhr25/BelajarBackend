package com.example.batch26.model;

import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_progress")
public class Progress{
   
    @ManyToOne
    @JoinColumn(name = "id", nullable=false)
    private Request requestid;
    @ManyToOne
    @JoinColumn(name = "id", nullable=false)
    private Status statusid;
    @ManyToOne
    @JoinColumn(name = "id", nullable=false)
    private Employee progressby;
    private String progressdate;


    public Request getRequestid(){
        return requestid;
    }

    public void setRequestid(Request requestid){
        this.requestid = requestid;
    }

    public Status getStatusid(){
        return statusid;
    }

    public void setStatusid(Status statusid){
        this.statusid = statusid;
    }

    public Employee getProgressby(){
        return progressby;
    }

    public void setProgressby(Employee progressby){
        this.progressby = progressby;
    }

    public String getProgressdate(){
        return progressdate;
    }

    public void setProgressdate(String progressdate){
        this.progressdate = progressdate;
    }

}