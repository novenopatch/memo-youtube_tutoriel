
public class Jouet implements Comparable<Jouet>{

    private String Name;
    private int prix;
    private String description;
    private int promo;//en pourcentage 

    
	public Jouet(String Name, int prix, String description,int promo){
        this.Name = Name;
        this.prix = prix;
        this.description = description;
        this.promo =promo;

    }
    public String getName(){
        return this.Name;
    }
    public int getPrix(){
        return this.prix;
    }
    public String getDescription(){
        return this.description;
    }
    public int getPromo(){
        return this.promo;
    }
	@Override
	public int compareTo(Jouet Jouet2) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(Jouet2.getName());
	}
}