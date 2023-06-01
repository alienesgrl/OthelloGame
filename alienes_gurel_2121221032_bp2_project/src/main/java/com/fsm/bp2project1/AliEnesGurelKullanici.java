/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fsm.bp2project1;

/**
 *
 * @author alien
 */
public class AliEnesGurelKullanici {

    public String email;
    public String kullanici_Adi;
    public String parola;

    public AliEnesGurelKullanici() {
        this.kullanici_Adi = kullanici_Adi;
        this.parola = parola;
    }

    @Override
    public String toString() {//txt dosyasina bu sekil yazdirir
        String values = "";
        values += this.email + " & ";
        values += this.kullanici_Adi + " & ";
        values += this.parola + "\n";
        return values;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKullanici_Adi() {
        return kullanici_Adi;
    }

    public void setKullanici_Adi(String kullanici_Adi) {
        this.kullanici_Adi = kullanici_Adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

}
