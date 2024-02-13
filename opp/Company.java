package opp;

public class Company extends Customer{
    private String companyName;
    private int taxNumber;

    public Company(int id, String city, String companyName, int taxNumber) {
        super(id, city);
        this.companyName = companyName;
        this.taxNumber = taxNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(int taxNumber) {
        this.taxNumber = taxNumber;
    }
}
