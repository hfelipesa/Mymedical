package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {
    public static void showPatientMenu(){
        int response = 0;
        do {

            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome: "+UIMenu.patientLogged.getName());

            System.out.println("1. Book an appointment");
            System.out.println("2. My Appointments");
            System.out.println("0. return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    showPatientMyAppointments();
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        }while (response != 0);
    }


    private static void showBookAppointmentMenu(){
        int response = 0;
        do {

            System.out.println("Book an appointment");
            System.out.println(":: Select date: ");
            //Numeracion de la lista de fechas
            //Indice de la fecha seleccionada
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k=0;
            for (int i=0; i<UIDoctorMenu.doctorsAvailableAppointments.size();i++){
                ArrayList<Doctor.availableAppointment> availableAppointments
                        =UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();

                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();
                for (int j=0; j<availableAppointments.size();j++){
                    k++;
                    System.out.println(k + ". " +availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j),UIDoctorMenu.doctorsAvailableAppointments.get(i));

                    doctors.put(Integer.valueOf(k), doctorAppointments);
                }
            }
            Scanner sc= new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());


            Map<Integer, Doctor> doctorMap  = doctors.get(responseDateSelected);
            Integer indexDate= 0;
            Doctor doctorSelected = new Doctor("","", "", "", "");
            for (Map.Entry<Integer, Doctor> doc:doctorMap.entrySet()){
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
            }

            System.out.println(doctorSelected.getName() + ". Time " +
                    doctorSelected.getAvailableAppointments().get(indexDate).getTime());

            System.out.println("Confirm your appointment: \n1. Yes \n2. Change Data");
            response = Integer.valueOf(sc.nextLine());

            if (response ==1){
                UIMenu.patientLogged.addAppointmentDoctors(
                        doctorSelected,
                        doctorSelected.getAvailableAppointments().get(indexDate).getDate(null),
                        doctorSelected.getAvailableAppointments().get(indexDate).getTime());

                showPatientMenu();

            }




        }while (response != 0);
    }

    private static void showPatientMyAppointments(){
        int response =0;
        do {
            if (UIMenu.patientLogged.getAppointmentDoctors().size() == 0){
                System.out.println("Don't have appointments");

                for (int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i++) {
                    int j = i+1;
                    System.out.println(j + " ."+
                            UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor().getName() +
                            " .Date: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate() +
                            " .Time: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime());
                    
                }
                System.out.println("0. Return");
            }

        }while (response != 0);
    }
}

