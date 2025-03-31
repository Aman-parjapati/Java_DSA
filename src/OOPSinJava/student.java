package OOPSinJava;

public class student {
    public String name;
    private int rol;  // we cant use private modifier with dot operator
//    private class can be accessed within the class

    double scent;
    public int getRol(){
        return 50;
    }
//    public int setRol(int roll){
//        rol = roll;
//        return rol;
//    }
//public int setRol(int rol){
//        rol = rol;
//        return rol;
//}   here see if i create a new datatype name rol and then put the value then system will think that
// that assigned variable is the same one as private var.
public int setRol(int rol){
    this.rol = rol;
    return rol;
}
}
