/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.Color;

/**
 *
 * @author jorge
 */
public class Check {

    public static boolean checarTamanhoPorta(String txtFieldPorta) {
        return txtFieldPorta.length() == 4;
    }
    
    public static boolean checarCaracteres(String txtFieldPorta) {
        String regex = "\\w";
        return txtFieldPorta.matches(regex);
    }
    
       public static boolean checarNull(String txtFieldPorta) {
        return txtFieldPorta.length() == 0;
    }
       
    public static String limpar(){
        String txtArea = "";
        return txtArea;
    }
    
    /*public static String alterarCor(){
        boolean alternateColor = false;
        Color textColor = alternateColor ? Color.BLUE : Color.BLACK;
        return textColor;
    }*/
}
