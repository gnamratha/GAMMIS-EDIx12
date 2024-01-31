package com.edi.Segments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ST_Segment {
    @JsonProperty("ST00")
    private String ST00;
    @JsonProperty("ST01")
    private String ST01;
    @JsonProperty("ST02")
    private String ST02;
    @JsonProperty("ST03")
    private String ST03;

    public String getST00() {
        return ST00;
    }

    public void setST00(String ST00) {
        this.ST00 = ST00;
    }

    public String getST01() {
        return ST01;
    }

    public void setST01(String ST01) {
        this.ST01 = ST01;
    }

    public String getST02() {
        return ST02;
    }

    public void setST02(String ST02) {
        this.ST02 = ST02;
    }

    public String getST03() {
        return ST03;
    }

    public void setST03(String ST03) {
        this.ST03 = ST03;
    }
}
