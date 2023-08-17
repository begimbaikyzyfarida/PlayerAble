import java.time.LocalDate;

public class Goalkeeper extends Comanda implements PlayerAble,Goalkeepers {//вратарь
    private String position;

    public Goalkeeper(String firstName, String lastName, LocalDate birthDate, double height, double weight,String position) {
        super(firstName, lastName, birthDate, height, weight);
        this.position = position;
    }

    @Override
    public void printPlayerInfo() {
        super.printPlayerInfo();
        System.out.println("Position: " + position);
    }
    @Override
    public void goalkeeper() {
        System.out.println("Responsible for scoring goals on behalf of their team");

    }
}
