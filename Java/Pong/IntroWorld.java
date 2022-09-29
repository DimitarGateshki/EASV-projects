import greenfoot.*;

/**
 * Write a description of class IntroWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IntroWorld extends World
{
    private static final int WORLD_WIDTH = 800;
    private static final int WORLD_HEIGHT = 800;

    /**
     * Constructor for objects of class IntroWorld.
     */
    public IntroWorld()
    {
        super(WORLD_WIDTH, WORLD_HEIGHT, 1); 
        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK);
        int c = 255;
        background.drawImage(new GreenfootImage("Hit <enter> to start working", 30, new Color( c, c, c),null),WORLD_WIDTH / 2 - 140-60,WORLD_HEIGHT / 2 + 200);
        background.drawImage(new GreenfootImage("Your job is to keep wombat alive", 30, new Color( c, c, c),null),WORLD_WIDTH / 2 - 180-60,WORLD_HEIGHT / 2-90 + 200);
        background.drawImage(new GreenfootImage("This is the ONLY way!", 30, new Color( c, c, c),null),WORLD_WIDTH / 2 - 110-60,WORLD_HEIGHT / 2-60 + 200);
        Greenfoot.start();
    }
    
    public void act()
    {
        String key = Greenfoot.getKey();
        if (key != null && key.equals("enter"))
        {
            Greenfoot.setWorld(new PingWorld(true));
        }
    }
    
}
