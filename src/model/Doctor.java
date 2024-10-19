package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    private String speciality;
    private String licence;

        //Constructor
    public Doctor(String name,String email, String phoneNumber, String speciality, String licence) {
            super(name, email, phoneNumber);
        }
    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    public String getLicence() {
        return licence;
    }
    public void setLicence(String licence) {
        this.licence = licence;
    }
    //Metodos Comportamiento
    ArrayList<availableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(String date, String time){
        availableAppointments.add(new Doctor.availableAppointment(date, time));
    }
    public ArrayList<availableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }
    //Metodo abstracto data
    @Override
    public void showData() {

    }

    @Override
    public String toString() {
    return super.toString() + "\nSpeciality: " + speciality +
            "\nAvailable: " + availableAppointments.toString() + "\n";
}
    //Clase anidada
    public static class  availableAppointment{
            private int id;
            private Date date;
            private String time;
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public availableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        public Date getDate(String DATE) {
            return date;
        }
        //Sobrecarga de metodo
        public String getDate(){
            return format.format(date);
        }

        public String getTime() {
            return time;
        }

       @Override
       public String toString() {
       return "availableAppointment{\n" +
            "date=" + date + ",\n" +
            "time='" + time + '\'' +
            "\n}";
       }
    }

}

