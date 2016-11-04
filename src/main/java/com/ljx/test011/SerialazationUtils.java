package com.ljx.test011;

import java.io.*;

/**
 * @Created by taylor on 2016/11/4.
 * @DESC
 */
public class SerialazationUtils {
    private static String FILE_NAME = "D:\\00-networkbench\\data\\obj.bin";

    public static void writeObject(Serializable s) {
        // 序列化
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            oos.writeObject(s);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Object readObject() {
        Object obj = null;
        // 反序列化 
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME));
            obj = ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
