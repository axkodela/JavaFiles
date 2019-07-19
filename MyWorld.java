import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Akash Kodela)
 * @version (1.0)
 */
public class MyWorld extends World
{
    public int myTotalFruit;
    
    public MyWorld()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        myTotalFruit = 0;
        myMakeFruit();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Floor floor = new Floor();
        addObject(floor,257,395);
        Bowl bowl = new Bowl();
        addObject(bowl,79,346);
    }
    
    public void myMakeFruit()
    {
        int myTempNum = Greenfoot.getRandomNumber(35);
        if (myTempNum < 10)
        {
            myTempNum = 10;
        }
        myTotalFruit = 0;
        for (int x = 0; x<myTempNum;x++)
        {
            Fruits fruit = new Fruits();
            addObject(fruit, Greenfoot.getRandomNumber(getWidth()-20),Greenfoot.getRandomNumber(getHeight()-20));
            myTotalFruit += 1;
        }
    }
}
