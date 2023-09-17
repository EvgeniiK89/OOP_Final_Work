import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void sendOffer(String nameCompany, Vacancy vacancy) {
        for (Observer observer: observers) {
            observer.receiveOffer(nameCompany, vacancy);
        }
    }
}