public interface Publisher {

    void registerObserver(Observer observer);

    void sendOffer(String nameCompany, Vacancy vacancy);

}