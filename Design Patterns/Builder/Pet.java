package Builder;

public class Pet {

    private String name;
    private Integer level;

    public Pet(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
