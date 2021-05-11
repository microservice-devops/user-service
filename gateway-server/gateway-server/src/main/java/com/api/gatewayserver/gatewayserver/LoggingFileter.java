package com.api.gatewayserver.gatewayserver;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class LoggingFileter implements GlobalFilter{

	private Logger log = LoggerFactory.getLogger(LoggingFileter.class);

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		log.info("test logger info @@@@@@@@@@@@@@@@@@@@@@@  -> {}", exchange.getRequest().getPath() );
		return chain.filter(exchange);
	}
	
}
