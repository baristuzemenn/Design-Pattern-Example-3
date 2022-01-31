import java.util.ArrayList;
import java.util.Iterator;

public class GamingComputerLineIterator implements Iterator<Computer> {

    int pos = 0;
    public ArrayList<Computer> list;

    public GamingComputerLineIterator(ArrayList<Computer> list) {
        super();
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (pos >= list.size() ||
                list.get(pos) == null)
            return false;
        else
            return true;
    }

    @Override
    public Computer next() {
        Computer computer =  list.get(pos);
        pos += 1;
        return computer;
    }
}