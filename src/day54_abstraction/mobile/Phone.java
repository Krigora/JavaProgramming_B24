package day54_abstraction.mobile;

public class Phone  extends MobileApp{
    public static void main(String[] args) {
        MobileApp app1 = new MobileApp();
        app1.setName("Generic");
        app1.setVersion(0.1);
        app1.useApp(10);
        app1.download();

        System.out.println();

        instagram instagram = new instagram();
        instagram.setName("instagram");
        instagram.setVersion(1.1);
        instagram.download();
        instagram.useApp(15);

        System.out.println();


        Discord discord = new Discord();
        discord.setName("discord");
        discord.setVersion(1.4);
        discord.download();
        discord.useApp(15);



    }
}
