import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
class Main {
    public static void simpleWholeFileRead() {
        try {
            FileReader fr = new FileReader("input_file");
            int ascii = 0;
            while (ascii != -1) {
                ascii = fr.read();
                char letter = (char) ascii;
                System.out.println(letter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void betterWholeFileRead() {
        try {
            FileReader fr = new FileReader("input_file");
            BufferedReader br = new BufferedReader(fr);
            int ascii = 0;
            while (ascii != -1) {
                ascii = fr.read();
                char letter = (char) ascii;
                if (ascii != -1) {
                    System.out.println(letter);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void bestWholeFileRead () {
        try {
            FileReader fr = new FileReader("input_file");
            BufferedReader br = new BufferedReader(fr);
            String line =br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        bestWholeFileRead();
    }
}

