/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Benjamin
 */
@Entity
@Table(name = "Account")
public class Account {
    @Column(name = "firstname", length = 30,nullable = false)
    private String firstname;
    @Column(name = "lastname", length = 30,nullable = false)
    private String lastname;
    @Id
    @Column(name = "username", length = 15,nullable = false,unique = true)
    private String username;
    @Column(name = "password", length = 20,nullable = false)
    private String password;
    @Column(name = "email", length = 30,nullable = false,unique = true)
    private String email;

    public Account() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Account(String firstname, String lastname, String username, String password, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Account(String username) {
        this.username = username;
    }
    
}
