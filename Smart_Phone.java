public class Smart_Phone extends Button_Phone {
    //**Attributes**

    //-Camera
    //-Number of Apps

    //**Method**

    //-Online Streaming
    //-Camera
    //-Games
    //-Online conferencing

    String Model;

    Smart_Phone(String name,int Year, String Brand,String Sim_Brand, String Model){
        super(name,Year,Brand,Sim_Brand);
        this.Model = Model;
    }

    void Online_Streaming(){
        System.out.println("By using "+ name +"we can Stream Online");
    }
}
