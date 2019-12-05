public class Chips extends Additions {

    public Chips(Hamburger hamburger) {
        super(hamburger);
        if (hamburger.getAdditionsCount() < 5) {
            super.setPrice(2);
            super.setName("Chips, ");
            hamburger.raisePrice(getPrice());
            hamburger.addToList(getName());
            System.out.println("Adding Chips to the burger for " + super.getPrice() + " dollars.");
        }
        else {
            hamburger.additionsOverload();
        }
    }
}
