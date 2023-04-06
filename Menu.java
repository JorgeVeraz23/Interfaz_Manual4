/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacion10;

import javax.swing.*;

/**
 *
 * @author USER
 */
public class Menu extends JFrame{
    JMenuBar barra;
    JMenu archivo, ayuda;
    JMenuItem abrir, salir, guardar, acercade;
    
    public Menu(){
        
        super("Menu");
        barra = new JMenuBar();
        archivo = new JMenu("Archivo");
        ayuda = new JMenu("Ayuda");
        salir = new JMenuItem("Salir");
        abrir = new JMenuItem("Abrir");
        guardar = new JMenuItem("Guardar");
        acercade = new JMenuItem("Acerca de");
        add(barra);
        barra.add(archivo);
        barra.add(archivo);
        barra.add(ayuda);
        archivo.add(guardar);
        archivo.add(abrir);
        archivo.add(salir);
        ayuda.add(acercade);
        setJMenuBar(barra);
        
        setSize(380,200);
        setLocationRelativeTo(null);
        setVisible(true);
        
        
    }
    
    public static void main(String[] args){
        JFrame.setDefaultLookAndFeelDecorated(true);
        Menu mr = new Menu();
        mr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
            
}
