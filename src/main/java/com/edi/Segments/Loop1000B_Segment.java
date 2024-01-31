package com.edi.Segments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Loop1000B_Segment {
    @JsonProperty
    private NM1ReceiverName nm1ReceiverName;

    public NM1ReceiverName getNm1ReceiverName() {
        return nm1ReceiverName;
    }

    public void setNm1ReceiverName(NM1ReceiverName nm1ReceiverName) {
        this.nm1ReceiverName = nm1ReceiverName;
    }

    public Loop1000B_Segment(NM1ReceiverName nm1ReceiverName) {
        this.nm1ReceiverName = nm1ReceiverName;
    }
    public class NM1ReceiverName {
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

        public void setNm101(String nm101) {
            this.nm101 = nm101;
        }

        public String getNm102() {
            return nm102;
        }

        public void setNm102(String nm102) {
            this.nm102 = nm102;
        }

        public String getNm103() {
            return nm103;
        }

        public void setNm103(String nm103) {
            this.nm103 = nm103;
        }

        public String getNm104() {
            return nm104;
        }

        public void setNm104(String nm104) {
            this.nm104 = nm104;
        }

        public String getNm105() {
            return nm105;
        }

        public void setNm105(String nm105) {
            this.nm105 = nm105;
        }

        public String getNm106() {
            return nm106;
        }

        public void setNm106(String nm106) {
            this.nm106 = nm106;
        }

        public String getNm107() {
            return nm107;
        }

        public void setNm107(String nm107) {
            this.nm107 = nm107;
        }

        public String getNm108() {
            return nm108;
        }

        public void setNm108(String nm108) {
            this.nm108 = nm108;
        }

        public String getNm109() {
            return nm109;
        }

        public void setNm109(String nm109) {
            this.nm109 = nm109;
        }

        public String getNm110() {
            return nm110;
        }

        public void setNm110(String nm110) {
            this.nm110 = nm110;
        }

        public NM1ReceiverName(String nm101, String nm102, String nm103, String nm104, String nm105, String nm106, String nm107, String nm108, String nm109, String nm110) {
            this.nm101 = nm101;
            this.nm102 = nm102;
            this.nm103 = nm103;
            this.nm104 = nm104;
            this.nm105 = nm105;
            this.nm106 = nm106;
            this.nm107 = nm107;
            this.nm108 = nm108;
            this.nm109 = nm109;
            this.nm110 = nm110;
        }
    }
}
