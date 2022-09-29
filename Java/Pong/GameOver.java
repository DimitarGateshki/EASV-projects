import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    private static final int WORLD_WIDTH = 800;
    private static final int WORLD_HEIGHT = 800;
    
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(WORLD_WIDTH, WORLD_HEIGHT,1); 
        GreenfootImage background = getBackground();
        
        background.drawImage(new GreenfootImage("Game Over", 50, new Color( 255,  0,  0),null),WORLD_WIDTH / 2 - 100,WORLD_HEIGHT / 4);
        background.drawImage(new GreenfootImage("Press <enter> to play again", 30, new Color( 0, 0, 0),null),WORLD_WIDTH / 2 - 140,WORLD_HEIGHT / 4+100);



    }
    
    public void act()
    {
        String key = Greenfoot.getKey();
        if (key != null && key.equals("enter"))
        {
            Greenfoot.setWorld(new IntroWorld());
        }
    }
}
