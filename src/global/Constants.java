package global;

public class Constants {

	public static double sizeOfChunk = 1024 * 1024 * 1;
	public static String dataDir = "C:\\Gossamer\\";
	public static String clientDir = "C:\\ClientStuff\\";
	public static String logFile = "Log.txt";

	public static String jedis1 = "192.168.1.20";
	public static String jedis2 = "192.168.1.21";
	public static String jedis3 = "192.168.1.22";

	// public static String jedis1 = "10.250.129.206";
	// public static String jedis2 = "10.250.47.208";
	// public static String jedis3 = "10.250.175.205";
	public static int clusterId = 2;
	public static int nextClusterId = 3;
	public static int whomToConnect = 2;

	public static int redisPort = 6379;
	public static int workPort = 4568;
	public static int clientPort = 4569;
	public static String localhost = "127.0.0.1";
	public static String next = "169.254.214.175";
}