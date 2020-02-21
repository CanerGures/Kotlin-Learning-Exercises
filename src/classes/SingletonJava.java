package classes;

class SingletonJava {
    private static SingletonJava newInstance = null;
    public String color = "";

    private SingletonJava() {

    }

    public static SingletonJava getNewInstance() {

        if (newInstance == null) {
            newInstance = new SingletonJava();
        }
        return newInstance;
    }

}
