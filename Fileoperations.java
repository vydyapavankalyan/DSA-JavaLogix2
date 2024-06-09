import java.io.*;
public class Fileoperations 
{
public static void main(String[] args) throws IOException 
{
File inputFile = new File("E:sample1.txt");
File outputFile = new File("E:sample350.txt");
FileReader in = new FileReader(inputFile);
FileWriter out = new FileWriter(outputFile);
try
{
 	int c;
	while ((c = in.read()) != -1)
	out.write((char)c);
}
finally
{
in.close();
out.close();
}
}
}
