import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MiMundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiMundo extends World
{
    GreenfootSound backgroundMusic = new GreenfootSound("musique.mp3");

    /**
     * Constructor for objects of class MiMundo.
     * 
     */
    public MiMundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        backgroundMusic.playLoop();
        prepare();
        crearpezB(15);
        crearpezM(5);
    }
    public void crearpezB (int numero){
        for (int i=0; i<numero; i++){
           pezB b=new pezB();
           int x=Greenfoot.getRandomNumber(getWidth());
           int y=Greenfoot.getRandomNumber(getHeight());
           addObject(b,x,y);
        }
    }
    public void crearpezM (int numero){
        for(int i=0; i<numero; i++){
            pezM m=new pezM();
            int x=Greenfoot.getRandomNumber (getWidth());
            int y=Greenfoot.getRandomNumber(getHeight());
            addObject(m,x,y);
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        delfin delfin = new delfin();
        addObject(delfin,46,257);
    }
}