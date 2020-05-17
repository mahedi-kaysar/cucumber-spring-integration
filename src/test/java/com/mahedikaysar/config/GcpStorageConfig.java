package com.mahedikaysar.config;

import com.google.api.gax.retrying.RetrySettings;
import com.google.cloud.http.HttpTransportOptions;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GcpStorageConfig {

    /**
     * GCS cloud storage client.
     * @param connectTimeout timeout for establishing connection
     * @param readTimeout timeout for reading from channel.
     * @param retryAttempts max. retry attempts before failing.
     * @return instance oF GCP cloud storage client.
     */
    @Bean
    public Storage gcsStorageClient(
            @Value("${stratus.gcs.connect.timeout:60000}") int connectTimeout,
            @Value("${stratus.gcs.read.timeout:60000}") int readTimeout,
            @Value("${stratus.gcs.retry.attempts:3}") int retryAttempts) {

        HttpTransportOptions transportOptions = StorageOptions
                .getDefaultHttpTransportOptions()
                .toBuilder()
                .setConnectTimeout(connectTimeout)
                .setReadTimeout(readTimeout)
                .build();

        StorageOptions storageOptions = StorageOptions.newBuilder()
                .setRetrySettings(RetrySettings.newBuilder().setMaxAttempts(retryAttempts).build())
                .setTransportOptions(transportOptions)
                .build();

        return storageOptions.getService();
    }
}
