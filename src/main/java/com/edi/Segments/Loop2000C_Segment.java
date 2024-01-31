package com.edi.Segments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Loop2000C_Segment {
    @JsonProperty
    private HL_PatientHierarchicalLevel HL_PatientHierarchicalLevel;
    @JsonProperty
    private PAT_PatientInformation PAT_PatientInformation;
    @JsonProperty
    private Loop2010CA Loop2010CA;

    // Getters and Setters

    public HL_PatientHierarchicalLevel getHL_PatientHierarchicalLevel() {
        return HL_PatientHierarchicalLevel;
    }

    public void setHL_PatientHierarchicalLevel(HL_PatientHierarchicalLevel HL_PatientHierarchicalLevel) {
        this.HL_PatientHierarchicalLevel = HL_PatientHierarchicalLevel;
    }

    public PAT_PatientInformation getPAT_PatientInformation() {
        return PAT_PatientInformation;
    }

    public void setPAT_PatientInformation(PAT_PatientInformation PAT_PatientInformation) {
        this.PAT_PatientInformation = PAT_PatientInformation;
    }

    public Loop2010CA getLoop2010CA() {
        return Loop2010CA;
    }

    public void setLoop2010CA(Loop2010CA Loop2010CA) {
        this.Loop2010CA = Loop2010CA;
    }


    public class HL_PatientHierarchicalLevel {
        @JsonProperty
        private String HL01;
        @JsonProperty
        private String HL02;
        @JsonProperty
        private String HL03;
        @JsonProperty
        private String HL04;

        // Getters and Setters
    }

    public class PAT_PatientInformation {
        @JsonProperty
        private String PAT01;

        // Getters and Setters
    }

    public class Loop2010CA {
        @JsonProperty
        private NM1_PatientName NM1_PatientName;
        @JsonProperty
        private N3_PatientAddress N3_PatientAddress;
        @JsonProperty
        private N4_PatientCity_State_ZIPCode N4_PatientCity_State_ZIPCode;
        @JsonProperty
        private DMG_PatientDemographicInformation DMG_PatientDemographicInformation;

        // Getters and Setters


        public class NM1_PatientName {
            @JsonProperty
            private String NM101;
            @JsonProperty
            private String NM102;
            @JsonProperty
            private String NM103;
            @JsonProperty
            private String NM104;

            // Getters and Setters
        }

        public class N3_PatientAddress {
            @JsonProperty
            private String N301;

            // Getters and Setters
        }

        public class N4_PatientCity_State_ZIPCode {
            @JsonProperty
            private String N401;
            @JsonProperty
            private String N402;
            @JsonProperty
            private String N403;

            // Getters and Setters
        }

        public class DMG_PatientDemographicInformation {
            @JsonProperty
            private String DMG01;
            @JsonProperty
            private String DMG02;
            @JsonProperty
            private String DMG03;

            // Getters and Setters
        }
    }
}

