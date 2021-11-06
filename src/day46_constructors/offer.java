package day46_constructors;

public class offer {

    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numberOfPTO;

    public offer(String company, double salary, boolean isFullTime){
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public offer(String location, String company, double salary, boolean isFullTime, int numberOfPTO){
      this.location = location;
      this.company = company;
      this.salary = salary;
      this.isFullTime = isFullTime;
      this.numberOfPTO = numberOfPTO;



    }

    @Override
    public String toString() {
        return "offer{" +
                "location='" + location + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                ", numberOfPTO=" + numberOfPTO +
                '}';
    }
}

/*
String s= "java"
s.charAT(0) -> j

s.substring(1.2) -> a
 */