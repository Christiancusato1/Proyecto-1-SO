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
     public int levels;
    public int narrative;

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
}
