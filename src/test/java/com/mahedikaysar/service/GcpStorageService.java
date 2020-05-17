package com.mahedikaysar.service;

import com.google.cloud.storage.Blob;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.Storage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GcpStorageService {

    @Autowired
    private Storage storage;

    public boolean checkIfBucketExist(String bucketName) {
        Bucket bucket = storage.get(bucketName);
        log.info("bucket" + bucket);
        return bucket != null;
    }
}
