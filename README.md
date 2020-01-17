#技术网站  
[dubbo](http://dubbo.apache.org/zh-cn/) <br>


# 1、RPC原理
```
(1)、先建立http请求  <br>
(2)、将调用信息序列化发送给b; User user = bServiceProxy.hello(obj);//相当于远程调用 <br>
(3)、b调用完成将结果反序列化给a <br>
RPC框架:Dubbo(java语言)、Thwift(跨语言) <br>
```
![RPC](https://github.com/LoveChunHua/Grain-Mall/blob/master/images/RPC.png) <br>

# 2、CAP？BASE?
```
CAP:<br>
(1)、一致性 Consistency <br>
    在分布式系统中的所有备份数据，在同一时刻是否同样的值。（写操作之后的读操作，必须返回该值。<br>
    更新操作执行成功后所有的用户都应该读到最新的值，要求所有的备份数据保持一致。<br>
(2)、可用性 Availability <br>
    在集群中一部分节点故障后，集群整体是否还能响应客户端的读写请求。（要求数据需要备份）<br>
(3)、分区容错 Partition tolerance <br>
    大多数分布式系统都分布在多个子网络中，每个子网络就叫做一个区。区间通信可能失败 <br>
CAP理论就是说在分布式系统中，最多只能实现其中的两点。而由于当前网络硬件肯定会出现延迟丢包等问题。<br>
所以分区容错是必须选的，只能从可用性和一致性二选一。<br>

一致性和可用性，为什么不能同时成立？答案很简单，因为可能通信失败，此时是选择对外服务的可用性还是要等待一致性导致不可用<br>
zookeeper :CP<br>
redis :AP<br>
Zookeeper如何在分布式系统中实现一致性的raft算法：http://thesecretlivesofdata.com/raft/ <br>

BASE: <br>
基本可用：Basically Available 软状态：Soft state 最终一致性：Eventually consistent <br>
```

# 3、Dubbo

三大核心能力：面向接口的远程方法调用;智能容错和负载均衡;服务自动注册和发现 <br>
Dubbo原理图 <br>
![Dubbo](https://github.com/LoveChunHua/Grain-Mall/blob/master/images/Dubbo%20Architecture.png)
![ipAndGateWay](https://github.com/LoveChunHua/Grain-Mall/blob/master/images/linuxAndGateway.png)

服务注册到zookeeper之后，dubbo将服务封装成代理对象，然后通过代理对象反射invoke执行方法<br>
dubbo底层利用netty框架将AB两个服务架起网络连接（通过send（request）），用channel读数据和写数据<br>







