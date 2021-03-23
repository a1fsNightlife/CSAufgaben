//Klasse
public class Tree {

    //Felder
    private Integer numberOfBranch;
    private String leaveType;
    private Double trunkPerimeter;
    private Double treeTop;

    //Konstruktor
    public Tree(Integer numberOfBranch, String leaveType, Double trunkPerimeter, Double treeTop) {
        this.numberOfBranch = numberOfBranch;
        this.leaveType = leaveType;
        this.trunkPerimeter = trunkPerimeter;
        this.treeTop = treeTop;
    }

    //Methoden
    public Integer getNumberOfBranch() {
        return numberOfBranch;
    }

    public void setNumberOfBranch(Integer numberOfBranch) {
        this.numberOfBranch = numberOfBranch;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public Double getTrunkPerimeter() {
        return trunkPerimeter;
    }

    public void setTrunkPerimeter(Double trunkPerimeter) {
        this.trunkPerimeter = trunkPerimeter;
    }

    public Double getTreeTop() {
        return treeTop;
    }

    public void setTreeTop(Double treeTop) {
        this.treeTop = treeTop;
    }
}
