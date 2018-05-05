/**
 * 看看别人的Java Doc写的多好,再看看你，一坨狗屎！
 * Logs a {@link org.jboss.netty.channel.ChannelEvent} for debugging purpose
 * using an {@link org.jboss.netty.logging.InternalLogger}.
 
 */
package com.base.jvmtunning;
//关于JVM调优的一些文档资料：
/*
CASE1:
执行jstat -gcutil 9132【pid】 1000命令：
通过打印的GC数据可以看出，JVM一直在进行FGC（cms gc），不过老年代的使用率反而没有下降，
一直稳定在60.16%，对这一情况很疑惑，几乎每次都重现，后来去仔细查看了JVM的启动参数，
发现其中CMSInitiatingOcupancyFraction参数，被设置成60，意味着当老年代的使用率达到阈值60%时会触发FGC，但是FGC之后，老年代的使用率还是大于60%，
所以会不断的进行FGC，建议这个值不要设置的这么小。
至于为什么FGC之后，老年代的使用率没有下降，可以通过dump查看到底是哪些存活对象在作怪，在进行FGC时，通常会伴随着一次YGC，
但这也不是一定的，如果执行YGC之后没有明显效果的话，会设置一个变量，表明下次不用进行YGC，所以如果老年代如果存在大量对象的GC ROOT在新生代的话，
这些对象就不会被回收，这种情况必须强制执行一次YGC之后，才有可能回收这些老年代的对象，比如添加参数-XX:+CMSScavengeBeforeRemark，就可以解这个问题。

*/


