public class HealthyBurger extends Hamburger {
    public HealthyBurger(int meatNumber) {
        super(2, meatNumber);
        setAdditionsCount(-2);
    }

    @Override
    public void additionsOverload() {
        System.out.println("You can only have up to 6 additions.");
    }
}
