package State;

public class TCPConnection {
    private TCPState currentState;

    public TCPConnection()
    {
        currentState=new TCPClosedState();
    }

    public void setState(TCPState state)
    {
        this.currentState=state;
    }

    public void open()
    {
        currentState.open(this);
    }
    public void close()
    {
        currentState.close(this);
    }

    public void acknowledge()
    {
        currentState.acknowledge(this);
    }
}
