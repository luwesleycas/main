package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Supply {
    long id;
    static String name;
    static long descript;
    enum measure {UN, KG, L};

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

    public static long getDescript() {
        return descript;
    }

    public void setDescript(long descript) {
        this.descript = descript;
    }
    
}
