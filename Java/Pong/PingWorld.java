import greenfoot.*;


/**
 * The Ping World is where Balls and Paddles meet to play pong.
 * 
 * @author The teachers 
 * @version 1
 */
public class PingWorld extends World
{
    private static final int WORLD_WIDTH = 800;
    private static final int WORLD_HEIGHT = 800;
    private int currentLvl = 1;
    /**
     * Constructor for objects of class PingWorld.
     */
    public PingWorld(boolean gameStarted)
    {
        
        super(WORLD_WIDTH, WORLD_HEIGHT, 1);
        Font font = getBackground().getFont();
        font =new Font("Arial", true, false, 40);

        getBackground().setFont(font);
        
        showText("Game Level: "+currentLvl, 10, 30);
        //getBackground().drawImage(new GreenfootImage("Game Level: "+currentLvl, 24, null,null),0,0);
        if (gameStarted)
        {
            GreenfootImage background = getBackground();
            background.setColor(Color.BLACK);
            // Create a new world with WORLD_WIDTHxWORLD_HEIGHT cells with a cell size of 1x1 pixels.
            addObject(new Ball(), WORLD_WIDTH/2, WORLD_HEIGHT/2);
            addObject(new PlayerPaddle(100,20), 60, WORLD_HEIGHT - 50);
            addObject(new BotPaddle(Greenfoot.getRandomNumber(50)+40,20), Greenfoot.getRandomNumber(getWidth()-200)+100, Greenfoot.getRandomNumber(getHeight()/2)+100);
        }
        else
        {
            Greenfoot.setWorld(new IntroWorld());
        }
    }
    
    public int getLvl()
    {
        return currentLvl;
    }
    
    public void lvlUp()
    {
       this.currentLvl += 1;
       showText(" ",10,30);
       showText("Game Level: "+currentLvl, 10, 50);
       for(int i=getObjects(BotPaddle.class).size();i<this.currentLvl;i++)
       {
           addObject(new BotPaddle(Greenfoot.getRandomNumber(50)+40,20), Greenfoot.getRandomNumber(getWidth()-200)+100, Greenfoot.getRandomNumber(getHeight()/2)+100);
       }

    }
}
