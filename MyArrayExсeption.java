public abstract class MyArrayExсeption extends Exception {

    private int lengh;
    private int hight;
    private String data;

    public int getLengh() {
        return lengh;
    }

    public int getHight() {
        return hight;
    }

    public String getData() {
        return data;
    }

    public MyArrayExсeption(String message, int lengh, int hight, String data) {
        super(message);
        this.lengh = lengh;
        this.hight = hight;
        this.data = data;
    }
}

