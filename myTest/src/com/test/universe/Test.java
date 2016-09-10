package com.test.universe;

import java.io.*;

public class Test {
	public static void main(String[] args) throws Exception {
        //SerializeCustomer();// ���л�Customer����
        Customer customer = DeserializeCustomer();// ������Customer����
        System.out.println(customer);
    }

    /**
     * MethodName: SerializeCustomer 
     * Description: ���л�Customer����
     * @author xudp
     * @throws FileNotFoundException
     * @throws IOException
     */
    private static void SerializeCustomer() throws FileNotFoundException,
            IOException {
        Customer customer = new Customer("gacl",25,"1");
        // ObjectOutputStream ���������
        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(
                new File("E:/Customer.txt")));
        oo.writeObject(customer);
        System.out.println("Customer�������л��ɹ���");
        oo.close();
    }

    /**
     * MethodName: DeserializeCustomer 
     * Description: ������Customer����
     * @author xudp
     * @return
     * @throws Exception
     * @throws IOException
     */
    private static Customer DeserializeCustomer() throws Exception, IOException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                new File("E:/Customer.txt")));
        Customer customer = (Customer) ois.readObject();
        System.out.println("Customer�������л��ɹ���");
        return customer;
    }
}

/**
 * <p>ClassName: Customer<p>
 * <p>Description: Customerʵ����Serializable�ӿڣ����Ա����л�<p>
 * @author xudp
 * @version 1.0 V
 * @createTime 2014-6-9 ����04:20:17
 */
class Customer implements Serializable {
	//Customer����û�ж���serialVersionUID
    private String name;
    private int age;
    private String sex;

    public Customer(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    /*
     * @MethodName toString
     * @Description ��дObject���toString()����
     * @author xudp
     * @return string
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "name=" + name + ", age=" + age;
    }

}