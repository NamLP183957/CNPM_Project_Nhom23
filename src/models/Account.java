/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Tran Van Tuyen
 */
public class Account {
    private int Id;
    private String password;
    private String userName;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
 
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
 
}
