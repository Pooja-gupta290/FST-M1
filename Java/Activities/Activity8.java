package Session2;

public class Activity8 {
    public static void exceptionTest(String value) throws CustomException {
        if (value == null) {
            throw new CustomException("CustomException: String value cannot be null!");
        } else {
            System.out.println("The string value is: " + value);
        }
    }

    public static void main(String[] args) {
        try {
            
            exceptionTest("Hello, World!");

            
            exceptionTest(null);
        } catch (CustomException e) {
           
            System.out.println(e.getMessage());
        }
    }
}