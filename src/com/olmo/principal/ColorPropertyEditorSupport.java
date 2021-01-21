/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olmo.principal;

import java.awt.Color;
import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author Dams2
 */
public class ColorPropertyEditorSupport extends PropertyEditorSupport{

    
    
    private PigmentoPanel pigmentoPanel = new PigmentoPanel();
    
    /**
     * Este método tiene que devolver true siempre si queremos que haya un editor
     * de propiedades personalizado
     * @return true
     */
    @Override
    public boolean supportsCustomEditor() {
        return true;
    }
    
    /**
     * Este método devuelve una instancia del panel a mostrar.
     * @return panel a mostrar
     */
    @Override
    public Component getCustomEditor() {
        return pigmentoPanel;
    }
    
    
    /**
     * En este método nos tenemos que arreglar para devolver un string que inicialize
     * la propiedad y que irá insertado en el setter dentro del initcomponents.
     * @return un string con la propiedad inicializada
     */
    @Override
    public String getJavaInitializationString() {
        
        Color cF = pigmentoPanel.getValue().getColorFondo();
        Color cT = pigmentoPanel.getValue().getColorTexto();
         
        return "new Pigmento(" + "new Color(" + cF.getRed() + "," +  cF.getGreen() + ","  + cF.getBlue()  + ")"
                +","+
                "new Color(" + cT.getRed() + "," +  cT.getGreen() + ","  + cT.getBlue() + ")" + ")"; //To change body of generated methods, choose Tools | Templates.
    }
    
     /**
     * Recuperamos el valor del panel y lo devolvemos.
     * @return 
     */
    @Override
    public Object getValue() {
        return pigmentoPanel.getValue();
    }

    
}
