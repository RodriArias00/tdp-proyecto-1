package launcher;
import gui.*;
import entities.*;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	try {
            		Student estudiante=new Student(120693,"Arias","Rodrigo","rodriariasuns@gmail.com","RodriArias00","../images/FotoParaLaGUI.jfif");
            		SimplePresentationScreen screen=new SimplePresentationScreen(estudiante);
            		screen.setVisible(true);
            	}catch(Exception e) {
            		e.printStackTrace();
            	}
            }
        });
    }
}