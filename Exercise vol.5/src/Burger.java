public class Burger {
    protected double price;
    private String burgerName, rollType, meatType, additionalName1, additionalName2, additionalName3, additionalName4;
    private double burgerPrice, additionalPrice1, additionalPrice2, additionalPrice3, additionalPrice4;

    public Burger(String burgerName, String rollType, String meatType, double burgerPrice) {
        this.burgerName = burgerName;
        this.rollType = rollType;
        this.meatType = meatType;
        this.burgerPrice = burgerPrice;
        this.price = price;
        this.additionalName1 = "Jalapeno";
        this.additionalPrice1 = 1.5;
        this.additionalName2 = "Becon";
        this.additionalPrice2 = 2.7;
        this.additionalName3 = "Halumi Cheese";
        this.additionalPrice3 = 3.0;
        this.additionalName4 = "Red Onion";
        this.additionalPrice4 = 0.5;
    }



    public void showInfo(){
        System.out.println("You picked burger named as: " + burgerName + ", with roll typ: " + rollType +
                ", and you've chosen: " + meatType + " as your meat, and it cost: " + burgerPrice );
    }


    public void addOnBurger(boolean jalapeno, boolean becon, boolean halumi, boolean redOnion){

        if(jalapeno==true){
            System.out.println("You add to your burger: " + additionalName1 + ", and it add extra: " + additionalPrice1 + ", to your bill");
            price += this.additionalPrice1;
        }

        if(becon==true){
            System.out.println("You add to your burger: " + additionalName2 + ", and it add extra: " + additionalPrice2 + ", to your bill");
            price += this.additionalPrice2;
        }

        if(halumi==true){
            System.out.println("You add to your burger: " + additionalName3 + ", and it add extra: " + additionalPrice3 + ", to your bill");
            price += this.additionalPrice3;
        }

        if(redOnion==true){
            System.out.println("You add to your burger: " + additionalName4 + ", and it add extra: " + additionalPrice4 + ", to your bill");
            price += this.additionalPrice4;
        }

    }

          public void totalPrice(){
              price +=burgerPrice;
              System.out.println("Total price is: " + price);
          }

}
