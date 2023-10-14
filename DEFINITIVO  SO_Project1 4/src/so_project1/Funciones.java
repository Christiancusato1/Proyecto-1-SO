/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so_project1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

import java.lang.Integer;

/**
 *
 * @author catalina
 */
public class Funciones {
    private int dayDuration; // la cantidad de trabajadores por area; 
    private int narrativa; 
    private int niveles; 
    private int sprites; 
    private int logica; 
    private int dlc; 
    private int integrador; 
 

    
    public void leerTxt(String stringPath, int dayDuration, int narrativa, int sprites, int logica, int dlc, int integrador){
        String path = stringPath; 
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
                        System.out.println("");
                        System.out.println(lectura[1]);
                        String num= lectura[1];
                        int u= java.lang.Integer.parseInt(num);
//                        System.out.println(i);
//                        String string = lectura[1];
                        dayDuration = u;
                        
                    }else if("narrative".equals(lectura[0])){
                         System.out.println("");
                        System.out.println(lectura[1]);
                        int m=Integer.parseInt(lectura[1]);
                         
                        narrativa = m;
                    }else if("niveles".equals(lectura[0])){
                         System.out.println("");
                        System.out.println(lectura[1]);
                        narrativa = Integer.parseInt(lectura[1]); 
                    }else if("sprites".equals(lectura[0])){
                         System.out.println("");
                        System.out.println(lectura[1]);
                        sprites = Integer.parseInt(lectura[1]); 
                    }else if(lectura[0].equals("logica")){
                         System.out.println("");
                        System.out.println(lectura[1]);
                        logica = Integer.parseInt(lectura[1]); 
                    }else if(lectura[0].equals("dlc")){
                         System.out.println("");
                        System.out.println(lectura[1]);
                        dlc = Integer.parseInt(lectura[1]);
                    }else{
                         System.out.println("");
                        System.out.println(lectura[1]);
                        integrador = Integer.parseInt(lectura[1]); 
                    }
                
            }
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se logró leer el archivo txt");
        }
        
    
}
    public void leerTxtDrive(String path,int levels, int narrative, int sprites, int systems, int dlc){
        
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
                    if("levels".equals(lectura[0])){
                        System.out.println("");
                        System.out.println(lectura[1]);
                        String num= lectura[1];
                        int u= java.lang.Integer.parseInt(num);
//                        System.out.println(i);
//                        String string = lectura[1];
this.setDayDuration(u);
                        
                    }else if("narrative".equals(lectura[0])){
                         System.out.println("");
                        System.out.println(lectura[1]);
                        int m=Integer.parseInt(lectura[1]);
                         
                        this.setNarrativa(m);
                    }else if("niveles".equals(lectura[0])){
                         System.out.println("");
                        System.out.println(lectura[1]);
                        this.setNiveles(Integer.parseInt(lectura[1])); 
                    }else if("sprites".equals(lectura[0])){
                         System.out.println("");
                        System.out.println(lectura[1]);
                        this.setSprites(Integer.parseInt(lectura[1])); 
                    }else if(lectura[0].equals("logica")){
                         System.out.println("");
                        System.out.println(lectura[1]);
                        this.setLogica(Integer.parseInt(lectura[1])); 
                    }else if(lectura[0].equals("dlc")){
                         System.out.println("");
                        System.out.println(lectura[1]);
                        this.setDlc(Integer.parseInt(lectura[1]));
                    }
                
            }
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se logró leer el archivo txt");
        }
        
        
        
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
}
