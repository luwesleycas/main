package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class CashLaunch {
    long id;
    long id_cash;
    long id_payment_form;
    long id_order;
    double value;
    enum type{RECEITA, DESPESA, ESTORNO}
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getId_cash() {
        return id_cash;
    }
    public void setId_cash(long id_cash) {
        this.id_cash = id_cash;
    }
    public long getId_payment_form() {
        return id_payment_form;
    }
    public void setId_payment_form(long id_payment_form) {
        this.id_payment_form = id_payment_form;
    }
    public long getId_order() {
        return id_order;
    }
    public void setId_order(long id_order) {
        this.id_order = id_order;
    }
    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    };

    
}
