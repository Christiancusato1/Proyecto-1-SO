/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so_project1;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author giovannacianfaglione
 */
public class Worker extends Thread {
    private Drive drive;
    private int day;
    private int daycounter;
    private double salary;
    private int produced;// cantidad que produce al finalizar el tiempo 
    private int cautity;
    private int dayDuration;
    private double ganancia;
    private int cautity_producer;
    private Semaphore mutex;
    private String type;
    private int salaryAcumulado; 
    private String company; 
    private int contadordiasparaelsalario;
    
    
    
    // hacer lo del drive
   

    public Worker(Drive drive, int day, double salary, int produced, int cautity, int dayDuration, String type, Semaphore mutex, String company) {
        this.drive = drive;
        
        this.day = day;// lo maximo 
        this.salary = salary;
        this.produced = produced;
        this.cautity = cautity;// cantidad de empleados
        this.dayDuration= 1000* dayDuration;
        this.ganancia=0;
        this.cautity_producer=0;
        this.mutex = mutex;
        this.daycounter= this.day;
        this.type= type;
        this.salaryAcumulado = 0; 
        this.company = company; 
        this.contadordiasparaelsalario=0;
         
    }
    
     @Override
    public void run(){
        while(true){
                    
                try {
                    Main.p.narrativaDisponible3.setText(Integer.toString(Main.capcom.getDrive().getNarrative().getSize()));
                    Main.p.nivelesDisponibles3.setText(Integer.toString(Main.capcom.getDrive().getLevels().getSize()));
                    Main.p.spriteDisponibles3.setText(Integer.toString(Main.capcom.getDrive().getSprites().getSize()));
                    Main.p.dlcDisponibles3.setText(Integer.toString(Main.capcom.getDrive().getDlc().getSize()));
                    Main.p.logicaDisponibles3.setText(Integer.toString(Main.capcom.getDrive().getSystems().getSize()));
                    
                    Main.p.narrativaDisponible2.setText(Integer.toString(Main.saquareenix.getDrive().getNarrative().getSize()));
                    Main.p.nivelesDisponible2.setText(Integer.toString(Main.saquareenix.getDrive().getLevels().getSize()));
                    Main.p.spriteDisponible2.setText(Integer.toString(Main.saquareenix.getDrive().getSprites().getSize()));
                    Main.p.dlcDisponible2.setText(Integer.toString(Main.saquareenix.getDrive().getDlc().getSize()));
                    Main.p.logicaDisponible2.setText(Integer.toString(Main.saquareenix.getDrive().getSystems().getSize()));
                    
                    Main.p.narrativaDisponible.setText(Integer.toString(Main.nintendo.getDrive().getNarrative().getSize()));
                    Main.p.nivelesDisponible.setText(Integer.toString(Main.nintendo.getDrive().getLevels().getSize()));
                    Main.p.spriteDisponible.setText(Integer.toString(Main.nintendo.getDrive().getSprites().getSize()));
                    Main.p.dlcDisponible.setText(Integer.toString(Main.nintendo.getDrive().getDlc().getSize()));
                    Main.p.logicaDisponible.setText(Integer.toString(Main.nintendo.getDrive().getSystems().getSize()));
                    
                    int costoNintendo = Main.nintendo.getCostoAcumulado()* contadordiasparaelsalario;
                    Main.p.salarioMonth.setText("$"+Integer.toString(costoNintendo));
                    
                    int costoEnix = Main.saquareenix.getCostoAcumulado()* contadordiasparaelsalario;
                    Main.p.salarioMonth2.setText("$"+Integer.toString(costoEnix));
                    
                    int costoCapcom = Main.capcom.getCostoAcumulado()* contadordiasparaelsalario;
                    Main.p.salarioMonth3.setText("$"+Integer.toString(costoCapcom));
                    
                    int utilidadnintendo= Main.nintendo.getDirector().getGananciaBruta()-costoNintendo; 
                    Main.p.utility.setText("$"+Integer.toString(utilidadnintendo));
                    
                    int utilidadEnix= Main.saquareenix.getDirector().getGananciaBruta()-costoEnix; 
                    Main.p.utility1.setText("$"+Integer.toString(utilidadEnix));
                    
                    int utilidadCapcom= Main.capcom.getDirector().getGananciaBruta()-costoCapcom; 
                    Main.p.utility2.setText("$"+Integer.toString(utilidadCapcom));
                    
                    
                    Main.p.totalDay1.setText(Integer.toString(this.contadordiasparaelsalario));
                    Main.p.totalDay2.setText(Integer.toString(this.contadordiasparaelsalario));
                    Main.p.totalDay.setText(Integer.toString(this.contadordiasparaelsalario));
                    
//                    
                    
                    this.addSalary();
//                    System.out.println("Se hizo salary");
//                    this.drive.getMutexDrive().acquire(); 
                    this.amountProduce();
//                    this.drive.getMutexDrive().release();
//                    System.out.println("Se hizo amount produced");
//                    System.out.println(this.produced);
                    this.salaryAcumulado += this.salary*24 * this.cautity; 
//                    System.out.println(salaryAcumulado);
//                    System.out.println("Day counter:"+this.daycounter  + this.type);
//                    System.out.println("Drive narrative"+Main.capcom.getDrive().getNarrative().getSize());
//                    System.out.println("Drive dlc"+Main.capcom.getDrive().getDlc().getSize());
//                    System.out.println("Drive levels"+Main.capcom.getDrive().getLevels().getSize());
//                    System.out.println("Drive sprites"+Main.capcom.getDrive().getSprites().getSize());
//                    System.out.println("Drive systems"+Main.capcom.getDrive().getSystems().getSize());
                    
                    this.daycounter --;
                    this.contadordiasparaelsalario ++;
                    Thread.sleep(this.getDayDuration());
                     
                } catch (InterruptedException ex) {
                    Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
                }
//                Main.capcom.getDrive().getNarrative().appendLast(1);
//                Main.capcom.getDrive().getNarrative().print();
//            this.drive.getNarrative().appendLast(1);
//            this.drive.getNarrative().print(); 
        }
        
      
        }
    
