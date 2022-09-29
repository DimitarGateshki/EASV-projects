import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerPaddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerPaddle extends Paddle
{
    private int speed = 3;
    public PlayerPaddle(int width, int height)
    {
        super(width, height);
    }
    /**
     * Act - do whatever the PlayerPaddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(false) //turn to true to make it work automatically
            moveAI();
        else
            movePaddle();
        
    }
    private void moveAI()
    {
        Ball ball = getWorld().getObjects(Ball.class).get(0);
        this.setLocation(ball.getX(), 750);
    }
    private void movePaddle()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-this.speed);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(this.speed);
        }
    }
}
