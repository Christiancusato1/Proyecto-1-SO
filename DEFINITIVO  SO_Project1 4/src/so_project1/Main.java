/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package so_project1;


import Interfaz.MainPagee;
import Interfaz.Prueba;
import java.util.concurrent.Semaphore;



/**
 *
 * @author giovannacianfaglione
 */
public class Main {
    public static Capcom capcom= new Capcom();
    public static Nintendo nintendo= new Nintendo();
    public static SquareEnix saquareenix= new SquareEnix();
    public static MainPagee p = new MainPagee(); 
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        capcom.getDrive().getNarrative().appendLast(1);
        capcom.start();
        nintendo.start();
        saquareenix.start();
        
//        MainPagee p = new MainPagee();
        p.setVisible(true);
        
        
//        Prueba d= new Prueba();
//        d.setVisible(true);
      
        
        
        
//        Director dir = new Director(10,2);
//        PM myPM = new PM(2);
//        myPM.start();

//int maxParaDlc, int dayDuration, int levels, int narrative, int sprites, int systems, int dlc )
//        Integer integer = new Integer(3, 1000, 2, 4, 10,);
//        Director dir = new Director(3, 1000, )
//
//int dayCounter, int dayDuration, Integer integer, long precioDlc, long precioJuegoNormal

       
//        Nintendo nintendo = new Nintendo();
//        nintendo.leerTxt();
       
       
    }
   
}
