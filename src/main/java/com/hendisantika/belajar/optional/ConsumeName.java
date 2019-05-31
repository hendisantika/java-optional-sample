package com.hendisantika.belajar.optional;

/**
 * Created by IntelliJ IDEA.
 * Project : java-optional-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-31
 * Time: 08:30
 */

/*
 * A function object that consumes a String.
 * Used in OptionalIfPresentConsumer
 */
public class ConsumeName {
    void printAName(String name) {
        System.out.println("Name is " + name);
        name = name.concat(" is a nice guy");
        System.out.println(name);
    }
}
