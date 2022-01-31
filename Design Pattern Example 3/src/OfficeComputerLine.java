import java.util.Iterator;

public class OfficeComputerLine implements Collection {

    static final int MAX_ITEMS = 5;
    int numberOfItems = 0;
    Computer[] computers;

    public OfficeComputerLine() {
        computers = new Computer[MAX_ITEMS];

        addItem("Office_Computer_1");
        addItem("Office_Computer_2");
        addItem("Office_Computer_3");
        addItem("Office_Computer_4");
        addItem("Office_Computer_5");
    }

    public void addItem(String str) {
        Computer computer = new Computer(str);
        if (numberOfItems >= MAX_ITEMS)
            System.err.println("Full");
        else {
            computers[numberOfItems] = computer;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Computer[] getComputers() {
        return computers;
    }

    @Override
    public Iterator createIterator() {
        return new OfficeComputerLineIterator(computers);
    }
}