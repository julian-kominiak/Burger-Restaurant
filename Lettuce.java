public class Lettuce extends Additions {
    public Lettuce(Hamburger hamburger) {
        super(hamburger);
        if (hamburger.getAdditionsCount() < 5) {
            super.setPrice(1);
            super.setName("Lettuce, ");
            hamburger.raisePrice(getPrice());
            hamburger.addToList(getName());
            System.out.println("Adding Lettuce to the burger for " + super.getPrice() + " dollar.");
        }
        else {
            hamburger.additionsOverload();
        }
    }
}
