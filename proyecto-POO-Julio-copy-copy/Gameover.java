import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gameover extends Actor
{
    /**
     * Act - do whatever the Gameover wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage imagen;
    String mensaje;
    public Gameover()//Detener juego con mensaje
    {
        imagen=new GreenfootImage(400,300);
        imagen.setColor(new Color(250,200,0,255));
        imagen.setFont(new Font("Verdana",34));
        imagen.drawString("Juego Terminado",0,30);
        setImage(imagen);
        Greenfoot.stop();
    }
    public void act()
    {
        // Add your action code here.
    }
}
