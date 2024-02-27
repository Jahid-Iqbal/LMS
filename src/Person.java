public class Person {
    private String name;
    private String address;
    private String password;
    private String phone;
    static int totalEmp=0;

    public Person(String name, String address, String password, String phone){
        this.name=name;
        this.address=address;
        this.password=password;
        this.phone=phone;

        totalEmp++;

    }

    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }

    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPassword(){
        return password;
    }
    public String getPhone(){
        return phone;
    }

    public void print(){
        System.out.println("-----------------------------------------");
        System.out.println("Details");
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Password: "+password);
        System.out.println("Phone: "+phone);
    }

}
