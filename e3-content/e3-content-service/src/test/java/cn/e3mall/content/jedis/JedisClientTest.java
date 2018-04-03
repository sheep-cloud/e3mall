package cn.e3mall.content.jedis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.e3mall.common.jedis.JedisClient;

public class JedisClientTest {

	private ApplicationContext applicationContext;

	@Test
	public void testJedisClient() {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-redis.xml");
		// 从容器中获得JedisClient对象
		JedisClient jedisClient = applicationContext.getBean(JedisClient.class); // 单机版或集群版
		jedisClient.set("mytest", "jedisClient");
		System.out.println(jedisClient.get("mytest"));
	}

}