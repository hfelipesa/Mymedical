package model;

import java.util.Date;

public class AppoinntmentNurse implements ISchedulable {
    private int id;
    private Nurse nurse;
    private Patient patient;
    private Date date;
    private String time;

    public AppoinntmentNurse(Nurse nurse, Patient patient) {
        this.nurse = nurse;
        this.patient = patient;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void schedule(Date date, String time) {

    }

}
