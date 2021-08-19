public class Cat 
{
    public Cat(String name, int age)
    {
        this.mName = name;
        this.mAge = age;
        System.out.println("Chat: " + this.mName + " Age: "+ this.mAge);
    }
    private String mName;
    private int mAge;
}