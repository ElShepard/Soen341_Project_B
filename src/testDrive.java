import java.io.IOException;

public class testDrive {
    public static void main(String[] args){
        Map<String, String>map = new Map<>();
        map.addKeyValue("halt", "00");
        map.addKeyValue("pop", "01");
        map.addKeyValue("dup", "02");
        map.addKeyValue("exit", "03");
        map.addKeyValue("ret", "04");
        map.addKeyValue("not", "0C");
        map.addKeyValue("and", "0D");
        map.addKeyValue("or", "0E");
        map.addKeyValue("xor", "0F");
        map.addKeyValue("neg", "10");
        map.addKeyValue("inc", "11");
        map.addKeyValue("dec", "12");
        map.addKeyValue("add", "13");
        map.addKeyValue("sub", "14");
        map.addKeyValue("mul", "15");
        map.addKeyValue("div", "16");
        map.addKeyValue("rem", "17");
        map.addKeyValue("shl", "18");
        map.addKeyValue("shr", "19");
        map.addKeyValue("teq", "1A");
        map.addKeyValue("tne", "1B");
        map.addKeyValue("tlt", "1C");
        map.addKeyValue("tgt", "1D");
        map.addKeyValue("tle", "1E");
        map.addKeyValue("tge", "1F");

        try{
            Lexer lexer = new Lexer(new Sourcefile("Text.asm"));
            lexer.readAsm(map);

            Parser parser = new Parser(lexer.nodes, map);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
