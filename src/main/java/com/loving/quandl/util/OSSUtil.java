package com.loving.quandl.util;

import java.io.InputStream;
import java.util.List;

import com.aliyun.oss.OSSClient;

/**
 * OSSUtil.java
 * Description: 阿里OSS工具类
 * Author: lmg
 * Date: 2017年1月20日 上午10:24:48
 */
public class OSSUtil {

	// 外网地址
	public static String endpoint = "http://oss-cn-qingdao.aliyuncs.com";
	// 内网地址
	// public static String endpoint = "http://oss-cn-qingdao-internal.aliyuncs.com";
	public static String accessKeyId = "0SDJzixpxadHXW48";
	public static String accessKeySecret = "MxlqFK3EO7hQK2NVx2uVZJDvVOWvNK";
	public static String bucketName = "quandl";
	private static OSSClient client = null;

	public static OSSClient ossClient() {
		if (client == null)
			client = new OSSClient(endpoint, accessKeyId, accessKeySecret);
		return client;
	}
	
	/**
	 * 上传文流到OSS
	 */
	public static boolean putObjectByStream(String key,InputStream input) {
		boolean uploadStatus = false;
		try {
			ossClient().putObject(bucketName, key ,input);
			uploadStatus = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return uploadStatus;
	}
	
	/**
	 * 获取指定路径下的文件列表
	 */
	public List<String> getObjectsByPath(String key) {
		return null;
	}
}
