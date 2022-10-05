public class Customer {
    String name;
    String appointment;

    public Customer(String name, String appointment){
        getName();
        getAppointment();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAppointment(){
        return appointment;
    }

    public void setAppointment(String appointment){
        this.appointment = appointment;
    }
}
