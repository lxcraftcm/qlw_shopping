package com.lx.qlw.shopping;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ShoppingMangerWebApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("start.");
        String Test = "";
        try {
            String file = Test.getClass().getResource("/tracker.conf").getFile();
            ClientGlobal.init(file);
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getConnection();
            StorageClient storageClient = new StorageClient(trackerServer, null);
            String orginalFilename = "d://1.png";
            String[] upload_file = storageClient.upload_file(orginalFilename, "png", null);
            for (int i = 0; i < upload_file.length; i++) {
                String s = upload_file[i];
                System.out.println("s = " + s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
