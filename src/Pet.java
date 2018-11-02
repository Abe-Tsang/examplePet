public class Pet {
    private String name;
    public Pet(){
    }
    public Pet(String _name){
        name = _name;
    }
    public void setName(){

    }
    public String toString(){
        return name;
    }

}
class Cat extends Pet{
    private String name;
    public Cat(String _name){
        name = _name;
    }
    public void meow(){
        System.out.println("Meow!!!");
    }

}
class Dog extends Pet{
    public void woof(){
        System.out.println("Woof!!!");
    }
}
class Hamster extends Pet{
    public void squeal(){
        System.out.println("Squeal!!!");
    }
}