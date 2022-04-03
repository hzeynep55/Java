public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    int Sans;

    public Fighter(String name, int damage, int health, int weight, double dodge,int Sans) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
        this.Sans=Sans;


    }

    public int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");

        if(foe.dodge()){
            System.out.println(foe.name+" gelen hasarı vurdu");
            return foe.health;
        }

        if(foe.health-this.damage<0){
            return 0;
        }

        return foe.health-this.damage;

    }
    public boolean dodge(){
        double randomVaele=Math.random()*100;
        return randomVaele<=this.dodge;

    }
    public boolean isSans(){
        double randomValue=Math.random()*100;
        return randomValue<=this.Sans;
    }

}
