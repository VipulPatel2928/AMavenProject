package markerTaggedInterface.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;

public class SerializableInterfaceClass implements Serializable{
	    public int age;
	    public String nameString;
	    public String addressString;
	    
	    public SerializableInterfaceClass(int age,String nameString, String addString) {
	    	this.age = age;
			this.nameString = nameString;
			this.addressString = addString;
		}
	    
	    public void displayData() {
	    	System.out.println(age);
	    	System.out.println(nameString);
	    	System.out.println(addressString);
	    }
	    
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SerializableInterfaceClass objClass = new SerializableInterfaceClass(58, "Vipul", "ALthan");
		
        //Serialization
		//Object to ByteStream
        FileOutputStream file = new FileOutputStream("xyz.txt");
        ObjectOutputStream obj = new ObjectOutputStream(file);
        obj.writeObject(objClass);
        objClass.displayData();
        
        //DeSerialization
        //Byte Stresm To Object
        SerializableInterfaceClass objClass1;
        FileInputStream inFile = new FileInputStream("xyz.txt");
        ObjectInputStream inObj = new ObjectInputStream(inFile);
        objClass1= (SerializableInterfaceClass) inObj.readObject();
        objClass1.displayData();
        
  
	}
}
