import java.time.LocalDate;

public abstract class Comanda implements PlayerAble {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private double height;
    private double weight;

    public Comanda(String firstName, String lastName, LocalDate birthDate, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.height = height;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void printPlayerInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
    }

    public int getYearsComanda() {
        LocalDate currentDate = LocalDate.now();
        int years = currentDate.getYear() - birthDate.getYear();
        return years;
    }

    @Override
    public String toString() {
        return "Comanda{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
