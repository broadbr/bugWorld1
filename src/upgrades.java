public class upgrades {

    protected int price = 10;

    ant ant = new ant();
    //increases damage of all current insects
   public void increaseDamage(){
    /*
        for(int i = 0; i < bugList.objects.size(); i++) {

            try{
                bugList.objects.get(i).setDamage(bugList.objects.get(i).getDamage()+1);
            }
            catch(ArithmeticException e){
                System.out.print("not issue");
            }
            i++;
        }*/
        ant.setDamage(3);
        beatle.damage+=3;
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


    //used to make food more valluble
    public void incValue(){
       foodList.valueMod++;
        leaf.valueMod++;
    }

    //used to make food spawn more often
    public void fastFood(){
       if(stage1.control>10){
           stage1.control-=2;
           stage2.control-=2;
       }
    }



    public int getPrice() {return price;}
}
