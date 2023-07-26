import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws Exception{
       try {
           //Serialization
           //Serialize korar jonne Obj created.
           Employee employee = new Employee("Paul",23,10000);
           ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"));

           // Write the object to the ObjectOutputStream
           oos.writeObject(employee);
           oos.flush();//File er modde out put show kore

           // Close the ObjectOutputStream object
           oos.close();
           //Deserialization
           ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.ser"));
           Employee employee1 = (Employee)in.readObject();
           System.out.println(employee1.getName()+ " "+ employee1.getAge()+ " "+employee1.getSalary());
           in.close();
       }catch (Exception e){System.out.println(e);}
    }
}