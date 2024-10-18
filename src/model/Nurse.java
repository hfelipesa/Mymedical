package model;

public class Nurse extends User {
    private String speciality;

    public Nurse(String name, String email, String phoneNumber) {
        super(name, email, phoneNumber);
        this.speciality = speciality;
    }
    public String getSpeciality() {
        return speciality;
    }

    //Metodo abstracto data
    @Override
    public void showData() {
        System.out.println("Empleado del Hospital: Cruz Roja");
        System.out.println("Departamento: Nutricion");
    }
}
