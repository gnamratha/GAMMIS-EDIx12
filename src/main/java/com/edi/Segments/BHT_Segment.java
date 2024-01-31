package com.edi.Segments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BHT_Segment {

    @JsonProperty("BHT01")
    private String BHT01;
    @JsonProperty("BHT02")
    private String BHT02;
    @JsonProperty("BHT03")
    private String BHT03;
    @JsonProperty("BHT04")
    private String BHT04;
    @JsonProperty("BHT05")
    private String BHT05;
    @JsonProperty("BHT06")
    private String BHT06;


    public String getBHT01() {
        return BHT01;
    }

    public void setBHT01(String BHT01) {
        this.BHT01 = BHT01;
    }

    public String getBHT02() {
        return BHT02;
    }

    public void setBHT02(String BHT02) {
        this.BHT02 = BHT02;
    }

    public String getBHT03() {
        return BHT03;
    }

    public void setBHT03(String BHT03) {
        this.BHT03 = BHT03;
    }

    public String getBHT04() {
        return BHT04;
    }

    public void setBHT04(String BHT04) {
        this.BHT04 = BHT04;
    }

    public String getBHT05() {
        return BHT05;
    }

    public void setBHT05(String BHT05) {
        this.BHT05 = BHT05;
    }

    public String getBHT06() {
        return BHT06;
    }

    public void setBHT06(String BHT06) {
        this.BHT06 = BHT06;
    }
}
