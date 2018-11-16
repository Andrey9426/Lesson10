public abstract class Animal {
    private boolean isVegatarian;
    protected String food;

    public Animal() {
    }

    public Animal(boolean isVegan, String food) {
        this.isVegatarian = isVegan;
        this.food = food;
    }

    public boolean isVegatarian() {
        return isVegatarian;
    }

    public String getFood() {
        return food;
    }
    public abstract void move();

    public final void printInfo(){
        System.out.println(" я наследую Animal");
    }
}



