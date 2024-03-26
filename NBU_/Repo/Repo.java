package NBU_.Repo;

public class Repo {
    private double maxData;
    private int numberOfDocuments;
    private double currUsedSpace;

    public Repo() {
    }

    public Repo(double maxData, int numberOfDocuments, double currUsedSpace) {
        this.maxData = maxData;
        this.numberOfDocuments = numberOfDocuments;
        this.currUsedSpace = currUsedSpace;
    }

    public double getMaxData() {
        return maxData;
    }

    public void setMaxData(double maxData) {
        this.maxData = maxData;
    }

    public int getNumberOfDocuments() {
        return numberOfDocuments;
    }

    public void setNumberOfDocuments(int numberOfDocuments) {
        this.numberOfDocuments = numberOfDocuments;
    }

    public double getCurrUsedSpace() {
        return currUsedSpace;
    }

    public void setCurrUsedSpace(double currUsedSpace) {
        this.currUsedSpace = currUsedSpace;
    }


    public void storeDocument(Document document) {
        if (maxData - currUsedSpace >= document.getFileSize()) {
            this.numberOfDocuments++;
            this.currUsedSpace += document.getFileSize();
            System.out.println("stored document" + document.toString());
        } else {
            System.out.println("Not enough space !");
        }
    }

    @Override
    public String toString() {
        return "Repo{" +
                "maxData=" + maxData +
                ", numberOfDocuments=" + numberOfDocuments +
                ", currUsedSpace=" + currUsedSpace +
                '}';
    }
}

