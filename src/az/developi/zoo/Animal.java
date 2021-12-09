package az.developi.zoo;

public abstract class Animal {
    private int age;
    private Gender gender;
    private String[] eats;
    private Health health;
    private int lifeExpentancy;


    public Animal(int age, Gender gender, String[] eats, Health health, int lifeExpentancy) {
        this.age = age;
        this.gender = gender;
        this.eats = eats;
        this.health = health;
        this.lifeExpentancy = lifeExpentancy;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;

    }

    public int getLifeExpentancy() {
        return lifeExpentancy;
    }
    public boolean canEat(String food){
        for(String eatenFood : this.eats){
            if(eatenFood.equalsIgnoreCase(food)){
                return true;
            }
        }
        return false;
    }
    public abstract void eat();

    public abstract void treat();

    public abstract boolean aMonthPasses();
}
