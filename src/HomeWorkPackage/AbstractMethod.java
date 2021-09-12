package HomeWorkPackage;

public abstract class AbstractMethod {
    public void sayHello(){
        System.out.println("Hello");
    }
    public abstract void sayBye();

    public int add2ints(int num1, int num2) {
        return num1+num2;
    }

    public abstract int sub2Ints(int num1, int num2);




}
