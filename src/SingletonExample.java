class SingletonExample {

    // private field that refers to the object
    private static SingletonExample singleObject;

    private SingletonExample() {
        // constructor of the SingletonExample class
    }

    public static SingletonExample getSingleObject() {
        return singleObject;
    }

    public static SingletonExample getInstance() {

        // write code that allows us to create only one object
        // access the object as per our need
        return null;
    }
}