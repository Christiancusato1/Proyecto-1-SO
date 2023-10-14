/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so_project1;

/**
 *
 * @author giovannacianfaglione
 */
import Estructura.List;
import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author giovannacianfaglione
 */
public class Integrador extends Thread {

    /**
     * @return the mutexDriveintegrador
     */
    public Semaphore getMutexDriveintegrador() {
        return mutexDriveintegrador;
    }

    /**
     * @param mutexDriveintegrador the mutexDriveintegrador to set
     */
    public void setMutexDriveintegrador(Semaphore mutexDriveintegrador) {
        this.mutexDriveintegrador = mutexDriveintegrador;
    }
    
    private Semaphore mutexDriveintegrador = new Semaphore(1);
    private Drive drive;
    private List standardGames = new List();
    private List dlcGames = new List();
    private int contador;
    private int maxParaDlc; // cantidad de juegos necesarios para el dlc
    private int dayDuration;
    // lo que necesitas para crear un juego
    private int levels;
    private int narrative;
    private int sprites;
    private int systems;
    private int dlc;
    private int counterstandargames;
    private double salary;
    private int pricePerHour;
//    private int counterdlcgames;
//    private int maxstandargames; // cantidad de video juegos que se neceitan poara crear un dlc

    // lista donde esta el juego que se esta creando 
    private List gameNotReady = new List();
    private String Doing;

    private Semaphore mutex;

    private int salaryAcumulado;

    private int cantidadIntegradores;

    public Integrador(int maxParaDlc, int dayDuration, int levels, int narrative, int sprites, int systems, int dlc, Drive drive, Semaphore mutex, int cantidadIntegradores) {
        this.maxParaDlc = maxParaDlc;
        this.dayDuration = dayDuration * 1000;
        this.levels = levels;
        this.narrative = narrative;
        this.sprites = sprites;
        this.systems = systems;
        this.dlc = dlc;
        this.counterstandargames = 0;
        this.salary = 0;
        this.pricePerHour = 25;
        this.drive = drive;
        this.mutex = mutex;
        this.cantidadIntegradores = cantidadIntegradores;
        this.salaryAcumulado = 0; 
    }

    public Game createGame() {
        Game game = new Game(this.getLevels(), this.getNarrative(), this.getSprites(), this.getSystems());

        return game;

    }

    public Game createDlc() {
        Game game = new Game(this.getLevels(), this.getNarrative(), this.getSprites(), this.getSystems(), this.getDlc());
        return game;

    }

    public boolean checkToCreatDlc() {
        if (this.getCounterstandargames() == this.getMaxParaDlc()) {
            return true;
        }
        return false;

    }

