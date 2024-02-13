package app;

public class DataHandler {

    public String handleData(String data) {

        DataValidator validator = new DataValidator();

        try {
            return validator.validateHeight(data);
        } catch (HeigtException ex) {
            return ex.getMessage();
        }
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
