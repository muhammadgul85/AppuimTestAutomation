package Generic;

public class StoreValue {

    private Double salary;
    private Integer value;

    public StoreValue(Integer value)
    {
        this.value = value;
    }

    public Integer getValue()
    {
        return value;
    }

    public StoreValue(Double salary)
    {
        this.salary = salary;

    }
    public Double getSalary()
    {
        return salary;
    }
}
