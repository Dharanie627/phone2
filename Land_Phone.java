import javax.lang.model.element.Name;

public class Land_Phone {

    String name;
    int Year;

    Land_Phone(String name,int Year){
        this.name = name;
        this.Year = Year;
    }

    void Call(){
        System.out.println(name+" can Call...");

    }

}
