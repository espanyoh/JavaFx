package test;

import org.apache.commons.io.input.TailerListenerAdapter;

public class MyTailerListener extends TailerListenerAdapter {
	@Override
	 public void handle(String line) {
         System.out.println(line);
     }
}
