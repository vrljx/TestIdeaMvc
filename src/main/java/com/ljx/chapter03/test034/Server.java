package com.ljx.chapter03.test034;

/**
 * @Created by taylor on 2016/11/9.
 * @DESC
 */
abstract class Server {
    public static final int DEFAULT_PORT = 4000;

    public Server() {
        int port = this.getPort();
        System.out.println("aaa = " + port);
    }

    protected abstract int getPort();
}
