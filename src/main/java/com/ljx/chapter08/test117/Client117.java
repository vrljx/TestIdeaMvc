package com.ljx.chapter08.test117;

/**
 * @Created by taylor on 2016/11/29.
 * @DESC    多使用异常，把性能问题放一边
 * Java的异常处理机制确实比较慢，这个“比较慢”是相对于诸如String、Integer等对象来说的，
 * 单单从对象的创建上来说，new一个IOException会比String慢5倍，
 * 这从异常的处理机制上也可以解释：因为它要执行fillInStackTrace方法，要记录当前栈的快照，
 * 而String类则是直接申请一个内存创建对象，异常类慢一筹也就在所难免了。 
 * 而且，异常类是不能缓存的，期望预先建立大量的异常对象以提高异常性能也是不现实的。 
 * 
 * 难道异常的性能问题就没有任何可提高的办法了？确实没有，但是我们不能因为性能问题而放弃使用异常，
 * 而且经过测试，在JDK 1.6下，一个异常对象创建的时间只需要1.4毫秒左右（注意是毫秒，通常一个交易处理是在100毫秒左右），
 * 难道我们的系统连如此微小的性能消耗都不允许吗？ 注意　性能问题不是拒绝异常的借口。
 */
public class Client117 {
}
