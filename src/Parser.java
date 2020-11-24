import java.io.*;
import java.util.ArrayList;

public class Parser {
        ArrayList<Node> nodes;
        private Map map;
    public Parser(ArrayList<Node> nodes, Map map)
    {
        this.nodes = nodes;
        this.map = map;
    }
    public void format() throws FileNotFoundException {
        PrintWriter write = new PrintWriter(new FileOutputStream("Text.asm"));

        write.printf("%-5s%-5s%-14s%-10s%-20s%-20s%", "Line", "Addr", "Machine Code", "Label","Assembly Code","Comments");

        for(int i = 0; i < nodes.size(); i++)
        {
            write.printf("\n");
            write.printf("%-5s%-5s%-14s%-10s%-20s%-20s%", nodes.get(i).position.line,String.format("%04x", nodes.get(i).address),map.getValue(nodes.get(i).instruction), nodes.get(i).label, nodes.get(i).instruction,nodes.get(i).comment);

        }
        write.close();

    }
}