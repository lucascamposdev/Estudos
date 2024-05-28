package Builder;

public class Main {
    public static void main(String[] args) {


        Character newCharacter = new CharacterBuilder()
                .setName("Lucas")
                .setLevel(1)
                .setVocation(Vocation.DRUID)
                .setPet("Rocky", 1)
                .setSpells("Exura", 20)
                .setSpells("Exori Flam", 40)
                .setSpells("Exevo Vis Hur", 60)
                .build();

        System.out.println(newCharacter);

    }
}