    public void checkDrive(Game game) {

        if (this.getDrive().getLevels().getSize() > 0) {
            if (this.getDrive().getLevels().getSize() >= game.getLevels()) {
                int num = game.getLevels();
                game.setLevels(0);
                for (int i = 1; i <= num; i++) {
                    this.getDrive().getLevels().deleteEnd();
                }

            }

            if (this.getDrive().getNarrative().getSize() > 0) {
                if (this.getDrive().getNarrative().getSize() >= game.getNarrative()) {
                    int num = game.getNarrative();
                    game.setNarrative(0);
                    for (int i = 1; i <= num; i++) {
                        this.getDrive().getNarrative().deleteEnd();
                    }

                }
            }

            if (this.getDrive().getSprites().getSize() > 0) {
                if (this.getDrive().getSprites().getSize() >= game.getSprites()) {
                    int num = game.getSprites();
                    game.setSprites(0);
                    for (int i = 1; i <= num; i++) {
                        this.getDrive().getSprites().deleteEnd();
                    }

                }
            }

            if (this.getDrive().getSystems().getSize() > 0) {
                if (this.getDrive().getSystems().getSize() >= game.getSystems()) {
                    int num = game.getSystems();
                    game.setSystems(0);
                    for (int i = 1; i <= num; i++) {
                        this.getDrive().getSystems().deleteEnd();
                    }

                }
            }

            if (this.getDrive().getDlc().getSize() > 0) {
                if (this.getDrive().getDlc().getSize() >= game.getDlc()) {
                    int num = game.getDlc();
                    game.setDlc(0);
                    for (int i = 1; i <= num; i++) {
                        this.getDrive().getDlc().deleteEnd();
                    }

                }
            }
        }

    }

//    @Override
//    public void run() {
//        while (true) {
//            
//            try {
//                
//                
//                if(!this.checkToCreatDlc()){
//                Game game;
//            if (    getGameNotReady().getSize() == 0) {
//                game = this.createGame();
//                this.getGameNotReady().appendLast(game);
//                game = (Game) this.getGameNotReady().getpFirst().getData();
//            } else {
//                game = (Game) this.getGameNotReady().getpFirst().getData();
//                
//            }
//            this.checkDrive(game);
//            
//            if(game.isReady()){
//                this.getStandardGames().appendLast(game);
//                this.setCounterstandargames(this.getCounterstandargames() + 1);
//                this.getGameNotReady().deleteEnd();
//                sleep(  this.getDayDuration());
//                this.setDoing("Integrando Juego standar"); 
//            }else{
//                this.setDoing("Revisando el Drive ");
//            }
//                
//            }else{
//                
//                Game gameDlc;
//                if (getGameNotReady().getSize() == 0) {
//                    gameDlc=this.createDlc();
//                    this.getGameNotReady().appendLast(gameDlc);
//                    gameDlc = (Game) this.getGameNotReady().getpFirst().getData();
//                } else {
//                    gameDlc = (Game) this.getGameNotReady().getpFirst().getData();
//                }
//                this.checkDrive(gameDlc);
//               
//                if(gameDlc.isReady()){
//                    this.getDlcGames().appendLast(gameDlc);
//                    this.setCounterstandargames(0);
//                    this.getGameNotReady().deleteEnd();
//                    sleep(this.getDayDuration());
//                    this.setDoing("Integrando un juego con Dlc");  
//                }else{
//                    this.setDoing("Revisando el Drive ");  
//                }
//                
//            }
//                
//                sleep(this.getDayDuration());
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Integrador.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            
//            
//            
//        }
//
//    }
    @Override
    public void run() {
        while (true) {

            try {
                for (int i = 0; i < this.cantidadIntegradores; i++) {
                    if (!this.checkToCreatDlc()) {
                        Game game;
                        if (getGameNotReady().getSize() == 0) {
                            System.out.println("se creo un nuevo juego");
                            
                            game = this.createGame();
                            this.getGameNotReady().appendLast(game);
                            game = (Game) this.getGameNotReady().getpFirst().getData();
                        } else {
                            game = (Game) this.getGameNotReady().getpFirst().getData();
                            System.out.println("se agarro el jiuego que estaba en la lista");

                        }
                        this.checkDrive(game);
                        

                        if (game.isReady()) {
                            getMutexDriveintegrador().acquire();
                            this.standardGames.appendStart(game);
                            
                            this.setCounterstandargames(this.getCounterstandargames() + 1);
                            this.getGameNotReady().deleteEnd();
                            getMutexDriveintegrador().release();
                            System.out.println("se saco el juego");
                            sleep(this.getDayDuration());
                            this.setDoing("Integrando Juego standar");
                        } else {
                            this.setDoing("Revisando el Drive ");
                        }

                    } else {

                        Game gameDlc;
                        if (getGameNotReady().getSize() == 0) {
                            gameDlc = this.createDlc();
                            this.getGameNotReady().appendLast(gameDlc);
                            gameDlc = (Game) this.getGameNotReady().getpFirst().getData();
                        } else {
                            gameDlc = (Game) this.getGameNotReady().getpFirst().getData();
                        }
                        this.checkDrive(gameDlc);

                        if (gameDlc.isReady()) {
                            this.getDlcGames().appendStart(gameDlc);
                            this.setCounterstandargames(0);
                            this.getGameNotReady().deleteEnd();
                            this.setDoing("Integrando un juego con Dlc");
                        } else {
                            this.setDoing("Revisando el Drive ");
                        }

                    }

                }
                this.salaryAcumulado += this.salary * 24*this.cantidadIntegradores; 
                
                Main.p.standarsGames.setText(Integer.toString(Main.nintendo.getMiIntegrador().getStandardGames().getSize()));
                Main.p.gameWithDlc.setText(Integer.toString(Main.nintendo.getMiIntegrador().getDlcGames().getSize()));
                
                Main.p.standarsGames2.setText(Integer.toString(Main.saquareenix.getMiIntegrador().getStandardGames().getSize()));
                Main.p.gameWithDlc2.setText(Integer.toString(Main.saquareenix.getMiIntegrador().getDlcGames().getSize()));
                
                Main.p.standarsGames3.setText(Integer.toString(Main.capcom.getMiIntegrador().getStandardGames().getSize()));
                Main.p.gameWithDlc3.setText(Integer.toString(Main.capcom.getMiIntegrador().getDlcGames().getSize()));
                
                sleep(this.getDayDuration());
            } catch (InterruptedException ex) {
                Logger.getLogger(Integrador.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    // intento de tener mas de 1 integrador 
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
     * @return the standardGames
     */
    public List getStandardGames() {
        return standardGames;
    }

    /**
     * @param standardGames the standardGames to set
     */
    public void setStandardGames(List standardGames) {
        this.standardGames = standardGames;
    }

    /**
     * @return the dlcGames
     */
    public List getDlcGames() {
        return dlcGames;
    }

    /**
     * @param dlcGames the dlcGames to set
     */
    public void setDlcGames(List dlcGames) {
        this.dlcGames = dlcGames;
    }

    /**
     * @return the contador
     */
    public int getContador() {
        return contador;
    }

    /**
     * @param contador the contador to set
     */
    public void setContador(int contador) {
        this.contador = contador;
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
     * @return the
     */
    public int getDlc() {
        return dlc;
    }

    /**
     * @param dlc the to set
     */
    public void setDlc(int dlc) {
        this.dlc = dlc;
    }

    /**
     * @return the counterstandargames
     */
    public int getCounterstandargames() {
        return counterstandargames;
    }

    /**
     * @param counterstandargames the counterstandargames to set
     */
    public void setCounterstandargames(int counterstandargames) {
        this.counterstandargames = counterstandargames;
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
     * @return the gameNotReady
     */
    public List getGameNotReady() {
        return gameNotReady;
    }

    /**
     * @param gameNotReady the gameNotReady to set
     */
    public void setGameNotReady(List gameNotReady) {
        this.gameNotReady = gameNotReady;
    }

    /**
     * @return the Doing
     */
    public String getDoing() {
        return Doing;
    }

    /**
     * @param Doing the Doing to set
     */
    public void setDoing(String Doing) {
        this.Doing = Doing;
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
     * @return the cantidadIntegradores
     */
    public int getCantidadIntegradores() {
        return cantidadIntegradores;
    }

    /**
     * @param cantidadIntegradores the cantidadIntegradores to set
     */
    public void setCantidadIntegradores(int cantidadIntegradores) {
        this.cantidadIntegradores = cantidadIntegradores;
    }

}
