public class bank {

    private static int account=3;
    private int score = 1;
    static int a2 = 0;

    public static bank bank = new bank(); 

    
    public static int getAccount() {
        return account;
    }

    public static int getAccount2() {
        return a2;
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

    public static void setSpend2(int withdrawal) {
        a2 -= withdrawal;}

    public void setEarnt(int pay) {
        this.account += pay;
        this.score += 1;
    }
    public void setEarnt2(int pay) {
        this.a2 += pay;
    }
    public void setScore(int plus) {
        this.score +=1;
    }

    public void setZero() {
        this.account = 0;
    }

}

