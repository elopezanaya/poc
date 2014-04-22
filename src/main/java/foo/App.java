package foo;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import foo.xsd.NoIdea;

/**
 * Hello world!
 *
 */
public class App 
{
   
	public void boredAdHell() throws JsonParseException, JsonMappingException, IOException{
		
		NoIdea noIdea ;
		String json="{\"id_Number\":\"12345\"}";
		
		ObjectMapper mapper = new ObjectMapper();
		
		noIdea= mapper.readValue(json, NoIdea.class);
		
		System.out.println(noIdea.toString());
		
	}
	
	public static void main( String[] args )
    {
        try {
			new App().boredAdHell();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
