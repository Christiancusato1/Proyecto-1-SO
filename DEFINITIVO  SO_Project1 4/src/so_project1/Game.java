/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so_project1;

/**
 *
 * @author giovannacianfaglione
 */
public class Game {
    
    private int levels;
    private int narrative;
    private int sprites; 
    private int systems; 
    private int dlc; 

    public Game(int levels, int narrative, int sprites, int systems) {// para el juego standar 
        this.levels = levels;
        this.narrative = narrative;
        this.sprites = sprites;
        this.systems = systems;
        this.dlc = 0; // porque no es necesario 
    }

    public Game(int levels, int narrative, int sprites, int systems, int dlc) {// el juego dlc 
        this.levels = levels;
        this.narrative = narrative;
        this.sprites = sprites;
        this.systems = systems;
        this.dlc = dlc;
    }
    
    
    
    public boolean isReady(){ // dice si el juego está listo o no 
        return this.levels == 0 && this.narrative == 0 && this.sprites == 0 && this.systems == 0 && this.dlc == 0;  
    }
    
    
    /**
     * @return the levels
     */
    public int getLevels() {
        return levels;
    }

    /**
     * @param levels the levels to set
     */
    public void setLevels(int levels) {
        this.levels = levels;
    }

    /**
     * @return the narrative
     */
    public int getNarrative() {
        return narrative;
    }

    /**
     * @param narrative the narrative to set
     */
    public void setNarrative(int narrative) {
        this.narrative = narrative;
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
     * @return the systems
     */
    public int getSystems() {
        return systems;
    }

    /**
     * @param systems the systems to set
     */
    public void setSystems(int systems) {
        this.systems = systems;
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
    
    
    
    
}


