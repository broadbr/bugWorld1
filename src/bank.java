public class bank {

    private static int account=3;
    private int score = 1;

    public static bank bank = new bank(); 


    public static int getAccount() {
        return account;
    }

    public String getStringScore() {
        return String.valueOf(this.score);
    }
    
    public int getIntScore() {
        return this.score;
    }

    public static void setSpend(int withdrawal) {
        account -= withdrawal;
    }

    public void setEarnt(int pay) {
        this.account += pay;
        this.score += 1;
    }
    public void setScore(int plus) {
        this.score +=1;
    }


}

