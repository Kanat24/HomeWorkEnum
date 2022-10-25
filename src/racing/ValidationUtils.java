package racing;

public class ValidationUtils {
    public static String validOrDefault(String value, String valueDefault){
      return value==null || value.isBlank() ||value.isEmpty()? valueDefault: value;
    }
}
