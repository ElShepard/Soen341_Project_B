public class Node {
    Position position;
    int address;
    String label;
    String comment;
    String instruction;

    public Node() {
        this.position = new Position();
        this.address = 0;
        this.label = "";
        this.instruction ="";
        this.comment="";
    }
}
