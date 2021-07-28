import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Actor
{
    /**
     * Act - do whatever the Scoreboard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage imagen;
    int cont;
    String mensaje; 
    public Scoreboard(int c,String msj)
    {//parametros scoreboard (Constructor)
        cont=c;
        mensaje=msj;
        imagen=new GreenfootImage(250,150);
        imagen.setColor(new Color(200,200,0,255));
        imagen.setFont(new Font("Verdana",24));
        dibuja();
    }
    public void dibuja()
    {
        imagen.clear();
        imagen.drawString(mensaje+cont,20,20);
        setImage(imagen);
    }
    public void incrementar()//Aumentar vida 
    {
        cont++;
        dibuja();
    }
    public void Disminuir ()//Disminuir vida
    {
        cont--;
        dibuja();
    }
    public int obtenerValor()//Saber cuantas vidas nos quedan
    {
        return cont;
    }
  }
