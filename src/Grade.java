public class Grade {
    private Double value;

    public Grade(double value) {
        if (value < 0)
            this.value = 0.0;
        else this.value = Math.min(value, 10.0);
    }

    public double getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
