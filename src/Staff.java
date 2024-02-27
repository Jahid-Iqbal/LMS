public class Staff extends Person{

    private int staffId;
    private int salary;
    static int currentStaffId=0;

    public Staff(String name, String address, String password, String phone, int salary){
        super(name,address,password,phone);
        this.salary=salary;
        currentStaffId++;
        this.staffId=currentStaffId;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Salary: "+salary);
        System.out.println("ID: S-"+staffId);
    }
}
