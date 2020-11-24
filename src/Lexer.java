/*
 * Lexer_Skeleton.java - A lexical analyser extracts tokens by reading
 *                       characters from a source file (.asm) for the parser.
 *
 * @author  Michel de Champlain
 */

import java.io.*;

public class Lexer {


    private final Sourcefile asmFile;

    public Lexer(Sourcefile asmFile) throws IOException {
        this.asmFile = asmFile;
        File f = asmFile.srcFile;
        Filereader fr = new FileReader(f);
        this.br = new BufferedReader(fr);
    }

    /* Read the next character. */
    private int read() {
        colPos++;
        return ch = reader.read();
    }

    private void error(String t) {
        errorReporter.record( _Error.create(t, getPosition()) );
    }

    private void scanNumber() {
        // your code...
    }
    private int scanIdentifier() {
        // your code...
    }
    private int scanDirective() {
        // your code...
    }
    private int scanString() {
        // your code...
    }
    /**
     * Scan the next token. Mark position on entry in case of error.
     * @return   the token.
     */
    public int getToken() {
        // skip whitespaces
        // "\n", "\r\n", "\n", or line comments are considered as EOL

        // your code...

        // Mark position (after skipping blanks)
        curlinePos = linePos;
        curcolPos = colPos;

        while (true) {
            switch ( ch ) {
                case -1:
                    return EOF;

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
                    return scanIdentifier();

                case '.':  /* dot for directives as a first character */
                    return scanDirective();


                case '0': case '1': case '2': case '3': case '4':
                case '5': case '6': case '7': case '8': case '9':
                    scanNumber();
                    return NUMBER;

                case '-':
                    read(); return MINUS;

                case ',':
                    read(); return COMMA;

                case '"':
                    return scanString();

                default:
                    read(); return ILLEGAL_CHAR;
            }
        }
    }
}
