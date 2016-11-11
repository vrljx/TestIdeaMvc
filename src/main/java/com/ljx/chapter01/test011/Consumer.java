package com.ljx.chapter01.test011;

/**
 * @Created by taylor on 2016/11/4.
 * @DESC
 * 这是一个反序列化过程，也就是对象数据流转换为一个实例对象的过程，其运行后的输出结果为：混世魔王。这太easy了，是的，这就是序列化和反序列化典型的demo。但此处隐藏着一个问题：如果消息的生产者和消息的消费者所参考的类（Person类）有差异，会出现何种神奇事件？比如：消息生产者中的Person类增加了一个年龄属性，而消费者没有增加该属性。为啥没有增加？！因为这是个分布式部署的应用，你甚至都不知道这个应用部署在何处，特别是通过广播（broadcast）方式发送消息的情况，漏掉一两个订阅者也是很正常的。 在这种序列化和反序列化的类不一致的情形下，反序列化时会报一个InvalidClassException异常，原因是序列化和反序列化所对应的类版本发生了变化，JVM不能把数据流转换为实例对象。接着刨根问底：JVM是根据什么来判断一个类版本的呢？ 好问题，通过SerialVersionUID，也叫做流标识符（Stream Unique Identifier），即类的版本定义的，它可以显式声明也可以隐式声明。显式声明格式如下：
 * private static final long serialVersionUID=XXXXXL；
 * 而隐式声明则是我不声明，你编译器在编译的时候帮我生成。生成的依据是通过包名、类名、继承关系、非私有的方法和属性，以及参数、返回值等诸多因子计算得出的，极度复杂，基本上计算出来的这个值是唯一的。 serialVersionUID如何生成已经说明了，我们再来看看serialVersionUID的作用。JVM在反序列化时，会比较数据流中的serialVersionUID与类的serialVersionUID是否相同，如果相同，则认为类没有发生改变，可以把数据流load为实例对象；如果不相同，对不起，我JVM不干了，抛个异常InvalidClassException给你瞧瞧。这是一个非常好的校验机制，可以保证一个对象即使在网络或磁盘中“滚过”一次，仍能做到“出淤泥而不染”，完美地实现类的一致性。
 */
public class Consumer {
    public static void main(String[] args) {
        // 反序列化
        Person p = (Person) SerialazationUtils.readObject();
        System.out.println(p.getName());
    }
}
