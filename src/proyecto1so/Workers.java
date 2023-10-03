/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1so;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author giovannacianfaglione
 */
public class Workers extends Thread {
    private Drive drive;
    private int day;
    private int daycounter;
    private double salary;
    private int produced;
    private int cautity;
    private int dayDuration;
    private double ganancia;
    private int cautity_producer;
    private Semaphore mutex;
    private String type;
    
   

    public Workers(Drive drive, int day, double salary, int produced, int cautity, int dayDuration, String type, Semaphore mutex) {
        this.drive = drive;
        this.day = day;
        this.salary = salary;
        this.produced = produced;
        this.cautity = cautity;
        this.dayDuration= 1000* dayDuration;
        this.ganancia=0;
        this.cautity_producer=0;
        this.mutex = mutex;
        this.daycounter= this.day;
        this.type= type;
         
    }
    
     @Override
    public void run(){
        while(true){
                    
                try {
                    this.addSalary();
                    this.amountProduce();
                    
                    Thread.sleep(this.getDayDuration());
                } catch (InterruptedException ex) {
                    Logger.getLogger(Workers.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        }
      
        }
    
    public void addSalary(){
        
        this.setGanancia(this.getGanancia() + this.getSalary() * this.getCautity() * 24);   
    }
    
    public void amountProduce(){
        
        
        
        if (this.daycounter ==0){
            this.setCautity_producer(this.getCautity_producer() + this.getProduced() * this.getCautity());
            drive.addproduct(this.cautity_producer, this.type);
            this.setDaycounter(this.getDay());
        }
    }
    /**
     * @return the drive
     */
    public Drive getDrive() {
        return drive;
    }

    /**
     * @param drive the drive to set
     */
    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the produced
     */
    public int getProduced() {
        return produced;
    }

    /**
     * @param produced the produced to set
     */
    public void setProduced(int produced) {
        this.produced = produced;
    }

    /**
     * @return the cautity
     */
    public int getCautity() {
        return cautity;
    }

    /**
     * @param cautity the cautity to set
     */
    public void setCautity(int cautity) {
        this.cautity = cautity;
    }

    /**
     * @return the mutex
     */
    public Semaphore getMutex() {
        return mutex;
    }

    /**
     * @param mutex the mutex to set
     */
    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }

    /**
     * @return the daycounter
     */
    public int getDaycounter() {
        return daycounter;
    }

    /**
     * @param daycounter the daycounter to set
     */
    public void setDaycounter(int daycounter) {
        this.daycounter = daycounter;
    }

    /**
     * @return the dayDuration
     */
    public int getDayDuration() {
        return dayDuration;
    }

    /**
     * @param dayDuration the dayDuration to set
     */
    public void setDayDuration(int dayDuration) {
        this.dayDuration = dayDuration;
    }

    /**
     * @return the ganancia
     */
    public double getGanancia() {
        return ganancia;
    }

    /**
     * @param ganancia the ganancia to set
     */
    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    /**
     * @return the cautity_producer
     */
    public int getCautity_producer() {
        return cautity_producer;
    }

    /**
     * @param cautity_producer the cautity_producer to set
     */
    public void setCautity_producer(int cautity_producer) {
        this.cautity_producer = cautity_producer;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the name
     */
    
    
    
        
    }
    
    
    
    
    

