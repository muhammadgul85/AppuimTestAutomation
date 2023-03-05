package OOPS.Inheritance;

public class CallingEmployees {
    public static void main(String[] args) {
        ManagerEmployee managerEmployee = new ManagerEmployee();
        ContractEmployee contractEmployee = new ContractEmployee();
        PermanentEmployee permanentEmployee = new PermanentEmployee();
        managerEmployee.setName("Manager");
        permanentEmployee.setName("Permanent");
        contractEmployee.setName("Contract");
        managerEmployee.setNoOfworkingDays(4);
        permanentEmployee.setNoOfworkingDays(40);
        contractEmployee.setNoOfworkingDays(20);
        managerEmployee.setAssignedDepartment("Finance");
        permanentEmployee.setNoOfhares(220);

    }
}
