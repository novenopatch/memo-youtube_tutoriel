public class Main {
    public void main(String [] args){

        Account<Character> myAccount = new Account("Jin", 1000, '$');
        myAccount.showBalance();

        Account<String> otherAccount = new Account("other", 100000, "euros");
        otherAccount.showBalance();

        Bank bank = new Bank("JosephBank");
        Bank.tranfert(myAccount, otherAccount, 100);

        myAccount.showBalance();
        otherAccount.showBalance();
    }
}
