# kafka-consumer-procucer
# zookeeper-server-start C:\kafka_2.13-3.3.2\config\zookeeper.properties

# kafka-server-start C:\kafka_2.13-3.3.2\config\server.properties




# kafka-topics --list --bootstrap-server localhost:9092

# kafka-topics --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic first-topic

# kafka-topics --describe --bootstrap-server localhost:9092 --topic first-topic

# kafka-console-consumer --bootstrap-server localhost:9092 --topic first-topic

# kafka-console-producer --broker-list localhost:9092 --topic first-topic

# kafka-topics --delete --bootstrap-server localhost:9092 --topic first-topic                           

Note:

# For delete add the following in kafka server.properties

# delete.topic.enable=true
