

public class Licence 
{
    /*
        [Acesseurs]:
            getters : acces a un attribut (lecture)
            setters : modification d'un attribut


    */
    public Licence(int expiration)
    {
        if(mNumbreOfRegistration > 0)
        {
            this.mExpirationYear = expiration;
            mNumbreOfRegistration--;

            System.out.println("Enregistrement du produit, valide jusqu'en " + this.mExpirationYear);
            System.out.println("il vous reste : " + this.mNumbreOfRegistration);



        }
        else{
            System.out.println("Maximum de validations effectuer");
        }
        
    }

    public int getExpiration()
    {
        return this.mExpirationYear;
    }

    public void setExpiration(int expiration)
    {
        this.mExpirationYear = expiration;
    }
    public static int getNumbreOfRegistration()
    {
        return mNumbreOfRegistration;
    }
    private int mExpirationYear;//comme il n'y a pas de private elle est accesible et modifiable,c'est la que les accesseurs intervienne pour assouplir le controle
    private static int mNumbreOfRegistration = 2;
}