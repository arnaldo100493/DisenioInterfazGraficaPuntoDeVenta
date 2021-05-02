/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diseniointerfazgraficapuntodeventa;

import com.diseniointerfazgraficapuntodeventa.vista.Index;
import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author abarrios
 */
public class DisenioInterfazGraficaPuntoDeVenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        // TODO code application logic here
        UIManager.setLookAndFeel(new BernsteinLookAndFeel());

        new Index().setVisible(true);
    }

}
