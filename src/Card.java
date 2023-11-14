public record Card(String suit, String name, Integer value) {

    public void display() {
        System.out.printf("Suit: %s, Name: %s, Value: %d%n", suit, name, value);
    }
    
}