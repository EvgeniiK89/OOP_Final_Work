import java.util.Random;

public class Student implements Observer {

    private static Random random = new Random();

    private String name;

    private double minSalary;
    private VacancyType vacancyType;

    public Student(String name, VacancyType vacancyType, double minSalary) {
        this.name = name;
        this.vacancyType = vacancyType;
        minSalary = random.nextDouble(20000, 50000);
    }

    @Override
        public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (vacancyType == vacancy.getVacanceName())
            if (minSalary <= vacancy.getMaxSalary()) {
                System.out.printf("Студент %s : Мне нужна эта работа! ('%s' в '%s' - %.2f)\n",
                        name, vacancy.getVacanceName(), nameCompany, vacancy.getMaxSalary());
                minSalary = vacancy.getMaxSalary();
           }
            else {
                System.out.printf("Студент %s : Я найду работу получше! ('%s' в '%s' - %.2f)\n",
                        name, vacancy.getVacanceName(), nameCompany, vacancy.getMaxSalary());
            }
        else {
            System.out.printf("Студент %s : Вакансия '%s' от компании '%s' - %.2f мне не подходит)\n",
                    name, vacancy.getVacanceName(), nameCompany, vacancy.getMaxSalary());
        }
    }
}