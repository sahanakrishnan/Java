public class NonStatic {
    int i = 5;

    public int getInt() {
        return i;
    }

    @Override
    public String toString() {
        return "Value is " + i;
    }
}