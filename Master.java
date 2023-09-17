import java.util.Random;

public class Master implements Observer {

    private static Random random = new Random();

    private String name;

    private VacancyType vacancyType;

    private double minSalary;

    public Master(String name, VacancyType vacancyType, double minSalary) {
        this.name = name;
        this.vacancyType = vacancyType;
        minSalary = random.nextDouble(70000, 90000);
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (vacancyType == vacancy.getVacanceName())
            if (minSalary <= vacancy.getMaxSalary()) {
                System.out.printf("Специалист %s : Мне нужна эта работа! ('%s' в '%s' - %.2f)\n",
                        name, vacancy.getVacanceName(), nameCompany, vacancy.getMaxSalary());
                minSalary = vacancy.getMaxSalary();
            }
        else {
                System.out.printf("Специалист %s : Я найду работу получше! ('%s' в '%s' - %.2f)\n",
                        name, vacancy.getVacanceName(), nameCompany, vacancy.getMaxSalary());
            }
        else {
            System.out.printf("Специалист %s : Вакансия '%s' от компании '%s' - %.2f мне не подходит)\n",
                    name, vacancy.getVacanceName(), nameCompany, vacancy.getMaxSalary());
        }
    }
}