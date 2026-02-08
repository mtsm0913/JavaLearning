class AnimalManager {
    private String[] animals;
    public AnimalManager(String[] animals) {
        this.animals = animals;
    }
    public String[] getAnimals() {
        return this.animals;
    }
    public void printAnimals() {
        for(String a: animals)
            System.out.print(a + " ");
    }
}
class Test14_14 {
    public static void main(String[] args) {
        String[] animals = new String[args.length];
        animals = args;
        AnimalManager am = new AnimalManager(animals);
        am.printAnimals();
    }
}