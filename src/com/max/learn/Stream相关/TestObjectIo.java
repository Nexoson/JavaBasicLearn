package com.max.learn.Stream相关;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @ClassName TestObjectIo
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/10/24 23:26
 * @Version 1.0
 **/
public class TestObjectIo {
    public static void main(String args[]) {
        T t = new T();
        t.k = 8;// 把k的值修改为8
        try {
            FileOutputStream fos = new FileOutputStream(
                    "C:\\Users\\Administrator\\Desktop\\TestObjectIo.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // ObjectOutputStream流专门用来处理Object的，在fos流的外面套接ObjectOutputStream流就可以直接把一个Object写进去
            oos.writeObject(t);// 直接把一个t对象写入到指定的文件里面
            oos.flush();
            oos.close();
            FileInputStream fis = new FileInputStream(
                    "C:\\Users\\Administrator\\Desktop\\TestObjectIo.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            // ObjectInputStream专门用来读一个Object的
            T tRead = (T) ois.readObject();
            // 直接把文件里面的内容全部读取出来然后分解成一个Object对象，并使用强制转换成指定类型T
            System.out.print(tRead.i + "\t" + tRead.j + "\t" + tRead.d + "\t"
                    + tRead.k);
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
