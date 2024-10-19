package model;

import java.util.Date;

public class AppoinntmentDoctor implements ISchedulable {
    private int id;
    private Patient patient;
    private Doctor doctor;
    private Date date;
    private String time;


    public AppoinntmentDoctor(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
    }

    public int getId() {
        return id;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Date getDate() {
        return date;
    }

    public String getTime() {
        return time + " hrs.";
    }

    @Override
    public void schedule(Date date, String time) {
        this.date = date;
        this.time = time;

    }
}
