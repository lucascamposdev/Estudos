package Builder;

public class Spell {

    private String name;
    private Integer damage;

    public Spell(String name, Integer damage) {
        this.name = name;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Spell{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                '}';
    }
}
