package accessModifiers2;
import accessModifiers1.A;
public class D {
    public static void main(String[] args) {
        A obj = new A();
        //System.out.println(obj.x);//default is not accessible outside the package
        //System.out.println(obj.y);//priavte not accessible outside the class
        System.out.println(obj.z);//public is accessible everywhere the object available
        System.out.println(obj.w);//protected will not be accessible outside package in non-subclass
    }
}
