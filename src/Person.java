public class Person {


    private String name;
    private String lastname;
    private int age;
    private String adress;
    private String email;


public Person(){

}

public Person(String name, String lastname, int age, String adress, String email){
    this.name = name;
    this.lastname=lastname;
    this.age=age;
    this.adress=adress;
    this.email=email;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //metodo soy

    public String soy(){
    return"Soy una persona";
    }
}
