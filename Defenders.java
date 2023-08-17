import java.time.LocalDate;

public class Defenders extends Comanda implements PlayerAble,Defender{//защитники
    private String position;


    public Defenders(String firstName, String lastName, LocalDate birthDate, double height, double weight,String position) {
        super(firstName, lastName, birthDate, height, weight);
        this.position = position;
    }

    @Override
    public void printPlayerInfo() {
        super.printPlayerInfo();
        System.out.println("Position: " + position);
    }

    @Override
    public void defenders() {
        System.out.println("Stop attacks during the game and prevent the opposition from scoring");
    }
}
