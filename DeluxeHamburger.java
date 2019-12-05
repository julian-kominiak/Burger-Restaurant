public class DeluxeHamburger extends Hamburger {

    public DeluxeHamburger(int breadRollNumber, int meatNumber) {
        super(breadRollNumber, meatNumber);
        Chips chips = new Chips(this);
        Drink dink = new Drink(this);
        setAdditionsCount(5);
    }

    @Override
    public void additionsOverload() {
        System.out.println("You cannot have more additions to your DeluxeHamburger.");
    }
}
