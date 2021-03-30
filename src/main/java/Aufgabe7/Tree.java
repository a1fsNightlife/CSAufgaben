package Aufgabe7;

//Klasse
public class Tree {

    //Felder
    private Integer numberOfBranches;
    private String leafType;
    private Double trunkPerimeterInM;
    private Double treeTopHeightInM;

    //Konstruktor
    public Tree(Integer numberOfBranches, String leafType, Double trunkPerimeterInM, Double treeTopHeightInM) {
        this.numberOfBranches = numberOfBranches;
        this.leafType = leafType;
        this.trunkPerimeterInM = trunkPerimeterInM;
        this.treeTopHeightInM = treeTopHeightInM;
    }

    //Methoden
    public Integer getNumberOfBranches() {
        return numberOfBranches;
    }

    public void setNumberOfBranches(Integer numberOfBranches) {
        this.numberOfBranches = numberOfBranches;
    }

    public String getLeafType() {
        return leafType;
    }

    public void setLeafType(String leafType) {
        this.leafType = leafType;
    }

    public Double getTrunkPerimeterInM() {
        return trunkPerimeterInM;
    }

    public void setTrunkPerimeterInM(Double trunkPerimeterInM) {
        this.trunkPerimeterInM = trunkPerimeterInM;
    }

    public Double getTreeTopHeightInM() {
        return treeTopHeightInM;
    }

    public void setTreeTopHeightInM(Double treeTopHeightInM) {
        this.treeTopHeightInM = treeTopHeightInM;
    }
}
