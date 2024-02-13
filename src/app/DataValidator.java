package app;

public class DataValidator {

    private static final int HEIGHT_LOWER_LIMIT = 120;
    private static final int HEIGHT_UPPER_LIMIT = 355;

    public String validateHeight(String height) throws HeigtException {

        if (Double.parseDouble(height) >= HEIGHT_LOWER_LIMIT &&
                Double.parseDouble(height) <= HEIGHT_UPPER_LIMIT) {

            return "Height " + height + " works";
        } else {
            throw new HeigtException("Height " + height + " doesn't work");
        }
    }
}
