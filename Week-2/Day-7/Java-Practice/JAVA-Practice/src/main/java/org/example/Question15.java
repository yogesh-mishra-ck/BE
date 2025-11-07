package org.example;

//Custom Exception: InvalidEmailException
//Validate an email string.
//Throw InvalidEmailException if it doesn’t contain an “@” symbol.

class InvalidEmailException extends Exception{
    InvalidEmailException(String message){
        super(message);
    }
}
public class Question15 {

    public static void checkEmail(String email) throws InvalidEmailException{
        if(!email.contains("@"))
            throw new InvalidEmailException("Invalid Email, it must include @");
        System.out.println("Email is valid "+email);
    }
    public static void main(String[] args) {
        String email1 = "yogesh@gmail.com";
        String email2 = "bhavesh@gmail.com";
        String email3 = "ashish23gmail.com";

        try{
             checkEmail(email1);
             checkEmail(email2);
             checkEmail(email3);
        }catch (InvalidEmailException e){
            System.out.println("Error Occurred!! "+e.getMessage());
        }
    }
}
