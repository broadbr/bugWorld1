public class upgrades {

    protected int price = 100;


    //increases damage of all current insects
   public void increaseDamage(){

        for(int i = 0; i < bugList.objects.size(); i++) {

            try{
                bugList.objects.get(i).setDamage(bugList.objects.get(i).getDamage()+1);
            }
            catch(ArithmeticException e){
                System.out.print("not issue");
            }
            i++;
        }
    }

    public void healBugs(){

        for(int i = 0; i < bugList.objects.size(); i++) {

            try{
                bugList.objects.get(i).setHealth(bugList.objects.get(i).getDamage()+1);
            }
            catch(ArithmeticException e){
                System.out.print("not issue");
            }
            i++;
        }
    }

    public int getPrice() {return price;}
}
