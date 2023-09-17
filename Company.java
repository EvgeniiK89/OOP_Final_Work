public class Company {

    private String nameCompany;

    private Publisher jobAgency;

    public Company(String nameCompany, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(Vacancy vacancy){
        jobAgency.sendOffer(nameCompany, vacancy);
    }

}