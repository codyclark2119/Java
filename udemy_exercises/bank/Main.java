package bank;

public class Main {
    public static void main(String[] args){
        Bank bank = new Bank("Credit Union of Texas");

        bank.addBranch("Dallas");
        bank.addCustomer("Dallas", "Cody", 25.82);
        bank.addCustomer("Dallas", "Loreida", 100.26);
        bank.addCustomer("Dallas", "Alec", 20.21);

        bank.addTransaction("Dallas","Cody", 50.31);
        bank.listCustomers("Dallas", true);
    }
}
