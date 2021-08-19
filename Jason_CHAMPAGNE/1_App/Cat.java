public class Cat 
{
    //attribue 
    public Cat(String name, int age, String couleur)
    {
        this.mName = name;
        this.mAge = age;
        this.mCouleur = couleur;
       System.out.println(this.mName + " - " + this.mAge + " de couleur " + this.mCouleur); 
    }
    private String mName;
    private int mAge;
    private String mCouleur;
}