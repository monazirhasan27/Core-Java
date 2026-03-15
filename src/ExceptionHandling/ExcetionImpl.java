package ExceptionHandling;

class InvalidEmailException extends RuntimeException{

    InvalidEmailException(String message){
        super(message);
    }
}

public class ExcetionImpl {

    static void validateUser(String email){

        if(email == null || !email.contains("@")){
            throw new InvalidEmailException("Not a Valid Email");
        }

        System.out.println("Valid Email");
    }

    public static void main(String[] args) {

        try{
            validateUser("monazirhasan27gmail.com");
        }
        catch (InvalidEmailException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Program continues");
    }
}
