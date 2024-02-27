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
@Table(name = "tb_m_assets")
public class Asset{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "specification")
    private String specification;

    @ManyToOne
    @JoinColumn(name = "categoryid", nullable=false)
    private Category category;

    @Column(name = "borrow_limit")
    private Integer borrowLimit;

    @Column(name = "available")
    private Integer available;

    @ManyToOne
    @JoinColumn(name = "borrowedby", nullable=false)
    private Employee borrowedBy;

    @Column(name = "discontinued")
    private Integer discontinued;

    @OneToMany(mappedBy="asset")
    private Set<Request> request;

    public Set<Request> getRequest(){
        return request;
    }

    public void setRequest(Set<Request> request){
        this.request = request;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSpecification(){
        return specification;
    }

    public void setSpecification(String specification){
        this.specification = specification;
    }
    
    public Category getCategoryId(){
        return category;
    }

    public void setCategoryid(Category categoryid){
        this.category = categoryid;
    }

    public Integer getBorrowLimit(){
        return borrowLimit;
    }

    public void setBorrowLimit(Integer borrowLimit){
        this.borrowLimit = borrowLimit;
    }

    public Integer getAvailable(){
        return available;
    }

    public void setAvailable(Integer available){
        this.available = available;
    }

    public Employee getBorrowedBy(){
        return borrowedBy;
    }

    public void setBorrowedBy(Employee borrowedBy){
        this.borrowedBy = borrowedBy;
    }

    public Integer getDiscontinued(){
        return discontinued;
    }

    public void setDiscontinued(Integer discontinued){
        this.discontinued = discontinued;
    }

}