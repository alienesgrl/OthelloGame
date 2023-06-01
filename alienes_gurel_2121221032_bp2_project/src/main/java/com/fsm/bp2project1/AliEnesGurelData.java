/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fsm.bp2project1;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author alien
 */
public class AliEnesGurelData {

    static ArrayList<AliEnesGurelKullanici> kullaniciListesi = new ArrayList<>();
    public static String kullaniciTxtFileName = "kullaniciListesi.txt";
    static ArrayList<AliEnesGurelSkorTablosu> skorListesi = new ArrayList<>();
    public static String skorListesiTxtFileName = "skorListesi.txt";

    public static boolean Login(String email, String kullaniciadi, String password) {
        boolean isLogin = false;
        for (AliEnesGurelKullanici k : kullaniciListesi) {
            if (k.email.compareTo(email) == 0 && k.kullanici_Adi.compareTo(kullaniciadi) == 0 && k.parola.compareTo(password) == 0) {
                isLogin = true;
                break;
            }
        }
        return isLogin;
    }

    public static void AddKullanici(AliEnesGurelKullanici kullanici) throws Exception {
        kullaniciListesi.add(kullanici);
    }

    public static void DosyayaKullaniciYazdirma() throws IOException {
        String filePath = "C:\\Users\\alien\\OneDrive\\Belgeler\\NetBeansProjects\\alienes_gurel_2121221032_bp2_project\\kullaniciListesi.txt";
        try ( BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Write data to the file
            for (AliEnesGurelKullanici kullanici : kullaniciListesi) {
                writer.write(kullanici.toString());
            }
            JOptionPane.showMessageDialog(null, "Kullanici basariyla kayit edilmistir");
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to write data to file: " + ex.getMessage());
        }
    }

    public static void DosyayiOkuma() throws IOException {
        BufferedWriter reader = new BufferedWriter(new FileWriter(kullaniciTxtFileName));
        for (AliEnesGurelKullanici kullanici : kullaniciListesi) {
            String values = kullanici.toString();
            reader.append(values + "\n");
        }
        reader.close();
    }

    public static void AddSkor(AliEnesGurelSkorTablosu skor) throws Exception {
        skorListesi.add(skor);
    }

    public static void DosyayaSkorYazdirma() throws IOException {
        String filePath = "C:\\Users\\alien\\OneDrive\\Belgeler\\NetBeansProjects\\alienes_gurel_2121221032_bp2_project\\skorListesi.txt";
        try ( BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (AliEnesGurelSkorTablosu skorTablosu : skorListesi) {
                writer.write(skorTablosu.toString());
            }
            //JOptionPane.showMessageDialog(null, "Skor basariyla kayit edilmistir");
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to write data to file: " + ex.getMessage());
        }
    }

    public static void SkoruOkuma() throws IOException {
        BufferedWriter reader = new BufferedWriter(new FileWriter(skorListesiTxtFileName));
        for (AliEnesGurelSkorTablosu skorTablosu : skorListesi) {
            String values = skorTablosu.toString();
            reader.append(values + "\n");
        }
        reader.close();
    }
}
