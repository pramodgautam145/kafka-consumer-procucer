package com.pramod;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import java.util.Properties;

public class OrderProducer {
    public static void main(String[] args) {

        Properties props = new Properties();
        props.setProperty("bootstrap.servers", "localhost:9092");
        props.setProperty("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.setProperty("value.serializer", "org.apache.kafka.common.serialization.IntegerSerializer");
        KafkaProducer<String, Integer> producer = new KafkaProducer<String, Integer>(props);
        ProducerRecord<String, Integer> record = new ProducerRecord<>("OrderTopic", "Mac Book Pro", 10);

        try {
            //Sync call
           // RecordMetadata recordMetadata = producer.send(record).get();
           // System.out.println(recordMetadata.partition());
           // System.out.println(recordMetadata.offset());
            //Async call
          producer.send(record,new OrderCallback());

            System.out.println("message successfully sent");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            producer.close();
        }
    }
}
