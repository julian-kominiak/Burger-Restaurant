public class Drink extends Additions {

    public Drink(Hamburger hamburger) {
        super(hamburger);
        if (hamburger.getAdditionsCount() < 5) {
            super.setPrice(2);
            super.setName("Drink, ");
            hamburger.raisePrice(getPrice());
            hamburger.addToList(getName());
            System.out.println("Adding a Drink to the burger for " + super.getPrice() + " dollars.");
        }
        else {
            hamburger.additionsOverload();
        }
    }
}
