public class NewIntCalculator extends ACalculator{

    NewIntCalculator(Object state){
        super(state);
    }
    @Override
    protected void init() {

    }

    public NewIntCalculator Add(int nr){
        state=(int)state+nr;
        return this;
    }

    public NewIntCalculator Substract(int nr){
        state=(int)state-nr;
        return this;
    }
    public NewIntCalculator Multiply(int nr){
        state=(int)state*nr;
        return this;
    }
}
