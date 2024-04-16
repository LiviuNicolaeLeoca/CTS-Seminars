package Decorator;

public class Example1 {
    public static void main(String[] args) {
        DataService myDataService=new LoggingDecorator(new DataServiceConcrete());
        System.out.println(myDataService.fetchData());

        DataService realDataService=new DataServiceConcrete();

        DataService loggedDataService=new LoggingDecorator(realDataService);

        String data = loggedDataService.fetchData();
        System.out.println("Data Retrieved: "+data);
    }
}
