package Builder;

public class CharacterBuilder {

    private final Character character;

    public CharacterBuilder() {
        this.character = new Character();
    }

    public CharacterBuilder setName(String name){
        this.character.setName(name);

        return this;
    }

    public CharacterBuilder setLevel(Integer level){
        this.character.setLevel(level);

        return this;
    }

    public CharacterBuilder setVocation(Vocation vocation){
        this.character.setVocation(vocation);

        return this;
    }

    public CharacterBuilder setPet(String name, Integer level){
        Pet newPet = new Pet(name, level);
        this.character.setPet(newPet);

        return this;
    }

    public CharacterBuilder setSpells(String name, Integer damage){
        Spell newSpell = new Spell(name, damage);

        this.character.getSpells().add(newSpell);

        return this;
    }


    public Character build(){
        return this.character;
    }
}
