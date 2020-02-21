package classes;

public class SingletonJavaText {
    public static void main(String[] args) {
        //SingletonJava singletonJava = new SingletonJava();
        SingletonJava.getNewInstance().color = "blue";
        System.out.println(SingletonJava.getNewInstance().color);
        SingletonJava.getNewInstance().color = "red";
        System.out.println(SingletonJava.getNewInstance().color);
    }
}
