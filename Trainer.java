public class Trainer implements PlayerAble {
    private String name;
    private String surname;

    public Trainer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public void printPlayerInfo() {
        System.out.println("Name Trainer: " + name + " " + surname);
    }

    @Override
    public int getYearsComanda() {
        return 45;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
