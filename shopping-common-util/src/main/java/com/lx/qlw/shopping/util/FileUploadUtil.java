package com.lx.qlw.shopping.util;


import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;

public class FileUploadUtil {

    public static String uploadImage(byte[] image, String imageName) throws Exception {
        String url = "http://192.168.0.107:";
        String tracker = FileUploadUtil.class.getResource("/tracker.conf").getPath();
        ClientGlobal.init(tracker);
        TrackerClient trackerClient = new TrackerClient();
        TrackerServer trackerServer = trackerClient.getConnection();
        StorageClient storageClient = new StorageClient(trackerServer, null);
        int i = imageName.lastIndexOf(".");
        String extName = imageName.substring(i + 1);
        for (String uploadImageinfo : storageClient.upload_file(image, extName, null)) {
            url += "/" + uploadImageinfo;
        }
        return url;
    }
}
