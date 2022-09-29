import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
public class MyWorld extends World
{


    public MyWorld()
    {    
        super(1000, 500, 1); 
        Reffer reff=new Reffer();
        addObject(reff, 800, 20);
        String[] names = {"Poldi","Vural","Srinivas","Anik","Serhiy","Devdas" };  
        showText("Ant   -   odds ",900,30);
        for(int i=0;i<6;i++){
            addAnt(reff,names[i]);
            showText(reff.getAnt().get(i).getName()+" - "+reff.getAnt().get(i).getOdds(),900,50+(i*30));

        }
        User user= new User(reff.getAnt().get(3));
        showText("Total: "+user.getCurrency(),100,30);
        reff.setUser(user);

        drawFinish();
        
        }
        
        
    
   
    
    public void drawFinish(){
        for(int i=50;i<800;i+=15){
            if(i%2==0){
            showText("|   |",800,i);
        }else{
            showText("  |  ",800,i);

        }
    }
}
    
    public void addAnt(Reffer arr,String i){
        Ant ant=new Ant(i);
        arr.getAnt().add(ant);
        addObject(ant, 20, Greenfoot.getRandomNumber(450)+50);
        
    }

 }