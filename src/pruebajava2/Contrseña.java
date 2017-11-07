/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava2;

import javax.swing.JOptionPane;

/************************************
 * Myriam Castillo Zavala;
 * @author LAB07
 * Fecha: Noviembre 06  2017
 * Programa: Pruebajava2 
 * Responsabilidad: Aplicaciones Escritorio Java
 ************************************/
public class Contrseña 

{
 public static void main(String[] args) 
 {
     float clave1,clave2,clave3;
    int numero;
    numero =211;
   
     
     numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));
     if (numero==211)
     {
     JOptionPane.showMessageDialog(null, "ingresar clave correcta");
     }
     else
     {
      JOptionPane.showMessageDialog(null, "clave incorrecta");
     numero =Integer.parseInt(JOptionPane.showInputDialog("ingrese segunda intento"));
      JOptionPane.showMessageDialog(null, "clave incorrecta");
      numero=Integer.parseInt(JOptionPane.showInputDialog("ingrese tersero intento"));
     } 
     while(numero==211)
     {
       JOptionPane.showMessageDialog(null, "clave bloqueada, comunicarse al soporte tecnico"); 
       {
       else
       }
 }
}
}   
    

