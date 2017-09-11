package framework.application;

public class AppTest
{
	public static void main(String[] args)	{
		FrameworkApp app = new FrameworkApp();
		app.init();
		app.lunchApp(args);
	}
}