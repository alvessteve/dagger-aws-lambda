package com.salves.di.daggeraws.infrastructure;

import java.util.Map;

public class ApiGatewayResponse {
    private String body;
    private boolean isBase64Encoded = false;
    private String statusCode;
    private Map<String, String> headers;

    public ApiGatewayResponse(String body, boolean isBase64Encoded, String statusCode, Map<String, String> headers) {
        this.body = body;
        this.isBase64Encoded = isBase64Encoded;
        this.statusCode = statusCode;
        this.headers = headers;
    }


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean isBase64Encoded() {
        return isBase64Encoded;
    }

    public void setBase64Encoded(boolean base64Encoded) {
        isBase64Encoded = base64Encoded;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }
}
