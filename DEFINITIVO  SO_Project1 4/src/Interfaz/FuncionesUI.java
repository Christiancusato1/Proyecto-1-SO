/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import javax.swing.JSpinner;

/**
 *
 * @author giovannacianfaglione
 */
public class FuncionesUI {
    
    public static int validateNumberSpiner(int maxWorkersCuantity, JSpinner[] spinners,String originalvalue, String empresa, boolean doesobject){
    
    int acumulado=calcularCantidadTrabajadoresActuales(spinners) ;
    int nuevoValor= Integer.parseInt(originalvalue);
    if(acumulado <= maxWorkersCuantity){
        
    }
    return acumulado; 
    

    
}
    public static int calcularCantidadTrabajadoresActuales(JSpinner[] spinners){
        int acumulado =0;
        for(int i=0; i<spinners.length; i++){
            acumulado+= Integer.parseInt(spinners[i].getValue().toString());
            
            
        }
        return acumulado;
    }
    
     public static int calcularDisponiblidadDeEmpleados(JSpinner[] spinners, int cantEmpleadoTotal){
         
         int acumu = calcularCantidadTrabajadoresActuales(spinners);
         
         int disponivilidad = cantEmpleadoTotal -acumu;
         
         return disponivilidad;
     }
    
    
        
    }
    
    

