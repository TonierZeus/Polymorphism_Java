public class DeluxBurger extends Burger{
    private String drink, fries, nachos;
    private double drinkPrice, friesPrice, nachosPrice;

    public DeluxBurger(String burgerName, String rollType, String meatType, double burgerPrice) {
        super(burgerName, rollType, meatType, burgerPrice);
        this.drink = "drink";
        this.fries = "fries";
        this.nachos = "nachos";
        this.drinkPrice = 5;
        this.friesPrice = 15;
        this.nachosPrice = 12;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("You have chosen Delux so:");
        System.out.println("We add to your burger: " + drink + ", and it add extra: " + drinkPrice + ", to your bill");
        System.out.println("We add to your burger: " + fries + ", and it add extra: " + friesPrice + ", to your bill");
        System.out.println("We add to your burger: " + nachos + ", and it add extra: " + nachosPrice + ", to your bill");
    }

    @Override
    public void addOnBurger(boolean jalapeno, boolean becon, boolean halumi, boolean redOnion) {
        if(jalapeno || becon || halumi || redOnion){
            System.out.println("Can't add extra additions");
        }
    }

    @Override
    public void totalPrice() {
        super.price+=drinkPrice+friesPrice+nachosPrice;
        super.totalPrice();

    }
}
