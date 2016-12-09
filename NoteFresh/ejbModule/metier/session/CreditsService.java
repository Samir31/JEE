package metier.session;

import java.io.IOException;

import org.picketbox.commons.cipher.Base64.InputStream;

public class CreditsService {
	
	private  Properties credits;

	public CreditsService() {
		this.credits = new Properties();
		try{
			InputStream is= new FileInputStream("/META-INF/credits.properties");
			this.credits.load(is);
			is.close();
		}
		catch(FileNotFindException e){}
		catch(IOException e){}
		
	}
	
	public String getVersion(){
		return this.credits.getProperty("version");
		
	}

	
	
	
	
	

}
