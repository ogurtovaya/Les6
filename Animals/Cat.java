package Animals;

public abstract class Cat extends Animals {


    public Cat(int maxRun) {
        super(maxRun, -1);
    }

    public Cat() {
        this(200);
    }

    @Override
    public void run(int distance) {
        if(getMaxRun()<=distance){
            System.out.println("Кот пробежал "+ distance);
        }else {
            System.out.println("У кота не хватит сил...");
        }

    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты плавать не умеют");

    }
}

