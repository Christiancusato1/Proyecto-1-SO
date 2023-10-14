/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so_project1;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author giovannacianfaglione
 */
public class PM extends Thread{
    
//    
    private Director dir;
    private int pricePerHour;
    private int faults;
    private double salary;
    private String jobDoing;
    private double countPerHour;
    private double countPerDay;// para dias de entrega 
    private int dayDuration;
    private Semaphore mutex;
    private int salaryRestado;
    private int salaryAcumulado; 
    private String company; 
    
   
   

    public PM(int dayDuration, Director dir, Semaphore mutex, String company) {
        this.dayDuration = dayDuration;
        this.pricePerHour=20;
        this.faults=0;
        this.salary=0;
        this.salaryRestado= 0;
        this.jobDoing= "";
        this.dayDuration= dayDuration * 1000;
        this.countPerHour = this.dayDuration/24 ;
        this.countPerDay=0;
        this.dir = dir; 
        this.mutex = mutex; 
        this.company = company; 
        
        
        
    }
//    int dayCounter, int dayDuration, Integer integer, long precioDlc, long precioJuegoNormal
    public void firstHours() throws InterruptedException{
        boolean working = true;
//        Director dir= new Director(10,1000,);
        
        for (int i = 0; i < 32; i++) {
            int dormir = this.getDayDuration() *30/1440; // dauivalente a 30 mins 
            if (working) {
                this.setJobDoing("Trabajando PM,");
                System.out.println(this.getJobDoing());
               Main.p.jobDoingPM.setText((Main.nintendo.getPm().getJobDoing()));
               Main.p.jobDoingPM2.setText((Main.saquareenix.getPm().getJobDoing()));
               Main.p.jobDoingPM3.setText((Main.capcom.getPm().getJobDoing()));
               
                sleep(dormir); 
//                working= false; 
            }else{
                this.setJobDoing("Jugando PM");
                
                Main.p.countFallas.setText(Integer.toString(Main.nintendo.getPm().getFaults()));
                Main.p.countFallas2.setText(Integer.toString(Main.saquareenix.getPm().getFaults()));
                Main.p.countFallas3.setText(Integer.toString(Main.capcom.getPm().getFaults()));
                
                Main.p.salaryPM.setText("$"+Integer.toString(Main.nintendo.getPm().getSalaryRestado()));
                Main.p.salaryPM2.setText("$"+Integer.toString(Main.saquareenix.getPm().getSalaryRestado()));
                Main.p.salaryPM3.setText("$"+Integer.toString(Main.capcom.getPm().getSalaryRestado()));
                System.out.println();
                String jobDoingDirector =""; 
                if(this.getCompany().equals("Nintendo")){
                    jobDoingDirector = Main.nintendo.getDirector().getJobDoing(); 
                }else if(this.getCompany().equals("Square Enix")){
                    jobDoingDirector = Main.saquareenix.getDirector().getJobDoing(); 
                }else{
                    jobDoingDirector = Main.capcom.getDirector().getJobDoing(); 
                }

                if(jobDoingDirector.equals("Revisando al PM")){
                    this.setFaults(this.getFaults() + 1); 
                    this.setSalary(this.getSalary() + 50);
                    this.setSalaryRestado(this.getFaults()*50);
                    System.out.println("Lo Cacho");
                    
                }else{
                    System.out.println("El se la Pela");
                    
                }Main.p.jobDoingPM.setText((Main.nintendo.getPm().getJobDoing()));
                Main.p.jobDoingPM2.setText((Main.saquareenix.getPm().getJobDoing()));
                Main.p.jobDoingPM3.setText((Main.capcom.getPm().getJobDoing()));
                sleep(dormir); 
//                
            }
            working= !working;
            
           
        } int tiempoRestante = (int)this.getDayDuration() *8/24; 
        this.updateCounter(tiempoRestante);
        
//        this.setJobDoing("Trabajando"); 
//        this.setCountPerDay(this.getCountPerDay() - 1); 
//            sleep(tiempoRestante); 
//        working= !working;
       
    }
    
