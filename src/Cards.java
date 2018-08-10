public class Cards {
    private Suite suite;
    private int value;

    public Cards(Suite suite,int value){
        this.suite = suite;
        this.value = value;
    }

    public Suite getSuites() {
        return suite;
    }

    public void setSuites(Suite suite) {
        this.suite = suite;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}