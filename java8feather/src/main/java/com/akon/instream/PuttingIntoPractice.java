package com.akon.instream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class PuttingIntoPractice {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        //找出2011年的所有交易并按照交易额排序
        transactions.stream()
                .filter(transaction -> transaction.getYear()==2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);
        //交易员都在哪些不同的城市工作过
        transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);
        //查找所有来自剑桥的交易员并按姓名排序
        transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> Objects.equals(trader.getCity(), "Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .distinct()
                .forEach(System.out::println);
        //返回所有交易员的姓名字符串，按字母顺序排序
        transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .sorted()
                .distinct()
                .reduce((s, s2) -> s + s2)
                .ifPresent(System.out::println);
        //有没有再米兰工作的交易员
        boolean match = transactions.stream()
                .anyMatch(transaction -> Objects.equals(transaction.getTrader().getCity(), "Milan"));
        System.out.println(match);

        //打印在剑桥的交易员的所有交易额
        transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

        //所有交易中最高的交易额
        transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max)
                .ifPresent(System.out::println);
        //交易额最小的交易
        transactions.stream()
                .reduce((transaction, transaction2) ->
                        transaction.getValue() < transaction2.getValue() ?
                                transaction:transaction2)
                .ifPresent(System.out::println);
        transactions.stream()
                .min((Comparator.comparing(Transaction::getValue)))
                .ifPresent(System.out::println);

    }
}
