package com.donald.router;

import java.util.List;

/**
 * @author donald
 * @date 2020/12/14
 */
public interface HttpEndpointRouter {

    String route(List<String> endpoints);

    // Load Balance
    // Random
    // RoundRibbon
    // Weight
    // - server01,20
    // - server02,30
    // - server03,50

}
