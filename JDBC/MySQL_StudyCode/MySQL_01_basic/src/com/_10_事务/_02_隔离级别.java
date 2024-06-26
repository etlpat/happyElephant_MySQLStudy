package com._10_事务;

//  隔离级别
//
//  todo 1.读取一致性问题
//  读取一致性问题：即当多用户并发执行数据库事务时，各用户读取到的数据不一致、不确定的问题。
//  ①脏读：用户在事务中，读到了其他用户未提交(commit)的数据
//  ②不可重复读：用户在事务中，读到了其他用户提交了的修改(update)、删除(delete)操作后的数据
//  ③幻读：用户在事务中，读到了其他用户提交了的插入(insert)操作后的数据
//  注意：以上三种错误，只有在事务中读取数据时才会遇到。
//
//
//  todo 2.事务的隔离级别（isolation level）
//  概念：在多个事务并发执行时，数据库系统通过隔离级别来定义事务之间的可见性和锁定行为，以保证用户获得数据的准确性。
//       不同的隔离级别可以不同程度上避免数据的一致性问题。
//  ①读未提交(read uncommitted)：会出现脏读+不可重复读+幻读，读取数据不加锁
//  ②读已提交(read committed)：不会出现脏读，会出现不可重复读+幻读，读取数据不加锁
//  ③可重复读(repeatable read)：不会出现脏读+不可重复读+大部分幻读，可能出现少量幻读，读取数据不加锁
//  ④串行化(serializable)：不会出现脏读+不可重复读+幻读，读取数据时会加锁
//  注意：如上①->④，按照隔离程度由小到大排列。
//
//
//  todo 3.隔离级别相关语法
//  ①查看当前会话隔离级别：SELECT @@tx_isolation;
//  ②查看系统当前隔离级别：SELECT @@global.tx_isolation;
//  ③设置当前会话隔离级别：SET SESSION TRANSACTION ISOLATION LEVEL 隔离级别名;  （隔离级别名，即如上英文直译）
//  ③设置系统当前隔离级别：SET GLOBAL TRANSACTION ISOLATION LEVEL 隔离级别名;
//  注意：MySQL事务默认的隔离级别为可重复读(repeatable read)，该级别可以满足绝大多数项目要求
//


public class _02_隔离级别 {
}
