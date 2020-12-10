package com.jlm.yunjian.websocket.controller;

import com.jlm.yunjian.websocket.config.WebSocket;
import javafx.concurrent.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 类作用描述：
 * @Author: sww
 * @UpdateUser:
 * @UpdateRemark: 修改内容
 * @Version: 0.0.1
 */
@RestController
public class WebSocketController {


    @Autowired
    WebSocket webSocket;

    @GetMapping("send/{messager}")
    public String sendWebSocket(@PathVariable(value = "messager") String messager) {
        webSocket.sendMessage(messager);
        return messager;
    }

}
