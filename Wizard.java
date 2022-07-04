public class Wizard {
    // instance Fields
    String name;
    int health = 100;
    int magicPower;
    int luck;
    boolean evil;

    // power validation
    public int powerValidation(int powerArgu){
        if(powerArgu>10){
            return 1;
        } else {
            return powerArgu;
        }
    }
// constructor

    public Wizard(String name, int magicPower, boolean evil){
        this.name = name;
        this.magicPower = powerValidation(magicPower);
        // or validation using:
        // this.magicPower = magicPower>10?1: magicPower?
        this.evil = evil;
        this.luck = createLuck();
        // this.health = 100; you can define the default here too

    }
// generate luck:
    public int createLuck(){
        this.luck = (int)(Math.random()*7 +1);
        return this.luck;
    }

    // attack spell

    public void attack(Wizard obj){
        System.out.println(this.name + " attacks " + obj.name);
        createLuck();
        obj.health -= this.magicPower*this.luck;
        healthCheck(obj);
    }
    //heal spell
    public void heal(){
         this.health += this.magicPower*createLuck();

    }
    // health check
    public void healthCheck(Wizard obj){
        if(obj.health<=0){
            System.out.println( obj.name + " is dead");
            System.exit(0);
        }
    }
    public static void main(String [] args){
    }
}