package com.crz.caffeine.model;

import java.util.concurrent.atomic.AtomicInteger;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author crz
 * @Description:
 * @date: 2018/10/23 下午6:04
 * @since JDK 1.8
 */
@AllArgsConstructor
@Data
public class CacheData {

    private String data;
     private static AtomicInteger counter = new AtomicInteger(0);

    public static CacheData get(String data) {
        counter.incrementAndGet();
        return new CacheData(data);
    }
}
