/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so_project1;


/**
 *
 * @author giovannacianfaglione
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import java.lang.Integer;
import static java.lang.Thread.sleep;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author catalina
 */
public class Nintendo extends Thread{
    private Semaphore mainMutex = new Semaphore(1);
    
    private int dayCounter; 
    
    // JUEGO ESTANDAR 
    private int juegoSGuion = 2; 
    private int juegoSNiveles = 1; 
    private int juegoSSprites = 4; 
    private int juegoSSistemasComplejos = 4; 
    private int gananciaS = 550; 
    
    
    // JUEGO CON DLC: 
    private int maxParaDlc = 5; // lo que se necesita para crear 1 dlc 
    private int cantDlc = 2; // la cantidad de dlc que se tienen que crear
    private int gananciDlc = 600; 

    private int dayDuration; // la cantidad de trabajadores por area; 
    private int narrativa; 
    private int niveles; 
    private int sprites; 
    private int logica; 
    private int dlc; 
    private int integrador; 
//    private String companyName= "Nintendo";
    
    // instancias de los trabajadores: 
    private Worker DesarroladorNarrativa; 
    private Worker DiseñadorNiveles; 
    private Worker ArtistaSprites; 
    private Worker ProgramadorLogica; 
    private Worker  DesarrolladorDlc; 
    private Integrador miIntegrador; 
    private PM pm; 
    private Director director;
    private int maxEmpleados; 
  
    private int costoAcumulado; 
    // drive de la empresa: 
    private Drive drive; 

    public Nintendo() {
        
        this.leerTxt();
        this.drive = new Drive(20, 25, 55, 35, 10); 
        this.DesarroladorNarrativa = new Worker(this.getDrive(), 4, 10, 1, this.getNarrativa(), this.getDayDuration(), "narrative", this.getMainMutex(), "Nintendo");
        this.DiseñadorNiveles = new Worker(this.getDrive(), 4, 13, 1, this.getNiveles(), this.getDayDuration(), "levels", this.getMainMutex(), "Nintendo"); 
        this.ArtistaSprites = new Worker(this.getDrive(), 1, 20, 1, this.getSprites(), this.getDayDuration(), "sprites", this.getMainMutex(), "Nintendo"); 
        this.ProgramadorLogica = new Worker(this.getDrive(), 1, 8, 5, this.getLogica(), this.getDayDuration(), "systems", this.getMainMutex(), "Nintendo"); 
        this.DesarrolladorDlc = new Worker(this.getDrive(), 2, 17, 1, this.getDlc(), this.getDayDuration(), "dlc", this.getMainMutex(), "Nintendo"); 
        this.miIntegrador = new Integrador(5, this.getDayDuration(),1,2,4,4,2, this.getDrive(), this.getMainMutex(), this.getIntegrador());
        this.director = new Director(this.getDayCounter(), this.getDayDuration(), this.getMiIntegrador(), 600, 550, this.getMainMutex(), "Nintendo"); 
        this.pm = new PM(this.getDayDuration(), this.getDirector(), this.getMainMutex(), "Nintendo");
        this.maxEmpleados= 16;
        this.costoAcumulado = 0; 
        
        
        
        }
    
    
    
    public void leerDrive(){
    Funciones funciones = new Funciones();
    String path = "src//Txt//Nintendo.txt";
    funciones.leerTxtDrive(path, this.getDayDuration(), this.getNarrativa(), this.getSprites(), this.getLogica(), this.getDlc());
    System.out.println("Day duration: " + funciones.getDayDuration());
    System.out.println("Narrativa: " + funciones.getNarrativa());
    System.out.println("Sprites: " + funciones.getSprites());
    System.out.println("Logica: " + funciones.getLogica());
    System.out.println("Dlc: " + funciones.getDlc());
    System.out.println("Integer: " + funciones.getIntegrador());
 }
    
    
   
   
    
