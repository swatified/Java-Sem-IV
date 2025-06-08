import java.io.*;

class CountCharacters {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("count.txt");
            writer.write("Hello World Java Programming");
            writer.close();
            
            FileReader reader = new FileReader("count.txt");
            int count = 0;
            int ch;
            while ((ch = reader.read()) != -1) {
                count++;
            }
            reader.close();
            
            System.out.println("Total characters: " + count);
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}