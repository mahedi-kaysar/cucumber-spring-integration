Feature: Demo Data pipeline to ingest raw kafka event data to Data Lake
    Expectation: Write Demo kafka Events to GCS bucket that are published to a Kafka topic.

    Scenario: Demo Data pipeline to ingest raw kafka event data to GCS
        Given The following Demon kafka Event
            | EventId |  Message         |
            | 1       |  Hello Message 1 |
            | 2       |  Hello Message 2 |
        And An empty bucket "demo-kafka-events" exists in GCS
        And A kafka topic "demo_kafka_event" exists in kafka
        When The Demo kafka events are published to the "demo_kafka_event" topic
        Then "demon-kafka-events" gcs bucket contains 2 files
        And The following Demon EventId will be found into "demo-kafka-events" gcs bucket
            | EventId |
            | 1       |
            | 2       |