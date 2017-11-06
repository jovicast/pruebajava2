/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava2;
import javax.swing.JOptionPane;
import java.lang.Math;
/************************************
 * Myriam Castillo Zavala;
 * @author LAB07
 * Fecha: Noviembre 06  2017
 * Programa: Pruebajava2 
 * Responsabilidad: Aplicaciones Escritorio Java
 ************************************/
public class Pruebajava2 
{

     /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        // TODO code application logic here
        float mes = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el mes"));
        
         //El metodo round es pas redondear un decimal
    switch(Math.round(mes))
    {
       case 1:
        JOptionPane.showMessageDialog(null,"Enero");    
        break; 
        
        case 2:
        JOptionPane.showMessageDialog(null,"Febrero");    
        break; 
        
        case 3:
        JOptionPane.showMessageDialog(null,"Marzo");    
        break; 
        
        case 4:
        JOptionPane.showMessageDialog(null,"Abril");    
        break;  
        
        case 5:
        JOptionPane.showMessageDialog(null,"Mayo");    
        break; 
        
        case 6:
        JOptionPane.showMessageDialog(null,"Junio");    
        break; 
        
        case 7:
        JOptionPane.showMessageDialog(null,"Julio");    
        break;  
        
        case 8:
        JOptionPane.showMessageDialog(null,"Agosto");    
        break;  
        
        case 9:
        JOptionPane.showMessageDialog(null,"Septiembre");    
        break; 
        
        case 10:
        JOptionPane.showMessageDialog(null,"Octubre");    
        break; 
        
        case 11:
        JOptionPane.showMessageDialog(null,"Noviembre");    
        break; 
        
        case 12:
        JOptionPane.showMessageDialog(null,"Diciembre");    
        break;  
        
        
        
    }
    
    }
    
}
