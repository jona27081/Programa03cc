/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa03cc;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zS20006736
 */
public abstract class MensajeAbstracto {
    
    
    public void imprimir(){
        Logger.getLogger(MensajeAbstracto.class.getName()).log(Level.INFO, "Hola mundo abstracto");   
    }
    
    public abstract void msg();
}
