package Builder;

public enum Vocation {
    KNIGHT("Knight"),
    PALADIN("Paladin"),
    SORCERER("Sorcerer"),
    DRUID("Druid");

    public final String vocation;

    Vocation(String vocation) {
        this.vocation = vocation;
    }

    public String getVocation() {
        return vocation;
    }
}
