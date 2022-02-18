package com.gur.rest.works.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient(name="USER-ADDRESS")
public interface UserAddressProxy {
	@GetMapping("/address/{name}")
	public String getAddress(@PathVariable String name);
}
