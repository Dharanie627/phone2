public class Button_Phone extends Land_Phone {

    //**Attribues**

    //-name
    //-Year
    //-Sim type
    //-Brand
    //-Sim Brand

    //**Method**

    //-Call
    //-SMS
    //-Radio

    String Brand;
    String Sim_Brand;


    Button_Phone(String name,int Year,String Brand, String Sim_Brand){
        super(name,Year);

        this.Brand = Brand;
        this.Sim_Brand = Sim_Brand;
    }

    void SMS(){
        System.out.println("By using "+name+" we can send SMS");
    }
    void Radio(){
        System.out.println("By using "+name+" we can listen to the Radio");
    }

}
