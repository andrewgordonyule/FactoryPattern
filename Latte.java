public class Latte extends Coffee{

    public Latte(){

        setName("Latte");
        setBeans("Kopi luwak");
        setMilk("Almond Milk");

    }

    @Override
    public void pourShot() {
        System.out.println("Double shot of coffee.....");
    }
}
