public class Officer extends Staff{

    private int deskNo;
    static int currentDesk=0;

    public Officer(String name, String address, String password, String phone, int salary){
        super(name,address,password,phone,salary);
        currentDesk++;
        deskNo=currentDesk;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("Desk no: emp-"+ deskNo);
    }
}
