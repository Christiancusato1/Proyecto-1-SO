/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import java.util.concurrent.Semaphore;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSpinner;
import so_project1.Capcom;
import so_project1.Main;
import so_project1.Nintendo;
import so_project1.SquareEnix;

/**
 *
 * @author giovannacianfaglione
 */
public class MainPagee extends javax.swing.JFrame {
    
//    Semaphore mainMutex;
//    Capcom capcom= new Capcom();
//    Nintendo nintendo= new Nintendo();
//    SquareEnix saquareenix= new SquareEnix();
    
    Capcom capcom = Main.capcom;
    Nintendo nintendo = Main.nintendo; 
    SquareEnix saquareenix = Main.saquareenix; 
    
    private int contadorNintendo;
    private int contadorEnix;
    private int contadorCapcom;
    private int disponibilidadNintendo;
    private int disponibilidadEnix;
    private int disponibilidadCapcom;
    JSpinner[] spinnerNintendo = new JSpinner[6]; 
    JSpinner[] spinnerSquareEnix = new JSpinner[6]; 
    JSpinner[] spinnerCapcom = new JSpinner[6]; 
    JSpinner[] spinnerNintendoTabbed = new JSpinner[6]; 
    JSpinner[] spinnerSquareEnixTabbed = new JSpinner[6]; 
    JSpinner[] spinnerCapcomTabbed = new JSpinner[6]; 
    FuncionesUI function= new FuncionesUI();
    boolean salir;
   
    

    
    
    
    

