public class Card {
    // Attributes of a card
    private String color; // e.g., Red, Green, Blue, Yellow
    private String type;  // e.g., Number, Skip, Reverse, Draw Two, Wild, Wild Draw Four
    private int value;    // Value for number cards (0–9), -1 for special cards

    // Constructor for number cards
    public Card(String color, int value) {
        this.color = color;
        this.type = "Number";
        this.value = value;
    }

    // Constructor for special cards
    public Card(String color, String type) {
        this.color = color;
        this.type = type;
        this.value = -1; // Special cards don't have a numeric value
    }

    // Getters
    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public int getValue() {
        return value;
    }

    // Check if this card matches another card (by color or value/type)
    public boolean matches(Card other) {
        return this.color.equals(other.color) || this.type.equals(other.type) || this.value == other.value;
    }

    // String representation of the card
    @Override
    public String toString() {
        if (type.equals("Number")) {
            return color + " " + value;
        } else {
            return color + " " + type;
        }
    }
}
