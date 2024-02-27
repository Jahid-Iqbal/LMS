public class SupportStaff extends Staff{
    private String category;
    public SupportStaff(String name, String address, String password, String phone, int salary){
        super(name,address,password,phone,salary);
        category="Floor cleaner";
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Category: "+category);
    }
}
