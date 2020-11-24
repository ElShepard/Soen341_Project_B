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

    // Getters and Setters:
    public String getLabel() { return label; }
    public void setLabel(String label) { this.label = label; }
    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }
    public String getInstruction() { return instruction; }
    public void setInstruction(String instruction) { this.instruction = instruction; }
    public int getAddress() { return address; }
    public void setAddress(int address) { this.address = address; }
    public Position getPosition() { return position; }
    public void setPosition(Position position) { this.position = position; }
}
