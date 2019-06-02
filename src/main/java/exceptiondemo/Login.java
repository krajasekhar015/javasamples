package exceptiondemo;

public class Login {
    public void auth(String un, String pwd) throws ValidLoginException, InvalidLoginException{
        if((un.equalsIgnoreCase("SaThYa"))&&(pwd.equals("java"))){
            ValidLoginException ve = new ValidLoginException("Login Success");
            throw ve;
        }else{
            InvalidLoginException ive = new InvalidLoginException("Login Denied");
            throw ive;
        }
    }
}
