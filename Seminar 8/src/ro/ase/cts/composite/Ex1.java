package ro.ase.cts.composite;

public class Ex1 {
    public static void main(String[] args) {
        File file1=new File("File1.txt");
        File file2=new File("File2.txt");
        File file3=new File("File3.txt");

        Directory rootDirectory=new Directory("RootDirectory");

        rootDirectory.addItem(file1);
        rootDirectory.addItem(file2);

        Directory subDirectory=new Directory("SubDirectory");

        subDirectory.addItem(file3);

        rootDirectory.addItem(subDirectory);

        rootDirectory.printName();
    }
}
