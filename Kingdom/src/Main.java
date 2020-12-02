import java.util.List;

public class Main {
    public static void main(String[] args){
        Human human = new Human("pawel");
        Human warior = new Warior("aaaaa",NumberGenerator.generateHealth());
        System.out.println(warior.getName()+" "+warior.health);

        List<ConstructedPerson> list;
        DeathMatch match = new DeathMatch();
        //match.fight(list);
    }

}
