package utils;

public class ToolManager {
	private static API apii; // DBExporter
	private static String type;
	
	
	public static void registerManager(API api, String extension) {
		apii = api;
		type = extension;
	}
	
	public static API getManager(String fileName) throws Exception{
		if (!fileName.contains(type)) {
			throw new Exception("Pogresan format");
		}
		apii.setFileName(fileName);
		
		return apii;
	}
	
	public static API getManager() {
		return apii;
	}
	
}
