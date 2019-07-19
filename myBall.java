import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class myBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class myBall extends Actor
{
    /**
     * Act - do whatever the myBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //setLocation(0, 0);
        move();
    }
    public void move()
    {
        if ( atWorldEdge() )
        {
            bounce();
            //setLocation(getX(), getY()-100 );
        }
        else
        {
            setLocation(getX(), getY()+1);
        }
    }
    public boolean atWorldEdge()
    {
        World tempW = getWorld();
        if ( getY() >= tempW.getHeight()-25 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean getEdges()
    {
        World tempW = getWorld();
        if ( getX() >= tempW.getWidth()-50 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void bounce()
    {
        for (int n = 0; n<Greenfoot.getRandomNumber(300); n++) 
        {
            if ( getEdges() )
            {
                setLocation(0, getY());
            }
            else
            {
                setLocation(getX()+1, getY()-1);
            }
            Greenfoot.delay(1);
        }
    }
}
