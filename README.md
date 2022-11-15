# spring-cloud-loadbalancer-usage

notes：

启动 server 的时候，需要启动多实例，且每个实例要定义 VM options

实例1： 

定义 VM options 为 `-Dserver.port=8090`

实例2：

定义 VM options 为 `-Dserver.port=9092`

实例3：

定义 VM options 为 `-Dserver.port=9999`