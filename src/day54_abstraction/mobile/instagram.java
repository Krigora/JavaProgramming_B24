package day54_abstraction.mobile;

public class instagram extends MobileApp{

    public void postPhoto(){
        System.out.println("Posting photo");
    }
    @Override
    public void useApp (int minute){
        super.useApp(minute);
        postPhoto();
    }



}
