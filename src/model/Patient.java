package model;

public class Patient extends User {
    private String birthDate;
    private String bloodType;
    private String weight;
    private String height;

    public Patient(String name,String email, String phoneNumber, String birthDate, String bloodType, String weight, String height) {
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
