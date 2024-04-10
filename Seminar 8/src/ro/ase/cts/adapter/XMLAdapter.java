package ro.ase.cts.adapter;

public class XMLAdapter implements DataReader{
    private XMLDataReader xmlDataReader;
    public XMLAdapter(XMLDataReader xmlDataReader){
        this.xmlDataReader=xmlDataReader;
    }
    @Override
    public String readData() {
        return xmlDataReader.readXML();
    }
}
