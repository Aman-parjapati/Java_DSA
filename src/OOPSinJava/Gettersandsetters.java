package OOPSinJava;

public class Gettersandsetters {
    public static void main(String[] args) {
        student s= new student();
//        s.rol;
//        here we can see that if we try to access private modifier then it will show error
//        also private modifier cant be accessed with the help of dot operator
//        but if call getter ---> getRol()
        System.out.println(s.getRol());
//         here this will give the op of the private modifier rol
        System.out.println(s.setRol(76));
    }
}
