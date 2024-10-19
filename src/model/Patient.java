package model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {

    private String birthDate;
    private String bloodType;
    private String weight;
    private String height;

    private ArrayList<AppoinntmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppoinntmentNurse> appointmentNurses = new ArrayList<>();

    public ArrayList<AppoinntmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppoinntmentDoctor appointmentDoctor = new AppoinntmentDoctor(this, doctor);
        appointmentDoctor.schedule(date, time);
        appointmentDoctors.add(appointmentDoctor);

    }

    public ArrayList<AppoinntmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppoinntmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    public Patient(String name, String email, String phoneNumber) {
        super(name, email, phoneNumber);
        this.birthDate = birthDate;
        this.bloodType = bloodType;
        this.weight = weight;
        this.height = height;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }



    @Override
    public String toString() {
        return "Patient{" +
                "bloodType='" + bloodType + '\'' +
                ", weight='" + weight + '\'' +
                ", height='" + height + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
    //Metodo abstracto data
    @Override
    public void showData() {
    }
    //Metodos Compartamiento


}
