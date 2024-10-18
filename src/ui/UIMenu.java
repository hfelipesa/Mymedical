package ui;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {
    public static String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i +". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }

    private  static void Auth(int userType){
        //userType = 1 Doctor
        //userType = 2 Patient
        ArrayList<Doctor> doctorsList = new ArrayList<>();
        doctorsList.add(new Doctor("Felipe sanchez", "felipe@gmail.com", "123456", "Cardiologia","C1"));
        doctorsList.add(new Doctor("Karen sosa", "Karen@gmail.com","123456", "Pediatra","C2"));

        ArrayList<Patient> patientList = new ArrayList<>();
        patientList.add(new Patient());


        if (userType == 1){
            System.out.println("Doctor");
            System.out.println("Enter your speciality");
        }else if (userType == 2){
            System.out.println("Patient");
            System.out.println("Enter your birthday date: dd/mm/yyyy");
        }
    }
}
