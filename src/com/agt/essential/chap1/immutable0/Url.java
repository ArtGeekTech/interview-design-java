package com.agt.essential.chap1.immutable0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Url {

    private final String host; //required
    private final String path;
    private final String scheme;
    private final Integer port; // default value 0 is unsuitable
    private final String anchor;
    private final Map<String, List<String>> queryParams;

    public static class Builder {
        private final String host; //required
        private String path;
        private String scheme = "http";
        private Integer port;
        private String anchor;
        private final Map<String, List<String>> queryParams = new HashMap<>();

        private Builder(String host) {
            this.host = host;
        }

        public Builder path(String path) {
            this.path = path;
            return this;
        }

        public Builder scheme(String scheme) {
            this.scheme = scheme;
            return this;
        }

        public Builder port(int port) {
            this.port = port;
            return this;
        }

        public Builder anchor(String anchor) {
            this.anchor = anchor;
            return this;
        }

        public Builder queryParams(String key, String value) {
            List<String> values = queryParams.getOrDefault(key, new ArrayList<>());
            values.add(value);
            return this;
        }

        public Url build() {
            return new Url(this);
        }
    }

    public static Builder builder(String host) {
        return new Builder(host);
    }

    private Url(Builder builder) {
        this.host = builder.host;
        this.path = builder.path;
        this.scheme = builder.scheme;
        this.port = builder.port;
        this.anchor = builder.anchor;
        this.queryParams = builder.queryParams;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(scheme).append("://").append(host)
                .append(port == null ? "" : ":" + port)
                .append(path).append(buildString(queryParams))
                .append(anchor == null ? "" : "#" + anchor);
        return sb.toString();
    }

    private String buildString(Map<String, List<String>> queryParams) {
        return null;
    }

    public static void main(String[] args) {
        Url url0 = Url.builder("www.google.com").build();
    }
}