    public void leerTxt(){
         
        Funciones funciones = new Funciones();
        String path = "src//Txt//Nintendo.txt";
        File file = new File(path);
        String line;
        String lectura_txt = "";
        try{
            if (!file.exists()){
                file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while((line = br.readLine()) != null){
                    if(!line.isEmpty()){
                        lectura_txt += line + "\n";
                        
                    }
                    
                }//
            }if(! "".equals(lectura_txt)){
//                String[] lectura_split = lectura_txt.split("\n");
                String lectura_split= lectura_txt.replace("(?m)^[ \t]*\r?\n", "");
                String[] lines= lectura_split.split("\\n");
                for (int i = 0; i < lines.length; i++) {
                    String[] lectura = lines[i].split(",");
                    if("dayDuration".equals(lectura[0])){
//                        System.out.println("");
//                        System.out.println(lectura[1]);
                        String num= lectura[1];
                        int u= java.lang.Integer.parseInt(num);
//                        System.out.println(i);
//                        String string = lectura[1];
                        setDayDuration(u);
                        
                    }else if("narrativa".equals(lectura[0])){
//                         System.out.println("");
//                        System.out.println(lectura[1]);
                        int m=Integer.parseInt(lectura[1]);
                        setNarrativa(m);
                        
                    }else if("niveles".equals(lectura[0])){
//                         System.out.println("");
//                        System.out.println(lectura[1]);
                        setNiveles(Integer.parseInt(lectura[1])); 
                    }else if("sprites".equals(lectura[0])){
//                         System.out.println("");
//                        System.out.println(lectura[1]);
                        setSprites(Integer.parseInt(lectura[1])); 
                    }else if(lectura[0].equals("logica")){
//                         System.out.println("");
//                        System.out.println(lectura[1]);
                        setLogica(Integer.parseInt(lectura[1])); 
                    }else if(lectura[0].equals("dlc")){
//                         System.out.println("");
//                        System.out.println(lectura[1]);
                        setDlc(Integer.parseInt(lectura[1]));
                    }else if(lectura[0].equals("dayCounter")){
                        this.setDayCounter(Integer.parseInt(lectura[1])); 
                }
                    else{
//                         System.out.println("");
//                        System.out.println(lectura[1]);
                        setIntegrador(Integer.parseInt(lectura[1])); 
                    }
                
            }
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se logró leer el archivo txt");
        }
//        funciones.leerTxt(path, this.dayDuration, this.narrativa, this.sprites, this.logica, this.dlc, this.integrador);
//        System.out.println("Day duration: " + this.dayDuration);
//        System.out.println("Narrativa: " + this.narrativa);
//        System.out.println("Sprites: " + this.sprites);
//        System.out.println("Logica: " + this.logica);
//        System.out.println("Dlc: " + this.dlc);
//        System.out.println("Integer: " + this.integrador);
        
        
    }
    
    
    public void escribirTxt(){
        
//        String textoActual="";
        String textoActual = "dayDuration,"+"\nnarrativa,"+"\nniveles,"+"\nsprites,"+"\nlogica,"+"\ndlc,"+"\ndayCounter,";
        
        
        
    }
        @Override
    public void run(){
        
        try {
            
            this.getDesarroladorNarrativa().start();
            this.getDiseñadorNiveles().start(); 
            this.getArtistaSprites().start(); 
            this.getProgramadorLogica().start(); 
            this.getDesarrolladorDlc().start(); 
            this.getMiIntegrador().start();
            this.getDirector().start();
            this.getPm().start();
            this.setCostoAcumulado((int) (this.getCostoAcumulado() + this.getDesarroladorNarrativa().getSalaryAcumulado() + this.getDesarrolladorDlc().getSalaryAcumulado() + this.getDiseñadorNiveles().getSalaryAcumulado() + this.getArtistaSprites().getSalaryAcumulado() + this.getProgramadorLogica().getSalaryAcumulado() + this.getMiIntegrador().getSalary() + this.getDirector().getSalary() + this.getPm().getSalaryAcumulado())); 
//            Main.p.salarioMonth.setText(Integer.toString(this.costoAcumulado));
            sleep(this.getDayDuration()*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Capcom.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    
    
    
    
    /**
     * @return the juegoSGuion
     */
    public int getJuegoSGuion() {
        return juegoSGuion;
    }

    /**
     * @param juegoSGuion the juegoSGuion to set
     */
    public void setJuegoSGuion(int juegoSGuion) {
        this.juegoSGuion = juegoSGuion;
    }

    /**
     * @return the juegoSNiveles
     */
    public int getJuegoSNiveles() {
        return juegoSNiveles;
    }

    /**
     * @param juegoSNiveles the juegoSNiveles to set
     */
    public void setJuegoSNiveles(int juegoSNiveles) {
        this.juegoSNiveles = juegoSNiveles;
    }

    /**
     * @return the juegoSSprites
     */
    public int getJuegoSSprites() {
        return juegoSSprites;
    }

    /**
     * @param juegoSSprites the juegoSSprites to set
     */
    public void setJuegoSSprites(int juegoSSprites) {
        this.juegoSSprites = juegoSSprites;
    }

    /**
     * @return the juegoSSistemasComplejos
     */
    public int getJuegoSSistemasComplejos() {
        return juegoSSistemasComplejos;
    }

    /**
     * @param juegoSSistemasComplejos the juegoSSistemasComplejos to set
     */
    public void setJuegoSSistemasComplejos(int juegoSSistemasComplejos) {
        this.juegoSSistemasComplejos = juegoSSistemasComplejos;
    }

    /**
     * @return the gananciaS
     */
    public int getGananciaS() {
        return gananciaS;
    }

    /**
     * @param gananciaS the gananciaS to set
     */
    public void setGananciaS(int gananciaS) {
        this.gananciaS = gananciaS;
    }

    /**
     * @return the maxParaDlc
     */
    public int getMaxParaDlc() {
        return maxParaDlc;
    }

    /**
     * @param maxParaDlc the maxParaDlc to set
     */
    public void setMaxParaDlc(int maxParaDlc) {
        this.maxParaDlc = maxParaDlc;
    }

    /**
     * @return the cantDlc
     */
    public int getCantDlc() {
        return cantDlc;
    }

    /**
     * @param cantDlc the cantDlc to set
     */
    public void setCantDlc(int cantDlc) {
        this.cantDlc = cantDlc;
    }

    /**
     * @return the gananciDlc
     */
    public int getGananciDlc() {
        return gananciDlc;
    }

    /**
     * @param gananciDlc the gananciDlc to set
     */
    public void setGananciDlc(int gananciDlc) {
        this.gananciDlc = gananciDlc;
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
     * @return the narrativa
     */
    public int getNarrativa() {
        return narrativa;
    }

    /**
     * @param narrativa the narrativa to set
     */
    public void setNarrativa(int narrativa) {
        this.narrativa = narrativa;
    }

    /**
     * @return the niveles
     */
    public int getNiveles() {
        return niveles;
    }

    /**
     * @param niveles the niveles to set
     */
    public void setNiveles(int niveles) {
        this.niveles = niveles;
    }

    /**
     * @return the sprites
     */
    public int getSprites() {
        return sprites;
    }

    /**
     * @param sprites the sprites to set
     */
    public void setSprites(int sprites) {
        this.sprites = sprites;
    }

    /**
     * @return the logica
     */
    public int getLogica() {
        return logica;
    }

    /**
     * @param logica the logica to set
     */
    public void setLogica(int logica) {
        this.logica = logica;
    }

    /**
     * @return the dlc
     */
    public int getDlc() {
        return dlc;
    }

    /**
     * @param dlc the dlc to set
     */
    public void setDlc(int dlc) {
        this.dlc = dlc;
    }

    /**
     * @return the integrador
     */
    public int getIntegrador() {
        return integrador;
    }

    /**
     * @param integrador the integrador to set
     */
    public void setIntegrador(int integrador) {
        this.integrador = integrador;
    }

    /**
     * @return the DesarroladorNarrativa
     */
    public Worker getDesarroladorNarrativa() {
        return DesarroladorNarrativa;
    }

    /**
     * @param DesarroladorNarrativa the DesarroladorNarrativa to set
     */
    public void setDesarroladorNarrativa(Worker DesarroladorNarrativa) {
        this.DesarroladorNarrativa = DesarroladorNarrativa;
    }

    /**
     * @return the DiseñadorNiveles
     */
    public Worker getDiseñadorNiveles() {
        return DiseñadorNiveles;
    }

    /**
     * @param DiseñadorNiveles the DiseñadorNiveles to set
     */
    public void setDiseñadorNiveles(Worker DiseñadorNiveles) {
        this.DiseñadorNiveles = DiseñadorNiveles;
    }

    /**
     * @return the ArtistaSprites
     */
    public Worker getArtistaSprites() {
        return ArtistaSprites;
    }

    /**
     * @param ArtistaSprites the ArtistaSprites to set
     */
    public void setArtistaSprites(Worker ArtistaSprites) {
        this.ArtistaSprites = ArtistaSprites;
    }

    /**
     * @return the ProgramadorLogica
     */
    public Worker getProgramadorLogica() {
        return ProgramadorLogica;
    }

    /**
     * @param ProgramadorLogica the ProgramadorLogica to set
     */
    public void setProgramadorLogica(Worker ProgramadorLogica) {
        this.ProgramadorLogica = ProgramadorLogica;
    }

    /**
     * @return the DesarrolladorDlc
     */
    public Worker getDesarrolladorDlc() {
        return DesarrolladorDlc;
    }

    /**
     * @param DesarrolladorDlc the DesarrolladorDlc to set
     */
    public void setDesarrolladorDlc(Worker DesarrolladorDlc) {
        this.DesarrolladorDlc = DesarrolladorDlc;
    }

    /**
     * @return the miIntegrador
     */
    public Integrador getMiIntegrador() {
        return miIntegrador;
    }

    /**
     * @param miIntegrador the miIntegrador to set
     */
    public void setMiIntegrador(Integer miIntegrador) {
        this.setMiIntegrador(miIntegrador);
    }

    /**
     * @return the pm
     */
    public PM getPm() {
        return pm;
    }

    /**
     * @param pm the pm to set
     */
    public void setPm(PM pm) {
        this.pm = pm;
    }

    /**
     * @return the director
     */
    public Director getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(Director director) {
        this.director = director;
    }

    /**
     * @return the mainMutex
     */
    public Semaphore getMainMutex() {
        return mainMutex;
    }

    /**
     * @param mainMutex the mainMutex to set
     */
    public void setMainMutex(Semaphore mainMutex) {
        this.mainMutex = mainMutex;
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
     * @param miIntegrador the miIntegrador to set
     */
    public void setMiIntegrador(Integrador miIntegrador) {
        this.miIntegrador = miIntegrador;
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
     * @return the maxEmpleados
     */
    public int getMaxEmpleados() {
        return maxEmpleados;
    }

    /**
     * @param maxEmpleados the maxEmpleados to set
     */
    public void setMaxEmpleados(int maxEmpleados) {
        this.maxEmpleados = maxEmpleados;
    }

    /**
     * @return the costoAcumulado
     */
    public int getCostoAcumulado() {
        return costoAcumulado;
    }

    /**
     * @param costoAcumulado the costoAcumulado to set
     */
    public void setCostoAcumulado(int costoAcumulado) {
        this.costoAcumulado = costoAcumulado;
    }
    
    
    
    
}


//public class Nintendo {
//     // JUEGO ESTANDAR
//    private int juegoSGuion = 2;
//    private int juegoSNiveles = 1;
//    private int juegoSSprites = 4;
//    private int juegoSSistemasComplejos = 4;
//    private int gananciaS = 550;
//   
//    // JUEGO CON DLC:
//    private int maxParaDlc = 5; // lo que se necesita para crear 1 dlc
//    private int cantDlc = 2; // la cantidad de dlc que se tienen que crear
//    private int gananciDlc = 600;
//
//    private int dayDuration;
//    private int narrativa;
//    private int niveles;
//    private int sprites;
//    private int logica;
//    private int dlc;
//    private int integrador;
//   
//   
// public void leerTxt(){
//    Funciones funciones = new Funciones();
//    String path = "src//Txt//Nintendo.txt";
//    funciones.leerTxt(path, this.dayDuration, this.narrativa, this.sprites, this.logica, this.dlc, this.integrador);
//    System.out.println("Day duration: " + funciones.getDayDuration());
//    System.out.println("Narrativa: " + funciones.getNarrativa());
//    System.out.println("Sprites: " + funciones.getSprites());
//    System.out.println("Logica: " + funciones.getLogica());
//    System.out.println("Dlc: " + funciones.getDlc());
//    System.out.println("Integer: " + funciones.getIntegrador());
// }
//   
////    public void leerTxt(){
//////        String path = stringPath;
////        File file = new File("src//Txt//Nintendo.txt");
////        String line;
////        String lectura_txt = "";
////        try{
////            if (!file.exists()){
////                file.createNewFile();
////            }else{
////                FileReader fr = new FileReader(file);
////                BufferedReader br = new BufferedReader(fr);
////                while((line = br.readLine()) != null){
////                    if(!line.isEmpty()){
////                        lectura_txt += line + "\n";
////                       
////                    }
////                   
////                }//
////            }if(! "".equals(lectura_txt)){
//////                String[] lectura_split = lectura_txt.split("\n");
////                String lectura_split= lectura_txt.replace("(?m)^[ \t]*\r?\n", "");
////                String[] lines= lectura_split.split("\\n");
////                for (int i = 0; i < lines.length; i++) {
////                    String[] lectura = lines[i].split(",");
////                    if("dayDuration".equals(lectura[0])){
////                        System.out.println("");
////                        System.out.println(lectura[1]);
////                        String num= lectura[1];
////                        int u= java.lang.Integer.parseInt(num);
//////                        System.out.println(i);
//////                        String string = lectura[1];
////                        dayDuration = u;
////                       
////                    }else if("narrative".equals(lectura[0])){
////                         System.out.println("");
////                        System.out.println(lectura[1]);
////                        int m=java.lang.Integer.parseInt(lectura[1]);
////                         
////                        narrativa = m;
////                    }else if("niveles".equals(lectura[0])){
////                         System.out.println("");
////                        System.out.println(lectura[1]);
////                        narrativa = java.lang.Integer.parseInt(lectura[1]);
////                    }else if("sprites".equals(lectura[0])){
////                         System.out.println("");
////                        System.out.println(lectura[1]);
////                        sprites = java.lang.Integer.parseInt(lectura[1]);
////                    }else if(lectura[0].equals("logica")){
////                         System.out.println("");
////                        System.out.println(lectura[1]);
////                        logica = java.lang.Integer.parseInt(lectura[1]);
////                    }else if(lectura[0].equals("dlc")){
////                         System.out.println("");
////                        System.out.println(lectura[1]);
////                        dlc = java.lang.Integer.parseInt(lectura[1]);
////                    }else{
////                         System.out.println("");
////                        System.out.println(lectura[1]);
////                        integrador = java.lang.Integer.parseInt(lectura[1]);
////                    }
////               
////            }
////            }
////           
////        }catch(Exception e){
////            JOptionPane.showMessageDialog(null, "No se logró leer el archivo txt");
////        }
////        
////        System.out.println("Day duration: " + this.dayDuration);
////        System.out.println("Narrativa: " + this.narrativa);
////        System.out.println("Sprites: " + this.sprites);
////        System.out.println("Logica: " + this.logica);
////        System.out.println("Dlc: " + this.dlc);
////        System.out.println("Integer: " + this.integrador);
////}
//   
//   
//    /**
//     * @return the juegoSGuion
//     */
//    public int getJuegoSGuion() {
//        return juegoSGuion;
//    }
//
//    /**
//     * @param juegoSGuion the juegoSGuion to set
//     */
//    public void setJuegoSGuion(int juegoSGuion) {
//        this.juegoSGuion = juegoSGuion;
//    }
//
//    /**
//     * @return the juegoSNiveles
//     */
//    public int getJuegoSNiveles() {
//        return juegoSNiveles;
//    }
//
//    /**
//     * @param juegoSNiveles the juegoSNiveles to set
//     */
//    public void setJuegoSNiveles(int juegoSNiveles) {
//        this.juegoSNiveles = juegoSNiveles;
//    }
//
//    /**
//     * @return the juegoSSprites
//     */
//    public int getJuegoSSprites() {
//        return juegoSSprites;
//    }
//
//    /**
//     * @param juegoSSprites the juegoSSprites to set
//     */
//    public void setJuegoSSprites(int juegoSSprites) {
//        this.juegoSSprites = juegoSSprites;
//    }
//
//    /**
//     * @return the juegoSSistemasComplejos
//     */
//    public int getJuegoSSistemasComplejos() {
//        return juegoSSistemasComplejos;
//    }
//
//    /**
//     * @param juegoSSistemasComplejos the juegoSSistemasComplejos to set
//     */
//    public void setJuegoSSistemasComplejos(int juegoSSistemasComplejos) {
//        this.juegoSSistemasComplejos = juegoSSistemasComplejos;
//    }
//
//    /**
//     * @return the gananciaS
//     */
//    public int getGananciaS() {
//        return gananciaS;
//    }
//
//    /**
//     * @param gananciaS the gananciaS to set
//     */
//    public void setGananciaS(int gananciaS) {
//        this.gananciaS = gananciaS;
//    }
//
//    /**
//     * @return the maxParaDlc
//     */
//    public int getMaxParaDlc() {
//        return maxParaDlc;
//    }
//
//    /**
//     * @param maxParaDlc the maxParaDlc to set
//     */
//    public void setMaxParaDlc(int maxParaDlc) {
//        this.maxParaDlc = maxParaDlc;
//    }
//
//    /**
//     * @return the cantDlc
//     */
//    public int getCantDlc() {
//        return cantDlc;
//    }
//
//    /**
//     * @param cantDlc the cantDlc to set
//     */
//    public void setCantDlc(int cantDlc) {
//        this.cantDlc = cantDlc;
//    }
//
//    /**
//     * @return the gananciDlc
//     */
//    public int getGananciDlc() {
//        return gananciDlc;
//    }
//
//    /**
//     * @param gananciDlc the gananciDlc to set
//     */
//    public void setGananciDlc(int gananciDlc) {
//        this.gananciDlc = gananciDlc;
//    }
//
//    /**
//     * @return the dayDuration
//     */
//    public int getDayDuration() {
//        return dayDuration;
//    }
//
//    /**
//     * @param dayDuration the dayDuration to set
//     */
//    public void setDayDuration(int dayDuration) {
//        this.dayDuration = dayDuration;
//    }
//
//    /**
//     * @return the narrativa
//     */
//    public int getNarrativa() {
//        return narrativa;
//    }
//
//    /**
//     * @param narrativa the narrativa to set
//     */
//    public void setNarrativa(int narrativa) {
//        this.narrativa = narrativa;
//    }
//
//    /**
//     * @return the niveles
//     */
//    public int getNiveles() {
//        return niveles;
//    }
//
//    /**
//     * @param niveles the niveles to set
//     */
//    public void setNiveles(int niveles) {
//        this.niveles = niveles;
//    }
//
//    /**
//     * @return the sprites
//     */
//    public int getSprites() {
//        return sprites;
//    }
//
//    /**
//     * @param sprites the sprites to set
//     */
//    public void setSprites(int sprites) {
//        this.sprites = sprites;
//    }
//
//    /**
//     * @return the logica
//     */
//    public int getLogica() {
//        return logica;
//    }
//
//    /**
//     * @param logica the logica to set
//     */
//    public void setLogica(int logica) {
//        this.logica = logica;
//    }
//
//    /**
//     * @return the dlc
//     */
//    public int getDlc() {
//        return dlc;
//    }
//
//    /**
//     * @param dlc the dlc to set
//     */
//    public void setDlc(int dlc) {
//        this.dlc = dlc;
//    }
//
//    /**
//     * @return the integrador
//     */
//    public int getIntegrador() {
//        return integrador;
//    }
//
//    /**
//     * @param integrador the integrador to set
//     */
//    public void setIntegrador(int integrador) {
//        this.integrador = integrador;
//    }
//    
//}
