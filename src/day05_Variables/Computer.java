package day05_Variables;

public class Computer {

    /*
    -  brand, processor, ram memory, storage memory, has monitor, has wifi card, description, price, cpu, color, number of monitors, number of usb slots, has usb 3.0
     */

public static void main(String[] args) {


    String brand = "Asus";
    String processor = "Intel";
    Short ramMemory = 16;
    int storageMemory = 516;
    Boolean hasMonitor = true;
    Boolean hasWifiCard = true;
    String description = " The best for you.";
    Double price = 1897.99;
    Double cpu = 3.7;
    String color = " Blu Ocean";
    int numberOfMonitor = 1;
    Short numberOfUsbSlots = 5;
    boolean hasUsb30 = true;

    String general = " \t\tMy new laptop " + "\nBrend: " + brand + " \nProcessor: " + processor + "\nram memory: " + ramMemory + " GB" + "\nStorage: " + storageMemory + " GB " + "\nHas monitor: " + hasMonitor + "\nWIFI Card: " + hasWifiCard + "\nDescription: " + description + "\nPrice: $" + price + "\nCPU: " + cpu + " GHz" + "\nColor: " + color + "\nNumber of monitor: " + numberOfMonitor + "\nNumber of USB slots: " + numberOfUsbSlots + "\nHas USD 3.0: " + hasUsb30;


    System.out.println(general);





}


}
