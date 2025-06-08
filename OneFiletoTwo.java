import java.io.*;

class OneFileToTwo {
    public static void main(String[] args) {
        try {
            // Create source file
            FileWriter source = new FileWriter("source.txt");
            source.write("Line 1\nLine 2\nLine 3\nLine 4");
            source.close();
            
            // Read from source and write to two files
            BufferedReader reader = new BufferedReader(new FileReader("source.txt"));
            FileWriter file1 = new FileWriter("output1.txt");
            FileWriter file2 = new FileWriter("output2.txt");
            
            String line;
            int lineCount = 0;
            while ((line = reader.readLine()) != null) {
                if (lineCount % 2 == 0) {
                    file1.write(line + "\n");
                } else {
                    file2.write(line + "\n");
                }
                lineCount++;
            }
            
            reader.close();
            file1.close();
            file2.close();
            System.out.println("File split successfully");
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}