public class UsaInterestService implements InterestRate {
    private double InterestRate;

    public UsaInterestService(double InterestRate) {
        this.InterestRate = InterestRate;
    }

    @Override
    public double getInterestRate() {
        return InterestRate;
    }
    
}
