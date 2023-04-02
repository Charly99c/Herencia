public class Teacher extends Person {

    public Teacher() {
    }

    public Teacher(String name, String lastname, int age, String adress, String email){
        super(name, lastname, age, adress, email);
    }
public String toString(){
        return "El maestro "+getName()+" "+getLastname()+" de edad"+getAge()+" con direccion "+getAdress() + " y correo "+getEmail();
}

public String soy(){
        return " y maestro";
}
}
