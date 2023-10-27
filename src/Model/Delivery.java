package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Delivery {
    long id;
    long id_order;
    long id_client;
    long adress;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getId_order() {
        return id_order;
    }
    public void setId_order(long id_order) {
        this.id_order = id_order;
    }
    public long getId_client() {
        return id_client;
    }
    public void setId_client(long id_client) {
        this.id_client = id_client;
    }
    public long getAdress() {
        return adress;
    }
    public void setAdress(long adress) {
        this.adress = adress;
    }
    
    
}
