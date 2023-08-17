import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

        Forwards forward=new Forwards("Azamat","Begimbai uulu",LocalDate.of(2004,12,22),185,80,"Forwarder");
        System.out.println(forward);
        forward.printPlayerInfo();
        forward.forwards();
        forward.getYearsComanda();
        System.out.println("-----------------------------------");

        Defenders defender = new Defenders("Farida", "Begimbai kyzy", LocalDate.of(2003, 7, 17), 157, 55,"Defenders");
        System.out.println(defender);
        defender.printPlayerInfo();
        defender.defenders();
        defender.getYearsComanda();
        System.out.println("-----------------------------------");
        Goalkeeper goalkeepers= new Goalkeeper("Bekzat", "Jusupmamatov", LocalDate.of(2013, 7, 7), 165, 60,"Goalkeeper");
        System.out.println(goalkeepers);
        goalkeepers.printPlayerInfo();
        goalkeepers.goalkeeper();
        goalkeepers.getYearsComanda();
        System.out.println("-----------------------------------");
        Trainer trainer =  new Trainer("Begimbai", "Maksutov");
        System.out.println(trainer);
        trainer.getName();
        trainer.getSurname();
        trainer.printPlayerInfo();
    }
}
