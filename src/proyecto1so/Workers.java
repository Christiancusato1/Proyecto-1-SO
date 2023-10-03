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
    private int day;// los dias que necesitas para que se produzca 1
    private double salary; 
    private int produced; // cantidad que produc
    private Semaphore mutex; 
    private int quantity; // cantidad de empleados
    private int dayDuration; 
    private double ganancia; 
    private int quantityProduced;//cantidad que tenemos de ese producto (que esta listo ) 
    private int dayCounter; // los dias que faltan para entregar el producto
    private String type; 
    

    public Workers(Drive drive, int day, double salary, int produced, int quantity,Semaphore mutex, int dayDuration, int dayCounter, String type) {
        this.drive = drive;
        this.day = day;
        this.salary = salary;
        this.produced = produced;
        this.mutex = mutex;
        this.quantity = quantity;
        this.dayDuration = 1000 *dayDuration;
        this.ganancia = 0; 
        this.quantityProduced = 0; 
        this.dayCounter = this.day; 
        this.type = type; 
        
    }
    
    public void addSalary(){
        this.setGanancia(this.getGanancia() + this.getSalary() * this.getQuantity() * 24);  
    }
    
    public void amountProduced(){
        if (this.getDayCounter() == 0) {
            this.setQuantityProduced(this.getQuantityProduced() + this.getQuantity()); 
            // Para agregar al drive: 
            
            drive.addProduct(this.quantityProduced, this.type);
            this.setDayCounter(this.getDay()); 
        }else{
            this.setDayCounter(this.getDayCounter() - 1); 
        }
    }
    
    
    @Override
    public void run(){
        
        while(true){
            try {
                Thread.sleep(this.getDayDuration());
                this.addSalary();
                this.amountProduced();
                
            } catch (InterruptedException ex) {
                System.out.println("");
            }
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
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
     * @return the quantityProduced
     */
    public int getQuantityProduced() {
        return quantityProduced;
    }

    /**
     * @param quantityProduced the quantityProduced to set
     */
    public void setQuantityProduced(int quantityProduced) {
        this.quantityProduced = quantityProduced;
    }

    /**
     * @return the dayCounter
     */
    public int getDayCounter() {
        return dayCounter;
    }

    /**
     * @param dayCounter the dayCounter to set
     */
    public void setDayCounter(int dayCounter) {
        this.dayCounter = dayCounter;
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
    
}
