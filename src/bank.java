public class bank {

    private int account=3;
    private int score = 1;

    public static bank bank = new bank(); 


    public int getAccount() {
        return this.account;
    }
    
    public String getStringScore() {
        return String.valueOf(this.score);
    }
    
    public int getIntScore() {
        return this.score;
    }

    public void setSpend(int withdrawal) {
        this.account -= withdrawal;
    }

    public void setEarnt(int pay) {
        this.account += pay;
        this.score += 1;
    }
    public void setScore(int plus) {
        this.score +=1;
    }


}

