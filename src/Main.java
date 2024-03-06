import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        OnlineShop o = new OnlineShop("Emag", "logo.jpg", new ArrayList<Product>());

        Product p1 = new Product("Laptop", 3200.5, 1,1, 1123, "");
        Product p2 = new Product("Frigider", 207.95, 1,2, 1245, "");

        Product p3 = new Product(p1);

        p3.setQuantity(5);
        p3.setName("Paine");

//        o.modifyProductsList(1,p1);
        o.addToProductsList(p1);
        o.addToProductsList(p2);
//        o.modifyProductsList(1,p2);
//
//        o.modifyProductsList(2, p1);
        o.removeFromProductsList(p1);
        System.out.println(p1.equals(p2));
    }
}

class OnlineShop {
    private String onlineShopName;
    private String image;
    private ArrayList<Product> products;

    OnlineShop(String name, String img, ArrayList<Product> products)
    {
        this.products = new ArrayList<Product>();
        this.image = img;
        this.onlineShopName = name;
    }

//    public void modifyProductsList(int what, Product p)
//    {
//        if(what == 1)
//        {
//            this.products.add(p);
//        }
//        else
//            this.products.remove(p);
//    }
//
    public void addToProductsList(Product p){
        this.products.add(p);
    }

    public void removeFromProductsList(Product p){
        this.products.remove(p);
    }

    public String getOnlineShopName() {
        return onlineShopName;
    }

    public void setOnlineShopName(String onlineShopName) {
        this.onlineShopName = onlineShopName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String img) {
        this.image = img;
    }
}

class Product
{
    private int Id;
    private String Name;
    private double Price;
    private int Type;
    private int Category;
    private int Quantity;
    private String ExpiryDate; //expiry date - only for goods
    private String details; // ex.: processor, memory, power, volume (for refrigerators etc)

    public Product(String n, double p, int pt, int pc, int id, String exp)
    {
        Name = n;
        Price = p;
        Type = pt;
        Category = pc;
        this.Id = id;
        this.ExpiryDate = exp;
    }

    public Product(Product p)
    {
        this.Name = p.Name;
        this.Price = p.Price;
        this.Type = p.Type;
        this.Category = p.Category;
        this.Id = p.Id;
        this.ExpiryDate=p.ExpiryDate;
        this.details=p.details;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        this.Price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        this.Type = type;
    }

    public boolean equals(Product p)
    {
        return p.Id == this.Id && p.Name==this.Name && p.Price == this.Price
                && p.Type == p.Type && p.Category == this.Category;
    }

    public void modifyPrice(boolean flag, double val)
    {
        if(flag)
            this.Price +=this.Price *val;
        else
            this.Price -=this.Price *val/100;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        this.Quantity = quantity;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

class User
{
    private String Name;
    private String Id;
    private ArrayList<Order> o;
    private ArrayList<Order> c;

    public User(String usn, String userId)
    {
        this.Name = usn;
        this.Id = userId;
        o=new ArrayList<Order>();
        c=new ArrayList<Order>();
    }

    public void addO1(Order o)
    {
        this.o.add(o);
    }

    public void addO2(Order o)
    {
        this.c.add(o);
    }
}

class Order
{
    private ArrayList<Product> list;
    private String address;

    public Order()
    {
        list = new ArrayList<Product>();
    }
    public void add(Product p)
    {
        if(list.size() > 99)
            return;

        list.add(p);
    }

    public void remove(Product p)
    {
        list.remove(p);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class InventoryP
{
    private Product p;
    private int q;

    public InventoryP(Product p, int q)
    {
        this.p = new Product(p);
        this.q = q;
    }
    public Product getP() {
        return p;
    }

    public void setP(Product p) {
        this.p = p;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }
}


