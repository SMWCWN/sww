package org.example.websocket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @Description: 类作用描述：
 * @Author: sww
 * @UpdateUser:
 * @UpdateRemark: 修改内容
 * @Version: 0.0.1
 */
@Configuration
public class WebSocketConfig {

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

}
