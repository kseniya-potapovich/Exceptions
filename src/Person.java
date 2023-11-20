public class Person {
    private String login;
    private String password;
    private String confirmPassword;


    static void methodOfPassword(String login, String password, String confirmPassword) {
        try {
            if (login.length() <= 20 && login.replaceAll(" ", "") == login) {
                System.out.println("Login is correct");
            }
            if ((password.length() <= 20 && password.equals(confirmPassword)) == true) {
                System.out.println("Password is correct");
            }
        } catch (WrongLoginException e) {
            System.out.println("Login isn't correct");
        } catch (WrongPasswordException e) {
            System.out.println("Password isn't correct");
        }
    }
}
