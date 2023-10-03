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
    
    public void addproduct(int productcuantity, String type){
        if("levels".equals(type)){
            this.levels+= productcuantity;
        }
        else if("narrative".equals(type)){
            this.narrative+= productcuantity;
        }
        else if("sprites".equals(type)){
            this.sprites+= productcuantity;
        }
        else if("systems".equals(type)){
            this.systems+= productcuantity;
        }
        else{
            this.dlc+= productcuantity;
        }
        
    }
   
    public Drive(int levels, int narrative) {
        this.levels = levels;
        this.narrative = narrative;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public int getNarrative() {
        return narrative;
    }

    public void setNarrative(int narrative) {
        this.narrative = narrative;
    }
    
    public void addProduct(int productQty, int type){
    if(type == 0){
        setLevels(getLevels()+productQty);
    }
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
