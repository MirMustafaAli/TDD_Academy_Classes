public class Probability {
    private double value;
    private final int MAX_PROBABILITY = 1;

    private Probability(double value) {
        this.value = value;
    }

    public static Probability createProbability(double value) {
        if (value >= 0 && value <= 1) {
               return new Probability(value);

        }
        return null;

    }

    public int compare(Probability otherProbability) {
        if (this.value > otherProbability.value) {
            return 1;
        }
        if (this.value < otherProbability.value) {
            return -1;

        }
        return 0;

    }
    public Probability after(Probability otherProbability){
        return  Probability.createProbability(this.value * otherProbability.value);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(that.value, value) == 0;
    }

    public Probability not(){
        return  Probability.createProbability(this.MAX_PROBABILITY - this.value);
    }


    public Probability or(Probability otherProbability){
        return  Probability.createProbability(this.value + otherProbability.value);
    }
}

