package kz.kaznu.nurali.HW4;

public class User {
    private String surname;
    private String name;
    private String FathersName;
    private int BirthYear;
    private String email;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathersName() {
        return FathersName;
    }

    public void setFathersName(String fathersName) {
        FathersName = fathersName;
    }

    public int getBirthYear() {
        return BirthYear;
    }

    public void setBirthYear(int birthYear) {
        BirthYear = birthYear;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }






    public User(String surname, String name, String FathersName, int birthYear, String email){
        this.surname = surname;
        this.name = name;
        this.FathersName = FathersName;
        this.BirthYear = birthYear;
        this.email = email;
    }

    public void info() {
        System.out.println("Surname: " + surname + "\nName: " + name +
                "\nFather's name: " + FathersName + "\nBirth Year: " + BirthYear +
                "\nEmail: " + email);
        System.out.println();

    }


}
