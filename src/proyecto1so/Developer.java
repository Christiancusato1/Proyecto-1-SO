/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1so;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */

/**
 *
 * @author isaac
 */
public class Developer extends Thread{
    private int type;
    private float productionPerDay;
    private int dayDuration = 1000;
    private float acc = 0;
    private Drive drive;
    Semaphore mutex;
    
    public Developer (int type, float pp, Drive drive, Semaphore m){
        this.type = type;
        this.productionPerDay = pp;
        this.drive = drive;
        this.mutex = m;
    }

    @Override
    public void run() {
        while(true) {
           
            try {
                
                Work();
                sleep(dayDuration);
                
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void Work(){
        this.acc += this.productionPerDay;
        if (this.acc >= 1){
            try {
                 // sección critica
                this.mutex.acquire(1);
                this.drive.addProduct(1, type);
              
                this.acc=0;
                this.mutex.release();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            
        }
        System.out.println(this.drive.getLevels());
    }
    
    
    
}


