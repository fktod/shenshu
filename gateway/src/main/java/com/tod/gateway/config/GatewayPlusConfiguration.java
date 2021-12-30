package com.tod.gateway.config;

import com.tod.gateway.nacos.GatewayRouteProperties;
import com.tod.gateway.nacos.NacosRouteDefinitionLocator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * 网关配置类
 * TODO 改名字
 *
 * @author x
 */
@Slf4j
@Configuration
@EnableConfigurationProperties(GatewayRouteProperties.class)
public class GatewayPlusConfiguration {
    /**
     * nacos动态路由
     * 实现原理是什么
     * @param gatewayRouteProperties
     * @return
     */
    @Bean
    @ConditionalOnMissingBean
    public NacosRouteDefinitionLocator dynamicRouteDefinitionLocator(GatewayRouteProperties gatewayRouteProperties) {
        return new NacosRouteDefinitionLocator(gatewayRouteProperties);
    }

    /**
     * 动态路由加载
     *
     * @return
     */
//    @Bean
//    @Lazy
//    public ResourceReactiveLocator resourceReactiveLocator(RouteDefinitionLocator routeDefinitionLocator,
//                                                           SystemResourceAuthorityServiceClient systemResourceAuthorityServiceClient,
//                                                           GatewayServiceClient gatewayServiceClient) {
//        ResourceReactiveLocator resourceReactiveLocator = new ResourceReactiveLocator(routeDefinitionLocator, systemResourceAuthorityServiceClient, gatewayServiceClient);
//        log.info("ResourceLocator  {}", resourceReactiveLocator);
//        return resourceReactiveLocator;
//    }

}
