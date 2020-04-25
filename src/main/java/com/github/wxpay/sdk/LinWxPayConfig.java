package com.github.wxpay.sdk;

import java.io.InputStream;

public class LinWxPayConfig extends WXPayConfig {

    @Override
    String getAppID() {
        return null;
    }

    @Override
    String getMchID() {
        return null;
    }

    @Override
    String getKey() {
        return null;
    }

    @Override
    InputStream getCertStream() {
        return null;
    }

    public int getHttpConnectTimeoutMs() {
        return 8000;
    }

    public int getHttpReadTimeoutMs() {
        return 10000;
    }

    @Override
    public IWXPayDomain getWXPayDomain() {
        IWXPayDomain iwxPayDomain = new IWXPayDomain() {
            @Override
            public void report(String domain, long elapsedTimeMillis, Exception ex) {

            }

            @Override
            public DomainInfo getDomain(WXPayConfig config) {
                return new IWXPayDomain.DomainInfo(WXPayConstants.DOMAIN_API, true);
            }
        };
        return iwxPayDomain;
    }
}
