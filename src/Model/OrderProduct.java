package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class OrderProduct {
    long id;
    long id_order;
    long id_product;
    double price;
    
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
    public long getId_product() {
        return id_product;
    }
    public void setId_product(long id_product) {
        this.id_product = id_product;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    
}
