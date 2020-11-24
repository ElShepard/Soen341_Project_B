
import java.io.*;
import java.util.ArrayList;

public class Lexer {


    Sourcefile asmFile;
    BufferedReader br;
    int colPos = 0;
    ArrayList<Node> nodes = new ArrayList<Node>();

    public Lexer(Sourcefile asmFile) throws IOException
    {
        this.asmFile = asmFile;
        File f = asmFile.srcFile;
        FileReader fr = new FileReader(f);
        this.br = new BufferedReader(fr);
    }


    public void scanIdentifier(int c , Map map) throws IOException
    {
        String identifier = "";
        while (c != ' ' && c != '\t' && c != '\n' && c != '\r') {
            char cn = (char) c;
            identifier = identifier + cn;
            c = this.br.read();
        }
        if (map.getValue(identifier) != null) {
            nodes.get(nodes.size() + 1).instruction = identifier;
        }
    }

    public void readAsm(Map map) throws IOException
    {

        int line = 1;
        int add = 0;
            int c = ' ';

        while (c != -1) {
            switch ( c ) {
                case ' ':
                    c = this.br.read();
                    break;

                case 'a': case 'b': case 'c': case 'd': case 'e':
                case 'f': case 'g': case 'h': case 'i': case 'j':
                case 'k': case 'l': case 'm': case 'n': case 'o':
                case 'p': case 'q': case 'r': case 's': case 't':
                case 'u': case 'v': case 'w': case 'x': case 'y':
                case 'z':
                case 'A': case 'B': case 'C': case 'D': case 'E':
                case 'F': case 'G': case 'H': case 'I': case 'J':
                case 'K': case 'L': case 'M': case 'N': case 'O':
                case 'P': case 'Q': case 'R': case 'S': case 'T':
                case 'U': case 'V': case 'W': case 'X': case 'Y':
                case '_':
                case 'Z':

                    nodes.add(new Node());
                    nodes.get(nodes.size() -1 ).position.setLine(line);
                    nodes.get(nodes.size() -1).address = add;
                    scanIdentifier(c, map);
                    c = this.br.read();
                    line++;
                    add++;
                    break;
                case '\n' : case '\r' :
                    c = this.br.read();


            }
        }
    }
}
