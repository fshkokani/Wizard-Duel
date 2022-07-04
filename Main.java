class Main {

    public static void main(String[] args) {
        Wizard good = new Wizard("Gandalf", 10, false);
        Wizard evil= new Wizard("Saruman", 10, true);
        // round 1
        good.attack(evil);
        evil.heal();
        evil.attack(good);
        good.heal();
        System.out.println(good.name + " health is at " + good.health + " and " + evil.name + " health is at " + evil.health);

        // round 2
        good.attack(evil);
        evil.heal();
        evil.attack(good);
        good.heal();
        System.out.println(good.name + " health is at " + good.health + " and " + evil.name + " health is at " + evil.health);

        // round 3
        good.attack(evil);
        evil.heal();
        evil.attack(good);
        good.heal();
        System.out.println(good.name + " health is at " + good.health + " and " + evil.name + " health is at " + evil.health);
        // determine the winner
        if(good.health>= evil.health){
            System.out.println(good.name + " wins!");
        } else {
            System.out.println(evil.name + " wins!");
        }
    }
}