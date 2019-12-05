public class BreadRoll {
    private String type;

    public BreadRoll(int number) throws IllegalArgumentException {
        if (number < 1 || number > 3) {
            throw new IllegalArgumentException("You can only choose 1, 2 or 3.");
        }
        switch (number) {
            case 1:
                setType("White");
                break;
            case 2:
                setType("Rye");
                break;
            case 3:
                setType("Whole Grain");
                break;
        }
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBreadRollType() {
        return type;
    }
}
