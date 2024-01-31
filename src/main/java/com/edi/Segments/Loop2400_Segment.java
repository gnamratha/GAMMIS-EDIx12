package com.edi.Segments;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
public class Loop2400_Segment {
    private List<ServiceLine> ServiceLine;

    // Getter and Setter

    public class ServiceLine {
        private LX_ServiceLineNumber LX_ServiceLineNumber;
        private SV1_ProfessionalService SV1_ProfessionalService;
        private SV5_DMEdetails SV5_DMEdetails;
        private AllDTP AllDTP;
        private Loop2410 Loop2410;
        private Loop2420A Loop2420A;
        private Loop2420E Loop2420E;
        private Loop2420F Loop2420F;
        private Loop2430 Loop2430;

        // Getter and Setter


        public class LX_ServiceLineNumber {
            private String LX01;
        }
            // Getter and Setter

            public class SV1_ProfessionalService {
                private CompositeMedicalProcedureIdentifier_01 CompositeMedicalProcedureIdentifier_01;
                private String SV102;
                private String SV103;
                private String SV104;
                private String SV105;
                private String SV107;
                private String SV109;
                private String SV112;

                // Getter and Setter


                public class CompositeMedicalProcedureIdentifier_01 {
                    private String SV101_1;
                    private String SV101_2;

                    // Getter and Setter
                }

            }

        public class SV5_DMEdetails {
            private String SV105_1;
            private String SV105_2;

            // Getter and Setter
        }

        public class AllDTP {
            private DTP_Date_ServiceDate DTP_Date_ServiceDate;

            // Getter and Setter


            public class DTP_Date_ServiceDate {
                private String DTP01;
                private String DTP02;
                private String DTP03;

                // Getter and Setter
            }
        }
    }

    public class Loop2410 {
        private LIN_DrugIdentification LIN_DrugIdentification;
        private CTP_DrugQuantity CTP_DrugQuantity;

        // Getter and Setter


        public class LIN_DrugIdentification {
            private String LIN03;

            // Getter and Setter
        }

        public class CTP_DrugQuantity {
            private String CTP04;
            private String CTP05;

            // Getter and Setter
        }
    }

    public class Loop2420A {
        private NM1_RenderingProviderName NM1_RenderingProviderName;

        // Getter and Setter


        public class NM1_RenderingProviderName {
            private String NM109;

            // Getter and Setter
        }
    }

    public class Loop2420E {
        private NM1_OrderingProvider NM1_OrderingProvider;
        private REF_OrderingProviderSecondaryIdentification REF_OrderingProviderSecondaryIdentification;

        // Getter and Setter


        public class NM1_OrderingProvider {


            private String nm104;

        }

        public class REF_OrderingProviderSecondaryIdentification {
            private String REF02;

            // Getter and Setter
        }
    }

    public class Loop2420F {
        private NM1_ReferringProviderName NM1_ReferringProviderName;

        // Getter and Setter


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

            // Getter and Setter
        }
    }

    public class Loop2430 {
        private SVD_ServiceLinePaidAmount SVD_ServiceLinePaidAmount;
        private ClaimLevelAdjustments ClaimLevelAdjustments;
        private RemittanceDate RemittanceDate;

        // Getter and Setter


        public class SVD_ServiceLinePaidAmount {
            private String SVD01;
            private String SVD02;

            // Getter and Setter
        }

        public class ClaimLevelAdjustments {
            private CAS CAS;

            // Getter and Setter
        }

        public class CAS {
            // Add appropriate fields for CAS segment
            // Getter and Setter
        }
        public class RemittanceDate {
            private DTP_Date_ServiceDate DTP_Date_ServiceDate;

            // Getter and Setter

            public class DTP_Date_ServiceDate {
                private String DTP01;
                private String DTP02;
                private String DTP03;
            }
        }
    }
}

