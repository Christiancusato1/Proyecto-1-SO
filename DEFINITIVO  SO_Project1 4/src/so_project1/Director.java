/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so_project1;

import Estructura.List;
import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author giovannacianfaglione
 */
public class Director extends Thread {

    private int salary;
    private int dayCounterInitial;
    private String work;
    private int dayDuration;
    private int pricePerHour;
    private String jobDoing;
    private int dayCounter;
    private Integrador integer; // aqui va el drive del integrador que es una lista
    private double earnings;
    private long precioDlc;
    private long precioJuegoNormal;
    private Semaphore mutex;
    private int salaryAcumulado;
    private String company;
    private int contadorJuegosNormales;
    private int contadorJuegosDlc;
    private int gananciaBruta;
    private int diasDefinitio; 
    

    public Director(int dayCounter, int dayDuration, Integrador integer, long precioDlc, long precioJuegoNormal, Semaphore mutex, String Company) {
        this.salary = 0;
        this.dayCounterInitial = dayCounter;
        this.dayCounter = this.dayCounterInitial; // con esta variable es con la que vamos a restar
        this.dayDuration = dayDuration * 1000;
        this.pricePerHour = 30;
        this.jobDoing = "";
        this.integer = integer;
        this.precioDlc = precioDlc;
        this.precioJuegoNormal = precioJuegoNormal;
        this.mutex = mutex;
        this.salaryAcumulado = 0;
        this.company = Company;
        this.contadorJuegosNormales = 0;
        this.contadorJuegosDlc = 0;
        this.gananciaBruta = 0;
        this.diasDefinitio = this.dayCounterInitial; 

    }

