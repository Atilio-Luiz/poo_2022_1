public class Manager extends Employee {
    double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + getBonus();
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", bonus: " + bonus;
    }
}
