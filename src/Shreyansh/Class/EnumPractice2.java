package Shreyansh.Class;

// enum with custom values.

enum PaymentStatus{
    PENDING("Payment Initiated"),
    SUCCESS("Payment Successful"),
    FAILED("Payment Failed");

    private String message;

    PaymentStatus(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}

public class EnumPractice2 {
    public static void main(String[] args) {

        for(PaymentStatus status : PaymentStatus.values()){
            System.out.println(status.name() + "->" + status.getMessage());
        }
    }

}