    /**
     * Creates new form MainPagee
     */
    public MainPagee() {
        initComponents();
        salir= true;
        this.nintendo.leerTxt();
        this.capcom.leerTxt();
        this.saquareenix.leerTxt();
        
        
//        n1.setText(Integer.toString(nintendo.getNarrativa()));
//        n2.setText(Integer.toString(nintendo.getNiveles()));
//        n3.setText(Integer.toString(nintendo.getSprites()));
//        n4.setText(Integer.toString(nintendo.getLogica()));
//        n5.setText(Integer.toString(nintendo.getDlc()));
//        n6.setText(Integer.toString(nintendo.getIntegrador()));
        
        
//        n7.setText(Integer.toString(capcom.getNarrativa()));
//        c2.setText(Integer.toString(capcom.getNiveles()));
//        c3.setText(Integer.toString(capcom.getSprites()));
//        c4.setText(Integer.toString(capcom.getLogica()));
//        c5.setText(Integer.toString(capcom.getDlc()));
//        c6.setText(Integer.toString(capcom.getIntegrador()));
//        
//        
//        jTextField1.setText(Integer.toString(saquareenix.getNarrativa()));
//        s2.setText(Integer.toString(saquareenix.getNiveles()));
//        s3.setText(Integer.toString(saquareenix.getSprites()));
//        s4.setText(Integer.toString(saquareenix.getLogica()));
//        s5.setText(Integer.toString(saquareenix.getDlc()));
//        s6.setText(Integer.toString(saquareenix.getIntegrador()));
        
        
        
        
//        mainMutex= new Semaphore(1);
        this.setExtendedState(this.MAXIMIZED_BOTH);
//        levelNintendo,spriteNintendo,logicNintendo, dlcNintendo, integerNintendo

//PARA EL DASHBOARD
        narrativeNintendo.setValue(nintendo.getNarrativa()); 
        spinnerNintendo[0] = narrativeNintendo;
        System.out.println(nintendo.getNarrativa());
                
//        spinnerNintendo[0] = spinnerNintendo[0].setValue(saquareenix.getNarrativa()); 
        levelNintendo.setValue(nintendo.getNiveles()); 
        spinnerNintendo[1] = levelNintendo;
        
        spriteNintendo.setValue(nintendo.getSprites()); 
        spinnerNintendo[2] = spriteNintendo;
        logicNintendo.setValue(nintendo.getLogica()); 
        spinnerNintendo[3] = logicNintendo;
        
        dlcNintendo.setValue(nintendo.getDlc()); 
        spinnerNintendo[4] = dlcNintendo;
        
        integerNintendo.setValue(nintendo.getIntegrador()); 
        spinnerNintendo[5] = integerNintendo;
        
        
        
        
        narrativeNintendo.setValue(capcom.getNarrativa());
        spinnerCapcom[0] = narrativeNintendo; 
        levelCapcom.setValue(capcom.getNiveles());
        spinnerCapcom[1] = levelCapcom;
        spriteCapcom.setValue(capcom.getSprites());
        spinnerCapcom[2] = spriteCapcom;
        logicCapcom.setValue(capcom.getLogica());
        spinnerCapcom[3] = logicCapcom;
        dlcCapcom.setValue(capcom.getDlc());
        spinnerCapcom[4] = dlcCapcom;
        integerCapcom.setValue(capcom.getIntegrador());
        spinnerCapcom[5] = integerCapcom;
        
        
        
        narrativeEnix.setValue(saquareenix.getNarrativa()); 
        spinnerSquareEnix[0] = narrativeEnix; 
        levelEnix.setValue(saquareenix.getNiveles()); 
        spinnerSquareEnix[1] = levelEnix;
        System.out.println(saquareenix.getNiveles());
        spriteEnix.setValue(saquareenix.getSprites()); 
        spinnerSquareEnix[2] = spriteEnix;
        logicEnix.setValue(saquareenix.getLogica()); 
        spinnerSquareEnix[3] = logicEnix;
        dlcEnix.setValue(saquareenix.getDlc());
        spinnerSquareEnix[4] = dlcEnix;
        integerEnix.setValue(saquareenix.getIntegrador());
        spinnerSquareEnix[5] = integerEnix;
        
        
        
        
//        PARA CADA UNO DE LOS TABS 

        narrativeNintendo1.setValue(nintendo.getNarrativa()); 
        spinnerNintendoTabbed[0] = narrativeNintendo1;
        System.out.println(nintendo.getNarrativa());
                
//        spinnerNintendo[0] = spinnerNintendo[0].setValue(saquareenix.getNarrativa()); 
        levelNintendo1.setValue(nintendo.getNiveles()); 
        spinnerNintendoTabbed[1] = levelNintendo1;
        
        spriteNintendo1.setValue(nintendo.getSprites()); 
        spinnerNintendoTabbed[2] = spriteNintendo1;
        logicNintendo1.setValue(nintendo.getLogica()); 
        spinnerNintendoTabbed[3] = logicNintendo1;
        
        dlcNintendo1.setValue(nintendo.getDlc()); 
        spinnerNintendoTabbed[4] = dlcNintendo1;
        
        integerNintendo1.setValue(nintendo.getIntegrador()); 
        spinnerNintendoTabbed[5] = integerNintendo1;
        
        
        
        
        narrativeCapcom1.setValue(capcom.getNarrativa());
        spinnerCapcomTabbed[0] = narrativeCapcom1; 
        levelCapcom1.setValue(capcom.getNiveles());
        spinnerCapcomTabbed[1] = levelCapcom1;
        spriteCapcom1.setValue(capcom.getSprites());
        spinnerCapcomTabbed[2] = spriteCapcom1;
        logicCapcom1.setValue(capcom.getLogica());
        spinnerCapcomTabbed[3] = logicCapcom1;
        dlcCapcom1.setValue(capcom.getDlc());
        spinnerCapcomTabbed[4] = dlcCapcom1;
        integerCapcom1.setValue(capcom.getIntegrador());
        spinnerCapcomTabbed[5] = integerCapcom1;
        
        
        
        narrativeEnix2.setValue(saquareenix.getNarrativa()); 
        spinnerSquareEnixTabbed[0] = narrativeEnix2; 
        levelEnix2.setValue(saquareenix.getNiveles()); 
        spinnerSquareEnixTabbed[1] = levelEnix2;
        System.out.println(saquareenix.getNiveles());
        spriteEnix2.setValue(saquareenix.getSprites()); 
        spinnerSquareEnixTabbed[2] = spriteEnix2;
        logicEnix2.setValue(saquareenix.getLogica()); 
        spinnerSquareEnixTabbed[3] = logicEnix2;
        dlcEnix2.setValue(saquareenix.getDlc());
        spinnerSquareEnixTabbed[4] = dlcEnix2;
        integerEnix2.setValue(saquareenix.getIntegrador());
        spinnerSquareEnixTabbed[5] = integerEnix2;
        
        contadorNintendo = function.calcularCantidadTrabajadoresActuales(spinnerNintendo);
        contadorEnix = function.calcularCantidadTrabajadoresActuales(spinnerSquareEnix);
        contadorCapcom=function.calcularCantidadTrabajadoresActuales(spinnerCapcom);
        
        disponibilidadNintendo = function.calcularDisponiblidadDeEmpleados(spinnerNintendo, nintendo.getMaxEmpleados());
        disponibilidadEnix = function.calcularDisponiblidadDeEmpleados(spinnerSquareEnix, saquareenix.getMaxEmpleados());
        disponibilidadCapcom=function.calcularDisponiblidadDeEmpleados(spinnerCapcom, capcom.getMaxEmpleados());
        
        
        narrativaLimite.setText(Integer.toString(nintendo.getDrive().getMaxNarrative()));
        nivelesLimite.setText(Integer.toString(nintendo.getDrive().getMaxLevels()));
        spriteLimites.setText(Integer.toString(nintendo.getDrive().getMaxSprites()));
        logicaLimite.setText(Integer.toString(nintendo.getDrive().getMaxSystems()));
        dclLimite.setText(Integer.toString(nintendo.getDrive().getMaxDlc()));
        
        
        narrativaLimite2.setText(Integer.toString(saquareenix.getDrive().getMaxNarrative()));
        nivelesLimite2.setText(Integer.toString(saquareenix.getDrive().getMaxLevels()));
        spriteLimites2.setText(Integer.toString(saquareenix.getDrive().getMaxSprites()));
        logicaLimite2.setText(Integer.toString(saquareenix.getDrive().getMaxSystems()));
        dclLimite2.setText(Integer.toString(saquareenix.getDrive().getMaxDlc()));
        
        
        narrativaLimite3.setText(Integer.toString(capcom.getDrive().getMaxNarrative()));
        nivelesLimite3.setText(Integer.toString(capcom.getDrive().getMaxLevels()));
        spriteLimites3.setText(Integer.toString(capcom.getDrive().getMaxSprites()));
        logicaLimite3.setText(Integer.toString(capcom.getDrive().getMaxSystems()));
        dclLimite3.setText(Integer.toString(capcom.getDrive().getMaxDlc()));
        
//        for(int i =0; i<){
//            
//        }
      
//            for (int i = 0; i <spinnerNintendo.length ; i++) {
//            if (Integer.parseInt(spinnerNintendo[0].getValue().toString())>disponibilidadNintendo) {
//                if (disponibilidadNintendo == 0) {
//                    spinnerNintendo[0].setValue(1);
//                    contadorNintendo = function.calcularCantidadTrabajadoresActuales(spinnerNintendo);
//                }else{
//                    spinnerNintendo[0].setValue(disponibilidadNintendo);
//                contadorNintendo = function.calcularCantidadTrabajadoresActuales(spinnerNintendo);
//                }
//                
//                
//            }else if (Integer.parseInt(spinnerNintendo[1].getValue().toString())>disponibilidadNintendo) {
//                if (disponibilidadNintendo == 0) {
//                    spinnerNintendo[1].setValue(1);
//                    contadorNintendo = function.calcularCantidadTrabajadoresActuales(spinnerNintendo);
//                }else{
//                    spinnerNintendo[1].setValue(disponibilidadNintendo);
//                    contadorNintendo = function.calcularCantidadTrabajadoresActuales(spinnerNintendo);
//                }
//                
//                
//            }
//            else if (Integer.parseInt(spinnerNintendo[2].getValue().toString())>disponibilidadNintendo) {
//                if (disponibilidadNintendo == 0) {
//                    spinnerNintendo[2].setValue(1);
//                    contadorNintendo = function.calcularCantidadTrabajadoresActuales(spinnerNintendo);
//                }else{
//                    spinnerNintendo[2].setValue(disponibilidadNintendo);
//                    contadorNintendo = function.calcularCantidadTrabajadoresActuales(spinnerNintendo);
//                }
//                
//            }else if (Integer.parseInt(spinnerNintendo[3].getValue().toString())>disponibilidadNintendo) {
//                if (disponibilidadNintendo == 0) {
//                    spinnerNintendo[3].setValue(1);
//                    contadorNintendo = function.calcularCantidadTrabajadoresActuales(spinnerNintendo);
//                }else{
//                    spinnerNintendo[3].setValue(disponibilidadNintendo);
//                    contadorNintendo = function.calcularCantidadTrabajadoresActuales(spinnerNintendo);
//                }
//                
//                
//            }else if (Integer.parseInt(spinnerNintendo[4].getValue().toString())>disponibilidadNintendo) {
//                if (disponibilidadNintendo == 0) {
//                    spinnerNintendo[4].setValue(1);
//                    contadorNintendo = function.calcularCantidadTrabajadoresActuales(spinnerNintendo);
//                }else{
//                    spinnerNintendo[4].setValue(disponibilidadNintendo);
//                    contadorNintendo = function.calcularCantidadTrabajadoresActuales(spinnerNintendo);
//                }
//                
//                
//            }else if (Integer.parseInt(spinnerNintendo[5].getValue().toString())>disponibilidadNintendo) {
//                if (disponibilidadNintendo == 0) {
//                    spinnerNintendo[5].setValue(1);
//                    contadorNintendo = function.calcularCantidadTrabajadoresActuales(spinnerNintendo);
//                }else{
//                     spinnerNintendo[5].setValue(disponibilidadNintendo);
//                    contadorNintendo = function.calcularCantidadTrabajadoresActuales(spinnerNintendo);
//                }
//                
//                
//            }
//            
//        }
//        
//        for (int i = 0; i <spinnerSquareEnix.length ; i++) {
//            if (Integer.parseInt(spinnerSquareEnix[0].getValue().toString())>disponibilidadEnix) {
//                if (disponibilidadEnix == 0) {
//                    spinnerSquareEnix[0].setValue(1);
//                    contadorEnix = function.calcularCantidadTrabajadoresActuales(spinnerSquareEnix);
//                }else{
//                    spinnerSquareEnix[0].setValue(disponibilidadEnix);
//                    contadorEnix = function.calcularCantidadTrabajadoresActuales(spinnerSquareEnix);
//                }
//                
//                
//                
//            }else if (Integer.parseInt(spinnerSquareEnix[1].getValue().toString())>disponibilidadEnix) {
//                if (disponibilidadEnix == 0) {
//                    spinnerSquareEnix[1].setValue(1);
//                    contadorEnix = function.calcularCantidadTrabajadoresActuales(spinnerSquareEnix);
//                }else{
//                    spinnerSquareEnix[1].setValue(disponibilidadEnix);
//                    contadorEnix = function.calcularCantidadTrabajadoresActuales(spinnerSquareEnix);
//                }
//               
//                
//            }
//            else if (Integer.parseInt(spinnerSquareEnix[2].getValue().toString())>disponibilidadEnix) {
//                if (disponibilidadEnix == 0 ) {
//                     spinnerSquareEnix[2].setValue(1);
//                    contadorEnix = function.calcularCantidadTrabajadoresActuales(spinnerSquareEnix);
//                }else{
//                    spinnerSquareEnix[2].setValue(disponibilidadEnix);
//                    contadorEnix = function.calcularCantidadTrabajadoresActuales(spinnerSquareEnix);
//                }
//                
//                
//            }else if (Integer.parseInt(spinnerSquareEnix[3].getValue().toString())>disponibilidadEnix) {
//                if (disponibilidadEnix == 0) {
//                    spinnerSquareEnix[3].setValue(1);
//                    contadorEnix = function.calcularCantidadTrabajadoresActuales(spinnerSquareEnix);
//                }else{
//                     spinnerSquareEnix[3].setValue(disponibilidadEnix);
//                    contadorEnix = function.calcularCantidadTrabajadoresActuales(spinnerSquareEnix);
//                }
//                
//                
//            }else if (Integer.parseInt(spinnerSquareEnix[4].getValue().toString())>disponibilidadEnix) {
//                if (disponibilidadEnix == 0) {
//                    spinnerSquareEnix[4].setValue(1);
//                    contadorEnix = function.calcularCantidadTrabajadoresActuales(spinnerSquareEnix);
//                }else{
//                    spinnerSquareEnix[4].setValue(disponibilidadEnix);
//                    contadorEnix = function.calcularCantidadTrabajadoresActuales(spinnerSquareEnix);
//                }
//                
//                
//            }else if (Integer.parseInt(spinnerSquareEnix[5].getValue().toString())>disponibilidadEnix) {
//                if (disponibilidadEnix == 0) {
//                    spinnerSquareEnix[5].setValue(1);
//                    contadorEnix = function.calcularCantidadTrabajadoresActuales(spinnerSquareEnix);
//                }else{
//                    spinnerSquareEnix[5].setValue(disponibilidadEnix);
//                    contadorEnix = function.calcularCantidadTrabajadoresActuales(spinnerSquareEnix);
//                }
//                
//                
//            }
//            
//        }
//        
//         for (int i = 0; i <spinnerCapcom.length ; i++) {
//            if (Integer.parseInt(spinnerCapcom[0].getValue().toString())>disponibilidadCapcom) {
//                if (disponibilidadCapcom == 0) {
//                    spinnerCapcom[0].setValue(1);
//                    contadorCapcom = function.calcularCantidadTrabajadoresActuales(spinnerCapcom);
//                }else{
//                    spinnerCapcom[0].setValue(disponibilidadCapcom);
//                    contadorCapcom = function.calcularCantidadTrabajadoresActuales(spinnerCapcom);
//                }
//                
//                
//                
//            }else if (Integer.parseInt(spinnerCapcom[1].getValue().toString())>disponibilidadCapcom) {
//                if (disponibilidadCapcom == 0) {
//                    spinnerCapcom[1].setValue(1);
//                    contadorCapcom = function.calcularCantidadTrabajadoresActuales(spinnerCapcom);
//                }else{
//                    spinnerCapcom[1].setValue(disponibilidadCapcom);
//                    contadorCapcom = function.calcularCantidadTrabajadoresActuales(spinnerCapcom);
//                }
//               
//                
//            }
//            else if (Integer.parseInt(spinnerCapcom[2].getValue().toString())>disponibilidadCapcom) {
//                if (disponibilidadCapcom == 0 ) {
//                     spinnerCapcom[2].setValue(1);
//                    contadorCapcom = function.calcularCantidadTrabajadoresActuales(spinnerCapcom);
//                }else{
//                    spinnerCapcom[2].setValue(disponibilidadCapcom);
//                    contadorCapcom = function.calcularCantidadTrabajadoresActuales(spinnerCapcom);
//                }
//                
//                
//            }else if (Integer.parseInt(spinnerCapcom[3].getValue().toString())>disponibilidadCapcom) {
//                if (disponibilidadCapcom == 0) {
//                    spinnerCapcom[3].setValue(1);
//                    contadorCapcom = function.calcularCantidadTrabajadoresActuales(spinnerCapcom);
//                }else{
//                     spinnerCapcom[3].setValue(disponibilidadCapcom);
//                    contadorCapcom = function.calcularCantidadTrabajadoresActuales(spinnerCapcom);
//                }
//                
//                
//            }else if (Integer.parseInt(spinnerCapcom[4].getValue().toString())>disponibilidadCapcom) {
//                if (disponibilidadCapcom == 0) {
//                    spinnerCapcom[4].setValue(1);
//                    contadorCapcom = function.calcularCantidadTrabajadoresActuales(spinnerCapcom);
//                }else{
//                    spinnerCapcom[4].setValue(disponibilidadCapcom);
//                    contadorCapcom = function.calcularCantidadTrabajadoresActuales(spinnerCapcom);
//                }
//                
//                
//            }else if (Integer.parseInt(spinnerCapcom[5].getValue().toString())>disponibilidadCapcom) {
//                if (disponibilidadCapcom == 0) {
//                    spinnerCapcom[5].setValue(1);
//                    contadorCapcom = function.calcularCantidadTrabajadoresActuales(spinnerCapcom);
//                }else{
//                    spinnerCapcom[5].setValue(disponibilidadCapcom);
//                    contadorCapcom = function.calcularCantidadTrabajadoresActuales(spinnerCapcom);
//                }
//                
//                
//            }
//            
//        }
            
        
            
            
        

        
        
        
        
//        SpinnerNumberModel nm= new SpinnerNumberModel();
//        nm.setMaximum(10);
//        nm.setMinimum(1);
//       narrativeNintendo.setModel(nm);










    }
        
//        nm.setStepSize(SOMEBITS);


    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tabbed = new javax.swing.JTabbedPane();
        DashBoard = new javax.swing.JPanel();
        Header1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        levelEnix = new javax.swing.JSpinner();
        spriteEnix = new javax.swing.JSpinner();
        logicEnix = new javax.swing.JSpinner();
        dlcEnix = new javax.swing.JSpinner();
        integerEnix = new javax.swing.JSpinner();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        levelCapcom = new javax.swing.JSpinner();
        spriteCapcom = new javax.swing.JSpinner();
        logicCapcom = new javax.swing.JSpinner();
        dlcCapcom = new javax.swing.JSpinner();
        integerCapcom = new javax.swing.JSpinner();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        narrativeNintendo = new javax.swing.JSpinner();
        narrativeEnix = new javax.swing.JSpinner();
        n6 = new javax.swing.JTextField();
        narrativeCapcom2 = new javax.swing.JSpinner();
        levelNintendo = new javax.swing.JSpinner();
        spriteNintendo = new javax.swing.JSpinner();
        logicNintendo = new javax.swing.JSpinner();
        integerNintendo = new javax.swing.JSpinner();
        dlcNintendo = new javax.swing.JSpinner();
        Nintendo = new javax.swing.JPanel();
        Header2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        salaryPM = new javax.swing.JLabel();
        cantEmpleados = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jobDoingPM = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        narrativeNintendo1 = new javax.swing.JSpinner();
        levelNintendo1 = new javax.swing.JSpinner();
        spriteNintendo1 = new javax.swing.JSpinner();
        logicNintendo1 = new javax.swing.JSpinner();
        dlcNintendo1 = new javax.swing.JSpinner();
        integerNintendo1 = new javax.swing.JSpinner();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        dlcDisponible = new javax.swing.JLabel();
        gameWithDlc = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        standarsGames = new javax.swing.JLabel();
        logicaDisponible = new javax.swing.JLabel();
        spriteDisponible = new javax.swing.JLabel();
        logicaLimite = new javax.swing.JLabel();
        nivelesDisponible = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        spriteLimites = new javax.swing.JLabel();
        dclLimite = new javax.swing.JLabel();
        narrativaLimite = new javax.swing.JLabel();
        nivelesLimite = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        countFallas = new javax.swing.JLabel();
        countFallas1 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        narrativaDisponible = new javax.swing.JLabel();
        gananciaLote = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        salarioMonth = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jobDoingDirector = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        countEmpleados = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        utility = new javax.swing.JLabel();
        totalDay = new javax.swing.JLabel();
        nextCut = new javax.swing.JLabel();
        SquareEnix = new javax.swing.JPanel();
        Header6 = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        salaryPM2 = new javax.swing.JLabel();
        cantEmpleados2 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jobDoingPM2 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        narrativeEnix2 = new javax.swing.JSpinner();
        levelEnix2 = new javax.swing.JSpinner();
        spriteEnix2 = new javax.swing.JSpinner();
        logicEnix2 = new javax.swing.JSpinner();
        dlcEnix2 = new javax.swing.JSpinner();
        integerEnix2 = new javax.swing.JSpinner();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        dlcDisponible2 = new javax.swing.JLabel();
        gameWithDlc2 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        standarsGames2 = new javax.swing.JLabel();
        logicaDisponible2 = new javax.swing.JLabel();
        spriteDisponible2 = new javax.swing.JLabel();
        logicaLimite2 = new javax.swing.JLabel();
        nivelesDisponible2 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        spriteLimites2 = new javax.swing.JLabel();
        dclLimite2 = new javax.swing.JLabel();
        narrativaLimite2 = new javax.swing.JLabel();
        nivelesLimite2 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        countEmpleados1 = new javax.swing.JLabel();
        countFallas5 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        narrativaDisponible2 = new javax.swing.JLabel();
        gananciaLote2 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        salarioMonth2 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jobDoingDirector2 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        totalDay1 = new javax.swing.JLabel();
        nextCut1 = new javax.swing.JLabel();
        utility1 = new javax.swing.JLabel();
        countFallas2 = new javax.swing.JLabel();
        CapCom = new javax.swing.JPanel();
        Header7 = new javax.swing.JPanel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        salaryPM3 = new javax.swing.JLabel();
        cantEmpleados3 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jobDoingPM3 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        narrativeCapcom1 = new javax.swing.JSpinner();
        levelCapcom1 = new javax.swing.JSpinner();
        spriteCapcom1 = new javax.swing.JSpinner();
        logicCapcom1 = new javax.swing.JSpinner();
        dlcCapcom1 = new javax.swing.JSpinner();
        integerCapcom1 = new javax.swing.JSpinner();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        dlcDisponibles3 = new javax.swing.JLabel();
        gameWithDlc3 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        standarsGames3 = new javax.swing.JLabel();
        logicaDisponibles3 = new javax.swing.JLabel();
        spriteDisponibles3 = new javax.swing.JLabel();
        logicaLimite3 = new javax.swing.JLabel();
        nivelesDisponibles3 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        spriteLimites3 = new javax.swing.JLabel();
        dclLimite3 = new javax.swing.JLabel();
        narrativaLimite3 = new javax.swing.JLabel();
        nivelesLimite3 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        countEmpleados3 = new javax.swing.JLabel();
        countFallas7 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        narrativaDisponible3 = new javax.swing.JLabel();
        gananciaLote3 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        salarioMonth3 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jobDoingDirector3 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        totalDay2 = new javax.swing.JLabel();
        nextCut2 = new javax.swing.JLabel();
        utility2 = new javax.swing.JLabel();
        countFallas3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DashBoard.setBackground(new java.awt.Color(34, 34, 114));

