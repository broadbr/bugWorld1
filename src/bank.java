public class bank {


    //code from Colin
    private int account=3;

    public static bank bank = new bank(); 


    public int getAccount() {
        return this.account;
    }

    public void setSpend(int withdrawal) {
        this.account -= withdrawal;
    }

    public void setEarnt(int pay) {
        this.account += pay;
    }
}

