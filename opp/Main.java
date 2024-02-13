package opp;

public class Main {
    public static void main(String[] args) {
        CreditManager creditManager = new CreditManager();  //instance creation

        Company company1 = new Company(1,"Kocaeli","Wide Spectrums",120231);
        Person person1 = new Person(2,"İstanbul","Burak","Anadol","Turkish");

        //
        CustomerManager customerManager = new CustomerManager(company1,new MilitaryCreditManager());
        customerManager.giveCredit();

        person1.setCity("Burak");

    }
}