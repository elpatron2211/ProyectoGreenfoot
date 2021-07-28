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
       //Movimiento automatico de pez malo
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
        } 
        //Daño a delfin y disminucion de vidas 
        Actor delfin=getOneObjectAtOffset(0, 0, delfin.class);
        if (delfin!=null){
            MiMundo mund=(MiMundo)getWorld();
            getWorld().removeObject(delfin);
            mund.vidas.Disminuir();
            getWorld().addObject(new delfin(), 50, 300);
            if (mund.vidas.obtenerValor()==0){
                Gameover t=new Gameover();
                getWorld().addObject(t,((getWorld().getWidth()/2)+30),((getWorld().getHeight()/2)+150));
                
            }
        }// Add your action code here.
    }
}
