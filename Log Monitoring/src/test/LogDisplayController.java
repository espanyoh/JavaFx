package test;
import java.io.File;
import java.util.Random;

import org.apache.commons.io.input.Tailer;
import org.apache.commons.io.input.TailerListener;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class LogDisplayController {
	
	@FXML
	private TextArea consoleLog;
	

    // Reference to the main application.
    private Main mainApp;
    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
    
    @FXML
    public void test(){
    	//consoleLog.appendText("111");

	      //TailerListener listener = new MyTailerListener();
    	/*TailerListener listener = new TailerListenerAdapter() {
			@Override
			 public void handle(String line) {
		         System.out.println(line);
		     }
		};*/
	      //Tailer tailer = Tailer.create(new File("C:\\JavaFX\\x.txt"), listener, 500);
	      //Tailer tailer = new Tailer(new File("C:\\JavaFX\\x.txt"), listener, 500);
	      //tailer.run();
	      Thread th = new Thread();
	      //th.start();
	      
	      try {
			while(true){
			      th.sleep(1000);
			      //consoleLog.appendText((new Random()).toString());
			      System.out.println((new Random()).toString());
			  }
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	      consoleLog.appendText("222");
	      
    }
    
    
}
