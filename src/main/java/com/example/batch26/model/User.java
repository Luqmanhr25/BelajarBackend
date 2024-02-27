package com.example.batch26.model;

import javax.persistence.Column;
import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_m_users")
public class User{
    @OneToOne
    @JoinColumn(name = "id", nullable=false)
    @Column(name = "employeeid")
    private Employee employee;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @ManyToOne
    @JoinColumn(name = "id", nullable=false)
    @Column(name = "roleid")
    private Role role;

    @Column(name = "active")
    private Integer active;

    public Employee getEmployeeId(){
        return employee;
    }

    public void setEmployeeId(Employee employee){
        this.employee = employee;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public Role getRoleId(){
        return role;
    }

    public void setRoleId(Role role){
        this.role = role;
    }

    public Integer getActive(){
        return active;
    }

    public void setActive(Integer active){
        this.active = active;
    }

}