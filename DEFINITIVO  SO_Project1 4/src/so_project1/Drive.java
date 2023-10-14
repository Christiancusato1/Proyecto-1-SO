/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so_project1;

import Estructura.List;
import java.util.concurrent.Semaphore;

/**
 *
 * @author giovannacianfaglione
 */
public class Drive {
    private Semaphore mutexDrive = new Semaphore(1);
    private List levels = new List();
    private List narrative = new List();
    private List sprites = new List();
    private List systems = new List();
    private List dlc = new List();
    private int maxLevels;  
    private int maxNarrative;  
    private int maxSprites;  
    private int maxSystems;  
    private int maxDlc; 

    
    public Drive(int maxLevels, int maxNarrative, int maxSprites, int maxSystems, int maxDlc) {
        this.maxLevels = maxLevels;
        this.maxNarrative = maxNarrative;
        this.maxSprites = maxSprites;
        this.maxSystems = maxSystems;
        this.maxDlc = maxDlc;
    }
    

    /**
     * @return the levels
     */
    public List getLevels() {
        return levels;
    }

    /**
     * @param levels the levels to set
     */
    public void setLevels(List levels) {
        this.levels = levels;
    }

    /**
     * @return the narrative
     */
    public List getNarrative() {
        return narrative;
    }

    /**
     * @param narrative the narrative to set
     */
    public void setNarrative(List narrative) {
        this.narrative = narrative;
    }

    /**
     * @return the sprites
     */
    public List getSprites() {
        return sprites;
    }

    /**
     * @param sprites the sprites to set
     */
    public void setSprites(List sprites) {
        this.sprites = sprites;
    }

    /**
     * @return the systems
     */
    public List getSystems() {
        return systems;
    }

    /**
     * @param systems the systems to set
     */
    public void setSystems(List systems) {
        this.systems = systems;
    }

    /**
     * @return the dlc
     */
    public List getDlc() {
        return dlc;
    }

    /**
     * @param dlc the dlc to set
     */
    public void setDlc(List dlc) {
        this.dlc = dlc;
    }
    
//    public void addGeneric(List lista, int quantity, int max){
//        int contador = 0;
////        while(lista.getSize() <= max && contador <= quantity){
//        while(lista.getSize() <= max ){
//            lista.appendLast(1);
//            contador ++;
//        }
//        
//        
//    }
    
//    public void addGeneric(List lista,int quantity, int max ){
//        if (lista.getSize() + quantity <= max) {
//            for (int i = 1; i <= quantity; i++) {
//                lista.appendLast(1); 
//                lista.print();
//                System.out.println("Entre a la lista1");
//            }
//        }else if(lista.getSize() + quantity > max && lista.getSize() < max){
//            while(lista.getSize() < max ){
//                lista.appendLast(1); 
//                lista.print(); 
//                System.out.println("Entre a la lista 2 ");
//            }
//        }
//        System.out.println("ENtre al add generic");
//        
//    }
    public void addG(List lista,int quantity, int max){
        if(lista.getSize()== max){
//            System.out.println("No hay espacio");
            
        }else{
            for(int i=0; i< quantity; i++){
//                System.out.println("loop");
                if(lista.getSize()< max){
                    lista.appendStart(1);
//                    System.out.println("agregue a la lista");
                    
                }
            }
                
        }
        
    }
//    public void addProduct(int productQty, String type){        
//            for (int i = 1; i < productQty ; i++) {
//                if( null != type)switch (type) {
//                    case "narrative":
//                        System.out.println("entre en addproduct");
//                    this.addG(this.getNarrative(),productQty, this.getMaxNarrative());
//                    break;
//                    case "levels":
//                    this.addG(this.getLevels(),productQty, this.getMaxLevels());
//                    break;
//                    case "sprites":
//                    this.addG(this.getSprites(),productQty, this.getMaxSprites());
//                    break;
//                    case "dlc":
//                    this.addG(this.getDlc(),productQty, this.getMaxDlc());
//                    break;
//                    case "systems":
//                    this.addG(this.getSystems(),productQty, this.getMaxSystems());
//                    break;
//                    default:
//                    break;
//        }
//}
//        }
    
    
    public void addProduct(int productQty, String type){
        if(type.equals("narrative")){
//            System.out.println("entre en narrativa");
            this.addG(this.getNarrative(),productQty, this.getMaxNarrative());
            
        }else if(type.equals("levels")){
            this.addG(this.getLevels(),productQty, this.getMaxLevels());
//            System.out.println("entre en levels");
            
        }else if(type.equals("sprites")){
//            System.out.println("entre en sprites");
            this.addG(this.getSprites(),productQty, this.getMaxSprites());
            
        }else if(type.equals("dlc")){
//             System.out.println("entre en dlc");
            this.addG(this.getDlc(),productQty, this.getMaxDlc());
            
        }else if(type.equals("systems")){
//             System.out.println("entre en systems");
            this.addG(this.getSystems(),productQty, this.getMaxSystems());
            
        }
        
    }
// Main.nintendo.getDrive().addProduct(this.getCautity_producer(), this.getType());
    /**
     * @return the maxLevels
     */
    public int getMaxLevels() {
        return maxLevels;
    }

    /**
     * @param maxLevels the maxLevels to set
     */
    public void setMaxLevels(int maxLevels) {
        this.maxLevels = maxLevels;
    }

    /**
     * @return the maxNarrative
     */
    public int getMaxNarrative() {
        return maxNarrative;
    }

    /**
     * @param maxNarrative the maxNarrative to set
     */
    public void setMaxNarrative(int maxNarrative) {
        this.maxNarrative = maxNarrative;
    }

    /**
     * @return the maxSprites
     */
    public int getMaxSprites() {
        return maxSprites;
    }

    /**
     * @param maxSprites the maxSprites to set
     */
    public void setMaxSprites(int maxSprites) {
        this.maxSprites = maxSprites;
    }

    /**
     * @return the maxSystems
     */
    public int getMaxSystems() {
        return maxSystems;
    }

    /**
     * @param maxSystems the maxSystems to set
     */
    public void setMaxSystems(int maxSystems) {
        this.maxSystems = maxSystems;
    }

    /**
     * @return the maxDlc
     */
    public int getMaxDlc() {
        return maxDlc;
    }

    /**
     * @param maxDlc the maxDlc to set
     */
    public void setMaxDlc(int maxDlc) {
        this.maxDlc = maxDlc;
    }

    /**
     * @return the mutexDrive
     */
    public Semaphore getMutexDrive() {
        return mutexDrive;
    }

    /**
     * @param mutexDrive the mutexDrive to set
     */
    public void setMutexDrive(Semaphore mutexDrive) {
        this.mutexDrive = mutexDrive;
    }
}