public class bank {
    /* Code to keep track of money earnt, spent and lost */

    //
    private int account;
    
    public int getAccount(){ 
        return account;
    }

    
    public void setSpend(int withdrawal){
        account -= withdrawal;
    }

    public void setEarnt(int pay){
        account += pay;       
    }

}
