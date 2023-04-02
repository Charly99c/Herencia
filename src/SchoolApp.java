public class SchoolApp {
    public static void main(String[] args) {
        Student student1 = new Student("Carlos", "Cuevas", 23, "Adolfo Lopez Mateos", "vegito0924@gmail.com");

        Teacher teacher1 = new Teacher("Martha Maria", "Garcia", 21, "Barrio de los jales", "marthamariagm@gmail.com");

        student1.setControlnumber(22670017);
        student1.setCareer("Ingenieria Informatica");
        student1.setGeneralaverage(95.2);

        System.out.println("Los datos del alumno "+ student1.getName() +" "+ student1.getLastname()+ " son: ");
        System.out.println(student1.getControlnumber());
        System.out.println(student1.getCareer());
        System.out.println(student1.getGeneralaverage());
        System.out.println(student1.getAge());
        System.out.println(student1.getEmail());
        System.out.println(student1.getAdress());
        System.out.println("\n");


        System.out.println("Los datos de de la maestra: "+teacher1.getName()+ " "+teacher1.getLastname());
        System.out.println(teacher1.getAge());
        System.out.println(teacher1.getEmail());

        System.out.println("En el metodo estudiante \n"+student1.toString());
        System.out.println("Soy una persona"+student1.soy());


        System.out.println("En el metodo maestro \n"+teacher1.toString());


        System.out.println("");
    }


}