    public void checkPm() throws InterruptedException {
        try {
            if (this.getDayCounter() == 0) {
                //esto es cuando manda el juego a la tienda
                this.setJobDoing("Trabajando");
                System.out.println(this.getJobDoing());
//                this.setDayCounter(this.getDayCounterInitial()); 
//                System.out.println(this.dayCounter);
//                Main.p.nextCut.setText(Integer.toString((int) Main.nintendo.getDirector().getDayCounter()));
//                Main.p.nextCut1.setText(Integer.toString((int) Main.saquareenix.getDirector().getDayCounter()));
//                Main.p.nextCut2.setText(Integer.toString((int) Main.capcom.getDirector().getDayCounter()));
//                
                this.getInteger().getMutexDriveintegrador().acquire();
//                Main.nintendo.getMiIntegrador().getMutexDriveintegrador().acquire();
//                Main.saquareenix.getMiIntegrador().getMutexDriveintegrador().acquire();
//                Main.capcom.getMiIntegrador().getMutexDriveintegrador().acquire();
                int numJuegosDlc = this.getInteger().getDlcGames().vaciarLista();
                // para las ganancias
                setContadorJuegosNormales(getContadorJuegosNormales() + this.getInteger().getStandardGames().getSize());
                setContadorJuegosDlc(getContadorJuegosDlc() + this.getInteger().getDlcGames().getSize());
                int numJuegos = this.getInteger().getStandardGames().vaciarLista(); //Para las ganacias de los juegos regulares 
                this.setEarnings(this.getEarnings() + numJuegos * this.getPrecioJuegoNormal() + numJuegosDlc * this.getPrecioDlc());
                this.getInteger().getMutexDriveintegrador().release();
                this.setGananciaBruta((int) (this.getGananciaBruta() + this.getContadorJuegosDlc() * this.getPrecioDlc() + this.getContadorJuegosNormales() * this.getPrecioJuegoNormal()));

                Main.p.gananciaLote.setText("$" + Integer.toString(Main.nintendo.getDirector().getGananciaBruta()));
                Main.p.gananciaLote2.setText("$" + Integer.toString(Main.saquareenix.getDirector().getGananciaBruta()));
                Main.p.gananciaLote3.setText("$" + Integer.toString(Main.capcom.getDirector().getGananciaBruta()));
//                Main.nintendo.getMiIntegrador().getMutexDriveintegrador().release();
//                Main.saquareenix.getMiIntegrador().getMutexDriveintegrador().release();
//                Main.capcom.getMiIntegrador().getMutexDriveintegrador().release();
//                this.dayCounter = this.dayCounterInitial; 

                Main.p.jobDoingDirector.setText((Main.nintendo.getDirector().getJobDoing()));
                Main.p.jobDoingDirector2.setText((Main.saquareenix.getDirector().getJobDoing()));
                Main.p.jobDoingDirector3.setText((Main.capcom.getDirector().getJobDoing()));
                Main.p.nextCut.setText(Integer.toString((int) Main.nintendo.getDirector().getDayCounter()));
                Main.p.nextCut1.setText(Integer.toString((int) Main.saquareenix.getDirector().getDayCounter()));
                Main.p.nextCut2.setText(Integer.toString((int) Main.capcom.getDirector().getDayCounter()));

                this.setDayCounter(this.getDiasDefinitio());
                System.out.println(this.getDayCounter());
                sleep(getDayDuration());
            } else {
                this.setDayCounter(this.getDayCounter() - 1);
                Random random = new Random();
                int hour = (random.nextInt(24));
                int minStart = (int) this.getDayDuration() * hour / 24;
                this.setJobDoing("Trabajando");
                System.out.println(this.getJobDoing());
                Main.p.jobDoingDirector.setText((Main.nintendo.getDirector().getJobDoing()));
                Main.p.jobDoingDirector2.setText((Main.saquareenix.getDirector().getJobDoing()));
                Main.p.jobDoingDirector3.setText((Main.capcom.getDirector().getJobDoing()));
                sleep(minStart);
                this.setJobDoing("Revisando al PM");

                int tiempoRevision = (int) ((this.getDayDuration() * 25) / 1440);
                Main.p.jobDoingDirector.setText((Main.nintendo.getDirector().getJobDoing()));
                Main.p.jobDoingDirector2.setText((Main.saquareenix.getDirector().getJobDoing()));
                Main.p.jobDoingDirector3.setText((Main.capcom.getDirector().getJobDoing()));
                sleep(tiempoRevision);
                int tiempoRestante = this.getDayDuration() - minStart - tiempoRevision;
                this.setJobDoing("Trabajando");
                Main.p.jobDoingDirector.setText((Main.nintendo.getDirector().getJobDoing()));
                Main.p.jobDoingDirector2.setText((Main.saquareenix.getDirector().getJobDoing()));
                Main.p.jobDoingDirector3.setText((Main.capcom.getDirector().getJobDoing()));

                Main.p.nextCut.setText(Integer.toString((int) Main.nintendo.getDirector().getDayCounter()));
                Main.p.nextCut1.setText(Integer.toString((int) Main.saquareenix.getDirector().getDayCounter()));
                Main.p.nextCut2.setText(Integer.toString((int) Main.capcom.getDirector().getDayCounter()));
                sleep(tiempoRestante);

                
            }
//            if (Main.p.nextCut.getText().equals("0")) {
//                this.setDayCounter(this.getDiasDefinitio()); 
//                Main.p.nextCut.setText(Integer.toString((int) Main.nintendo.getDirector().getDayCounter()));
//                Main.p.nextCut1.setText(Integer.toString((int) Main.saquareenix.getDirector().getDayCounter()));
//                Main.p.nextCut2.setText(Integer.toString((int) Main.capcom.getDirector().getDayCounter()));
//                
//            }

        } catch (InterruptedException ex) {
            Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean checkcouenter() {
        try {
            this.getMutex().acquire();
            if (true) {
                if (this.getCompany().equals("Nintendo")) {
                    if (Main.nintendo.getPm().getCountPerDay() <= 0) {
                        Main.nintendo.getPm().setCountPerDay(this.getDayCounter());
                        Main.nintendo.getMainMutex().release();

                    }
                    Main.nintendo.getMainMutex().release();
                    return false;

                } else if (this.getCompany().equals("Square Enix")) {

                    if (Main.saquareenix.getPm().getCountPerDay() <= 0) {
                        Main.saquareenix.getPm().setCountPerDay(this.getDayCounter());
                        Main.saquareenix.getMainMutex().release();

                    }
                    Main.saquareenix.getMainMutex().release();
                    return false;

                } else {

                    if (Main.capcom.getPm().getCountPerDay() <= 0) {
                        Main.capcom.getPm().setCountPerDay(this.getDayCounter());
                        Main.capcom.getMainMutex().release();

                    }
                    Main.capcom.getMainMutex().release();
                    return false;

                }

            }

        } catch (InterruptedException ex) {
            Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

//    public void checkPM() throws InterruptedException{
//        
//        
//        try {
//            this.setJobDoing("Trabajando");
//                    Random random = new Random();
//                    System.out.println(this.getJobDoing());
//                    int hour= (random.nextInt(24));
//                    int minsStart= (int)(this.getDayDuration() * hour)/24;
//                    System.out.println(this.getJobDoing());
//                    Thread.sleep(minsStart);
//                    this.setJobDoing("Rivisando al PM");
//                    int revisando =(int)((this.getDayDuration()*25)/1440);
//                    System.out.println(this.getJobDoing());
//                    Thread.sleep(revisando);
//                    this.setJobDoing("Trabajando");
//                    System.out.println(this.getJobDoing());
//                    Thread.sleep(this.getDayDuration() - minsStart - revisando);
//                    
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
//                }
//        
//        
//    }
    @Override
    public void run() {
        while (true) {

            try {
                System.out.println("FLAGGGGGG: Day counter inicial:"+this.getDayCounterInitial());
                this.checkPm();

                this.setSalaryAcumulado(this.getSalaryAcumulado() + this.getSalary() * 24);

                Main.p.jobDoingDirector.setText((Main.nintendo.getDirector().getJobDoing()));
                Main.p.jobDoingDirector2.setText((Main.saquareenix.getDirector().getJobDoing()));
                Main.p.jobDoingDirector3.setText((Main.capcom.getDirector().getJobDoing()));

                Thread.sleep(this.getDayDuration());
            } catch (InterruptedException ex) {
                Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

//    public void check()  {
//        
//         this.setJobDoing("Trabajando");
//                    Random random = new Random();
//                    System.out.println(this.getJobDoing());
//                    int hour= (random.nextInt((7)+12));
//                    int firstbreack= (int)(this.getDayDuration() * hour)/24;
//                    System.out.println(this.getJobDoing());
//                    
//                    float timecheackpm= (random.nextInt((61)+30));
//                    
//                    int secondBreack =(int)(this.getDayDuration()*(timecheackpm/1440));
//                    
////                    System.out.println(this.getJobDoing());
//                     int thirdBreack =(int)(this.getDayDuration() - firstbreack - secondBreack);
//                    
//        
//        
//        try {
//            
//                  sleep(firstbreack);  
//                  this.setJobDoing("Revisando al PM");
//                  sleep(secondBreack);
//                  this.setJobDoing("Trabajando");
//                  sleep(thirdBreack);
//                    
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
//                }
//        
//        
//    }
//    @Override
//    public void run(){
//        while(true){
//                    
//            try {
//                this.checkPM();
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//        }
//      
//        }
    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the dayCounter
     */
    public int getDayCounter() {
        return getDayCounterInitial();
    }

    /**
     * @param dayCounter the dayCounter to set
     */
    public void setDayCounter(int dayCounter) {
        this.setDayCounterInitial(dayCounter);
    }

    /**
     * @return the work
     */
    public String getWork() {
        return work;
    }

    /**
     * @param work the work to set
     */
    public void setWork(String work) {
        this.work = work;
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
     * @return the dayCounterInitial
     */
    public int getDayCounterInitial() {
        return dayCounterInitial;
    }

    /**
     * @param dayCounterInitial the dayCounterInitial to set
     */
    public void setDayCounterInitial(int dayCounterInitial) {
        this.dayCounterInitial = dayCounterInitial;
    }

    /**
     * @return the integer
     */
    public Integrador getInteger() {
        return integer;
    }

    /**
     * @param integer the integer to set
     */
    public void setInteger(Integrador integer) {
        this.integer = integer;
    }

    /**
     * @return the earnings
     */
    public double getEarnings() {
        return earnings;
    }

    /**
     * @param earnings the earnings to set
     */
    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

    /**
     * @return the precioDlc
     */
    public long getPrecioDlc() {
        return precioDlc;
    }

    /**
     * @param precioDlc the precioDlc to set
     */
    public void setPrecioDlc(long precioDlc) {
        this.precioDlc = precioDlc;
    }

    /**
     * @return the precioJuegoNormal
     */
    public long getPrecioJuegoNormal() {
        return precioJuegoNormal;
    }

    /**
     * @param precioJuegoNormal the precioJuegoNormal to set
     */
    public void setPrecioJuegoNormal(long precioJuegoNormal) {
        this.precioJuegoNormal = precioJuegoNormal;
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

    /**
     * @return the contadorJuegosNormales
     */
    public int getContadorJuegosNormales() {
        return contadorJuegosNormales;
    }

    /**
     * @param contadorJuegosNormales the contadorJuegosNormales to set
     */
    public void setContadorJuegosNormales(int contadorJuegosNormales) {
        this.contadorJuegosNormales = contadorJuegosNormales;
    }

    /**
     * @return the contadorJuegosDlc
     */
    public int getContadorJuegosDlc() {
        return contadorJuegosDlc;
    }

    /**
     * @param contadorJuegosDlc the contadorJuegosDlc to set
     */
    public void setContadorJuegosDlc(int contadorJuegosDlc) {
        this.contadorJuegosDlc = contadorJuegosDlc;
    }

    /**
     * @return the gananciaBruta
     */
    public int getGananciaBruta() {
        return gananciaBruta;
    }

    /**
     * @param gananciaBruta the gananciaBruta to set
     */
    public void setGananciaBruta(int gananciaBruta) {
        this.gananciaBruta = gananciaBruta;
    }

    /**
     * @return the diasDefinitio
     */
    public int getDiasDefinitio() {
        return diasDefinitio;
    }

    /**
     * @param diasDefinitio the diasDefinitio to set
     */
    public void setDiasDefinitio(int diasDefinitio) {
        this.diasDefinitio = diasDefinitio;
    }

}
