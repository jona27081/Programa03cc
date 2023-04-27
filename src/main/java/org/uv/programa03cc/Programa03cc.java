/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.programa03cc;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zS20006736
 */
public class Programa03cc {

    public static void main(String[] args) {
        
        IMensaje ma = null;
        
        ma = new MensajeSaludoI();
        ma.msg();
        
        ma = new MensajeDespedidaI();
        ma.msg();
        
        //Intancia anonima
        ma = new IMensaje() {
            @Override
            public void msg() {
                Logger.getLogger(Programa03cc.class.getName()).log(Level.INFO, "Otro...");   
            }
        };
        ma.msg();
    }
}
