package com.edi.Segments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Loop2000B_Segment {
    @JsonProperty
    private HL_SubscriberHierarchicalLevel HL_SubscriberHierarchicalLevel;
    @JsonProperty
    private SBR_SubscriberInformation SBR_SubscriberInformation;
    @JsonProperty
    private Loop2010BA Loop2010BA;
    @JsonProperty
    private Loop2010BB Loop2010BB;

    public HL_SubscriberHierarchicalLevel getHL_SubscriberHierarchicalLevel() {
        return HL_SubscriberHierarchicalLevel;
    }

    public void setHL_SubscriberHierarchicalLevel(HL_SubscriberHierarchicalLevel HL_SubscriberHierarchicalLevel) {
        this.HL_SubscriberHierarchicalLevel = HL_SubscriberHierarchicalLevel;
    }

    public SBR_SubscriberInformation getSBR_SubscriberInformation() {
        return SBR_SubscriberInformation;
    }

    public void setSBR_SubscriberInformation(SBR_SubscriberInformation SBR_SubscriberInformation) {
        this.SBR_SubscriberInformation = SBR_SubscriberInformation;
    }

    public Loop2010BA getLoop2010BA() {
        return Loop2010BA;
    }

    public void setLoop2010BA(Loop2010BA Loop2010BA) {
        this.Loop2010BA = Loop2010BA;
    }

    public Loop2010BB getLoop2010BB() {
        return Loop2010BB;
    }

    public void setLoop2010BB(Loop2010BB Loop2010BB) {
        this.Loop2010BB = Loop2010BB;
    }


    public class HL_SubscriberHierarchicalLevel {
        @JsonProperty
        private String HL01;
        @JsonProperty
        private String HL02;
        @JsonProperty
        private String HL03;
        @JsonProperty
        private String HL04;

        public String getHL01() {
            return HL01;
        }

        public void setHL01(String HL01) {
            this.HL01 = HL01;
        }

        public String getHL02() {
            return HL02;
        }

        public void setHL02(String HL02) {
            this.HL02 = HL02;
        }

        public String getHL03() {
            return HL03;
        }

        public void setHL03(String HL03) {
            this.HL03 = HL03;
        }

        public String getHL04() {
            return HL04;
        }

        public void setHL04(String HL04) {
            this.HL04 = HL04;
        }
    }

    public class SBR_SubscriberInformation {
        @JsonProperty
        private String SBR01;
        @JsonProperty
        private String SBR02;
        @JsonProperty
        private String SBR03;
        @JsonProperty
        private String SBR04;
        @JsonProperty
        private String SBR05;
        @JsonProperty
        private String SBR06;
        @JsonProperty
        private String SBR07;
        @JsonProperty
        private String SBR08;
        @JsonProperty
        private String SBR09;

        public String getSBR01() {
            return SBR01;
        }

        public void setSBR01(String SBR01) {
            this.SBR01 = SBR01;
        }

        public String getSBR02() {
            return SBR02;
        }

        public void setSBR02(String SBR02) {
            this.SBR02 = SBR02;
        }

        public String getSBR03() {
            return SBR03;
        }

        public void setSBR03(String SBR03) {
            this.SBR03 = SBR03;
        }

        public String getSBR04() {
            return SBR04;
        }

        public void setSBR04(String SBR04) {
            this.SBR04 = SBR04;
        }

        public String getSBR05() {
            return SBR05;
        }

        public void setSBR05(String SBR05) {
            this.SBR05 = SBR05;
        }

        public String getSBR06() {
            return SBR06;
        }

        public void setSBR06(String SBR06) {
            this.SBR06 = SBR06;
        }

        public String getSBR07() {
            return SBR07;
        }

        public void setSBR07(String SBR07) {
            this.SBR07 = SBR07;
        }

        public String getSBR08() {
            return SBR08;
        }

        public void setSBR08(String SBR08) {
            this.SBR08 = SBR08;
        }

        public String getSBR09() {
            return SBR09;
        }

        public void setSBR09(String SBR09) {
            this.SBR09 = SBR09;
        }
    }

    public class Loop2010BA {
        @JsonProperty
        private NM1_SubscriberName NM1_SubscriberName;
        @JsonProperty
        private DMG_SubscriberDemographicInformation DMG_SubscriberDemographicInformation;

        public Loop2000B_Segment.Loop2010BA.NM1_SubscriberName getNM1_SubscriberName() {
            return NM1_SubscriberName;
        }

        public void setNM1_SubscriberName(Loop2000B_Segment.Loop2010BA.NM1_SubscriberName NM1_SubscriberName) {
            this.NM1_SubscriberName = NM1_SubscriberName;
        }

        public Loop2000B_Segment.Loop2010BA.DMG_SubscriberDemographicInformation getDMG_SubscriberDemographicInformation() {
            return DMG_SubscriberDemographicInformation;
        }

        public void setDMG_SubscriberDemographicInformation(Loop2000B_Segment.Loop2010BA.DMG_SubscriberDemographicInformation DMG_SubscriberDemographicInformation) {
            this.DMG_SubscriberDemographicInformation = DMG_SubscriberDemographicInformation;
        }

        public class NM1_SubscriberName {
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

        public class DMG_SubscriberDemographicInformation {
            @JsonProperty
            private String DMG01;
            @JsonProperty
            private String DMG02;
            @JsonProperty
            private String DMG03;

            public String getDMG01() {
                return DMG01;
            }

            public void setDMG01(String DMG01) {
                this.DMG01 = DMG01;
            }

            public String getDMG02() {
                return DMG02;
            }

            public void setDMG02(String DMG02) {
                this.DMG02 = DMG02;
            }

            public String getDMG03() {
                return DMG03;
            }

            public void setDMG03(String DMG03) {
                this.DMG03 = DMG03;
            }
        }
    }

    public class Loop2010BB {
        @JsonProperty
        private NM1_PayerName NM1_PayerName;
        @JsonProperty
        private N4_PayerName N4_PayerName;
        @JsonProperty
        private REF_BillingProviderSecondaryIdentification REF_BillingProviderSecondaryIdentification;

        public Loop2000B_Segment.Loop2010BB.NM1_PayerName getNM1_PayerName() {
            return NM1_PayerName;
        }

        public void setNM1_PayerName(Loop2000B_Segment.Loop2010BB.NM1_PayerName NM1_PayerName) {
            this.NM1_PayerName = NM1_PayerName;
        }

        public Loop2000B_Segment.Loop2010BB.N4_PayerName getN4_PayerName() {
            return N4_PayerName;
        }

        public void setN4_PayerName(Loop2000B_Segment.Loop2010BB.N4_PayerName n4_PayerName) {
            N4_PayerName = n4_PayerName;
        }

        public Loop2000B_Segment.Loop2010BB.REF_BillingProviderSecondaryIdentification getREF_BillingProviderSecondaryIdentification() {
            return REF_BillingProviderSecondaryIdentification;
        }

        public void setREF_BillingProviderSecondaryIdentification(Loop2000B_Segment.Loop2010BB.REF_BillingProviderSecondaryIdentification REF_BillingProviderSecondaryIdentification) {
            this.REF_BillingProviderSecondaryIdentification = REF_BillingProviderSecondaryIdentification;
        }

        public class NM1_PayerName {
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

        public class N4_PayerName {
            @JsonProperty
            private String N401;
            @JsonProperty
            private String N402;
            @JsonProperty
            private String N403;

            public String getN401() {
                return N401;
            }

            public void setN401(String n401) {
                N401 = n401;
            }

            public String getN402() {
                return N402;
            }

            public void setN402(String n402) {
                N402 = n402;
            }

            public String getN403() {
                return N403;
            }

            public void setN403(String n403) {
                N403 = n403;
            }
        }

        public class REF_BillingProviderSecondaryIdentification {
            @JsonProperty
            private String REF01;
            @JsonProperty
            private String REF02;

            public String getREF01() {
                return REF01;
            }

            public void setREF01(String REF01) {
                this.REF01 = REF01;
            }

            public String getREF02() {
                return REF02;
            }

            public void setREF02(String REF02) {
                this.REF02 = REF02;
            }
        }
    }
}
