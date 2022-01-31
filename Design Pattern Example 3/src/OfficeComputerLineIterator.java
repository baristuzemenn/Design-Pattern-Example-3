import java.util.Iterator;

public class OfficeComputerLineIterator implements Iterator<Computer>{

    Computer[] computers;
    int pos = 0;

    public OfficeComputerLineIterator(Computer[] computers) {
        super();
        this.computers = computers;
    }

    @Override
    public boolean hasNext() {
        if (pos >= computers.length ||
                computers[pos] == null)
            return false;
        else
            return true;
    }

    @Override
    public Computer next() {
        Computer computer =  computers[pos];
        pos += 1;
        return computer;
    }
}