    public void addSalary(){
        
        this.setGanancia(this.getGanancia() + this.getSalary() * this.getCautity() * 24);   
    }
    
    public void amountProduce() throws InterruptedException{
//    System.out.println("FLAGGG1");
        if (this.daycounter ==0){
            this.drive.getMutexDrive().acquire();
//            System.out.println("entre en el day counter");
//            System.out.println("FLAGGG2");
            this.setCautity_producer(this.getProduced() * this.getCautity());
//            System.out.println("FLAGGG2");
            
            if(this.company.equals("Nintendo")){
                
                Main.nintendo.getDrive().addProduct(this.getCautity_producer(), this.getType());
//                System.out.println("agrego al drive" + this.type);
                this.cautity_producer = 0; 
            }else if(this.company.equals("Square Enix")){
                           
                Main.saquareenix.getDrive().addProduct(this.getCautity_producer(), this.getType());
                this.cautity_producer = 0; 
            
            }else{
                
//                System.out.println("Entre en el drive");
//                System.out.println(this.getCautity_producer());
//                System.out.println(this.getType());
                Main.capcom.getDrive().addProduct(this.getCautity_producer(), this.getType());
//                System.out.println("agrego al drive" + this.type);
//                 System.out.println("Se agrego al drive: " + this.getCautity_producer());
                 this.cautity_producer = 0; 
            }this.drive.getMutexDrive().release();
            this.setDaycounter(this.getDay());
        }
    }
    
    
//    "Desarrolador Narrativa", this.getMainMutex());
//        this.DiseñadorNiveles = new Worker(this.getDrive(), 4, 13, 1, this.getNiveles(), this.getDayDuration(), "Diseñador Niveles", this.getMainMutex()); 
//        this.ArtistaSprites = new Worker(this.getDrive(), 1, 20, 1, this.getSprites(), this.getDayDuration(), "Artista Sprites", this.getMainMutex()); 
//        this.ProgramadorLogica = new Worker(this.getDrive(), 1, 8, 5, this.getLogica(), this.getDayDuration(), "Programador Lógica", this.getMainMutex()); 
//        this.DesarrolladorDlc = new Worker(this.getDrive(), 2, 17, 1, this.getDlc(), this.getDayDuration(), "Desarrollador DLC", this.getMa
    
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


    
    
        
    }
