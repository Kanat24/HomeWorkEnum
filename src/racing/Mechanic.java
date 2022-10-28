package racing;

import java.util.List;

public class Mechanic <T extends Transport> {
    private String firstAndLastName;
    private String company;

    public Mechanic(String firstAndLastName, String company) {
        this.firstAndLastName = firstAndLastName;
        this.company = company;
    }

    public String getFirstAndLastName() {
        return firstAndLastName;
    }

    public void setFirstAndLastName(String firstAndLastName) {
        this.firstAndLastName = firstAndLastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean carryOutMaintenance(T t){
        return t.passDiagnostics();
    }
    public void fixCar(T t){
        System.out.println("Машина починена");
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "firstAndLastName='" + firstAndLastName + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
