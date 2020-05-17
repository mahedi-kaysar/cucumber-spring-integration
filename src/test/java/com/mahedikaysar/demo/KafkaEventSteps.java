package com.mahedikaysar.demo;

import com.mahedikaysar.demo.model.KafkaEvent;
import com.mahedikaysar.service.GcpStorageService;
import com.mahedikaysar.service.KafkaService;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class KafkaEventSteps {
    @Autowired
    private KafkaService kafkaService;

    @Autowired
    private GcpStorageService gcpStorageService;

    private List<KafkaEvent> kafkaEvents;

    private String topicName;

    private String bucketName;

    @Given("The following Demon kafka Event")
    public void theFollowingDemonKafkaEvent(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }

    @Given("An empty bucket {string} exists in GCS")
    public void anEmptyBucketExistsInGCS(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("A kafka topic {string} exists in kafka")
    public void aKafkaTopicExistsInKafka(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The Demo kafka events are published to the \"demo_kafka_event\" topic")
    public void theDemoKafkaEventsArePublishedToTheDemo_kafka_eventTopic() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("{string} gcs bucket contains {int} files")
    public void gcsBucketContainsFiles(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The following Demon EventId will be found into {string} gcs bucket")
    public void theFollowingDemonEventIdWillBeFoundIntoGcsBucket(String string, DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }

}
