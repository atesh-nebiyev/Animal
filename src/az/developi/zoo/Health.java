package az.developi.zoo;

public class Health {
    private int health;

    public Health(int health) {
        if(!(health>0 && health<=10)){
            throw new RuntimeException(health + " exceeds range");

        }
        this.health = health;
    }
    public int getHealth(){
        return this.health;
    }
    public void decreaseHealth(){

    }
}
