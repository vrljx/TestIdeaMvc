package com.ljx.test034;

/**
 * @Created by taylor on 2016/11/9.
 * @DESC
 */
 class SimpleServer extends Server {
    private int port = 100;
    public SimpleServer(int _port){
       port = _port; 
    }
    protected int getPort() {
        return Math.random() > 0.5 ? port: DEFAULT_PORT;
    }
}
