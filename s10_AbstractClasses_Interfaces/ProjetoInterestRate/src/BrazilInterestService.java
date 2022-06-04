public class BrazilInterestService implements InterestRate {
    private double InterestRate;

    public BrazilInterestService(double InterestRate) {
        this.InterestRate = InterestRate;
    }

    @Override
    public double getInterestRate() {
        return InterestRate;
    }
    
}
