public class Student extends Person {

    private int controlnumber;
    private String career;
    private double generalaverage;


    public Student(){

    }

    public Student(String name, String lastName, int age, String adress, String email){
        super(name, lastName, age, adress, email);
    }

    public Student(String name, String lastname, int age, String adress, String email, int controlnumber, String career, double generalaverage) {
        super(name, lastname, age, adress, email);
        this.controlnumber = controlnumber;
        this.career = career;
        this.generalaverage = generalaverage;
    }

    public int getControlnumber() {
        return controlnumber;
    }

    public void setControlnumber(int controlnumber) {
        this.controlnumber = controlnumber;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public double getGeneralaverage() {
        return generalaverage;
    }

    public void setGeneralaverage(double generalaverage) {
        this.generalaverage = generalaverage;
    }


    public String toString() {
        return "\nEl alumno\n"+getName()+"\n"+getLastname()+"\ncon numero de control\n"+getControlnumber()+",\ncorrero electronico\n"+getEmail()+"\n"+" y direccion\n"+getAdress();

    }
    public String soy(){
        return " y studiante";
    }
}