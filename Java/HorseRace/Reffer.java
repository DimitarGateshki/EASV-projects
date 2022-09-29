import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Reffer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reffer extends Actor
{
    private List<Ant> ants=new ArrayList();
    private List<Ant> finished=new ArrayList();
    private Ant current;
    private User user;
    
    public void act()
    {
        for(int i=0; i<ants.size();i++){
            if(ants.get(i).getEnd()){
                finished.add(ants.get(i));
                ants.remove(ants.get(i));
                i--;
            }
        }
        
       if(finished.size()==6){
        for(int i=0; i<finished.size();i++){
            current=finished.get(i);
            if(i!=0){
            getWorld().showText(current.getName() +"- Time of finishing:  "+current.getTimeOFEnd(),400, 100+(i*30));
        }else{
            getWorld().showText("Winner:  "+current.getName()+"- Time of finishing:  "+current.getTimeOFEnd(),400, 100+(i*30));

        }
        } 
        
        if(finished.get(0).getName().equals(user.getChosenOne().getName())){
            user.setCurrency(finished.get(0).getOdds());
         getWorld().showText("Total: "+user.getCurrency() +" WIN!!!",100,30);
        }else{
         getWorld().showText("Total: "+0+" LOSE!",100,30);

        }
        Greenfoot.stop();
      }
    }
    
    public List<Ant> getAnt(){
        return this.ants;
    }
    
    public void setUser(User user){
        this.user=user;
    }
}