    public void updateCounter(int tiempoRestante){
        // acquire
        try{
            this.setJobDoing("Cambiando el contador");
            if (this.getCompany().equals("Nintendo")) {
                Main.nintendo.getMainMutex().acquire();
                
            }else if(this.getCompany().equals("Square Enix")){
                Main.saquareenix.getMainMutex().acquire();
            }else{
                Main.nintendo.getMainMutex().acquire();
            }
            this.setJobDoing("Cambiando el contador");
            Main.p.jobDoingPM.setText((Main.nintendo.getPm().getJobDoing()));
            Main.p.jobDoingPM2.setText((Main.saquareenix.getPm().getJobDoing()));
            Main.p.jobDoingPM3.setText((Main.capcom.getPm().getJobDoing()));
            
            
            sleep(tiempoRestante);
            this.setCountPerDay(this.getCountPerDay() - 1);
            
            if (this.getCompany().equals("Nintendo")) {
                Main.nintendo.getMainMutex().release();
                
            }else if(this.getCompany().equals("Square Enix")){
                Main.saquareenix.getMainMutex().release();
            }else{
                Main.nintendo.getMainMutex().release();
            }
           
            
        }catch(InterruptedException ex) {
                    Logger.getLogger(PM.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        
    }
    
    
    @Override
    public void run(){
        while(true){
                    
                try {
                    this.setSalaryAcumulado((int) (this.getSalaryAcumulado() + (24 * this.getSalary()) - (this.getSalaryRestado()))); 
                    
                    this.firstHours();
                    
             
                    
//                    Thread.sleep(this.dayDuration); //no va
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(PM.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        }
      
        }

    /**
     * @return the pricePerHour
     */
    public int getPricePerHour() {
        return pricePerHour;
    }

    /**
     * @param pricePerHour the pricePerHour to set
     */
    public void setPricePerHour(int pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    /**
     * @return the faults
     */
    public int getFaults() {
        return faults;
    }

    /**
     * @param faults the faults to set
     */
    public void setFaults(int faults) {
        this.faults = faults;
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
     * @return the jobDoing
     */
    public String isJobDoing() {
        return getJobDoing();
    }

    /**
     * @param jobDoing the jobDoing to set
     */
  

    /**
     * @return the countPerHour
     */
    public double getCountPerHour() {
        return countPerHour;
    }

    /**
     * @param countPerHour the countPerHour to set
     */
    public void setCountPerHour(double countPerHour) {
        this.countPerHour = countPerHour;
    }

    /**
     * @return the countPerDay
     */
    public double getCountPerDay() {
        return countPerDay;
    }

    /**
     * @param countPerDay the countPerDay to set
     */
    public void setCountPerDay(double countPerDay) {
        this.countPerDay = countPerDay;
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
     * @return the dir
     */
    public Director getDir() {
        return dir;
    }

    /**
     * @param dir the dir to set
     */
    public void setDir(Director dir) {
        this.dir = dir;
    }

    /**
     * @return the jobDoing
     */
    public String getJobDoing() {
        return jobDoing;
    }

    /**
     * @param jobDoing the jobDoing to set
     */
    public void setJobDoing(String jobDoing) {
        this.jobDoing = jobDoing;
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
     * @return the salaryAcumulado
     */
    public int getSalaryAcumulado() {
        return salaryAcumulado;
    }

    /**
     * @param salaryAcumulado the salaryAcumulado to set
     */
    public void setSalaryAcumulado(int salaryAcumulado) {
        this.salaryAcumulado = salaryAcumulado;
    }

    /**
     * @return the salaryRestado
     */
    public int getSalaryRestado() {
        return salaryRestado;
    }

    /**
     * @param salaryRestado the salaryRestado to set
     */
    public void setSalaryRestado(int salaryRestado) {
        this.salaryRestado = salaryRestado;
    }

    /**
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(String company) {
        this.company = company;
    }
    
    
    
    
    
    
    
    
    
    
}