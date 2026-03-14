package ExceptionHandling;

public class LoginService {
    void login1 (String username,String password)throws Exception{
        if(!username.equals("admin@gmail.com")&&!password.equals("Krish@123")){
            throw new Exception("Incorrect username or password");
        }
        {
            System.out.println("Login Successful");
        }
    }
    public static void main(String[] args) {
        LoginService login = new LoginService();
        try{
            login.login1 ("admin@gmail.com","Krish@123");
        }catch (Exception e) {
            System.out.println(e);
        }

        }
    }

