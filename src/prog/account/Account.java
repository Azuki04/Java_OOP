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


    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getPwd() {
        return this.pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
	public String toString() {
		return "Account: [Id=" + ID + ", FirstName=" + firstname + ", LastName=" + lastname + ", saldo=" + saldo + "]";
	}


}
