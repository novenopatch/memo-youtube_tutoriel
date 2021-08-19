public class Toy implements Comparable<Toy>{
    private String name;
    private int price;
    private String description;
    private int promo;

    public Toy(String name, int price,String description, int promo){
        this.name = name;
        this.price = price;
        this.description = description;
        this.promo = promo;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getPromo() {
        return promo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPromo(int promo) {
        this.promo = promo;
    }

    @Override
    public int compareTo(Toy toy2) {
        if(this.promo > toy2.promo){
            return -1;
        }else {
            return 1;
        }

    }
}
