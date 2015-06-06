
package TugasBesar;

import java.io.*;


public class Simpan {
    public Object save(){
		
		
Data save= new Data();
		
try{
	         
FileOutputStream fileOut = new FileOutputStream("Data.ser");
	         
ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         
out.writeObject(save);
	         
out.close();
	         
fileOut.close();
	         
System.out.printf("Serialized data is saved in /tmp/employee.ser");
	      
}
catch(IOException i){
	          
i.printStackTrace();

}
		
return null;
	
}
    
    public Object Output() {
        
        try {
        FileInputStream fileIn = new FileInputStream("Data.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        
        Object save = in.readObject();
        in.close();
        fileIn.close();    
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        return null;
        
    }
}
