package com.max.learn.Java8新特性.Optional.demo01;

import org.junit.Test;

/**
 * @author huangX huangxun@lidomtech.com
 * @version 1.0
 * @className Test02
 * @date 2021/3/25 19:41
 * @desc
 **/
public class Test02 {

    @Test
    public void testA(){
        String str = "I love java";
        System.out.println(System.identityHashCode(str));
        String str1 = str;
        System.out.println(System.identityHashCode(str1));
        String replace = str.replace("java", "Java");
        System.out.println(System.identityHashCode(replace));

/*        System.out.println("after replace str:" + replace);
        System.out.println("after replace str1:" + str1);*/
    }

    /**
     * 不可变集合
     **/
    @Test
    public void testB(){

    }

    protected static class enmuType{
        public static final String FPX = "fpx";
        public static final String WINIT = "winit";
        public static final String SHIHANG = "shihang";
        protected static final String ANJUN = "anjun";
        public static final String YANWEN = "yanwen";
        public static final String ETOWER = "etower";
    }

    public static void main(String[] args) {
        Integer num = 6;

        System.out.println(Test02.enmuType.ANJUN);
    }

}
