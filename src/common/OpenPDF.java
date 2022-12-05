/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class OpenPDF {

    public static void openById(String id) {
        try {
            if ((new File("D:\\CNPM" + id + ".pdf")).exists()) {
                Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler D:\\CNPM" + id + ".pdf");
            } else {
                JOptionPane.showMessageDialog(null, "File not exitsts");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
