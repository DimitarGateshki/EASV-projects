import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BotPaddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BotPaddle extends Paddle
{
    private int speed = Greenfoot.getRandomNumber(5)+1;
    public BotPaddle(int width, int height)
    {
        super(width, height);
        GreenfootImage image = new GreenfootImage("plane (Custom).png");
        image.scale(Greenfoot.getRandomNumber(80)+80,20);
        setImage(image);
    }
    /**
     * Act - do whatever the BotPaddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(1);
        tryEdge();
        tryHit();
        // Add your action code here.
    }
    private void tryEdge()
    {
        //Check to see if we are touching the outer boundaries of the world:
        // IF we are touching the right boundary OR we are touching the left boundary:
        if(getX() + this.width/2 >= getWorld().getWidth() || getX() - this.width/2 <= 0)
        {

            this.setLocation(50, Greenfoot.getRandomNumber(getWorld().getHeight()/2)+100);
            this.width = Greenfoot.getRandomNumber(50)+40;
            GreenfootImage image = new GreenfootImage("plane (Custom).png");
            image.scale(Greenfoot.getRandomNumber(80)+80,20);
            setImage(image);
        
        }
    }
    private void tryHit()
    {
        //if(this.getOneIntersectingObject(Ball.class)!=null)
        
    }
}
