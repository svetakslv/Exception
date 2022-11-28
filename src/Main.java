public class Main {

    public static void main(String[] args) {
        boolean success = Data.validate("kiko_","kIkO12345", "kIkO12345");
        if(success){
            System.out.println("Данные введены верно");
        } else {
            System.out.println("Данные введены не верно");
        }
    }
}