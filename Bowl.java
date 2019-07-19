import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The class BOWL is the image for the user playing the game that is trying to get more 'good'
 * fruits, while avoiding the 'bad' fruits.
 * 
 * @author (Akash Kodela) 
 * @version (1.0)
 */
public class Bowl extends Actor
{
    public int myScore = 0;
    public int FruitEaten = 0;
    
    /**
     * Act - do whatever the Bowl wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        myIsCollided();
    }
    
    /**
     * code to make the bowl move with the left and right arrow keys.
     */
    public void move()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5,getY());
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5,getY());
        }
    }
    
    /**
     * code to check if the fruit(s) are colliding with the bowl (the player).
     */
    public void myIsCollided()
    {
        if (getOneIntersectingObject(Fruits.class) != null)
        {
            getWorld().removeObject(getOneIntersectingObject(Fruits.class));
            myScore += 1;
            FruitEaten += 1;
            if (FruitEaten >= ((MyWorld) getWorld()).myTotalFruit)
            {
                (   (MyWorld) getWorld()    ).myMakeFruit();
                FruitEaten = 0;
            }
            getWorld().showText("Score = "+myScore+"", 65, 20);
        }

    }
}