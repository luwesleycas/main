package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Order {
    long id;
    long id_user;
    long id_client;
    long id_status;
    static String datetime_open;
    static String datetime_close;
    double valor;

    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getId_user() {
        return id_user;
    }
    public void setId_user(long id_user) {
        this.id_user = id_user;
    }
    public long getId_client() {
        return id_client;
    }
    public void setId_client(long id_client) {
        this.id_client = id_client;
    }
    public long getId_status() {
        return id_status;
    }
    public void setId_status(long id_status) {
        this.id_status = id_status;
    }
    public String getDatetime_open() {
        return datetime_open;
    }
    public void setDatetime_open(String datetime_open) {
        this.datetime_open = datetime_open;
    }
    public String getDatetime_close() {
        return datetime_close;
    }
    public void setDatetime_close(String datetime_close) {
        this.datetime_close = datetime_close;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    
}
