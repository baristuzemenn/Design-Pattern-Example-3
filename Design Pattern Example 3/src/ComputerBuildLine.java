import java.util.Iterator;

public class ComputerBuildLine {

    public OfficeComputerLine office;
    public GamingComputerLine gaming;

    public ComputerBuildLine() {
        office = new OfficeComputerLine();
        gaming = new GamingComputerLine();
    }

    public void buildComputer(Iterator<Computer> iterator) {
        if (iterator instanceof OfficeComputerLineIterator) {
            System.out.println("Office computers are:");
            OfficeComputerLineIterator officeIterator = (OfficeComputerLineIterator) iterator;
            while (officeIterator.hasNext()) {
                Computer computer = (Computer) officeIterator.next();
                System.out.println(computer);
            }
        } else if (iterator instanceof GamingComputerLineIterator) {
            System.out.println("Gaming Computers are:");
            GamingComputerLineIterator gamingIterator = (GamingComputerLineIterator) iterator;
            while (gamingIterator.hasNext()) {
                Computer computer = (Computer) gamingIterator.next();
                System.out.println(computer);
            }
        }
    }

    public void runLine() {
        buildComputer(office.createIterator());
        buildComputer(gaming.createIterator());
    }
}