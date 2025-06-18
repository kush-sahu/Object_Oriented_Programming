package Exception;

import java.io.FileReader;

public class FileNotFoundException {
        public static void main(String[] args) {
        	try {
			FileReader file=new FileReader("abc.txt");
        	}
        	catch(Throwable a) {
        		System.out.print(a);
        	}
		}
}
