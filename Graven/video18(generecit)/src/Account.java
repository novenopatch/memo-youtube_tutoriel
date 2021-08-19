public class Account<T> {
    private String owner;
    private double amount;
    private  T  currency;

    public Account(String name, double amount, T currency){
        this.owner = name;
        this.amount = amount;
        this.currency = currency;
    }

    public String getOwner() {
        return owner;
    }

    public double getAmount() {
        return amount;
    }

    public T getCurrency() {
        return currency;
    }


    public void addMoney(int amount) {
        this.amount += amount;
    }
    public void removeMoney(int amount) {
        this.amount -= amount;
    }

   public void showBalance(){
        System.out.println("Vous avez actuellement " + amount +" "+ currency + "sur votre solde !");
   }
}
