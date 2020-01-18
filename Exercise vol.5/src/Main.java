public class Main {

    public static void main(String[] args) {

        Burger burger = new Burger("Classic","white","chicken",25);
        burger.showInfo();
        burger.addOnBurger(false,true,false,true);
        burger.totalPrice();

        HealthyBurger healthyBurger = new HealthyBurger("Healthy","tofu",28);
        healthyBurger.showInfo();
        healthyBurger.addOnBurger(true,true,true, false,true,true);
        healthyBurger.totalPrice();

        DeluxBurger deluxBurger = new DeluxBurger("Delux", "wheet","beef",40);
        deluxBurger.showInfo();
        deluxBurger.addOnBurger(true,true,false,false);
        deluxBurger.totalPrice();

    }
}
