public class Vacancy {

    private VacancyType vacanceName;
    private double maxSalary;

    public Vacancy(VacancyType vacanceName, double maxSalary) {
        this.vacanceName = vacanceName;
        this.maxSalary = maxSalary;
    }

    public VacancyType getVacanceName() {
        return vacanceName;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

}