package prog.account;

public class Account {
    String ID;
    String firstname;
    String lastname;
    int pwd;
    double saldo;

    public Account(String ID, String firstname, String lastname, int pwd, double saldo){
        this.ID = ID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.pwd = pwd;
        this.saldo = saldo;
    }

}
