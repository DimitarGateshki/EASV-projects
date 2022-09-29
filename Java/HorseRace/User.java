/**
 * Write a description of class User here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class User  
{
    // instance variables - replace the example below with your own
    private int currency;
    private Ant chosenOne;

    
    public User(Ant ant)
    {
        this.currency=1000;
        this.chosenOne=ant;
    }

    public int getCurrency(){
        return this.currency;
    }
    
     public void setCurrency(int i){
         this.currency=this.currency*i;
    }
    
    public Ant getChosenOne(){
        return this.chosenOne;
    }
    
    
     
    
   
   
}
