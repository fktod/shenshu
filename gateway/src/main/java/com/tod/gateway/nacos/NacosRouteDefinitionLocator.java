package com.tod.gateway.nacos;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
import reactor.core.publisher.Flux;

/**
 * nacos 动态路由定义
 */
@Slf4j
public class NacosRouteDefinitionLocator implements RouteDefinitionLocator {

    private final GatewayRouteProperties properties;

    public NacosRouteDefinitionLocator(GatewayRouteProperties properties) {
        this.properties = properties;
    }

    @Override
    public Flux<RouteDefinition> getRouteDefinitions() {
        return Flux.fromIterable(this.properties.getRoutes());
    }

}
