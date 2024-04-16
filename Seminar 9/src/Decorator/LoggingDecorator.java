package Decorator;

import javax.xml.crypto.Data;

public class LoggingDecorator implements DataService{
    private DataService wrappee;
    LoggingDecorator(DataService dataService)
    {
        this.wrappee=dataService;
    }
    @Override
    public String fetchData() {
        System.out.println("Fetching data...");
        return wrappee.fetchData();
    }
}
