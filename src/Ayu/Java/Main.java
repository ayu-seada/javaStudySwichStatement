package Ayu.Java;

public class Main {

    public static void main(String[] args) {
	int swichValue = 4;
	switch (swichValue){
	    case 1:
        System.out.println("value was 1");
        break;
        case 2:
            System.out.println("value was 2");

        case 3:case 4:case 5:
            System.out.println("value was 3 or 4 or 5");
            System.out.println("actually value is "+ swichValue);
            break;
        default:
            System.out.println("was not 1 or 2");
	}


  }
}
