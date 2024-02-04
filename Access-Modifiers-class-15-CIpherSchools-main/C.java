package accessModifiers2;
import accessModifiers1.A;
public class C extends A{
    public static void main(String[] args) {
        A obj = new A();
        C childObj = new C();
        //System.out.println(obj.x);//default is not accessible outside the package
        System.out.println(childObj.x);//NOT VISIBLE
        //System.out.println(obj.y);//priavte not accessible outside the class
        System.out.println(childObj.y);//NOT VISIBLE
        System.out.println(obj.z);//public is accessible everywhere the object available
        System.out.println(childObj.w);//protected will be visible in different package in subclass, using object of subclass only
    }
}
