package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author user
 */
public class User {
    long id;
    static String name;
    static String pass;
    static String email;
    static String cpf;
    static String birth;
    boolean admin;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public static String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public static String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public static String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public static String getBirth() {
        return birth;
    }
    public void setBirth(String birth) {
        this.birth = birth;
    }
    public boolean isAdmin() {
        return admin;
    }
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    
    
    
}
