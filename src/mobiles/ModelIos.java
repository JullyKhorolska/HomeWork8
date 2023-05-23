package mobiles;
public class ModelIos extends MobilePhone implements Mobile{
    public String message;
    @Override
    public void unlocking(){
        System.out.println("Please, unlock phone with faceId");
    }
    @Override
    public void takeFoto(){
        System.out.println("Press icon 'Foto' for take foto");
    }
    @Override
    public void printMessage(String message){
        this.message = message;
        System.out.println("Message of IOs: " + this.message);
    }
    @Override
    public void receiveCall(){
        System.out.println("You need to touch screen for receive call");
    }
}
