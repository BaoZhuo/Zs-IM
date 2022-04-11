package com.zs.server.config;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import feign.Feign;
import feign.Request;
import feign.Retryer;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.I0Itec.zkclient.ZkClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zhishi
 * @version 1.0
 * @date 2022/4/11 10:38 上午
 */
@Data
@Component
@EqualsAndHashCode
@ConfigurationProperties(prefix = "fire-im.server")
public class AppGlobalConfig {

    private int nettyPort;

    private String zkAddress;

    private int zkConnectionTimeout;

    private boolean registerSelf;

    private String zkRootPath;

    private int heartbeatTime;

    private String storeType;

    private String routeUrl;

    private String tokenSecret;

    private Integer weight;

}
