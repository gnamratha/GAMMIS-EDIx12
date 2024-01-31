package com.edi.Segments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Loop1000A_Segment {
    @JsonProperty
    private NM1SubmitterName nm1SubmitterName;
    @JsonProperty
    private PER perList;

    public NM1SubmitterName getNm1SubmitterName() {
        return nm1SubmitterName;
    }

    public void setNm1SubmitterName(NM1SubmitterName nm1SubmitterName) {
        this.nm1SubmitterName = nm1SubmitterName;
    }

    public PER getPerList() {
        return perList;
    }

    public void setPerList(PER perList) {
        this.perList = perList;
    }

    public class NM1SubmitterName {
        @JsonProperty
        private String nm101;
        @JsonProperty
        private String nm102;
        @JsonProperty
        private String nm103;
        @JsonProperty
        private String nm104;
        @JsonProperty
        private String nm105;
        @JsonProperty
        private String nm106;
        @JsonProperty
        private String nm107;
        @JsonProperty
        private String nm108;
        @JsonProperty
        private String nm109;
        @JsonProperty
        private String nm110;

        public String getNm101() {
            return nm101;
        }

        public String getNm102() {
            return nm102;
        }

        public String getNm103() {
            return nm103;
        }

        public String getNm104() {
            return nm104;
        }

        public String getNm105() {
            return nm105;
        }

        public String getNm106() {
            return nm106;
        }

        public String getNm107() {
            return nm107;
        }

        public String getNm108() {
            return nm108;
        }

        public String getNm109() {
            return nm109;
        }

        public String getNm110() {
            return nm110;
        }

        public void setNm110(String nm110) {
            this.nm110 = nm110;
        }

        public NM1SubmitterName(String nm101, String nm102, String nm103, String nm104, String nm105, String nm106, String nm107, String nm108, String nm109) {
            this.nm101 = nm101;
            this.nm102 = nm102;
            this.nm103 = nm103;
            this.nm104 = nm104;
            this.nm105 = nm105;
            this.nm106 = nm106;
            this.nm107 = nm107;
            this.nm108 = nm108;
            this.nm109 = nm109;
        }
    }
    public class PER {
        @JsonProperty
        private String per01;
        @JsonProperty
        private String per02;
        @JsonProperty
        private String per03;
        @JsonProperty
        private String per04;

        public String getPer01() {
            return per01;
        }

        public void setPer01(String per01) {
            this.per01 = per01;
        }

        public String getPer02() {
            return per02;
        }

        public void setPer02(String per02) {
            this.per02 = per02;
        }

        public String getPer03() {
            return per03;
        }

        public void setPer03(String per03) {
            this.per03 = per03;
        }

        public String getPer04() {
            return per04;
        }

        public void setPer04(String per04) {
            this.per04 = per04;
        }

        public PER(String per01, String per02, String per03, String per04) {
            this.per01 = per01;
            this.per02 = per02;
            this.per03 = per03;
            this.per04 = per04;
        }
    }
}

