package leonhar001.app.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
	
	public static void info(String msg) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("[LOG] "+sdf.format(new Date())
			+"->"+msg);
	}
}
