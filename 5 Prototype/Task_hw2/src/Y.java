public class Y {
    private int value;

    public Y(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int newValue) {
        this.value = newValue;
    }
    public Y prototype() {
        return new Y(this.value);
    }
}