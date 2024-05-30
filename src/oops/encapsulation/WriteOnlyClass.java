package oops.encapsulation;

public class WriteOnlyClass {

    private int a;
    private String company;

    public void setA(int a) {
        this.a = a;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public int getA() {
        return a;
    }

    public String getCompany() {
        return company;
    }
}
