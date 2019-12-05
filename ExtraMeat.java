public class ExtraMeat extends Additions {
    public ExtraMeat(Hamburger hamburger) {
        super(hamburger);
        if (hamburger.getAdditionsCount() < 5) {
            super.setPrice(2);
            super.setName("ExtraMeat, ");
            hamburger.raisePrice(getPrice());
            hamburger.addToList(getName());
            System.out.println("Adding ExtraMeat to the burger for " + super.getPrice() + " dollars.");
        }
        else {
            hamburger.additionsOverload();
        }
    }
}
