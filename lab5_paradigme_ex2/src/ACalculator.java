    public abstract class ACalculator {
        protected Object state;

        public ACalculator(Object state) {
            this.state=state;
        }

        public Object result() {
            return state;
        }
        public ACalculator clear() {
            this.init();
            return this;
        }
        protected abstract void init();
    }


