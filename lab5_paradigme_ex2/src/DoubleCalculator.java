public class DoubleCalculator extends ACalculator{
    public DoubleCalculator(Object state) {
        super(state);
    }

    @Override
    protected void init() {

    }

    public DoubleCalculator Add(double nr){
        state=(double)state+nr;
        return this;
    }
    public DoubleCalculator Substract(double nr){
        state=(double)state-nr;
        return this;
    }
    public DoubleCalculator Multiply(double nr){
        state=(double)state*nr;
        return this;
    }

}
