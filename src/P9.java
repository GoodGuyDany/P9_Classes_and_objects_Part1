import java.util.Optional;

// Part 1
    // 1.1
class MyClass {
     public int age;
     public String name;

    public void setAge(int age) {
        this.age = age;
        System.out.println("Age has been created!");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Name has been created!");
    }
    // 1.5
    public void printMyClass(){
        System.out.println("Your name is: " + name + " And your age is: " + age);
    }
 }
    // 1.2
 class MyClassWithMethod {
     public void print(String str) {
         System.out.print(str);
     }

 }
    class MyPrivateClass {
    // 1.3
        private void printMyPrivateClass() {
            System.out.println(name1 + age1);
        }
    // 1.6
        private int age1;
        private String name1;
        public void publicPrintMyPrivateClass(){
            System.out.println(name1 + " " + age1);
        }
    // 1.4
        public MyPrivateClass(int age1In, String name1In) {
            name1 = name1In;
            age1 = age1In;

    }

 }
    // 1.7
 class MyPrivateClass2{
    private int ageP;
    private String nameP;
    private double temperatureP;
    private boolean isSickP;
    public void setAgeP(int inputageP){
        ageP = inputageP;
    }
    public void setNameP(String  inputnameP){
        nameP = inputnameP;
    }
    public void setTemperatureP(double inputtemperatureP){
        temperatureP = inputtemperatureP;
    }
    public void setisSickP(boolean inputissick){
        isSickP = inputissick;
    }
    public int getAgeP(){
        return ageP;
    }
    public String  getNameP(){
        return nameP;
    }
    public double getTemperatureP(){
        return temperatureP;
    }
    public boolean getisSickP(){
        return  isSickP;
    }
 }

 class P9{
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.setAge(19);
        obj.setName("Dame");
        obj.printMyClass();
        System.out.println(obj.name + " " + obj.age);
        MyClassWithMethod obj2 = new MyClassWithMethod();
        obj2.print("Printing method test");
        System.out.println("");
        MyPrivateClass objP = new MyPrivateClass(11, "Kia");
//Error
//      objP.printMyPrivateClass();
        objP.publicPrintMyPrivateClass();
//Error 2
//      System.out.println(objP.name1);
        MyPrivateClass2 objN = new MyPrivateClass2();
        // 1.8
        objN.setAgeP(19);
        objN.setNameP("Tester");
        objN.setTemperatureP(36.6);
        objN.setisSickP(false);
        System.out.println("The subject's name is: " + objN.getNameP() + " The subject's age is: " + objN.getAgeP() + " The subject's temperature is: " + objN.getTemperatureP() + " Is the subject sick?: " + objN.getisSickP());
    }
}
