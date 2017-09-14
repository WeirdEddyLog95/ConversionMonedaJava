package MVP;

import javax.swing.*;

public class ConMain {
	
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){            
			public void run() {
				Model model = new Model();
	            View view = new View();
	            Presenter presenter = new Presenter(view, model);
				view.setPresenter(presenter);				
			}            
        });

	}
}
