package model;

public class Nurse extends User {
    private String speciality;

    public Nurse(String speciality) {
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "speciality='" + speciality + '\'' +
                '}';
    }
}
