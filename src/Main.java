import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;


public class Main {


	public static void main(String[] args) throws IOException {
	File fid = new File("file_name");
	File fig = new File("get_file");
	ArrayList <Integer> test = new ArrayList <Integer>();
	Iterator <Integer> it;
	Random r = new Random();
	
	FileReader rd = new FileReader(fid);
	FileWriter wr = new FileWriter(fig);
	BufferedReader br = new BufferedReader(rd);
	BufferedWriter wrr = new BufferedWriter(wr);
	try{
		String line = br.readLine();
		while(line != null && line.length()!=0){
			System.out.println(line);
			wrr.write(line);
			line = br.readLine();
			wrr.newLine();
		}
	}catch(IOException iex){
		
	}
	wr.close();
	
	for(int i = 0; i < 5; i++){
		int x = r.nextInt(10);
		test.add(x);
	}
	
	it = test.iterator();
	
	while( it.hasNext()){
		Integer bala = it.next();
		System.out.println(bala);
	}
	}

}
