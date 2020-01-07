package com.max.learn.Java8新特性.lesson04;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestTransaction {

    List<Transaction> transactions = null;

    @Before
    public void before() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
    }

    // 1.找出2011年发生的所有交易,并按交易额排序(从低到高)
    @Test
    public void test01() {
        transactions.stream()
                .filter((e)->  e.getYear()==2011)
                .sorted((x,y) -> Integer.compare(x.getValue(),y.getValue()))
                .forEach(System.out::println);
    }
    // 2.交易员都在哪些不同的城市工作过
    @Test
    public void test02() {
        transactions.stream()
                .map(e -> e.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

    }
    // 3.查找所有来自剑桥的交易员,并按姓名排序
    @Test
    public void test03() {
        transactions.stream()
                .filter(e -> e.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getTrader)
                .sorted((x,y) -> x.getName().compareTo(y.getName()))
                .forEach(System.out::println);
    }
    // 4.返回所有交易员的姓名字符串,按字母顺序排序
    @Test
    public void test04() {
        transactions.stream()
                .map(e -> e.getTrader().getName())
                .distinct()
                .sorted((x,y) -> x.compareTo(y))
                .forEach(System.out::println);
        System.out.println("<---------------------------------->");

        String result = transactions.stream()
                .map(e -> e.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("",String::concat);
        System.out.println(result);
    }
    // 5.有没有交易员是在米兰工作的
    @Test
    public void test05() {
        boolean flag = transactions.stream()
                .anyMatch(e -> e.getTrader().getCity().equals("Milan"));
        System.out.println(flag);
    }
    // 6.打印生活在剑桥的交易员的所有交易额
    @Test
    public void test06() {
        Optional<Integer> sum = transactions.stream()
                .filter(e -> e.getTrader().getCity().equals("Cambridge"))
//                .map(e -> e.getValue())
                .map(Transaction::getValue)
                .reduce(Integer::sum);
        System.out.println(sum.get());

    }
    // 7.所有交易中,最高的一笔交易额是多少
    @Test
    public void test07() {
        Optional<Integer> max = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);

        System.out.println(max.get());

        System.out.println("<---------------------------------->");

        Optional<Integer> num = transactions.stream()
                .map(Transaction::getValue)
                .max(Integer::compareTo);
        System.out.println(num.get());

    }
    // 8.找到最小的一笔交易额
    @Test
    public void test08() {
        IntSummaryStatistics collect = transactions.stream()
                .collect(Collectors.summarizingInt(Transaction::getValue));

        System.out.println(collect.getMin());

        System.out.println("<---------------------------------->");
        Optional<Transaction> min = transactions.stream()
                .min((x, y) -> Integer.compare(x.getValue(), y.getValue()));
        System.out.println("min = " + min.get());
    }
}
