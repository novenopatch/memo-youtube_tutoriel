public class Bank {
    private  String name;
    public Bank(String name){
        this.name = name;
    }

    public <T, S> void tranfert(Account<T> sourceAccount, Account<S> targetAccount, int amount) {
        if(sourceAccount.getAmount()>= amount){
            sourceAccount.removeMoney(amount);
            System.out.println("Tranfert de: "+ amount  + " vers "+ sourceAccount.getOwner() + " vers le compte: " + targetAccount.getOwner());
        }
        else {
            System.err.println("Transfert impossible");
        }
    }

    public String getName() {
        return name;
    }
}
