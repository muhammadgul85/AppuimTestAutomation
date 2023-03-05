package OOPS.Inheritance;

public class BaseClassEmployee {
    private String name;
    private String Gender;
    private int age;
    private int employeeID;
    private boolean isCovidTestDone ;
    private int noOfworkingDays;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public boolean isCovidTestDone() {
        return isCovidTestDone;
    }

    public void setCovidTestDone(boolean covidTestDone) {
        isCovidTestDone = covidTestDone;
    }

    public int getNoOfworkingDays() {
        return noOfworkingDays;
    }

    public void setNoOfworkingDays(int noOfworkingDays) {
        this.noOfworkingDays = noOfworkingDays;
    }
}
