package mobiles;

public class ModelAndroid extends MobilePhone implements Mobile{
    public ModelAndroid(){

    }
    public String message;
    @Override
    public void unlocking(){
        System.out.println("Please, unlock phone with button 'Unlock'");
    }
    @Override
    public void takeFoto(){
        System.out.println("Press icon 'Camera' for take foto");
    }
    @Override
    public void printMessage(String message){
        this.message = message;
        System.out.println("Message of Android: " + this.message);
    }
    @Override
    public void receiveCall(){
        System.out.println("You need to press green button for receive call");
    }
}
