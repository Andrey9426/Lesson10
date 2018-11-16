public class Cat extends Animal {
    private String poroda;

    public Cat(boolean isVegan, String food, String poroda) {
        super(isVegan, food);
        this.poroda = poroda;
    }

    public String getPoroda() {
        return poroda;
    }
    public void move(){
        System.out.println("move like a cat");
    }
}