package test;

import java.io.File;

import org.apache.commons.io.input.Tailer;
import org.apache.commons.io.input.TailerListener;

public class TestTailer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      TailerListener listener = new MyTailerListener();
	      //Tailer tailer = Tailer.create(new File("C:\\JavaFX\\x.txt"), listener, 500);
	      Tailer tailer = new Tailer(new File("C:\\JavaFX\\x.txt"), listener, 500);
	      tailer.run();
	      
	}

}
