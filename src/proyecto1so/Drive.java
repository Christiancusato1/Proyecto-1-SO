/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1so;

/**
 *
 * @author Usuario
 */
public class Drive {
    private int levels;
    private int narrative;
    private int sprites;
    private int systems;
    private int dlc;

    public Drive(int levels, int narrative) {
        this.levels = 0;
        this.narrative = 0;
        this.sprites = 0;
        this.systems = 0;
        this.dlc = 0;
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
     * @return the sistems
     */
    public int getSistems() {
        return systems;
    }

    /**
     * @param sistems the sistems to set
     */
    public void setSistems(int sistems) {
        this.systems = sistems;
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
    
    public void addProduct(int productQty, String type){
    if( null != type)switch (type) {
            case "screenwriter":
                this.setNarrative(getNarrative()+productQty);
                break;
            case "levels":
                this.setLevels(getLevels()+productQty);
                break;
            case "sprites":
                this.setSprites(getSprites() + productQty);
                break;
            case "dlc":
                this.setDlc(getDlc()+productQty);
                break;
            case "systems":
                this.setSistems(getSistems()+productQty);
                break;
            default:
                break;
        }
}
}
