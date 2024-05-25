package com.psja;

import org.springframework.context.annotation.Configuration;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class CacheEvictConfiguration {

	@CacheEvict(value="ertbMessage", allEntries=true)
	@Scheduled(fixedDelay=30000)
	public void cacheEvictErtbMessage() {
		System.out.println("In cache evict");
	}
}
