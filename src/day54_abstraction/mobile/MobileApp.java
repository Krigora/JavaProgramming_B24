package day54_abstraction.mobile;

public class MobileApp {

   private String name;
   private double version;

   public void download(){
       System.out.println("Downloading version " + version + " of " + name);
   }

   public void useApp(int minutes){
       System.out.println("using for " + name + " for " + minutes + "minutes");
   }
//  encapsulate - Generate -> Getter and Setter ->
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }
}

/*
task
create a class MobileApp
instance variable:
name, version;
instance method:
use App()
encapsulate
 */