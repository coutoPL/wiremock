package com.github.tomakehurst.wiremock.admin.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CaptureHeadersSpec {

    private final Boolean caseInsensitive;

    public CaptureHeadersSpec(@JsonProperty("caseInsensitive") Boolean caseInsensitive) {
        this.caseInsensitive = caseInsensitive;
    }

    public Boolean getCaseInsensitive() {
        return caseInsensitive;
    }
}
