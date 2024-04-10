package ro.ase.cts.adapter;

public class JSONAdapter implements DataReader{
    private JSONDataReader jsonDataReader;
    public JSONAdapter(JSONDataReader jsonDataReader){
        this.jsonDataReader=jsonDataReader;
    }
    @Override
    public String readData() {
        return jsonDataReader.readJSON();
    }
}
