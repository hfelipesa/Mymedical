
import model.Doctor;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        showMenu();
        Doctor myDoctor = new Doctor("Felipe Sanchez", "Felipesa@gmail.com", "123456789", "Cardiologia","C1"   );
       myDoctor.addAvailableAppointment(new Date(), "4pm");
       myDoctor.addAvailableAppointment(new Date(), "10am");

        System.out.println(myDoctor);


    }
}