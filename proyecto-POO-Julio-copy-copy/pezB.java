import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pezB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pezB extends Actor
{
    /**
     * Act - do whatever the pezB wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Movimiento automatico de pez bueno
        move(2);
        World j=getWorld();
        if(getX()>j.getWidth()-5||getX()<=5){
         turn (180);
         if(Greenfoot.getRandomNumber(100)<90){
             turn(Greenfoot.getRandomNumber(90-45));
         }
        }// Add your action code here.
        if(getY()>=j.getHeight()-5||getY()<=5){
            turn(180);
            if(Greenfoot.getRandomNumber(1000)<90){
                turn(Greenfoot.getRandomNumber(90-45));
            }
        }
        
    }
}

