package wsblearning.start;

public class Person {

    private String firstname;
    private String lastname;
    private int age;
    private String city;


    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Person(String firstname, String lastname, int age, String city) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.city = city;
    }

    public String getFullname(){
        return this.firstname+" "+this.lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

}
