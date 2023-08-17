public class Employee {

    private int baseSalary;
    private int hourlyRate;
    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }
    public Employee(int baseSalary) {
        this(baseSalary,0);
    }
    public int calculateWage(int extraHours){
        return getBaseSalary()+ (getHourlyRate() *extraHours);
    }
    private void setBaseSalary(int baseSalary){
        if (baseSalary <=0 )
            throw new IllegalArgumentException("Base salary should be More than 0");
        this.baseSalary =baseSalary;
    }
    private int getBaseSalary(){
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate<=0)
            throw new IllegalArgumentException("Hourly rate Can Not Be 0 or less than 0!!");
        this.hourlyRate = hourlyRate;
    }
}
