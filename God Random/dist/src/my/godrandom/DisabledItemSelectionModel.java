/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.godrandom;

import javax.swing.DefaultListSelectionModel;

/**
 *
 * @author andresilva
 */
public class DisabledItemSelectionModel extends DefaultListSelectionModel {
    
    @Override
    public void setSelectionInterval(int index0, int index1) {
        super.setSelectionInterval(-1, -1);
    }
}
