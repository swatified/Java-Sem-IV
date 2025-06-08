import java.io.*;

class TwoFilesToOne {
    public static void main(String[] args) {
        try {
            // Create test files
            FileWriter fw1 = new FileWriter("file1.txt");
            fw1.write("Content from file 1");
            fw1.close();
            
            FileWriter fw2 = new FileWriter("file2.txt");
            fw2.write("Content from file 2");
            fw2.close();
            
            // Read from both files and write to combined file
            FileWriter combined = new FileWriter("combined.txt");
            
            BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
            String line1;
            while ((line1 = br1.readLine()) != null) {
                combined.write(line1 + "\n");
            }
            br1.close();
            
            BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
            String line2;
            while ((line2 = br2.readLine()) != null) {
                combined.write(line2 + "\n");
            }
            br2.close();
            combined.close();
            
            System.out.println("Files combined successfully");
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}