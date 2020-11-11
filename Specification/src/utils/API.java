package utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import models.Entity;

public abstract class API 
{
	protected List<Entity> entities = new ArrayList<Entity>();
	protected String fileName;
	public API() {
	}
	
//	abstract public void importFile(String dir, Class<?> classOf);
//	
//	abstract public void exportObject(String dir, Object obj);
	
	abstract public void save(List<Entity> data, String fileName);
	abstract public void enterEntity(String tekst);
	abstract public void brisiNaOsnovuIDa(String id, String dirPath);
	abstract public void brisiKljucVrednost(String name_, String key, String value_, String dirPath);
	//abstract public void dodajSaIDom(String fileName);
	
	abstract void openFile(File file);
	/// da openFile vraca listu 
	/**
	 * Otvara sve fajlove iz zeljenog direktorijuma
	 * U direktorijumu se nalaze fajlovi jednog formata
	 * @param path
	 * @throws IOException 
	 */
	
	public List<Entity> openDir(String path)
	{
		File directory = new File(path);
		
		
		File[] contents = directory.listFiles();
		
		for(File f : contents) 
		{	
			if (f.length() > 0) {
				openFile(f);
			}
		}
		return entities;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	
	
	
}