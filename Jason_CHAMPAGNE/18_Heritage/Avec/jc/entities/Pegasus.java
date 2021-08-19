package jc.entities;

public class Pegasus extends Horse{

    public Pegasus(String name){
        super(name);
        this.mPosZ = 100;
    }
    /*
    public void move(int x , int y){
        this.mPosX = x;
        this.mPosY = y;
        System.out.println("Le Pegase se deplace (X= "+this.mPosX+", Y ="+this.mPosY+")");
    }
    */
    public void fly(int z){
        this.mPosZ = z;
        System.out.println("Le cheval se deplace (Z= "+this.mPosZ+")");
        
    }
    
    private int mPosZ;
    

}