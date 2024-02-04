package accessModifiers1;

public class B {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.x);//default is accessible in same package
        //System.out.println(obj.y);//priavte not accessible outside the class
        System.out.println(obj.z);//public is accessible everywhere the object available
        System.out.println(obj.w);
    }
}
