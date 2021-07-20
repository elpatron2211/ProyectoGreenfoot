import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class delfin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class delfin extends Actor
{
    /**
     * Act - do whatever the delfin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        mueveYvuelta();// Add your action code here.
    }
    public void mueveYvuelta()
    {
    if (Greenfoot.isKeyDown("left"))
    {
        turn(-3);
    }
    if(Greenfoot.isKeyDown("right"))
    {
        turn(3);
    }
    if(Greenfoot.isKeyDown("up"))
    {
        move(2);
    }
    if (Greenfoot.isKeyDown("down"))
    {
        move(-2);
    }
    }
}
