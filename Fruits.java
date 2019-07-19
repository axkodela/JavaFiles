import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fruits here.
 * 
 * @author (Akash Kodela) 
 * @version (1.0)
 */
public class Fruits extends Actor
{
    int mySpeed;
    public Fruits()
    {
        mySpeed = Greenfoot.getRandomNumber(10);
        if (mySpeed == 0)
        {
            mySpeed += 1;
        }
    }
    
    /**
     * Act - do whatever the Fruits wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveMyFruit();
    }
    
    public void moveMyFruit()
    {
        if (isTouching(Floor.class) == false)
        {
            setLocation(getX(), getY()+mySpeed);
        }
        else
        {
           (( MyWorld ) getWorld()).myTotalFruit -= 1;
            getWorld().removeObject(this);
        }
    }
}