import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tablero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tablero extends Actor
{
    /**
     * Act - do whatever the tablero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int c=3;
    public tablero(){
        
    }
    public void Disminuir(){
        c--;
        if(c==0)
        {
            Greenfoot.stop();
        }
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
