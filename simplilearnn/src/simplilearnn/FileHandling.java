package simplilearnn;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.*;
import java.io.File;

public class FileHandling {
	public static void main(String[] args) throws IOException
	{
		//Reading content from file
		Path path=Path.of("file1");
		try(Stream<String> lines=Files.lines(path)){
		lines.forEach(System.out::println);
		}
		catch(IOException e)
		{
			e.printStackTrace();
					
		}
		boolean exists=Files.exists(path);
		System.out.println("exists= "+exists);
		
		//writing content to file
		Path writef=Paths.get("file2");
		try(BufferedWriter writer=Files.newBufferedWriter(writef))
		{
			writer.write("hi !how are you?");
		}
		//appending content to a file
		File file=new File("C:\\Users\\cnikitha\\git\\simplilearnn\\simplilearnn\\file2");
        FileWriter fw=new FileWriter(file,true);
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        pw.println("first line");
        pw.println("second line");
        pw.close();
       		
	}

}
