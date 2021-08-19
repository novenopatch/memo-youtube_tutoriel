package mypackage;
/*
     la methode conventionel avec les point
*/
public class Item {
   
    public Item()
    {
        this.pName = "inconnu";
        this.pLevel = 1;
        System.out.println(this.pName + "-" + this.pLevel);
    }

    public Item(String name)
    {
        this.pName = name;
        this.pLevel = 1;
        System.out.println(this.pName + "-" + this.pLevel);
    }

    private String pName;
    private int pLevel;
   
}