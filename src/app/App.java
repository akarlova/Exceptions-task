package app;

public class App {

    public static void main(String[] args) {

        DataProvider provider = new DataProvider();
        String data = provider.getData();

        DataHandler handler = new DataHandler();
        handler.getOutput(handler.handleData(data));

        handler.getOutput("Continue");

    }
}
