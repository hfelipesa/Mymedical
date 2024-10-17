package model;

public class User {
    public static Integer id = 0;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;

    public User(String name, String email,String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 10) {
            System.out.println("El numero de digitos maximo permitido es 10");
        } else if (phoneNumber.length() < 10) {
            this.phoneNumber = phoneNumber;
        }
    }

        @Override
        public String toString() {
         return "User: " + name + ",\nEmail: " + email +
            "\nAddress: " + address + ",\nPhone: " + phoneNumber;
         }
}
