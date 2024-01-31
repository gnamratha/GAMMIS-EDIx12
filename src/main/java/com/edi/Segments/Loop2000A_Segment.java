package com.edi.Segments;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Loop2000A_Segment {
    @JsonProperty("HL_BillingProviderHierarchicalLevel")
    private HLBillingProviderHierarchicalLevel hlBillingProviderHierarchicalLevel;

    @JsonProperty("PRV_BillingProviderSpecialtyInformation")
    private PRVBillingProviderSpecialtyInformation prvBillingProviderSpecialtyInformation;

    @JsonProperty("Loop2010AA")
    private List<Loop2010AA> loop2010AAList;

    public HLBillingProviderHierarchicalLevel getHlBillingProviderHierarchicalLevel() {
        return hlBillingProviderHierarchicalLevel;
    }

    public void setHlBillingProviderHierarchicalLevel(HLBillingProviderHierarchicalLevel hlBillingProviderHierarchicalLevel) {
        this.hlBillingProviderHierarchicalLevel = hlBillingProviderHierarchicalLevel;
    }

    public PRVBillingProviderSpecialtyInformation getPrvBillingProviderSpecialtyInformation() {
        return prvBillingProviderSpecialtyInformation;
    }

    public void setPrvBillingProviderSpecialtyInformation(PRVBillingProviderSpecialtyInformation prvBillingProviderSpecialtyInformation) {
        this.prvBillingProviderSpecialtyInformation = prvBillingProviderSpecialtyInformation;
    }

    public List<Loop2010AA> getLoop2010AAList() {
        return loop2010AAList;
    }

    public void setLoop2010AAList(List<Loop2010AA> loop2010AAList) {
        this.loop2010AAList = loop2010AAList;
    }


@JsonInclude(JsonInclude.Include.NON_NULL)
class HLBillingProviderHierarchicalLevel {
    @JsonProperty("HL01")
    private String hl01;

    @JsonProperty("HL02")
    private String hl02;

    @JsonProperty("HL03")
    private String hl03;

    public String getHl01() {
        return hl01;
    }

    public void setHl01(String hl01) {
        this.hl01 = hl01;
    }

    public String getHl02() {
        return hl02;
    }

    public void setHl02(String hl02) {
        this.hl02 = hl02;
    }

    public String getHl03() {
        return hl03;
    }

    public void setHl03(String hl03) {
        this.hl03 = hl03;
    }
}

@JsonInclude(JsonInclude.Include.NON_NULL)
class PRVBillingProviderSpecialtyInformation {
    @JsonProperty("PRV01")
    private String prv01;

    @JsonProperty("PRV02")
    private String prv02;

    @JsonProperty("PRV03")
    private String prv03;

    public String getPrv01() {
        return prv01;
    }

    public void setPrv01(String prv01) {
        this.prv01 = prv01;
    }

    public String getPrv02() {
        return prv02;
    }

    public void setPrv02(String prv02) {
        this.prv02 = prv02;
    }

    public String getPrv03() {
        return prv03;
    }

    public void setPrv03(String prv03) {
        this.prv03 = prv03;
    }
}

@JsonInclude(JsonInclude.Include.NON_NULL)
class Loop2010AA {
    @JsonProperty("NM1_BillingProviderName")
    private NM1BillingProviderName nm1BillingProviderName;

    @JsonProperty("N3_BillingProviderAddress")
    private N3BillingProviderAddress n3BillingProviderAddress;

    @JsonProperty("N4_BillingProviderCity_State_ZIPCode")
    private N4BillingProviderCityStateZIPCode n4BillingProviderCityStateZIPCode;

    @JsonProperty("REF_BillingProviderTaxIdentification")
    private REFBillingProviderTaxIdentification refBillingProviderTaxIdentification;

    public NM1BillingProviderName getNm1BillingProviderName() {
        return nm1BillingProviderName;
    }

    public void setNm1BillingProviderName(NM1BillingProviderName nm1BillingProviderName) {
        this.nm1BillingProviderName = nm1BillingProviderName;
    }

    public N3BillingProviderAddress getN3BillingProviderAddress() {
        return n3BillingProviderAddress;
    }

    public void setN3BillingProviderAddress(N3BillingProviderAddress n3BillingProviderAddress) {
        this.n3BillingProviderAddress = n3BillingProviderAddress;
    }

    public N4BillingProviderCityStateZIPCode getN4BillingProviderCityStateZIPCode() {
        return n4BillingProviderCityStateZIPCode;
    }

    public void setN4BillingProviderCityStateZIPCode(N4BillingProviderCityStateZIPCode n4BillingProviderCityStateZIPCode) {
        this.n4BillingProviderCityStateZIPCode = n4BillingProviderCityStateZIPCode;
    }

    public REFBillingProviderTaxIdentification getRefBillingProviderTaxIdentification() {
        return refBillingProviderTaxIdentification;
    }

    public void setRefBillingProviderTaxIdentification(REFBillingProviderTaxIdentification refBillingProviderTaxIdentification) {
        this.refBillingProviderTaxIdentification = refBillingProviderTaxIdentification;
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    class NM1BillingProviderName {
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
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    class N3BillingProviderAddress {
        @JsonProperty("N301")
        private String n301;

        public String getN301() {
            return n301;
        }

        public void setN301(String n301) {
            this.n301 = n301;
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    class N4BillingProviderCityStateZIPCode {
        @JsonProperty("N401")
        private String n401;

        @JsonProperty("N402")
        private String n402;

        @JsonProperty("N403")
        private String n403;

        public String getN401() {
            return n401;
        }

        public void setN401(String n401) {
            this.n401 = n401;
        }

        public String getN402() {
            return n402;
        }

        public void setN402(String n402) {
            this.n402 = n402;
        }

        public String getN403() {
            return n403;
        }

        public void setN403(String n403) {
            this.n403 = n403;
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    class REFBillingProviderTaxIdentification {
        @JsonProperty("REF01")
        private String ref01;

        @JsonProperty("REF02")
        private String ref02;

        public String getRef01() {
            return ref01;
        }

        public void setRef01(String ref01) {
            this.ref01 = ref01;
        }

        public String getRef02() {
            return ref02;
        }

        public void setRef02(String ref02) {
            this.ref02 = ref02;
        }
    }
}
}

