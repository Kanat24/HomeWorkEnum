public class Data {
    String login;
    String password;
    String confirmPassword;
    private static final String VALIDATION_SIMVOL = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890_";

    public static boolean inputСorrectness(String login, String password, String confirmPassword) {
        try {
            check(login, password, confirmPassword);

        } catch (WrongLoginException| WrongPasswordException e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }





        private static void check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login == null || login.length() > 20 || !checkPassvord(login)) {
            throw new WrongLoginException("Ошибка ввода логина");
        }
        if (password == null || password.length() > 20 || !checkPassvord(password)) {
            throw new WrongPasswordException("Ошибка ввода пароля");
        }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("не совпадение паролей");
        }
    }
     private static boolean checkPassvord(String s){
         for (int i = 0; i < s.length() ; i++) {
             if (!VALIDATION_SIMVOL.contains(String.valueOf(s.charAt(i)))){
                 return false;
             }
         }
         return true;
     }
}
