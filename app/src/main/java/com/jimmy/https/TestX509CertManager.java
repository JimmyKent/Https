package com.jimmy.https;

import javax.net.ssl.SSLSocket;

/**
 * https://my.oschina.net/ososchina/blog/742883
 *
 * https://my.oschina.net/ososchina/blog/675037
 *
 * Java 实现TLS/SSL证书的自动安装校验，主要经过ssl/tls握手，密钥交换，证书校验机制实现。我们这里模拟浏览器，实现自动校验和证书的检测。

 主要实现如下功能：

 1.自动检测，校验根证书，校验过期时间，校验签名的证书是否有效，校验证书和域名是否匹配

 2.实现证书的自动存储，自动安装，加载

 3.实现普通Socket自动升级为SSLSocket
 */
public class TestX509CertManager {

    public static void main(String[] args) {
        try {
            SSLSocket baiduSocket = SSLX509CertificateManager.createTrustCASocket("www.baidu.com", 443);
            SSLSocket taobaoSocket = SSLX509CertificateManager.createTrustCASocket("www.taobao.com", 443);
            SSLSocket imququSocket = SSLX509CertificateManager.createTrustCASocket("imququ.com", 443);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
