import java.io.*;

class FileWriteRead {
    public static void main(String[] args) {
        try {
            // Write to file
            FileWriter writer = new FileWriter("test.txt");
            writer.write("Hello World\nJava Programming");
            writer.close();
            
            // Read from file
            FileReader reader = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}