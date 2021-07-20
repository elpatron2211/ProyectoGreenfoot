import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pezM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pezM extends Actor
{
    /**
     * Act - do whatever the pezM wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       move(2);
        World l=getWorld();
        if(getX()>l.getWidth()-5||getX()<=5){
         turn (180);
         if(Greenfoot.getRandomNumber(100)<80){
             turn(Greenfoot.getRandomNumber(80-45));
         }
        }// Add your action code here.
        if(getY()>=l.getHeight()-5||getY()<=5){
            turn(180);
            if(Greenfoot.getRandomNumber(1000)<90){
                turn(Greenfoot.getRandomNumber(80-45));
            }
        } // Add your action code here.
    }
}
