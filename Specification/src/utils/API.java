package utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import models.Entity;

public abstract class API 
{
	List<Entity> entities = new ArrayList<Entity>();
	public API() {
	}
	
//	abstract public void importFile(String dir, Class<?> classOf);
//	
//	abstract public void exportObject(String dir, Object obj);
	
	abstract public void openFile(File file);
	
	/**
	 * Otvara sve fajlove iz zeljenog direktorijuma
	 * U direktorijumu se nalaze fajlovi jednog formata
	 * @param path
	 */
	
	public void openDir(String path)
	{
		entities.clear();
		File directory = new File(path);
		File[] contents = directory.listFiles();
		
		for(File f : contents) 
		{
			openFile(f);
		}
	}

	
}