/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pertemuan11;

/**
 *
 * @author A-3
 */
class MobilBekas extends Mobil{
    private int tahun;
private double harga;
public MobilBekas(String merek, String model, int tahun, double harga) {
super(merek, model);
this.tahun = tahun;
this.harga = harga;
}
public int getTahun() {
return tahun;
}
public double getHarga() {
return harga;
}
public void info() {
System.out.println("Mobil Bekas: " + getMerek() + " " + getModel() + " ("
+ tahun + ")");
}
}
