public class Program {


    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();

        // Создаем работодателей
        Company geekBrains = new Company("GeekBrains", jobAgency);
        Company google = new Company("Google",jobAgency);
        Company yandex = new Company("Yandex",jobAgency);

        //Создаем актуальные вакансии
        Vacancy driver = new Vacancy(VacancyType.Водитель, 45000);
        Vacancy lawyer = new Vacancy(VacancyType.Юрист, 80000);
        Vacancy economist = new Vacancy(VacancyType.Экономист, 75000);
        Vacancy developer = new Vacancy(VacancyType.Разработчик, 120000);

        //Создаем наших соискателей
        Master ivanov = new Master("Иванов", VacancyType.Юрист, 85000);
        Master petrov = new Master("Петров", VacancyType.Разработчик, 100000);
        Student kopylov = new Student("Копылов", VacancyType.Водитель, 65000);
        Supervizor yagodkin = new Supervizor("Ягодкин", VacancyType.Экономист, 90000);


        //добавляем сосикателей в поле зрения обозревателя
        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(kopylov);
        jobAgency.registerObserver(yagodkin);

        //публикуем вакансии
        geekBrains.needEmployee(developer);
        google.needEmployee(economist);
        yandex.needEmployee(lawyer);
        yandex.needEmployee(driver);
    }

}