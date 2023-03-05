package OOPS.Encapsulation;

public class PersonExample {
   private String name;
    private String Gender;
    private int age;
    private String Occupation;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equalsIgnoreCase("Gul"))
        {
            this.name = name;
        }
        else {
            System.out.println("You have provided Incorrect Name or Pwd or You are not authorised");
        }


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

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String occupation) {
        Occupation = occupation;
    }
}