        Header1.setBackground(new java.awt.Color(66, 90, 197));

        jLabel1.setFont(new java.awt.Font("Phosphate", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VideoJuego");

        jLabel2.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dashboard");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimalistic-console-game-controller-gray-icon-on-transparent-background-3d-rendering-png.png"))); // NOI18N

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_GAME_Store_Iberia.png"))); // NOI18N

        javax.swing.GroupLayout Header1Layout = new javax.swing.GroupLayout(Header1);
        Header1.setLayout(Header1Layout);
        Header1Layout.setHorizontalGroup(
            Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Header1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel77)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 489, Short.MAX_VALUE)
                .addGroup(Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Header1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addGap(8, 8, 8)))
                .addGap(34, 34, 34))
        );
        Header1Layout.setVerticalGroup(
            Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Header1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel77))
                .addGap(0, 1, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Header1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Información");

        jLabel45.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("NINTENDO");

        jLabel17.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("CAPCOM");

        jLabel18.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("SQUARE ENIX");

        jLabel44.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Integrador");

        jLabel43.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("DLC");

        jLabel42.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Lógica");

        jLabel41.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Sprites");

        jLabel40.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Niveles");

        jLabel39.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Narrativa");

        levelEnix.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        spriteEnix.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        logicEnix.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        dlcEnix.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        integerEnix.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel33.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Narrativa");

        jLabel34.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Niveles");

        jLabel35.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Sprites");

        jLabel36.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Lógica");

        jLabel37.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("DLC");

        jLabel38.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Integrador");

        levelCapcom.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        spriteCapcom.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        logicCapcom.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        dlcCapcom.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        integerCapcom.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel27.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Narrativa");

        jLabel28.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Niveles");

        jLabel29.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Sprites");

        jLabel30.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Lógica");

        jLabel31.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("DLC");

        jLabel32.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Integrador");

        update.setBackground(new java.awt.Color(66, 90, 197));
        update.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jLabel78.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));

        jLabel79.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));

        narrativeNintendo.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        narrativeEnix.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        n6.setText("jTextField2");
        n6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6ActionPerformed(evt);
            }
        });

        narrativeCapcom2.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        levelNintendo.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        spriteNintendo.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        logicNintendo.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        integerNintendo.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        dlcNintendo.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout DashBoardLayout = new javax.swing.GroupLayout(DashBoard);
        DashBoard.setLayout(DashBoardLayout);
        DashBoardLayout.setHorizontalGroup(
            DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DashBoardLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DashBoardLayout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(spriteNintendo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spriteCapcom, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spriteEnix, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DashBoardLayout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(logicNintendo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logicCapcom, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logicEnix, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DashBoardLayout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(dlcNintendo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dlcCapcom, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dlcEnix, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DashBoardLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(update))
                    .addGroup(DashBoardLayout.createSequentialGroup()
                        .addGroup(DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DashBoardLayout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(levelNintendo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(levelCapcom, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DashBoardLayout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(narrativeNintendo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, 0)
                        .addGroup(DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(DashBoardLayout.createSequentialGroup()
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(levelEnix, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DashBoardLayout.createSequentialGroup()
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(narrativeEnix, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(DashBoardLayout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(integerNintendo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DashBoardLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(integerCapcom, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(integerEnix, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DashBoardLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(DashBoardLayout.createSequentialGroup()
                        .addGroup(DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(narrativeCapcom2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(DashBoardLayout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(95, 95, 95)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DashBoardLayout.setVerticalGroup(
            DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashBoardLayout.createSequentialGroup()
                .addComponent(Header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update))
                .addGroup(DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DashBoardLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addGroup(DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(DashBoardLayout.createSequentialGroup()
                                .addGroup(DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel45)
                                        .addComponent(jLabel18))
                                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addGap(10, 10, 10)
                                .addGroup(DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(narrativeNintendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(narrativeCapcom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(narrativeEnix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(levelNintendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(levelCapcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(levelEnix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(spriteNintendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spriteCapcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spriteEnix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(logicNintendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(logicCapcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(logicEnix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dlcNintendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dlcCapcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dlcEnix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(integerNintendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(integerCapcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(integerEnix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 708, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DashBoardLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        Tabbed.addTab("DashBoard", DashBoard);

        Nintendo.setBackground(new java.awt.Color(34, 34, 114));

        Header2.setBackground(new java.awt.Color(66, 90, 197));

        jLabel3.setFont(new java.awt.Font("Phosphate", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("VideoJuego");

        jLabel4.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Company");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Nintendo_red_logo.svg.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout Header2Layout = new javax.swing.GroupLayout(Header2);
        Header2.setLayout(Header2Layout);
        Header2Layout.setHorizontalGroup(
            Header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Header2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30))
        );
        Header2Layout.setVerticalGroup(
            Header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Header2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap())
            .addGroup(Header2Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel19.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Empleados");

        jLabel21.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Director:");

        salaryPM.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        salaryPM.setForeground(new java.awt.Color(255, 255, 255));

        cantEmpleados.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        cantEmpleados.setForeground(new java.awt.Color(255, 255, 255));

        jLabel52.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 36)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Gestionar Empleados");

        jobDoingPM.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jobDoingPM.setForeground(new java.awt.Color(255, 255, 255));

        jLabel23.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Estadisticas");

        jLabel54.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Narrativa");

        jLabel55.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Niveles");

        jLabel56.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Sprites");

        jLabel57.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Lógica");

        jLabel58.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("DLC");

        jLabel59.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Integrador");

        jLabel66.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Narrativa");

        jLabel67.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("Niveles");

        jLabel68.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Sprites");

        jLabel69.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("Lógica");

        jLabel70.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("DLC");

        jLabel53.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 36)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Juegos Creados");

        jLabel25.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Juegos Standars:");

        jLabel26.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Juegos con DLC:");

        dlcDisponible.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        dlcDisponible.setForeground(new java.awt.Color(255, 255, 255));
        dlcDisponible.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        gameWithDlc.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        gameWithDlc.setForeground(new java.awt.Color(255, 255, 255));

        jLabel60.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 36)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Recursos");

        jLabel24.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Disponible");

        standarsGames.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        standarsGames.setForeground(new java.awt.Color(255, 255, 255));

        logicaDisponible.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        logicaDisponible.setForeground(new java.awt.Color(255, 255, 255));
        logicaDisponible.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        spriteDisponible.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        spriteDisponible.setForeground(new java.awt.Color(255, 255, 255));
        spriteDisponible.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        logicaLimite.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        logicaLimite.setForeground(new java.awt.Color(255, 255, 255));
        logicaLimite.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nivelesDisponible.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        nivelesDisponible.setForeground(new java.awt.Color(255, 255, 255));
        nivelesDisponible.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel46.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Partes");

        jLabel62.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Limite");

        spriteLimites.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        spriteLimites.setForeground(new java.awt.Color(255, 255, 255));
        spriteLimites.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        dclLimite.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        dclLimite.setForeground(new java.awt.Color(255, 255, 255));
        dclLimite.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        narrativaLimite.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        narrativaLimite.setForeground(new java.awt.Color(255, 255, 255));
        narrativaLimite.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nivelesLimite.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        nivelesLimite.setForeground(new java.awt.Color(255, 255, 255));
        nivelesLimite.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel63.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("PM:");

        countFallas.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        countFallas.setForeground(new java.awt.Color(255, 255, 255));

        countFallas1.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        countFallas1.setForeground(new java.awt.Color(255, 255, 255));
        countFallas1.setText("Faltas");

        jLabel64.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Ganancia Bruta");

        narrativaDisponible.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        narrativaDisponible.setForeground(new java.awt.Color(255, 255, 255));
        narrativaDisponible.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        gananciaLote.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        gananciaLote.setForeground(new java.awt.Color(255, 255, 255));
        gananciaLote.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel71.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("Costos Operativos");

        salarioMonth.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        salarioMonth.setForeground(new java.awt.Color(255, 255, 255));
        salarioMonth.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Super_Mario_Maker_2_4_image912w.jpg"))); // NOI18N

        jobDoingDirector.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jobDoingDirector.setForeground(new java.awt.Color(255, 255, 255));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Super_Mario_Maker_2_4_image912w.jpg"))); // NOI18N

        jLabel48.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Utilidad");

        jLabel49.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Días Totales");

        countEmpleados.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        countEmpleados.setForeground(new java.awt.Color(255, 255, 255));

        jLabel50.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Proximo Corte");

        utility.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        utility.setForeground(new java.awt.Color(255, 255, 255));
        utility.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        totalDay.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        totalDay.setForeground(new java.awt.Color(255, 255, 255));
        totalDay.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nextCut.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        nextCut.setForeground(new java.awt.Color(255, 255, 255));
        nextCut.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout NintendoLayout = new javax.swing.GroupLayout(Nintendo);
        Nintendo.setLayout(NintendoLayout);
        NintendoLayout.setHorizontalGroup(
            NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(NintendoLayout.createSequentialGroup()
                .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NintendoLayout.createSequentialGroup()
                        .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NintendoLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel52)
                                    .addGroup(NintendoLayout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(countEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(NintendoLayout.createSequentialGroup()
                                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(narrativeNintendo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(NintendoLayout.createSequentialGroup()
                                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(levelNintendo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(NintendoLayout.createSequentialGroup()
                                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(spriteNintendo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(NintendoLayout.createSequentialGroup()
                                        .addGap(390, 390, 390)
                                        .addComponent(cantEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(NintendoLayout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(NintendoLayout.createSequentialGroup()
                                            .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                                .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                                .addComponent(salaryPM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(NintendoLayout.createSequentialGroup()
                                                    .addComponent(countFallas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(countFallas1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jobDoingPM, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                                .addComponent(jobDoingDirector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(NintendoLayout.createSequentialGroup()
                                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(integerNintendo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dlcNintendo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(NintendoLayout.createSequentialGroup()
                                                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(logicNintendo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NintendoLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel53)
                                        .addGroup(NintendoLayout.createSequentialGroup()
                                            .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(gameWithDlc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(standarsGames, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel60)
                            .addGroup(NintendoLayout.createSequentialGroup()
                                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spriteDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nivelesDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(NintendoLayout.createSequentialGroup()
                                .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(NintendoLayout.createSequentialGroup()
                                        .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel46))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel24)
                                            .addComponent(narrativaDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(NintendoLayout.createSequentialGroup()
                                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(logicaDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nivelesLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(narrativaLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spriteLimites, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(NintendoLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel62))
                                    .addComponent(logicaLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dclLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(NintendoLayout.createSequentialGroup()
                                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dlcDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NintendoLayout.createSequentialGroup()
                                .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(NintendoLayout.createSequentialGroup()
                                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(gananciaLote, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(NintendoLayout.createSequentialGroup()
                                            .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(salarioMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                                .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nextCut, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalDay, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(utility, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8))))
                    .addGroup(NintendoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel47)))
                .addGap(118, 118, 118))
        );
        NintendoLayout.setVerticalGroup(
            NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NintendoLayout.createSequentialGroup()
                .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NintendoLayout.createSequentialGroup()
                        .addComponent(Header2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NintendoLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel52)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jobDoingDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NintendoLayout.createSequentialGroup()
                                        .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel63)
                                            .addComponent(jobDoingPM, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(salaryPM, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(countFallas1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(countFallas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(countEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(narrativeNintendo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(levelNintendo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spriteNintendo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dlcNintendo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(logicNintendo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(integerNintendo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel53)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(NintendoLayout.createSequentialGroup()
                                        .addComponent(standarsGames, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(gameWithDlc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(NintendoLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel49)
                                    .addComponent(totalDay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel50)
                                    .addComponent(nextCut, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(NintendoLayout.createSequentialGroup()
                                        .addComponent(jLabel48)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(NintendoLayout.createSequentialGroup()
                                        .addComponent(utility, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(NintendoLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(NintendoLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(gananciaLote, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salarioMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel71, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NintendoLayout.createSequentialGroup()
                                .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel46)
                                        .addComponent(jLabel62)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(nivelesLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(NintendoLayout.createSequentialGroup()
                                                .addComponent(narrativaDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(nivelesDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(NintendoLayout.createSequentialGroup()
                                                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(narrativaLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spriteDisponible, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(spriteLimites, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logicaLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logicaDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dclLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dlcDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(NintendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel47))
                .addGap(276, 276, 276)
                .addComponent(cantEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
        );

        Tabbed.addTab("Nintendo", Nintendo);

        SquareEnix.setBackground(new java.awt.Color(34, 34, 114));

        Header6.setBackground(new java.awt.Color(66, 90, 197));

        jLabel98.setFont(new java.awt.Font("Phosphate", 0, 48)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setText("VideoJuego");

        jLabel99.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 24)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setText("Company");

        jLabel100.setBackground(new java.awt.Color(255, 255, 255));
        jLabel100.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(255, 0, 0));
        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Square_Enix_logo.svg.png"))); // NOI18N
        jLabel100.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout Header6Layout = new javax.swing.GroupLayout(Header6);
        Header6.setLayout(Header6Layout);
        Header6Layout.setHorizontalGroup(
            Header6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Header6Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Header6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel99)
                    .addComponent(jLabel98))
                .addGap(30, 30, 30))
        );
        Header6Layout.setVerticalGroup(
            Header6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Header6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Header6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Header6Layout.createSequentialGroup()
                        .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel99)
                        .addContainerGap())))
        );

        jLabel101.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(255, 255, 255));
        jLabel101.setText("Empleados");

        jLabel102.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(255, 255, 255));
        jLabel102.setText("Director:");

        salaryPM2.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        salaryPM2.setForeground(new java.awt.Color(255, 255, 255));

        cantEmpleados2.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        cantEmpleados2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel103.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 36)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel103.setText("Gestionar Empleados");

        jobDoingPM2.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jobDoingPM2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel104.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(255, 255, 255));
        jLabel104.setText("Estadisticas");

        jLabel105.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(255, 255, 255));
        jLabel105.setText("Narrativa");

        jLabel106.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(255, 255, 255));
        jLabel106.setText("Niveles");

        jLabel107.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(255, 255, 255));
        jLabel107.setText("Sprites");

        jLabel108.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(255, 255, 255));
        jLabel108.setText("Lógica");

        jLabel109.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(255, 255, 255));
        jLabel109.setText("DLC");

        jLabel110.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 255, 255));
        jLabel110.setText("Integrador");

        jLabel111.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(255, 255, 255));
        jLabel111.setText("Narrativa");

        jLabel112.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(255, 255, 255));
        jLabel112.setText("Niveles");

        jLabel113.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(255, 255, 255));
        jLabel113.setText("Sprites");

        jLabel114.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(255, 255, 255));
        jLabel114.setText("Lógica");

        jLabel115.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(255, 255, 255));
        jLabel115.setText("DLC");

        jLabel116.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 36)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(255, 255, 255));
        jLabel116.setText("Juegos Creados");

        jLabel117.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(255, 255, 255));
        jLabel117.setText("Juegos Standars:");

        jLabel118.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(255, 255, 255));
        jLabel118.setText("Juegos con DLC:");

        dlcDisponible2.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        dlcDisponible2.setForeground(new java.awt.Color(255, 255, 255));
        dlcDisponible2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        gameWithDlc2.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        gameWithDlc2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel119.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 36)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(255, 255, 255));
        jLabel119.setText("Recursos");

        jLabel120.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 18)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(255, 255, 255));
        jLabel120.setText("Disponible");

        standarsGames2.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        standarsGames2.setForeground(new java.awt.Color(255, 255, 255));

        logicaDisponible2.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        logicaDisponible2.setForeground(new java.awt.Color(255, 255, 255));
        logicaDisponible2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        spriteDisponible2.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        spriteDisponible2.setForeground(new java.awt.Color(255, 255, 255));
        spriteDisponible2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        logicaLimite2.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        logicaLimite2.setForeground(new java.awt.Color(255, 255, 255));
        logicaLimite2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nivelesDisponible2.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        nivelesDisponible2.setForeground(new java.awt.Color(255, 255, 255));
        nivelesDisponible2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel121.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 18)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(255, 255, 255));
        jLabel121.setText("Partes");

        jLabel122.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 18)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(255, 255, 255));
        jLabel122.setText("Limite");

        spriteLimites2.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        spriteLimites2.setForeground(new java.awt.Color(255, 255, 255));
        spriteLimites2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        dclLimite2.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        dclLimite2.setForeground(new java.awt.Color(255, 255, 255));
        dclLimite2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        narrativaLimite2.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        narrativaLimite2.setForeground(new java.awt.Color(255, 255, 255));
        narrativaLimite2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nivelesLimite2.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        nivelesLimite2.setForeground(new java.awt.Color(255, 255, 255));
        nivelesLimite2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel123.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(255, 255, 255));
        jLabel123.setText("PM:");

        countEmpleados1.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        countEmpleados1.setForeground(new java.awt.Color(255, 255, 255));

        countFallas5.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        countFallas5.setForeground(new java.awt.Color(255, 255, 255));
        countFallas5.setText("Faltas");

        jLabel125.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(255, 255, 255));
        jLabel125.setText("Ganancia bruta");

        narrativaDisponible2.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        narrativaDisponible2.setForeground(new java.awt.Color(255, 255, 255));
        narrativaDisponible2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        gananciaLote2.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        gananciaLote2.setForeground(new java.awt.Color(255, 255, 255));
        gananciaLote2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel127.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(255, 255, 255));
        jLabel127.setText("Costos Operativos");

        salarioMonth2.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        salarioMonth2.setForeground(new java.awt.Color(255, 255, 255));
        salarioMonth2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/topgames.jpg"))); // NOI18N

        jobDoingDirector2.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jobDoingDirector2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/topgames.jpg"))); // NOI18N

        jLabel51.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Días Totales");

        jLabel72.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("Proximo Corte");

        jLabel73.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("Utilidad");

        totalDay1.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        totalDay1.setForeground(new java.awt.Color(255, 255, 255));
        totalDay1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nextCut1.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        nextCut1.setForeground(new java.awt.Color(255, 255, 255));
        nextCut1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        utility1.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        utility1.setForeground(new java.awt.Color(255, 255, 255));
        utility1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        countFallas2.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        countFallas2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout SquareEnixLayout = new javax.swing.GroupLayout(SquareEnix);
        SquareEnix.setLayout(SquareEnixLayout);
        SquareEnixLayout.setHorizontalGroup(
            SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SquareEnixLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel103)
                    .addGroup(SquareEnixLayout.createSequentialGroup()
                        .addComponent(jLabel101)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(countEmpleados1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SquareEnixLayout.createSequentialGroup()
                        .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(narrativeEnix2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SquareEnixLayout.createSequentialGroup()
                        .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(levelEnix2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SquareEnixLayout.createSequentialGroup()
                        .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(spriteEnix2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SquareEnixLayout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(cantEmpleados2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SquareEnixLayout.createSequentialGroup()
                        .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel119)
                            .addGroup(SquareEnixLayout.createSequentialGroup()
                                .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spriteDisponible2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nivelesDisponible2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(SquareEnixLayout.createSequentialGroup()
                                .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(SquareEnixLayout.createSequentialGroup()
                                        .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel121))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel120)
                                            .addComponent(narrativaDisponible2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(SquareEnixLayout.createSequentialGroup()
                                        .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(logicaDisponible2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(narrativaLimite2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(SquareEnixLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel122))
                                    .addComponent(nivelesLimite2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spriteLimites2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(logicaLimite2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dclLimite2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(SquareEnixLayout.createSequentialGroup()
                                .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dlcDisponible2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(SquareEnixLayout.createSequentialGroup()
                        .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(SquareEnixLayout.createSequentialGroup()
                                    .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(gananciaLote2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(SquareEnixLayout.createSequentialGroup()
                                    .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(salarioMonth2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel72, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel73, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nextCut1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalDay1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(utility1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97))))
            .addGroup(SquareEnixLayout.createSequentialGroup()
                .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SquareEnixLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SquareEnixLayout.createSequentialGroup()
                                .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(integerEnix2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(dlcEnix2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(SquareEnixLayout.createSequentialGroup()
                                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(logicEnix2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel116)
                            .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SquareEnixLayout.createSequentialGroup()
                                .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(salaryPM2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel123, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SquareEnixLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jobDoingPM2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(SquareEnixLayout.createSequentialGroup()
                                        .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(SquareEnixLayout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(countFallas2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(countFallas5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(SquareEnixLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jobDoingDirector2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SquareEnixLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SquareEnixLayout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(gameWithDlc2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(standarsGames2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel129))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel128)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        SquareEnixLayout.setVerticalGroup(
            SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SquareEnixLayout.createSequentialGroup()
                .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SquareEnixLayout.createSequentialGroup()
                        .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SquareEnixLayout.createSequentialGroup()
                                .addComponent(Header6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel103)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jobDoingDirector2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel123)
                                    .addComponent(jobDoingPM2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(salaryPM2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(countFallas5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(countFallas2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(countEmpleados1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(narrativeEnix2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(levelEnix2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spriteEnix2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(SquareEnixLayout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel51)
                                    .addComponent(totalDay1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel72)
                                    .addComponent(nextCut1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel73)
                                    .addComponent(utility1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dlcEnix2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logicEnix2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(integerEnix2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(SquareEnixLayout.createSequentialGroup()
                                .addComponent(standarsGames2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gameWithDlc2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SquareEnixLayout.createSequentialGroup()
                                .addComponent(jLabel116)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(SquareEnixLayout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(SquareEnixLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel104)
                        .addGap(18, 18, 18)
                        .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SquareEnixLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(gananciaLote2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salarioMonth2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel127, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel119)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(SquareEnixLayout.createSequentialGroup()
                                .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel120, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel121)
                                        .addComponent(jLabel122)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(nivelesLimite2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(SquareEnixLayout.createSequentialGroup()
                                                .addComponent(narrativaDisponible2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(nivelesDisponible2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(SquareEnixLayout.createSequentialGroup()
                                                .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(narrativaLimite2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel113, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spriteDisponible2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(spriteLimites2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logicaLimite2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logicaDisponible2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dclLimite2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dlcDisponible2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(SquareEnixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel128)
                    .addComponent(jLabel129))
                .addGap(178, 178, 178)
                .addComponent(cantEmpleados2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 134, Short.MAX_VALUE))
        );

        Tabbed.addTab("Square Enix", SquareEnix);

        CapCom.setBackground(new java.awt.Color(34, 34, 114));

        Header7.setBackground(new java.awt.Color(66, 90, 197));

        jLabel130.setFont(new java.awt.Font("Phosphate", 0, 48)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(255, 255, 255));
        jLabel130.setText("VideoJuego");

        jLabel131.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 24)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(255, 255, 255));
        jLabel131.setText("Company");

        jLabel132.setBackground(new java.awt.Color(255, 255, 255));
        jLabel132.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(255, 0, 0));
        jLabel132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-raster-capcom.png"))); // NOI18N
        jLabel132.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout Header7Layout = new javax.swing.GroupLayout(Header7);
        Header7.setLayout(Header7Layout);
        Header7Layout.setHorizontalGroup(
            Header7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Header7Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel132)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Header7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel131)
                    .addComponent(jLabel130))
                .addGap(30, 30, 30))
        );
        Header7Layout.setVerticalGroup(
            Header7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Header7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Header7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Header7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel131))
                    .addComponent(jLabel132, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel133.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(255, 255, 255));
        jLabel133.setText("Empleados");

        jLabel134.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel134.setForeground(new java.awt.Color(255, 255, 255));
        jLabel134.setText("Director:");

        salaryPM3.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        salaryPM3.setForeground(new java.awt.Color(255, 255, 255));

        cantEmpleados3.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        cantEmpleados3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel135.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 36)); // NOI18N
        jLabel135.setForeground(new java.awt.Color(255, 255, 255));
        jLabel135.setText("Gestionar Empleados");

        jobDoingPM3.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jobDoingPM3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel136.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        jLabel136.setForeground(new java.awt.Color(255, 255, 255));
        jLabel136.setText("Estadisticas");

        jLabel137.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel137.setForeground(new java.awt.Color(255, 255, 255));
        jLabel137.setText("Narrativa");

        jLabel138.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel138.setForeground(new java.awt.Color(255, 255, 255));
        jLabel138.setText("Niveles");

        jLabel139.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel139.setForeground(new java.awt.Color(255, 255, 255));
        jLabel139.setText("Sprites");

        jLabel140.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel140.setForeground(new java.awt.Color(255, 255, 255));
        jLabel140.setText("Lógica");

        jLabel141.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel141.setForeground(new java.awt.Color(255, 255, 255));
        jLabel141.setText("DLC");

        jLabel142.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel142.setForeground(new java.awt.Color(255, 255, 255));
        jLabel142.setText("Integrador");

        jLabel143.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel143.setForeground(new java.awt.Color(255, 255, 255));
        jLabel143.setText("Narrativa");

        jLabel144.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel144.setForeground(new java.awt.Color(255, 255, 255));
        jLabel144.setText("Niveles");

        jLabel145.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel145.setForeground(new java.awt.Color(255, 255, 255));
        jLabel145.setText("Sprites");

        jLabel146.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel146.setForeground(new java.awt.Color(255, 255, 255));
        jLabel146.setText("Lógica");

        jLabel147.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel147.setForeground(new java.awt.Color(255, 255, 255));
        jLabel147.setText("DLC");

        jLabel148.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 36)); // NOI18N
        jLabel148.setForeground(new java.awt.Color(255, 255, 255));
        jLabel148.setText("Juegos Creados");

        jLabel149.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel149.setForeground(new java.awt.Color(255, 255, 255));
        jLabel149.setText("Juegos Standars:");

        jLabel150.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel150.setForeground(new java.awt.Color(255, 255, 255));
        jLabel150.setText("Juegos con DLC:");

        dlcDisponibles3.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        dlcDisponibles3.setForeground(new java.awt.Color(255, 255, 255));
        dlcDisponibles3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        gameWithDlc3.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        gameWithDlc3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel151.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 36)); // NOI18N
        jLabel151.setForeground(new java.awt.Color(255, 255, 255));
        jLabel151.setText("Recursos");

        jLabel152.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 18)); // NOI18N
        jLabel152.setForeground(new java.awt.Color(255, 255, 255));
        jLabel152.setText("Disponible");

        standarsGames3.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        standarsGames3.setForeground(new java.awt.Color(255, 255, 255));

        logicaDisponibles3.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        logicaDisponibles3.setForeground(new java.awt.Color(255, 255, 255));
        logicaDisponibles3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        spriteDisponibles3.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        spriteDisponibles3.setForeground(new java.awt.Color(255, 255, 255));
        spriteDisponibles3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        logicaLimite3.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        logicaLimite3.setForeground(new java.awt.Color(255, 255, 255));
        logicaLimite3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nivelesDisponibles3.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        nivelesDisponibles3.setForeground(new java.awt.Color(255, 255, 255));
        nivelesDisponibles3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel153.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 18)); // NOI18N
        jLabel153.setForeground(new java.awt.Color(255, 255, 255));
        jLabel153.setText("Partes");

        jLabel154.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 18)); // NOI18N
        jLabel154.setForeground(new java.awt.Color(255, 255, 255));
        jLabel154.setText("Limite");

        spriteLimites3.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        spriteLimites3.setForeground(new java.awt.Color(255, 255, 255));
        spriteLimites3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        dclLimite3.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        dclLimite3.setForeground(new java.awt.Color(255, 255, 255));
        dclLimite3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        narrativaLimite3.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        narrativaLimite3.setForeground(new java.awt.Color(255, 255, 255));
        narrativaLimite3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nivelesLimite3.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        nivelesLimite3.setForeground(new java.awt.Color(255, 255, 255));
        nivelesLimite3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel155.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel155.setForeground(new java.awt.Color(255, 255, 255));
        jLabel155.setText("PM:");

        countEmpleados3.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        countEmpleados3.setForeground(new java.awt.Color(255, 255, 255));

        countFallas7.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        countFallas7.setForeground(new java.awt.Color(255, 255, 255));
        countFallas7.setText("Faltas");

        jLabel157.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel157.setForeground(new java.awt.Color(255, 255, 255));
        jLabel157.setText("Ganancia bruta");

        narrativaDisponible3.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        narrativaDisponible3.setForeground(new java.awt.Color(255, 255, 255));
        narrativaDisponible3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        gananciaLote3.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        gananciaLote3.setForeground(new java.awt.Color(255, 255, 255));
        gananciaLote3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel159.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jLabel159.setForeground(new java.awt.Color(255, 255, 255));
        jLabel159.setText("Costos Operativos");

        salarioMonth3.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        salarioMonth3.setForeground(new java.awt.Color(255, 255, 255));
        salarioMonth3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel160.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/89287_capcom-reveals-new-game-sales-figures-for-resident-evil-monster-hunter-and-more.png.jpeg"))); // NOI18N

        jobDoingDirector3.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        jobDoingDirector3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel161.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/89287_capcom-reveals-new-game-sales-figures-for-resident-evil-monster-hunter-and-more.png.jpeg"))); // NOI18N

        jLabel74.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("Días Totales");

        jLabel75.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("Proximo Corte");

        jLabel76.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 24)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("Utilidad");

        totalDay2.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        totalDay2.setForeground(new java.awt.Color(255, 255, 255));
        totalDay2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nextCut2.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        nextCut2.setForeground(new java.awt.Color(255, 255, 255));
        nextCut2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        utility2.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        utility2.setForeground(new java.awt.Color(255, 255, 255));
        utility2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        countFallas3.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 14)); // NOI18N
        countFallas3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout CapComLayout = new javax.swing.GroupLayout(CapCom);
        CapCom.setLayout(CapComLayout);
        CapComLayout.setHorizontalGroup(
            CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(CapComLayout.createSequentialGroup()
                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CapComLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel135)
                            .addGroup(CapComLayout.createSequentialGroup()
                                .addComponent(jLabel133)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(countEmpleados3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CapComLayout.createSequentialGroup()
                                .addComponent(jLabel137, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(narrativeCapcom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CapComLayout.createSequentialGroup()
                                .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(levelCapcom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CapComLayout.createSequentialGroup()
                                .addComponent(jLabel139, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(spriteCapcom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CapComLayout.createSequentialGroup()
                                .addGap(390, 390, 390)
                                .addComponent(cantEmpleados3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel151)
                            .addGroup(CapComLayout.createSequentialGroup()
                                .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spriteDisponibles3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nivelesDisponibles3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(CapComLayout.createSequentialGroup()
                                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CapComLayout.createSequentialGroup()
                                        .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel143, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel153))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel152)
                                            .addComponent(narrativaDisponible3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CapComLayout.createSequentialGroup()
                                        .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(logicaDisponibles3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nivelesLimite3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(narrativaLimite3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spriteLimites3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CapComLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel154))
                                    .addComponent(logicaLimite3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dclLimite3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(CapComLayout.createSequentialGroup()
                                .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dlcDisponibles3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CapComLayout.createSequentialGroup()
                                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(CapComLayout.createSequentialGroup()
                                            .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(gananciaLote3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(CapComLayout.createSequentialGroup()
                                            .addComponent(jLabel159, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(salarioMonth3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(112, 112, 112)
                                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel75, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel74, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nextCut2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalDay2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(utility2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(CapComLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CapComLayout.createSequentialGroup()
                                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel134, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(jLabel155, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(salaryPM3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CapComLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(CapComLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(countFallas3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(countFallas7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jobDoingDirector3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CapComLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jobDoingPM3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(CapComLayout.createSequentialGroup()
                                .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(integerCapcom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(dlcCapcom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(CapComLayout.createSequentialGroup()
                                    .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(logicCapcom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(CapComLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CapComLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel148)
                                    .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(gameWithDlc3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(standarsGames3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(CapComLayout.createSequentialGroup()
                                .addComponent(jLabel161)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel160)))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        CapComLayout.setVerticalGroup(
            CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CapComLayout.createSequentialGroup()
                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CapComLayout.createSequentialGroup()
                        .addComponent(Header7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(CapComLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel135)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jobDoingDirector3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel155)
                                    .addComponent(jobDoingPM3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(countFallas7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(countFallas3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(salaryPM3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel133, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(countEmpleados3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel137, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(narrativeCapcom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(levelCapcom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel139, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spriteCapcom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dlcCapcom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(logicCapcom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(integerCapcom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(CapComLayout.createSequentialGroup()
                                        .addComponent(standarsGames3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(gameWithDlc3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(CapComLayout.createSequentialGroup()
                                        .addComponent(jLabel148)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(CapComLayout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CapComLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel74)
                                    .addComponent(totalDay2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel75)
                                    .addComponent(nextCut2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel76)
                                    .addComponent(utility2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(386, 386, 386))))
                    .addGroup(CapComLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel136)
                        .addGap(18, 18, 18)
                        .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CapComLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(gananciaLote3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salarioMonth3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel159, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel151)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(CapComLayout.createSequentialGroup()
                                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel152, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel153)
                                        .addComponent(jLabel154)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(nivelesLimite3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(CapComLayout.createSequentialGroup()
                                            .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(narrativaDisponible3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel143, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                                            .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(CapComLayout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CapComLayout.createSequentialGroup()
                                                    .addGap(7, 7, 7)
                                                    .addComponent(nivelesDisponibles3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(narrativaLimite3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel145, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spriteDisponibles3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(spriteLimites3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logicaLimite3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logicaDisponibles3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dclLimite3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dlcDisponibles3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(CapComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CapComLayout.createSequentialGroup()
                        .addComponent(jLabel161)
                        .addGap(0, 149, Short.MAX_VALUE))
                    .addGroup(CapComLayout.createSequentialGroup()
                        .addComponent(jLabel160)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)))
                .addComponent(cantEmpleados3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 188, Short.MAX_VALUE))
        );

        Tabbed.addTab("CapCom", CapCom);

        getContentPane().add(Tabbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 1370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void n6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n6ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

    }//GEN-LAST:event_updateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPagee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPagee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPagee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPagee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPagee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel CapCom;
    private javax.swing.JPanel DashBoard;
    private javax.swing.JPanel Header1;
    private javax.swing.JPanel Header2;
    private javax.swing.JPanel Header6;
    private javax.swing.JPanel Header7;
    private javax.swing.JPanel Nintendo;
    private javax.swing.JPanel SquareEnix;
    private javax.swing.JTabbedPane Tabbed;
    private javax.swing.JLabel cantEmpleados;
    private javax.swing.JLabel cantEmpleados2;
    private javax.swing.JLabel cantEmpleados3;
    private javax.swing.JLabel countEmpleados;
    private javax.swing.JLabel countEmpleados1;
    private javax.swing.JLabel countEmpleados3;
    public javax.swing.JLabel countFallas;
    private javax.swing.JLabel countFallas1;
    public javax.swing.JLabel countFallas2;
    public javax.swing.JLabel countFallas3;
    private javax.swing.JLabel countFallas5;
    private javax.swing.JLabel countFallas7;
    private javax.swing.JLabel dclLimite;
    private javax.swing.JLabel dclLimite2;
    private javax.swing.JLabel dclLimite3;
    private javax.swing.JSpinner dlcCapcom;
    private javax.swing.JSpinner dlcCapcom1;
    public javax.swing.JLabel dlcDisponible;
    public javax.swing.JLabel dlcDisponible2;
    public javax.swing.JLabel dlcDisponibles3;
    private javax.swing.JSpinner dlcEnix;
    private javax.swing.JSpinner dlcEnix2;
    private javax.swing.JSpinner dlcNintendo;
    private javax.swing.JSpinner dlcNintendo1;
    public javax.swing.JLabel gameWithDlc;
    public javax.swing.JLabel gameWithDlc2;
    public javax.swing.JLabel gameWithDlc3;
    public javax.swing.JLabel gananciaLote;
    public javax.swing.JLabel gananciaLote2;
    public javax.swing.JLabel gananciaLote3;
    private javax.swing.JSpinner integerCapcom;
    private javax.swing.JSpinner integerCapcom1;
    private javax.swing.JSpinner integerEnix;
    private javax.swing.JSpinner integerEnix2;
    private javax.swing.JSpinner integerNintendo;
    private javax.swing.JSpinner integerNintendo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    public javax.swing.JLabel jobDoingDirector;
    public javax.swing.JLabel jobDoingDirector2;
    public javax.swing.JLabel jobDoingDirector3;
    public javax.swing.JLabel jobDoingPM;
    public javax.swing.JLabel jobDoingPM2;
    public javax.swing.JLabel jobDoingPM3;
    private javax.swing.JSpinner levelCapcom;
    private javax.swing.JSpinner levelCapcom1;
    private javax.swing.JSpinner levelEnix;
    private javax.swing.JSpinner levelEnix2;
    private javax.swing.JSpinner levelNintendo;
    private javax.swing.JSpinner levelNintendo1;
    private javax.swing.JSpinner logicCapcom;
    private javax.swing.JSpinner logicCapcom1;
    private javax.swing.JSpinner logicEnix;
    private javax.swing.JSpinner logicEnix2;
    private javax.swing.JSpinner logicNintendo;
    private javax.swing.JSpinner logicNintendo1;
    public javax.swing.JLabel logicaDisponible;
    public javax.swing.JLabel logicaDisponible2;
    public javax.swing.JLabel logicaDisponibles3;
    private javax.swing.JLabel logicaLimite;
    private javax.swing.JLabel logicaLimite2;
    private javax.swing.JLabel logicaLimite3;
    private javax.swing.JTextField n6;
    public javax.swing.JLabel narrativaDisponible;
    public javax.swing.JLabel narrativaDisponible2;
    public javax.swing.JLabel narrativaDisponible3;
    private javax.swing.JLabel narrativaLimite;
    private javax.swing.JLabel narrativaLimite2;
    private javax.swing.JLabel narrativaLimite3;
    private javax.swing.JSpinner narrativeCapcom1;
    private javax.swing.JSpinner narrativeCapcom2;
    private javax.swing.JSpinner narrativeEnix;
    private javax.swing.JSpinner narrativeEnix2;
    private javax.swing.JSpinner narrativeNintendo;
    private javax.swing.JSpinner narrativeNintendo1;
    public javax.swing.JLabel nextCut;
    public javax.swing.JLabel nextCut1;
    public javax.swing.JLabel nextCut2;
    public javax.swing.JLabel nivelesDisponible;
    public javax.swing.JLabel nivelesDisponible2;
    public javax.swing.JLabel nivelesDisponibles3;
    private javax.swing.JLabel nivelesLimite;
    private javax.swing.JLabel nivelesLimite2;
    private javax.swing.JLabel nivelesLimite3;
    public javax.swing.JLabel salarioMonth;
    public javax.swing.JLabel salarioMonth2;
    public javax.swing.JLabel salarioMonth3;
    public javax.swing.JLabel salaryPM;
    public javax.swing.JLabel salaryPM2;
    public javax.swing.JLabel salaryPM3;
    private javax.swing.JSpinner spriteCapcom;
    private javax.swing.JSpinner spriteCapcom1;
    public javax.swing.JLabel spriteDisponible;
    public javax.swing.JLabel spriteDisponible2;
    public javax.swing.JLabel spriteDisponibles3;
    private javax.swing.JSpinner spriteEnix;
    private javax.swing.JSpinner spriteEnix2;
    private javax.swing.JLabel spriteLimites;
    private javax.swing.JLabel spriteLimites2;
    private javax.swing.JLabel spriteLimites3;
    private javax.swing.JSpinner spriteNintendo;
    private javax.swing.JSpinner spriteNintendo1;
    public javax.swing.JLabel standarsGames;
    public javax.swing.JLabel standarsGames2;
    public javax.swing.JLabel standarsGames3;
    public javax.swing.JLabel totalDay;
    public javax.swing.JLabel totalDay1;
    public javax.swing.JLabel totalDay2;
    private javax.swing.JButton update;
    public javax.swing.JLabel utility;
    public javax.swing.JLabel utility1;
    public javax.swing.JLabel utility2;
    // End of variables declaration//GEN-END:variables
}
