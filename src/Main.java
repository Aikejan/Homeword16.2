import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        Backend[] backend = {new Java(),
                            new CSharp(),
                            new Python()};


        for (Backend  backend1: backend) {
            System.out.println(backend1.toString());
            System.out.println(backend1.getClass());
            boolean isIt = backend1 instanceof Backend;
            System.out.println(isIt);



    }
}
    }


