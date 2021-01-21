/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olmo.principal;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author Dams2
 */
public class Pigmento implements Serializable {

    private Color colorFondo = new Color(255,0,0);
    private Color colorTexto = new Color(255,255,0);

    public Pigmento() {
    }

    public Pigmento(Color colorFondo, Color colorTexto) {
        this.colorFondo = colorFondo;
        this.colorTexto = colorTexto;
    }

    public Color getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(Color colorFondo) {
        this.colorFondo = colorFondo;
    }

    public Color getColorTexto() {
        return colorTexto;
    }

    public void setColorTexto(Color colorTexto) {
        this.colorTexto = colorTexto;
    }

    
    

}
