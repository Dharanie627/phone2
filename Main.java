// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Land_Phone obj1 = new Land_Phone("Land Phone",1999);
        Button_Phone obj2 = new Button_Phone("Button Phone",2007,"Nokia","Mobile");
        Smart_Phone obj3 = new Smart_Phone("Smart Phone",2023,"Apple","Dialog","Iphone 15 pro");


        System.out.println(" ");
        obj1.Call();
        System.out.println("  ");

        obj2.Call();
        obj2.SMS();
        obj2.Radio();
        System.out.println("  ");

        obj3.Call();
        obj3.SMS();
        obj3.Radio();
        obj3.Online_Streaming();

    }
}