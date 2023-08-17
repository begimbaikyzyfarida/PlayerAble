import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        PlayerAble[] team = {
                new Forwards("Azamat", "Begimbai uulu", LocalDate.of(2004, 12, 22), 185, 80),
                new Defenders("Farida", "Begimbai kyzy", LocalDate.of(2003, 7, 17), 157, 55),
                new Goalkeeper("Bekzat", "Jusupmamatov", LocalDate.of(2013, 7, 7), 165, 60),
                new Trainer("Begimbai", "Maksutov")};

        for (PlayerAble player : team) {
            System.out.println("---------------------------------");
            player.printPlayerInfo();
            System.out.println("Age:"+ player.getYearsComanda());
            System.out.println("---------------------------------");
        }
    }
}
