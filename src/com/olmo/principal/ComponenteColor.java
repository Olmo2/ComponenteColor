/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olmo.principal;

import java.awt.Color;
import java.io.Serializable;
import javax.swing.JTextField;

/**
 *
 * @author Dams2
 */
public class ComponenteColor extends JTextField implements Serializable{
    
    
    
   
    private Pigmento pigmento;
    

    public ComponenteColor() {
    }

    public Pigmento getPigmento() {
        return pigmento;
    }

    public void setPigmento(Pigmento pigmento) {
        this.pigmento = pigmento;
    }

     
    
    
    
    
}
