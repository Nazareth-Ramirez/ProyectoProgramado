/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author kaysc
 */
public class Menu {
    private int opcion;
    
    public void menuPrincipal(){
        do{
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                  Capitulos del Libro
                                                                  
                                                                  1.Primer capitulo: Nombra colores
                                                                  2.Segundo capitulo: Separa en temperatura
                                                                  3.Tercer capitulo: Clasifica objetos
                                                                  4.Salir
                                                                  
                                                                  Elige una opcion de capitulo: 
                                                                  
                                                                  """));
            
            switch(opcion){
                
                case 1:
                    JOptionPane.showMessageDialog(null, "Primer Capitulo");
                break;
                
                case 2:
                    JOptionPane.showMessageDialog(null, "Segundo Capitulo");
                break;
                
                case 3:
                    JOptionPane.showMessageDialog(null, "Tercer Capitulo");
                break;
                
                case 4:
                    JOptionPane.showMessageDialog(null, "Saiendo del Sistema...");
                break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no disponible");
            }
            
        }while(opcion != 4);
    }
            
}
