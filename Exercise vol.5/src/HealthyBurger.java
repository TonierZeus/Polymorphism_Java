public class HealthyBurger extends Burger {
    private  String additionalName5, additionalName6 ;
    private double  additionalPrice5, additionalPrice6;

    public HealthyBurger(String burgerName, String meatType, double burgerPrice) {
            super(burgerName, "brown rye", meatType, burgerPrice);
            this.additionalName5 = "Olives";
            this.additionalName6 = "Dried Tomato";
            this.additionalPrice5 = 0.8;
            this.additionalPrice6 = 1.2;
        }

    @Override
    public void showInfo() {
        super.showInfo();
    }

    public void addOnBurger(boolean jalapeno, boolean becon, boolean halumi, boolean redOnion, boolean olives, boolean driedTomato) {
        super.addOnBurger(jalapeno, becon, halumi, redOnion);

        if(olives==true){
            System.out.println("You add to your burger: " + additionalName5 + ", and it add extra: " + additionalPrice5 + ", to your bill");
            super.price += this.additionalPrice5;
        }
        if(driedTomato==true){
            System.out.println("You add to your burger: " + additionalName6 + ", and it add extra: " + additionalPrice6 + ", to your bill");
            super.price += this.additionalPrice6;
        }
    }

    @Override
    public void totalPrice() {
        super.totalPrice();
    }
}
