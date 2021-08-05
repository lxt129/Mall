package com.atguigu.gulimall.product;



import com.atguigu.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    public BrandService brandService;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedissonClient redissonClient;

    @Test
    public void test(){
        System.out.println(redissonClient);
    }

//    @Test
//    public void testUpload() throws FileNotFoundException {
//        InputStream inputStream = new FileInputStream("C:\\Users\\HP\\Desktop\\新建文件夹\\image\\265f198a1986a37b05be940e4d2ffe53.jpeg");
//
//        ossClient.putObject("edu-lxt01","img",inputStream);
//
//        ossClient.shutdown();
//    }
//
//    @Test
//    public void test(){
//        System.out.println("!!!!!!!!!!!");
//    }
}
