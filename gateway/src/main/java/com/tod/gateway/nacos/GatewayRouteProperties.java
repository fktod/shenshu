package com.tod.gateway.nacos;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.gateway.route.RouteDefinition;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@ConfigurationProperties("spring.cloud.gateway")
public class GatewayRouteProperties implements Serializable {

    private static final long serialVersionUID = 6345811282810969963L;

    @NotNull
    @Valid
    private List<RouteDefinition> routes = new ArrayList<>();

}
