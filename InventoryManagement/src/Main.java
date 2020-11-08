import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
		// name id quantity price category
		
		int total;
		
		//obj[0] = new item("LG", 0001, 10, 19.95, "TV");
		
		File file = new File("fullinv.txt");
		Scanner scanFile = new Scanner(file);
		
		total = scanFile.nextInt();
		item[] obj = new item[50];
		
		
		for (int i = 0; i < total; i++ ) {
			int num = i+ 1;
			obj[i]= new item(scanFile.next(), scanFile.nextInt(), scanFile.nextInt(), scanFile.nextDouble(), scanFile.next() );
			
			System.out.println("Item number"+num+": " );
			obj[i].showData();
			System.out.println();
		}
		
		
		
	}
	
	
}

