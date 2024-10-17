package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
        private String speciality;
        private String licence;

        //Constructor
        public Doctor(String name,String email, String phoneNumber, String speciality, String licence) {
            super(name, email, phoneNumber);
            System.out.println("Los datos del doctor asignado: ");
            this.speciality = speciality;
            this.licence = licence;
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
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new availableAppointment(date, time));
    }
    public ArrayList<availableAppointment> getAvailableAppointments(){
        return availableAppointments;
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

        public availableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public Date getDate() {
            return date;
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

