package com.edi;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class JsonToEdiConverter837P {
    private static StringBuilder globalEdiBuilder = new StringBuilder();
    private static void appendToGlobalVariable(String output) {
        // For SV5 segment
        globalEdiBuilder.append(output).append("\n");
    }

    public static void main(String[] args) {
        String jsonString = "{"
                // ISA Segment
                + "\"ISA\": {"
                + "    \"ISA01\": \"00\","
                + "    \"ISA02\": \"          \","
                + "    \"ISA03\": \"00\","
                + "    \"ISA04\": \"          \","
                + "    \"ISA05\": \"ZZ\","
                + "    \"ISA06\": \"SENDERID4567891\","
                + "    \"ISA07\": \"ZZ\","
                + "    \"ISA08\": \"77034\","
                + "    \"ISA09\": \"210102\","
                + "    \"ISA10\": \"1200\","
                + "    \"ISA11\": \"^\","
                + "    \"ISA12\": \"00501\","
                + "    \"ISA13\": \"00\","
                + "    \"ISA14\": \"0\","
                + "    \"ISA15\": \"T\","
                + "    \"ISA16\": \":\""
                + "},"
                // GS Segment
                + "\"GS\": {"
                + "    \"GS01\": \"HC\","
                + "    \"GS02\": \"SENDERID4567891\","
                + "    \"GS03\": \"77034\","
                + "    \"GS04\": \"20210102\","
                + "    \"GS05\": \"1200\","
                + "    \"GS06\": \"1\","
                + "    \"GS07\": \"X\","
                + "    \"GS08\": \"005010X222A1\""
                + "},"
                // ST Segment
                + "\"ST\": {"
                + "    \"ST01\": \"837\","
                + "    \"ST02\": \"000000001\","
                + "    \"ST03\": \"005010X222A1\""
                + "},"
                // BHT Segment
                + "\"BHT\": {"
                + "    \"BHT01\": \"0019\","
                + "    \"BHT02\": \"00\","
                + "    \"BHT03\": \"2223254003792\","
                + "    \"BHT04\": \"20230118\","
                + "    \"BHT05\": \"1200\","
                + "    \"BHT06\": \"CH\""
                + "},"
                // Loop 1000A
                + "\"Loop1000A\": {"
                + "    \"NM1\": {"
                + "        \"NM101\": \"41\","
                + "        \"NM102\": \"2\","
                + "        \"NM103\": \"PREMIUM BILLING SERVICES\","
                + "        \"NM104\": \"\","
                + "        \"NM105\": \"\","
                + "        \"NM106\": \"\","
                + "        \"NM107\": \"\","
                + "        \"NM108\": \"\","
                + "        \"NM109\": \"XX\","
                + "        \"NM110\": \"123456789\""
                + "    },"
                + "    \"PER\": {"
                + "        \"PER01\": \"IC\","
                + "        \"PER02\": \"TOM CRUISE\","
                + "        \"PER03\": \"TE\","
                + "        \"PER04\": \"3055552222\""
                + "    }"
                + "},"
                // Loop 1000B
                + "\"Loop1000B\": {"
                + "    \"NM1\": {"
                + "        \"NM101\": \"40\","
                + "        \"NM102\": \"2\","
                + "        \"NM103\": \"\","
                + "        \"NM104\": \"GEORGIA FAMILIES\","
                + "        \"NM105\": \"\","
                + "        \"NM106\": \"\","
                + "        \"NM107\": \"\","
                + "        \"NM108\": \"46\","
                + "        \"NM109\": \"77034\""
                + "    }"
                + "},"
                // Loop 2000A
                + "\"Loop2000A\": {"
                + "\"HL\": {"
                + "\"HL01\": \"1\","
                + "\"HL02\": \"20\","
                + "\"HL03\": \"1\""
                + "},"
                + "\"PRV\": {"
                + "\"PRV01\": \"BI\","
                + "\"PRV02\": \"PXC\","
                + "\"PRV03\": \"453088947A\""
                + "}"
                + "},"
                // Loop 2010AA
                + "\"Loop2010AA\": {"
                + "\"NM1\": {"
                + "\"NM101\": \"85\","
                + "\"NM102\": \"2\","
                + "\"NM103\": \"LGREEN20\","
                + "\"NM108\": \"XX\","
                + "\"NM109\": \"9876543210\""
                + "},"
                + "\"N3\": {"
                + "\"N301\": \"234 SEAWAY ST\""
                + "},"
                + "\"N4\": {"
                + "\"N401\": \"MIAMI\","
                + "\"N402\": \"FL\","
                + "\"N403\": \"33111\""
                + "},"
                + "\"REF\": {"
                + "\"REF01\": \"EI\","
                + "\"REF02\": \"587654321\""
                + "}"
                + "},"
                // Loop 2000B
                + "\"Loop2000B\": {"
                + "\"HL\": {"
                + "\"HL01\": \"2\","
                + "\"HL02\": \"1\","
                + "\"HL03\": \"22\","
                + "\"HL04\": \"1\""
                + "},"
                + "\"SBR\": {"
                + "\"SBR01\": \"P\","
                + "\"SBR02\": \"\","
                + "\"SBR03\": \"2222-SJ\","
                + "\"SBR04\": \"\","
                + "\"SBR05\": \"\","
                + "\"SBR06\": \"\","
                + "\"SBR07\": \"\","
                + "\"SBR08\": \"\","
                + "\"SBR09\": \"CI\""
                + "}"
                + "},"
                // Loop 2010BA
                + "\"Loop2010BA\": {"
                + "\"NM1\": {"
                + "\"NM101\": \"IL\","
                + "\"NM102\": \"1\","
                + "\"NM103\": \"BRYANT\","
                + "\"NM104\": \"AHMED\","
                + "\"NM105\": \"\","
                + "\"NM106\": \"\","
                + "\"NM107\": \"\","
                + "\"NM108\": \"MI\","
                + "\"NM109\": \"222114962578\""
                + "},"
                + "\"DMG\": {"
                + "\"DMG01\": \"D8\","
                + "\"DMG02\": \"19740112\","
                + "\"DMG03\": \"M\""
                + "}"
                + "},"
                // Loop 2010BB
                + "\"Loop2010BB\": {"
                + "\"NM1\": {"
                + "\"NM101\": \"PR\","
                + "\"NM102\": \"2\","
                + "\"NM103\": \"GEORGIA FAMILIES\","
                + "\"NM104\": \"\","
                + "\"NM105\": \"\","
                + "\"NM106\": \"\","
                + "\"NM107\": \"\","
                + "\"NM108\": \"PI\","
                + "\"NM109\": \"77034\""
                + "},"
                + "\"N4\": {"
                + "\"N401\": \"TUCKER\","
                + "\"N402\": \"GA\","
                + "\"N403\": \"300855201\""
                + "},"
                + "\"REF\": {"
                + "\"REF01\": \"G2\","
                + "\"REF02\": \"KA6663\""
                + "}"
                + "},"
                // Loop 2000C
                + "\"Loop2000C\": {"
                + "\"HL\": {"
                + "\"HL01\": \"3\","
                + "\"HL02\": \"2\","
                + "\"HL03\": \"23\","
                + "\"HL04\": \"0\""
                + "},"
                + "\"PAT\": {"
                + "\"PAT01\": \"21\""
                + "}"
                + "},"
                // Loop 2010CA
                + "\"Loop2010CA\": {"
                + "\"NM1\": {"
                + "\"NM101\": \"QC\","
                + "\"NM102\": \"1\","
                + "\"NM103\": \"SMITH\","
                + "\"NM104\": \"TED\""
                + "},"
                + "\"N3\": {"
                + "\"N301\": \"236 N MAIN ST\""
                + "},"
                + "\"N4\": {"
                + "\"N401\": \"MIAMI\","
                + "\"N402\": \"FL\","
                + "\"N403\": \"33413\""
                + "},"
                + "\"DMG\": {"
                + "\"DMG01\": \"D8\","
                + "\"DMG02\": \"19730501\","
                + "\"DMG03\": \"M\""
                + "}"
                + "},"
                // Loop 2300
                + "\"Loop2300\": {"
                + "\"CLM\": {"
                + "\"CLM01\": \"2223254003792\","
                + "\"CLM02\": \"292.32\","
                + "\"CLM05-1\": \"11\","
                + "\"CLM05-2\": \"B\","
                + "\"CLM05-03\": \"1\","
                + "\"CLM09\": \"Y\","
                + "\"CLM10\": \"A\","
                + "\"CLM11\": \"Y\","
                + "\"CLM12\": \"I\""
                + "},"
                // + "\"AllREF\": {"
                + "\"REF\": {"
                //Referral Number
                + "\"REF01\": \"9F\","
                + "\"REF02\": \"17312345600006351\""
                + "},"
                + "\"REF\": {"
                //PriorAuthorization
                + "\"REF01\": \"G1\","
                + "\"REF02\": \"900019507620\""
                + "},"
                + "\"REF\": {"
                //PayerClaimControlNumber
                + "\"REF01\": \"1K\","
                + "\"REF02\": \"50678356\""
                + "},"
                //+ "{"
                + "\"HI\": {"
                + "\"HI01-1\": \"ABK\","
                + "\"HI01-2\": \"0340\""
                + "}, "
                + "\"HI\": {"
                + "\"HI01-1\": \"ABF\","
                + "\"HI01-2\": \"V7389\""
                + "}"
                + "},"
                // Loop 2310A
                + "\"Loop2310A\": {"
                + "\"NM1\": {"

                + "\"NM101\": \"DN\","
                + "\"NM108\": \"XX\","
                + "\"NM109\": \"9876543210\""
                + "}"
                + "},"
                // Loop 2310B
                + "\"Loop2310B\": {"
                + "\"NM1\": {"

                + "\"NM108\": \"XX\","
                + "\"NM109\": \"9876543280\""
                + "},"
                + "\"PRV\": {"

                + "\"PRV01\": \"AT\","
                + "\"PRV02\": \"PXC\","
                + "\"PRV03\": \"453088947A\""
                + "}"
                + "},"
                // Loop 2320
                + "\"Loop2320\": {"
                + "\"AMT\": {"
                + "\"AMT01\": \"D\","
                + "\"AMT02\": \"12.23\""
                + "},"
                + "\"AMT\": {"
                + "\"AMT01\": \"EAF\","
                + "\"AMT02\": \"17.25\""
                + "}"
                + "},"
                // Loop 2330B
                + "\"Loop2330B\": {"
                + "\"DTP\": {"
                + "\"DTP01\": \"573\","
                + "\"DTP02\": \"D8\","
                + "\"DTP03\": \"20230918\""
                + "}"
                + "},"
                // Loop 2400
                + "\"Loop2400\": ["
                + "{"
                + "\"LX\": {"
                + "\"LX01\": \"1\""
                + "},"
                + "\"SV1\": {"
                + "\"SV101-1\": \"HC\","
                + "\"SV101-2\": \"99213\","
                + "\"SV102\": \"40\","
                + "\"SV103\": \"UN\","
                + "\"SV104\": \"1\","
                + "\"SV105\": \"11\","
                + "\"SV107\": \"N\","
                + "\"SV109\": \"Y\","
                + "\"SV110\": \"Y\""
                + "},"
                + "\"SV5\": {"
                + "\"SV105-1\": \"HC\","
                + "\"SV105-2\": \"H2017\""
                + "},"
                + "\"DTP\": {"
                //   + "\"DTP_ServiceDate\": {"
                + "\"DTP01\": \"472\","
                + "\"DTP02\": \"D8\","
                + "\"DTP03\": \"20230903\""
                + "}"
                + "},"
                + "{"
                + "\"LX\": {"
                + "\"LX01\": \"2\""
                + "},"
                + "\"SV1\": {"
                + "\"SV101-1\": \"HC\","
                + "\"SV101-2\": \"99214\","
                + "\"SV102\": \"60\","
                + "\"SV103\": \"UN\","
                + "\"SV104\": \"1\","
                + "\"SV105\": \"15\","
                + "\"SV106\": \"\","
                + "\"SV107\": \"N\","
                + "\"SV109\": \"Y\","
                + "\"SV110\": \"Y\""
                + "},"
                + "\"SV5\": {"

                + "\"SV105-1\": \"HC\","
                + "\"SV105-2\": \"H0004\""
                + "},"
                + "\"DTP\": {"
                //  + "\"DTP_ServiceDate\": {"
                + "\"DTP01\": \"472\","
                + "\"DTP02\": \"D8\","
                + "\"DTP03\": \"20230903\""
                + "}"
                + "}"
                + "],"
                + "\"SE\": {"
                + "\"SE01\": \"42\","
                + "\"SE02\": \"000000001\""
                + "},"
                + "\"GE\": {"
                + "\"GE01\": \"1\","
                + "\"GE02\": \"1\""
                + "},"
                + "\"IEA\": {"
                + "\"IEA01\": \"1\","
                + "\"IEA02\": \"000000001\""
                + "}"
                + "}";

        //  Convert JSON to EDI
        //String ediString = convertJsonToEdi(jsonString);
        //
        ResponseEntity<String> responseEntity = convertJsonToEdi(jsonString);

        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            String ediString = responseEntity.getBody();
            System.out.println(ediString);
        } else {
            System.out.println("Error in conversion. Status code: " + responseEntity.getStatusCodeValue());
        }
        //System.out.println(ediString);
    }

    @PostMapping("/convertJsonToEdi_837P")
    //public static ResponseEntity<String> convertJsonToEdi(@RequestParam("jsonString") String jsonString) {
    public static ResponseEntity<String> convertJsonToEdi(@RequestBody String jsonString) {
        try {
            globalEdiBuilder.setLength(0); // Clear the global EDI builder
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode parentNode = objectMapper.readTree(jsonString);
           // StringBuilder ediBuilder = new StringBuilder();

            // Process ISA Segment
            JsonNode isaNode = parentNode.path("ISA");
            if (!isaNode.isMissingNode()) {
                processEdiSegment("ISA", isaNode);
            }
            // Process GS Segment
            JsonNode gsNode = parentNode.path("GS");
            if (!gsNode.isMissingNode()) {
                processEdiSegment("GS", gsNode);
            }
            // Process ST Segment
            JsonNode stNode = parentNode.path("ST");
            if (!stNode.isMissingNode()) {
                processEdiSegment("ST", stNode);
            }
            // Process BHT Segment
            JsonNode bhtNode = parentNode.path("BHT");
            if (!bhtNode.isMissingNode()) {
                processEdiSegment("BHT", bhtNode);
            }
            // Process LOOP1000A Segment
            JsonNode loop1000ANode = parentNode.path("Loop1000A");
            if (!loop1000ANode.isMissingNode()) { // Ensure the Loop1000A node exists
                JsonNode nm1Node = loop1000ANode.path("NM1");
                if (!nm1Node.isMissingNode()) { // Check if the HL segment exists within LOOP2000B
                    processEdiSegment("NM1", nm1Node);
                    if (!loop1000ANode.isMissingNode()) { // Ensure the LOOP2000C node exists
                        JsonNode perNode = loop1000ANode.path("PER");
                        if (!perNode.isMissingNode()) { // Check if the HL segment exists within LOOP2000B
                            processEdiSegment("PER", perNode);
                        }
                    }
                }
            }
            // Process LOOP1000B Segment
            JsonNode loop1000BNode = parentNode.path("Loop1000B");
            if (!loop1000BNode.isMissingNode()) { // Ensure the Loop1000A node exists
                JsonNode nm1Node = loop1000BNode.path("NM1");
                if (!nm1Node.isMissingNode()) { // Check if the NM1 segment exists within LOOP2000B
                    processEdiSegment("NM1", nm1Node);
                }
            }
            // Process Loop2000A Segment
            JsonNode loop2000ANode = parentNode.path("Loop2000A");
            if (!loop2000ANode.isMissingNode()) { // Ensure the Loop2000A node exists
                // Process HL Segment within Loop2000A
                JsonNode hlNode = loop2000ANode.path("HL");
                if (!hlNode.isMissingNode()) { // Check if the HL segment exists within Loop2000A
                    processEdiSegment("HL", hlNode);

                    // Process PRV Segment within Loop2000A
                    JsonNode prvNode = loop2000ANode.path("PRV");
                    if (!prvNode.isMissingNode()) { // Check if the PRV segment exists within Loop2000A
                        processEdiSegment("PRV", prvNode);
                    }
                }
            }
            // Process Loop2010AA Segment within Loop2000A
            JsonNode loop2010AANode = parentNode.path("Loop2010AA");
            if (!loop2010AANode.isMissingNode()) { // Ensure the Loop2010AA node exists within Loop2000A
                // Process NM1 Segment within Loop2010AA
                JsonNode nm1Node = loop2010AANode.path("NM1");
                if (!nm1Node.isMissingNode()) { // Check if the NM1 segment exists within Loop2010AA
                    processEdiSegment("NM1", nm1Node);
                }

                // Process N3 Segment within Loop2010AA
                JsonNode n3Node = loop2010AANode.path("N3");
                if (!n3Node.isMissingNode()) { // Check if the N3 segment exists within Loop2010AA
                    processEdiSegment("N3", n3Node);
                }

                // Process N4 Segment within Loop2010AA
                JsonNode n4Node = loop2010AANode.path("N4");
                if (!n4Node.isMissingNode()) { // Check if the N4 segment exists within Loop2010AA
                    processEdiSegment("N4", n4Node);
                }

                // Process REF Segment within Loop2010AA
                JsonNode refNode = loop2010AANode.path("REF");
                if (!refNode.isMissingNode()) { // Check if the REF segment exists within Loop2010AA
                    processEdiSegment("REF", refNode);
                }
            }

            // Process LOOP2000B Segment
            JsonNode loop2000BNode = parentNode.path("Loop2000B");
            if (!loop2000BNode.isMissingNode()) { // Ensure the Loop2000B node exists
                // Process HL Segment within Loop2000B
                JsonNode hlNode = loop2000BNode.path("HL");
                if (!hlNode.isMissingNode()) { // Check if the HL segment exists within Loop2000B
                    processEdiSegment("HL", hlNode);
                }

                // Process SBR Segment within Loop2000B
                JsonNode sbrNode = loop2000BNode.path("SBR");
                if (!sbrNode.isMissingNode()) { // Check if the SBR segment exists within Loop2000B
                    processEdiSegment("SBR", sbrNode);
                }
            }
            // Process LOOP2010BA Segment
            JsonNode loop2010BANode = parentNode.path("Loop2010BA");
            if (!loop2010BANode.isMissingNode()) { // Ensure the Loop2010BA node exists
                // Process NM1 Segment within Loop2010BA
                JsonNode nm1Node = loop2010BANode.path("NM1");
                if (!nm1Node.isMissingNode()) { // Check if the NM1 segment exists within Loop2010BA
                    processEdiSegment("NM1", nm1Node);
                }

                // Process DMG Segment within Loop2010BA
                JsonNode dmgNode = loop2010BANode.path("DMG");
                if (!dmgNode.isMissingNode()) { // Check if the DMG segment exists within Loop2010BA
                    processEdiSegment("DMG", dmgNode);
                }
            }

            // Process LOOP2010BB Segment
            JsonNode loop2010BBNode = parentNode.path("Loop2010BB");
            if (!loop2010BBNode.isMissingNode()) { // Ensure the Loop2010BB node exists
                // Process NM1 Segment within Loop2010BB
                JsonNode nm1Node = loop2010BBNode.path("NM1");
                if (!nm1Node.isMissingNode()) { // Check if the NM1 segment exists within Loop2010BB
                    processEdiSegment("NM1", nm1Node);
                }
                // Process N4 Segment within Loop2010BB
                JsonNode n4Node = loop2010BBNode.path("N4");
                if (!n4Node.isMissingNode()) { // Check if the N4 segment exists within Loop2010BB
                    processEdiSegment("N4", n4Node);
                }
                // Process REF Segment within Loop2010BB
                JsonNode refNode = loop2010BBNode.path("REF");
                if (!refNode.isMissingNode()) { // Check if the REF segment exists within Loop2010BB
                    processEdiSegment("REF", refNode);
                }
            }

            // Process LOOP2000C Segment
            JsonNode loop2000CNode = parentNode.path("Loop2000C");
            if (!loop2000CNode.isMissingNode()) { // Ensure the Loop2000B node exists
                // Process HL Segment within Loop2000C
                JsonNode hlNode = loop2000CNode.path("HL");
                if (!hlNode.isMissingNode()) { // Check if the HL segment exists within Loop2000C
                    processEdiSegment("HL", hlNode);
                }

                // Process PAT Segment within Loop2000C
                JsonNode patNode = loop2000CNode.path("PAT");
                if (!patNode.isMissingNode()) { // Check if the SBR segment exists within Loop2000C
                    processEdiSegment("PAT", patNode);
                }
            }
            // Process LOOP2010CA Segment
            JsonNode loop2010CANode = parentNode.path("Loop2010CA");
            if (!loop2010CANode.isMissingNode()) { // Ensure the Loop2010CA node exists
                // Process NM1 Segment within Loop2010CA
                JsonNode nm1Node = loop2010CANode.path("NM1");
                if (!nm1Node.isMissingNode()) { // Check if the NM1 segment exists within Loop2010CA
                    processEdiSegment("NM1", nm1Node);
                }
                // Process N3 Segment within Loop2010CA
                JsonNode n3Node = loop2010CANode.path("N3");
                if (!n3Node.isMissingNode()) { // Check if the N3 segment exists within Loop2010CA
                    processEdiSegment("N3", n3Node);
                }

                // Process N4 Segment within Loop2010CA
                JsonNode n4Node = loop2010CANode.path("N4");
                if (!n4Node.isMissingNode()) { // Check if the N4 segment exists within Loop2010CA
                    processEdiSegment("N4", n4Node);
                }
                // Process DMG Segment within Loop2010CA
                JsonNode dmgNode = loop2010CANode.path("DMG");
                if (!dmgNode.isMissingNode()) { // Check if the DMG segment exists within Loop2010CA
                    processEdiSegment("DMG", dmgNode);
                }
            }
            // Process Loop2300 Segment
            JsonNode loop2300Node = parentNode.path("Loop2300");
            if (!loop2300Node.isMissingNode()) { // Ensure the Loop2300 node exists

                // Process CLM Segment
                JsonNode clmNode = loop2300Node.path("CLM");
                if (!clmNode.isMissingNode()) { // Check if the CLM segment exists within Loop2300
                    processEdiSegment("CLM", clmNode);
                }
                //REF
                JsonNode refNode = loop2300Node.path("REF");
                if (!refNode.isMissingNode()) { // Check if the REF segment exists within Loop2300
                    processEdiSegment("REF", refNode);
                }
                //HI
                JsonNode hiNode = loop2300Node.path("HI");
                if (!hiNode.isMissingNode()) { // Check if the HI segment exists within Loop2300
                    processEdiSegment("HI", hiNode);
                }

            }
            // Process LOOP2310A Segment
            JsonNode loop2310ANode = parentNode.path("Loop2310A");
            if (!loop2310ANode.isMissingNode()) { // Ensure the Loop2310A node exists
                // Process NM1 Segment within Loop2310A
                JsonNode nm1Node = loop2310ANode.path("NM1");
                if (!nm1Node.isMissingNode()) { // Check if the NM1 segment exists within Loop2310A
                    processEdiSegment("NM1", nm1Node);
                }
            }
            // Process LOOP2310B Segment
            JsonNode loop2310BNode = parentNode.path("Loop2310B");
            if (!loop2310BNode.isMissingNode()) { // Ensure the Loop2310B node exists
                // Process NM1 Segment within Loop2310A
                JsonNode nm1Node = loop2310BNode.path("NM1");
                if (!nm1Node.isMissingNode()) { // Check if the NM1 segment exists within Loop2310B
                    processEdiSegment("NM1", nm1Node);
                }
                JsonNode prvNode = loop2310BNode.path("PRV");
                if (!prvNode.isMissingNode()) { // Check if the NM1 segment exists within Loop2310B
                    processEdiSegment("PRV", prvNode);
                }
            }
            // Process LOOP2320 Segment
            JsonNode loop2320Node = parentNode.path("Loop2320");
            if (!loop2320Node.isMissingNode()) { // Ensure the Loop2320 node exists
                // Process AMT Segment within Loop2310A
                JsonNode amtNode = loop2320Node.path("AMT");
                if (!amtNode.isMissingNode()) { // Check if the NM1 segment exists within Loop2320
                    processEdiSegment("AMT", amtNode);
                }
            }
            // Process LOOP2330B Segment
            JsonNode loop2330BNode = parentNode.path("Loop2330B");
            if (!loop2330BNode.isMissingNode()) { // Ensure the Loop2330B node exists
                // Process DTP Segment within Loop2310A
                JsonNode dtpNode = loop2330BNode.path("DTP");
                if (!dtpNode.isMissingNode()) { // Check if the NM1 segment exists within Loop2330B
                    processEdiSegment("DTP", dtpNode);
                }
            }
            // Process Loop2400 Segment
            JsonNode loop2400Node = parentNode.path("Loop2400");
            if (!loop2400Node.isMissingNode() && loop2400Node.isArray()) {
                for (JsonNode loop2400Item : loop2400Node) {
                    // Process LX Segment
                    JsonNode lxNode = loop2400Item.path("LX");
                    if (!lxNode.isMissingNode()) {
                        processEdiSegment("LX", lxNode);
                    }

                    // Process SV1 Segment
                    JsonNode sv1Node = loop2400Item.path("SV1");
                    if (!sv1Node.isMissingNode()) {
                        processEdiSegment("SV1", sv1Node);
                    }

                    // Process SV5 Segment
                    JsonNode sv5Node = loop2400Item.path("SV5");
                    if (!sv5Node.isMissingNode()) {
                        String sv5Output = String.format("SV5*%s:%s~", sv5Node.path("SV105-1").asText(), sv5Node.path("SV105-2").asText());
                        //processEdiSegment("SV5", sv5Node);
                        appendToGlobalVariable(sv5Output);
                    }

                    // Process DTP Segment
                    JsonNode dtpNode = loop2400Item.path("DTP");
                    if (!dtpNode.isMissingNode()) {
                        processEdiSegment("DTP", dtpNode);
                    }
                }
            }

            // Process SE Segment
            JsonNode seNode = parentNode.path("SE");
            if (!seNode.isMissingNode()) { // Check if the SE segment exists
                processEdiSegment("SE", seNode);
            }

            // Process GE Segment
            JsonNode geNode = parentNode.path("GE");
            if (!geNode.isMissingNode()) { // Check if the GE segment exists
                processEdiSegment("GE", geNode);
            }

             //Process IEA Segment
            JsonNode ieaNode = parentNode.path("IEA");
            if (!ieaNode.isMissingNode()) { // Check if the IEA segment exists
                processEdiSegment("IEA", ieaNode);
            }
//            String ediString = ediBuilder.toString();
//            return ResponseEntity.ok(ediString);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error converting JSON to EDI");
//        }
            return ResponseEntity.ok(globalEdiBuilder.toString());

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error converting JSON to EDI");
        }
    }

        private static void processEdiSegment (String segmentName, JsonNode segmentNode){
            StringBuilder segmentBuilder = new StringBuilder(segmentName);
            segmentNode.fields().forEachRemaining(field -> {
                appendFieldValues(segmentBuilder, field.getValue());
            });
            segmentBuilder.append("~\n");
            //System.out.println(segmentBuilder);
            // Append the segment to the global EDI builder
            globalEdiBuilder.append(segmentBuilder);
        }

        private static void appendFieldValues (StringBuilder segmentBuilder, JsonNode node){
            if (node.isObject()) {
                // If the field value is an object (nested structure), recursively process its fields
                node.fields().forEachRemaining(field -> appendFieldValues(segmentBuilder, field.getValue()));
            } else {
                // If the field value is not an object, append its value to the segmentBuilder
                segmentBuilder.append("*").append(node.asText());
            }
        }

}
