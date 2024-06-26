package com._09_索引;

// 索引机制
//
//  (1)问：没有索引为什么会慢？
//      当不建立索引，执行[SELECT * FROM table WHERE...]语句时，
//      由于该操作要求返回所有符合where条件的语句，因此MySQL会执行全表的遍历扫描过程
//
//
//  (2)问：使用索引为什么会快？
//      当建立索引，该表中会形成一个索引的数据结构，如B+树，拿空间换时间，
//      通过引索查找数据，会将时间复杂度从O(n)变为O(log2(n))，极大程度上节省空间
//
//
//  (3)索引的代价：
//      ①引索本身会占用磁盘空间
//      ②建立引索后，会降低数据的添加、删除、修改的效率
//       （对数据CRUT时，也要相应的改变索引的结构）
//      注意：实际项目中select的使用频率远大于增删改，因此适当建立引索不亏
//
//
//  (4)问：如何选择字段创建索引？
//      ①较频繁作为查询条件的字段应该创建索引
//      ②唯一性太差的字段不适合创建索引，如：sex
//      ③更新非常频繁的字段不适合创建索引
//      ④不会出现在where子句中作为查询条件的字段不应该创建索引
//


public class _01_索引机制 {
}
