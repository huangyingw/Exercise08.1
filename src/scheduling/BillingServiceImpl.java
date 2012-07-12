package scheduling;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class BillingServiceImpl implements BillingService {

	public void printBills() {
		Date date =  Calendar.getInstance().getTime();
		DateFormat timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT);
		String currenttime = timeFormatter.format(date);

		System.out.println(currenttime+"    printing bills");
	}
	public void generateBillingReport() {
		Date date =  Calendar.getInstance().getTime();
		DateFormat timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT);
		String currenttime = timeFormatter.format(date);

		System.out.println(currenttime+"    generate bills");
	}
}
