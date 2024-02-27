public class Main {

    public static void main(String[] args) {
        Person person= new Person("Jahid","Uttara","asdf","0175");
        Person person2= new Person("Iqbal","Uttara","asdf","0175");
        Staff staff= new Staff("Iqbal","Uttara","asdf","0175",2500);
        Officer officer= new Officer("Iqbal","Uttara","asdf","0175",2500);
        SupportStaff ss= new SupportStaff("Abdullah","Uttara","asdf","0175",2500);

        ss.print();
    }

}
