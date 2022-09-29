import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ant extends Actor
{
    private int speed=Greenfoot.getRandomNumber(10)+1;
    private int odd=Greenfoot.getRandomNumber(7)+3;

    private int timeOfEnd=0;
    private boolean end =false;
    private String name;
    
    public Ant(String name){
       this.name=name;
    }
    
    public void act()
    {
        getWorld().showText(" ", this.getX()-this.speed,this.getY()-20);

        getWorld().showText(this.name, this.getX(),this.getY()-20);

        if(getX()<800){
             timeOfEnd++;
             move(speed);
            }else{
                end=true;
            }

        
      
}

      public boolean getEnd(){
      return end;  
      }
      
      public String getName(){
          return this.name;
      }
      
      public int getTimeOFEnd(){
          return this.timeOfEnd;
      }
      
      public int getOdds(){
          return this.odd;
      }
    
    
}
