package org.edi;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class JsonToEdiConverter270 {
    private static StringBuilder globalEdiBuilder = new StringBuilder();
    public static void main(String[] args) {
        String jsonInput = "{" +
                "\"SegmentDelimiter\": \"~\"," +
                "\"DataElementDelimiter\": \"*\"," +
                "\"ISA\": {" +
                "    \"ISA01\": \"00\"," +
                "    \"ISA02\": \"          \"," +
                "    \"ISA03\": \"00\"," +
                "    \"ISA04\": \"          \"," +
                "    \"ISA05\": \"ZZ\"," +
                "    \"ISA06\": \"SENDERID4567891     \"," +
                "    \"ISA07\": \"ZZ\"," +
                "    \"ISA08\": \"77034     \"," +
                "    \"ISA09\": \"210102\"," +
                "    \"ISA10\": \"1200\"," +
                "    \"ISA11\": \"^\"," +
                "    \"ISA12\": \"00501\"," +
                "    \"ISA13\": \"000000001\"," +
                "    \"ISA14\": \"0\"," +
                "    \"ISA15\": \"T\"," +
                "    \"ISA16\": \":\"" +
                "}," +
                "    \"GS\": {" +
                "    \"GS01\": \"HS\"," +
                "    \"GS02\": \"AV0935\"," +
                "    \"GS03\": \"INSU123\"," +
                "    \"GS04\": \"20210101\"," +
                "    \"GS05\": \"1200\"," +
                "    \"GS06\": \"1\"," +
                "    \"GS07\": \"X\"," +
                "    \"GS08\": \"005010X279A1\"" +
                "}," +
                "    \"ST\": {" +
                "    \"ST01\": \"270\"," +
                "    \"ST02\": \"0001\"," +
                "    \"ST03\": \"005010X279A1\"" +
                "}," +
                "    \"BHT\": {" +
                "    \"BHT01\": \"270\"," +
                "    \"BHT02\": \"13\"," +
                "    \"BHT03\": \"TEST01\"," +
                "    \"BHT04\": \"YYYYMMD\"," +
                "    \"BHT05\": \"HHMM\"" +
                "}," +
                "    \"LOOP2000A\": {" +
                "    \"HL\": {" +
                "    \"HL01\": \"1\"," +
                "    \"HL02\": \"\"," +
                "    \"HL03\": \"20\"," +
                "    \"HL04\": \"1\"" +
                "}" +
                "}," +
                "    \"LOOP2100A\": {" +
                "    \"NM1\": {" +
                "    \"NM101\": \"PR\"," +
                "    \"NM102\": \"2\"," +
                "    \"NM103\": \"GEORGIA HEALTH PARTNERSHIP\"," +
                "    \"NM104\": \"*****\"," +
                "    \"NM108\": \"PI\"," +
                "    \"NM109\": \"77034\"" +
                "} " +
                "}," +
                "    \"LOOP2000B\": {" +
                "    \"HL\": {" +
                "    \"HL01\": \"2\"," +
                "    \"HL02\": \"1\"," +
                "    \"HL03\": \"21\"," +
                "    \"HL04\": \"1\"" +
                "} " +
                "}," +
                "    \"LOOP2100B\": {" +
                "    \"NM1\": {" +
                "    \"NM101\": \"1P\"," +
                "    \"NM108\": \"xx\"," +
                "    \"NM109\": \"Primary NPI\"" +
                "}," +
                "    \"N4\": {" +
                "    \"N401\": \"Anytown\"," +
                "    \"N402\": \"GA\"," +
                "    \"N403\": \"12345\"" +
                "}," +
                "    \"PRV\": {" +
                "    \"PRV\": \"BI\"" +
                "} " +
                "}," +
                "    \"LOOP2000B\": {" +
                "    \"HL\": {" +
                "    \"HL01\": \"3\"," +
                "    \"HL02\": \"2\"," +
                "    \"HL03\": \"22\"," +
                "    \"HL04\": \"0\"" +
                "} " +
                "}," +
                "    \"LOOP2000C\": {" +
                "    \"HL\": {" +
                "    \"HL01\": \"3\"," +
                "    \"HL02\": \"2\"," +
                "    \"HL03\": \"22\"," +
                "    \"HL04\": \"0\"" +
                "}," +
                "    \"TRN\": {" +
                "    \"TraceTypeCode\": \"1\"," +
                "    \"TRN02\": \"123456789\"," +
                "    \"TRN03\": \"COMPANYID\"," +
                "    \"TRN04\": \"REFID\"" +
                "} " +
                "}," +
                "    \"LOOP2100C\": {" +
                "    \"REF\": {" +
                "    \"REF01\": \"EJ\"," +
                "    \"REF02\": \"Georgia Member Patient Account Number\"" +
                "}," +
                "    \"DTP\": {" +
                "    \"DTP01\": \"291\"," +
                "    \"DTP02\": \"RD8\"," +
                "    \"DTP03\": \"YYMMDD\"" +
                "}," +
                "    \"NM1\": {" +
                "    \"NM103\": \"OrganizationName\"," +
                "    \"NM104\": \"FirstName\"," +
                "    \"NM108\": \"MI\"," +
                "    \"NM109\": \"12 digit Georgia Member Medicaid ID\"" +
                "}," +
                "    \"DMG\": {" +
                "    \"DMG01\": \"D8\"," +
                "    \"DMG02\": \"CCYYMMDD\"," +
                "    \"DMG03\": \"F\"" +
                "} " +
                "}," +
                "    \"LOOP2110C\": {" +
                "    \"EQ\": {" +
                "    \"EQ01\": \"30\"" +
                "} " +
                "}," +
                "    \"IEA\": {" +
                "    \"IEA01\": \"1\"," +
                "    \"IEA02\": \"000000001\"" +
                "}," +
                "    \"GE\": {" +
                "    \"GE01\": \"1\"," +
                "    \"GE02\": \"000000001\"" +
                "}," +
                "    \"SE\": {" +
                "    \"SE01\": \"10\"," +
                "    \"SE02\": \"0001\"" +
                "}  " +
                "},";

        //  Convert JSON to EDI
        //String ediString = convertJsonToEdi(jsonInput);
        ResponseEntity<String> responseEntity = jsonToEdiModel(jsonInput);

        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            String ediString = responseEntity.getBody();
            System.out.println(ediString);
        } else {
            System.out.println("Error in conversion. Status code: " + responseEntity.getStatusCodeValue());
        }
        //System.out.println(ediString);
    }

    @PostMapping("/convertJsonToEdi_270")
    public static ResponseEntity<String> jsonToEdiModel(@RequestBody String jsonString) {
        try {
            globalEdiBuilder.setLength(0); // Clear the global EDI builder
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode parentNode = objectMapper.readTree(jsonString);

        // Process ISA Segment
        JsonNode isaNode = parentNode.path("ISA");
        if (!isaNode.isMissingNode()) { // Check if the ISA segment exists
            processEdiSegment("ISA", isaNode);
        }

        // Process GS Segment
        JsonNode gsNode = parentNode.path("GS");
        if (!gsNode.isMissingNode()) { // Check if the GS segment exists
            processEdiSegment("GS", gsNode);
        }

        // Process ST Segment
        JsonNode stNode = parentNode.path("ST");
        if (!stNode.isMissingNode()) { // Check if the ST segment exists
            //System.out.println("ST segment found");
            processEdiSegment("ST", stNode);
        }

        // Process BHT Segment
        JsonNode bhtNode = parentNode.path("BHT");
        if (!bhtNode.isMissingNode()) { // Check if the BHT segment exists
            processEdiSegment("BHT", bhtNode);
        }

        // Process LOOP2000A Segment
        JsonNode loop2000ANode = parentNode.path("LOOP2000A");
        if (!loop2000ANode.isMissingNode()) { // Ensure the LOOP2000A node exists
            JsonNode hlNode = loop2000ANode.path("HL");
            if (!hlNode.isMissingNode()) { // Check if the HL segment exists within LOOP2000A
                processEdiSegment("HL", hlNode);
            }
        }

        // Process LOOP2100A Segment
        JsonNode loop2100ANode = parentNode.path("LOOP2100A");
        if (!loop2100ANode.isMissingNode()) { // Ensure the LOOP2100A node exists
            JsonNode nm1Node = loop2100ANode.path("NM1");
            if (!nm1Node.isMissingNode()) { // Check if the NM1 segment exists within LOOP2100A
                processEdiSegment("NM1", nm1Node);
            }
        }


        // Process LOOP2000B Segment
        JsonNode loop2000BNode = parentNode.path("LOOP2000B");
        if (!loop2000BNode.isMissingNode()) { // Ensure the LOOP2000B node exists
            JsonNode hlNode = loop2000BNode.path("HL");
            if (!hlNode.isMissingNode()) { // Check if the HL segment exists within LOOP2000B
                processEdiSegment("HL", hlNode);
            }
        }

        // Process LOOP2100B Segment
        JsonNode loop2100BNode = parentNode.path("LOOP2100B");
        if (!loop2100BNode.isMissingNode()) { // Ensure the LOOP2100B node exists
            JsonNode nm1Node = loop2100BNode.path("NM1");
            if (!nm1Node.isMissingNode()) { // Check if the NM1 segment exists within LOOP2100B
                processEdiSegment("NM1", nm1Node);
                if (!loop2100BNode.isMissingNode()) { // Ensure the LOOP2100B node exists
                    JsonNode n4Node = loop2100BNode.path("N4");
                    if (!n4Node.isMissingNode()) { // Check if the N4 segment exists within LOOP2100B
                        processEdiSegment("N4", n4Node);
                        if (!loop2100BNode.isMissingNode()) { // Ensure the LOOP2100B node exists
                            JsonNode prvNode = loop2100BNode.path("PRV");
                            if (!prvNode.isMissingNode()) { // Check if the PRV segment exists within LOOP2100B
                                processEdiSegment("PRV", prvNode);
                            }
                        }

                    }
                }
            }
        }


        // Process LOOP2000C Segment
        JsonNode loop2000CNode = parentNode.path("LOOP2000C");
        if (!loop2000CNode.isMissingNode()) { // Ensure the LOOP2000C node exists
            JsonNode hlNode = loop2000CNode.path("HL");
            if (!hlNode.isMissingNode()) { // Check if the HL segment exists within LOOP2000B
                processEdiSegment("HL", hlNode);
                if (!loop2000CNode.isMissingNode()) { // Ensure the LOOP2000C node exists
                    JsonNode trnNode = loop2000CNode.path("TRN");
                    if (!trnNode.isMissingNode()) { // Check if the HL segment exists within LOOP2000B
                        processEdiSegment("TRN", trnNode);
                    }
                }
            }
        }

        // Process LOOP2100C Segment
        JsonNode loop2100CNode = parentNode.path("LOOP2100C");
        if (!loop2100CNode.isMissingNode()) { // Ensure the LOOP2100C node exists
            JsonNode refNode = loop2100CNode.path("REF");
            if (!refNode.isMissingNode()) { // Check if the HL segment exists within LOOP2100C
                processEdiSegment("REF", refNode);
                if (!loop2100CNode.isMissingNode()) { // Ensure the LOOP2100C node exists
                    JsonNode dtpNode = loop2100CNode.path("DTP");
                    if (!dtpNode.isMissingNode()) { // Check if the HL segment exists within LOOP2100C
                        processEdiSegment("DTP", dtpNode);
                        if (!loop2100CNode.isMissingNode()) { // Ensure the LOOP2100C node exists
                            JsonNode nm1Node = loop2100CNode.path("NM1");
                            if (!nm1Node.isMissingNode()) { // Check if the HL segment exists within LOOP2100C
                                processEdiSegment("NM1", nm1Node);
                                if (!loop2100CNode.isMissingNode()) { // Ensure the LOOP2100C node exists
                                    JsonNode dmgNode = loop2100CNode.path("DMG");
                                    if (!dmgNode.isMissingNode()) { // Check if the HL segment exists within LOOP2100C
                                        processEdiSegment("DMG", dmgNode);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        // Process LOOP2110C Segment
        JsonNode loop2110CNode = parentNode.path("LOOP2110C");
        if (!loop2110CNode.isMissingNode()) { // Ensure the LOOP2110C node exists
            JsonNode eqNode = loop2110CNode.path("EQ");
            if (!eqNode.isMissingNode()) { // Check if the EQ segment exists within LOOP2110C
                processEdiSegment("EQ", eqNode);
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

        // Process IEA Segment
        JsonNode ieaNode = parentNode.path("IEA");
        if (!ieaNode.isMissingNode()) { // Check if the IEA segment exists
            processEdiSegment("IEA", ieaNode);
        }

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

