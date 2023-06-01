/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fsm.bp2project1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alien
 */
public class AliEnesGurelMain {//oyunu buradan calistirin

    public static void main(String[] args) {
        try {
            AliEnesGurelData.DosyayiOkuma();
        } catch (IOException ex) {
            Logger.getLogger(AliEnesGurelMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        AliEnesGurelLogin newFrm = new AliEnesGurelLogin();
        newFrm.setVisible(true);

    }
}
