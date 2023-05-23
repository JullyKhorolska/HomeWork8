package checkMobile;
import mobiles.ModelAndroid;
import mobiles.ModelIos;

public class CheckMobile {
    public static void main(String[] arg) {
        ModelAndroid mobileAndroid = new ModelAndroid();
        ModelIos mobileIos = new ModelIos();

        mobileIos.printMessage("Hello, I'm Iphone");
        mobileAndroid.printMessage("Hello, I'm Samsung");
        System.out.println("----------------------------");

        mobileIos.unlocking();
        mobileAndroid.unlocking();
        System.out.println("----------------------------");

        mobileIos.receiveCall();
        mobileAndroid.receiveCall();
        System.out.println("----------------------------");

        mobileIos.takeFoto();
        mobileAndroid.takeFoto();
        System.out.println("----------------------------");
    }
}
