public class Customer {
    private String name;
    private String appointment;
    private boolean hasCredit;

    public Customer(String name, String appointment, boolean hasCredit){
        setName(name);
        setAppointment(appointment);
        hasCredit = Credit.hasCredit();
    }
    public Customer(){

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

    public boolean hasCredit(){
        return  hasCredit;
    }
    public void hasCredit(boolean hasCredit){
        this.hasCredit = hasCredit;
    }

}
