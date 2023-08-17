import java.time.LocalDate;

public class Forwards extends Comanda implements PlayerAble,Forward {//нападающие
    private String position;

    public Forwards(String firstName, String lastName, LocalDate birthDate, double height, double weight, String position) {
        super(firstName, lastName, birthDate, height, weight);
        this.position = position;
    }

    @Override
    public void printPlayerInfo() {
        super.printPlayerInfo();
        System.out.println("Position: " + position);
    }

    @Override
    public void forwards() {
        System.out.println("Player responsible for turning the team's efforts into goals and winning them the games");
    }
}
