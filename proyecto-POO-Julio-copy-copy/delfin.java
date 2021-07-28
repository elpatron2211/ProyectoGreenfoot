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
        mueveYvuelta();
        eat();// Clase de movimientos de delfin.
    }
    public void mueveYvuelta()
    {
    if (Greenfoot.isKeyDown("left")) //Movimiento hacia la izquierda
    {
        turn(-3);
    }
    if(Greenfoot.isKeyDown("right")) //Movimiento hacia la derecha
    {
        turn(3);
    }
    if(Greenfoot.isKeyDown("up"))//Movimiento hacia delante
    {
        move(2);
    }
    if (Greenfoot.isKeyDown("down"))//Movimiento hacia atrás
    {
        move(-2);
    }
    }
    public void eat ()
    {
      Actor pezB;
      pezB = getOneObjectAtOffset(0, 0, pezB.class);
      if (pezB != null)
      {
          World world;
          world= getWorld();
          world.removeObject(pezB);
      }
    }
}
