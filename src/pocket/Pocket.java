package pocket;
//Task 2.
//1. Create class Pocket.
//2.  Add field „money”, create constructor, getter and setter.
//3. Add verification for both getter and setter. Getter should result in returning as much money, as the
//user asked for. It should return 0 if money <= 10.
//4. Setter should not accept values below 0 and greater than 3000. It may print a message like „I don’t
//have enough space in my pocket for as much money!”
//


public class Pocket {




    private int money;

    public Pocket(int money){
        this.money = money;
    }
    public int getMoney() {
        if (money <= 10){
            return 0;
        }
        return money;
    }
    public void setMoney(int money) {
        if (money <= 0 || money >= 3000) {


            System.out.println("I don’t have enough space in my pocket for as much money! ");
        }
}
}
