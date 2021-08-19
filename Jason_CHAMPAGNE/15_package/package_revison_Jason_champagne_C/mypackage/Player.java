package mypackage;

public class  Player{

    
    public Player()
    {
        this.pName = "inconnu";
        this.pLevel = 1;
        System.out.println(this.pName + "-" + this.pLevel);
    }

    public Player(String name)
    {
        this.pName = name;
        this.pLevel = 1;
        System.out.println(this.pName + "-" + this.pLevel);
    }

    private String pName;
    private int pLevel;
}