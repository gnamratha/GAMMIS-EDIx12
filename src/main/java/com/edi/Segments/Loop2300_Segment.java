package com.edi.Segments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Loop2300_Segment {
    @JsonProperty
    private CLM_ClaimInformation CLM_ClaimInformation;
    @JsonProperty
    private AllREF AllREF;
    @JsonProperty
    private AllHI AllHI;
    @JsonProperty
    private Loop2310A Loop2310A;
    @JsonProperty
    private Loop2310B Loop2310B;
    @JsonProperty
    private Loop2320 Loop2320;
    @JsonProperty
    private Loop2330B Loop2330B;

    public class CLM_ClaimInformation {
        @JsonProperty
        private String CLM01;
        @JsonProperty
        private String CLM02;
        @JsonProperty
        private String CLM03;
        @JsonProperty
        private String CLM04;
        @JsonProperty
        private String CLM05_1;
        @JsonProperty
        private String CLM05_2;
        @JsonProperty
        private String CLM05_03;
        @JsonProperty
        private String CLM09;
        @JsonProperty
        private String CLM10;
        private String CLM11;
        @JsonProperty
        private String CLM12;

        // Getters and Setters
    }


    public class AllREF {
        @JsonProperty
        private REF_ReferralNumber REF_ReferralNumber;
        @JsonProperty
        private REF_PriorAuthorization REF_PriorAuthorization;
        @JsonProperty
        private REF_PayerClaimControlNumber REF_PayerClaimControlNumber;
        @JsonProperty
        private REF_ClaimIdentifierForTransmissionIntermediaries REF_ClaimIdentifierForTransmissionIntermediaries;

        // Getters and Setters


        public class REF_ReferralNumber {
            @JsonProperty
            private String REF01;
            @JsonProperty
            private String REF02;

            // Getters and Setters
        }

        public class REF_PriorAuthorization {
            @JsonProperty
            private String REF01;
            @JsonProperty
            private String REF02;

            // Getters and Setters
        }

        public class REF_PayerClaimControlNumber {
            @JsonProperty
            private String REF01;
            @JsonProperty
            private String REF02;

            // Getters and Setters
        }

        public class REF_ClaimIdentifierForTransmissionIntermediaries {
            @JsonProperty
            private String REF01;
            @JsonProperty
            private String REF02;

            // Getters and Setters
        }
    }

    public class AllHI {
        @JsonProperty
        private HI_HealthCareDiagnosisCode hi_healthCareDiagnosisCode;


        public class HI_HealthCareDiagnosisCode {
            @JsonProperty
            private HealthCareCodeInformation_01 HealthCareCodeInformation_01;
            @JsonProperty
            private HealthCareIndustryCode_02 HealthCareIndustryCode_02;

            // Getters and Setters


            public class HealthCareCodeInformation_01 {
                @JsonProperty
                private String HI01_1;
                @JsonProperty
                private String HI01_2;

                // Getters and Setters
            }

            public class HealthCareIndustryCode_02 {
                @JsonProperty
                private String HI02_1;
                @JsonProperty
                private String HI02_2;

                // Getters and Setters
            }
        }
    }

    public class Loop2310A {
        @JsonProperty
        private NM1_ReferringProviderName NM1_ReferringProviderName;

        // Getters and Setters


        public class NM1_ReferringProviderName {
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

            // Getters and Setters
        }

    }

    public class Loop2310B {
        @JsonProperty
        private NM1_RenderingProviderName NM1_RenderingProviderName;
        @JsonProperty
        private PRV_RenderingProviderSpecialtyInformation PRV_RenderingProviderSpecialtyInformation;

        // Getters and Setters


        public class NM1_RenderingProviderName {
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

            // Getters and Setters
        }

        public class PRV_RenderingProviderSpecialtyInformation {
            @JsonProperty
            private String PRV01;
            @JsonProperty
            private String PRV02;
            @JsonProperty
            private String PRV03;

            // Getters and Setters
        }
    }

    public class Loop2320 {
        @JsonProperty
        private AMT_COBPayerPaidAmount AMT_COBPayerPaidAmount;

        // Getters and Setters


        public class AMT_COBPayerPaidAmount {
            private String AMT01;
            private String AMT02;

            // Getters and Setters
        }
    }

    public class Loop2330B {

        private DTP_RemittanceDate DTP_RemittanceDate;

        // Getters and Setters

        public class DTP_RemittanceDate {
            private String DTP01;
            private String DTP02;
            private String DTP03;

            // Getters and Setters
        }
    }
}


