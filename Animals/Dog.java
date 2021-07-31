package Animals;

public abstract class Dog extends Animals{

    public Dog(int maxRun, int maxSwim) {
        super(maxRun, maxSwim);
    }

    public Dog() {
        this(500,20);
    }

    @Override
    public void run(int distance) {
        if(getMaxRun()<=distance){
            System.out.println("Собака пробежала "+ distance);
        }else {
            System.out.println("У собаки не хватит сил...");
        }


    }

    @Override
    public void swim(int distance) {
        if(getMaxRun()<=distance){
            System.out.println("Собака проплыла "+ distance);
        }else {
            System.out.println("У собаки не хватит сил...");
        }

    }
}
