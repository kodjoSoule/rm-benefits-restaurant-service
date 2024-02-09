package com.rewardomain.restaurant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rewardomain.restaurant.bean.BenefitServer;

@RestController
public class BenefitServerControIIer {
	@GetMapping("/benefit-server")
	public BenefitServer getBenefitServer() {
		return new BenefitServer( "unique", "SRV-LOCAL-UNKØØI");
	}
}
