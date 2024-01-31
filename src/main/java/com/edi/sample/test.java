//package com.edi;
//
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//    @RequestMapping("/api")
//    public class test {
//        public static void main(String[] args) {
//            String jsonString = "{"
//                    // ISA Segment
//                    + "\"ISA\": {"
//                    + "    \"ISA01\": \"00\","
//                    + "    \"ISA02\": \"          \","
//                    + "    \"ISA03\": \"00\","
//                    + "    \"ISA04\": \"          \","
//                    + "    \"ISA05\": \"ZZ\","
//                    + "    \"ISA06\": \"SENDERID4567891\","
//                    + "    \"ISA07\": \"ZZ\","
//                    + "    \"ISA08\": \"77034\","
//                    + "    \"ISA09\": \"210102\","
//                    + "    \"ISA10\": \"1200\","
//                    + "    \"ISA11\": \"^\","
//                    + "    \"ISA12\": \"00501\","
//                    + "    \"ISA13\": \"00\","
//                    + "    \"ISA14\": \"0\","
//                    + "    \"ISA15\": \"T\","
//                    + "    \"ISA16\": \":\""
//                    + "},"
//                    // GS Segment
//                    + "\"GS\": {"
//                    + "    \"GS01\": \"HC\","
//                    + "    \"GS02\": \"SENDERID4567891\","
//                    + "    \"GS03\": \"77034\","
//                    + "    \"GS04\": \"20210102\","
//                    + "    \"GS05\": \"1200\","
//                    + "    \"GS06\": \"1\","
//                    + "    \"GS07\": \"X\","
//                    + "    \"GS08\": \"005010X222A1\""
//                    + "},"
//                    // ST Segment
//                    + "\"ST\": {"
//                    + "    \"ST01\": \"837\","
//                    + "    \"ST02\": \"000000001\","
//                    + "    \"ST03\": \"005010X222A1\""
//                    + "},"
//                    // BHT Segment
//                    + "\"BHT\": {"
//                    + "    \"BHT01\": \"0019\","
//                    + "    \"BHT02\": \"00\","
//                    + "    \"BHT03\": \"2223254003792\","
//                    + "    \"BHT04\": \"20230118\","
//                    + "    \"BHT05\": \"1200\","
//                    + "    \"BHT06\": \"CH\""
//                    + "},"
//                    // Loop 1000A
//                    + "\"Loop1000A\": {"
//                    + "    \"NM1\": {"
//                    + "        \"NM101\": \"41\","
//                    + "        \"NM102\": \"2\","
//                    + "        \"NM103\": \"PREMIUM BILLING SERVICES\","
//                    + "        \"NM104\": \"\","
//                    + "        \"NM105\": \"\","
//                    + "        \"NM106\": \"\","
//                    + "        \"NM107\": \"\","
//                    + "        \"NM108\": \"\","
//                    + "        \"NM109\": \"XX\","
//                    + "        \"NM110\": \"123456789\""
//                    + "    },"
//                    + "    \"PER\": {"
//                    + "        \"PER01\": \"IC\","
//                    + "        \"PER02\": \"TOM CRUISE\","
//                    + "        \"PER03\": \"TE\","
//                    + "        \"PER04\": \"3055552222\""
//                    + "    }"
//                    + "},"
//                    // Loop 1000B
//                    + "\"Loop1000B\": {"
//                    + "    \"NM1\": {"
//                    + "        \"NM101\": \"40\","
//                    + "        \"NM102\": \"2\","
//                    + "        \"NM103\": \"\","
//                    + "        \"NM104\": \"GEORGIA FAMILIES\","
//                    + "        \"NM105\": \"\","
//                    + "        \"NM106\": \"\","
//                    + "        \"NM107\": \"\","
//                    + "        \"NM108\": \"46\","
//                    + "        \"NM109\": \"77034\""
//                    + "    }"
//                    + "},"
//                    // Loop 2000A
//                    + "\"Loop2000A\": {"
//                    + "\"HL\": {"
//                    + "\"HL01\": \"1\","
//                    + "\"HL02\": \"20\","
//                    + "\"HL03\": \"1\""
//                    + "},"
//                    + "\"PRV\": {"
//                    + "\"PRV01\": \"BI\","
//                    + "\"PRV02\": \"PXC\","
//                    + "\"PRV03\": \"453088947A\""
//                    + "}"
//                    + "},"
//                    // Loop 2010AA
//                    + "\"Loop2010AA\": {"
//                    + "\"NM1\": {"
//                    + "\"NM101\": \"85\","
//                    + "\"NM102\": \"2\","
//                    + "\"NM103\": \"LGREEN20\","
//                    + "\"NM108\": \"XX\","
//                    + "\"NM109\": \"9876543210\""
//                    + "},"
//                    + "\"N3\": {"
//                    + "\"N301\": \"234 SEAWAY ST\""
//                    + "},"
//                    + "\"N4\": {"
//                    + "\"N401\": \"MIAMI\","
//                    + "\"N402\": \"FL\","
//                    + "\"N403\": \"33111\""
//                    + "},"
//                    + "\"REF\": {"
//                    + "\"REF01\": \"EI\","
//                    + "\"REF02\": \"587654321\""
//                    + "}"
//                    + "},"
//                    // Loop 2000B
//                    + "\"Loop2000B\": {"
//                    + "\"HL\": {"
//                    + "\"HL01\": \"2\","
//                    + "\"HL02\": \"1\","
//                    + "\"HL03\": \"22\","
//                    + "\"HL04\": \"1\""
//                    + "},"
//                    + "\"SBR\": {"
//                    + "\"SBR01\": \"P\","
//                    + "\"SBR02\": \"\","
//                    + "\"SBR03\": \"2222-SJ\","
//                    + "\"SBR04\": \"\","
//                    + "\"SBR05\": \"\","
//                    + "\"SBR06\": \"\","
//                    + "\"SBR07\": \"\","
//                    + "\"SBR08\": \"\","
//                    + "\"SBR09\": \"CI\""
//                    + "}"
//                    + "},"
//                    // Loop 2010BA
//                    + "\"Loop2010BA\": {"
//                    + "\"NM1\": {"
//                    + "\"NM101\": \"IL\","
//                    + "\"NM102\": \"1\","
//                    + "\"NM103\": \"BRYANT\","
//                    + "\"NM104\": \"AHMED\","
//                    + "\"NM105\": \"\","
//                    + "\"NM106\": \"\","
//                    + "\"NM107\": \"\","
//                    + "\"NM108\": \"MI\","
//                    + "\"NM109\": \"222114962578\""
//                    + "},"
//                    + "\"DMG\": {"
//                    + "\"DMG01\": \"D8\","
//                    + "\"DMG02\": \"19740112\","
//                    + "\"DMG03\": \"M\""
//                    + "}"
//                    + "},"
//                    // Loop 2010BB
//                    + "\"Loop2010BB\": {"
//                    + "\"NM1\": {"
//                    + "\"NM101\": \"PR\","
//                    + "\"NM102\": \"2\","
//                    + "\"NM103\": \"GEORGIA FAMILIES\","
//                    + "\"NM104\": \"\","
//                    + "\"NM105\": \"\","
//                    + "\"NM106\": \"\","
//                    + "\"NM107\": \"\","
//                    + "\"NM108\": \"PI\","
//                    + "\"NM109\": \"77034\""
//                    + "},"
//                    + "\"N4\": {"
//                    + "\"N401\": \"TUCKER\","
//                    + "\"N402\": \"GA\","
//                    + "\"N403\": \"300855201\""
//                    + "},"
//                    + "\"REF\": {"
//                    + "\"REF01\": \"G2\","
//                    + "\"REF02\": \"KA6663\""
//                    + "}"
//                    + "},"
//                    // Loop 2000C
//                    + "\"Loop2000C\": {"
//                    + "\"HL\": {"
//                    + "\"HL01\": \"3\","
//                    + "\"HL02\": \"2\","
//                    + "\"HL03\": \"23\","
//                    + "\"HL03\": \"0\""
//                    + "},"
//                    + "\"PAT\": {"
//                    + "\"PAT01\": \"21\""
//                    + "}"
//                    + "},"
//                    // Loop 2010CA
//                    + "\"Loop2010CA\": {"
//                    + "\"NM1\": {"
//                    + "\"NM101\": \"QC\","
//                    + "\"NM102\": \"1\","
//                    + "\"NM103\": \"SMITH\","
//                    + "\"NM104\": \"TED\""
//                    + "},"
//                    + "\"N3\": {"
//                    + "\"N301\": \"236 N MAIN ST\""
//                    + "},"
//                    + "\"N4\": {"
//                    + "\"N401\": \"MIAMI\","
//                    + "\"N402\": \"FL\","
//                    + "\"N403\": \"33413\""
//                    + "},"
//                    + "\"DMG\": {"
//                    + "\"DMG01\": \"D8\","
//                    + "\"DMG02\": \"19730501\","
//                    + "\"DMG03\": \"M\""
//                    + "}"
//                    + "}"
//                    + "}";
//
//           //  Convert JSON to EDI
//        //String ediString = convertJsonToEdi(jsonString);
//        ResponseEntity<String> responseEntity = convertJsonToEdi(jsonString);
//
//        if (responseEntity.getStatusCode().is2xxSuccessful()) {
//            String ediString = responseEntity.getBody();
//            System.out.println(ediString);
//        } else {
//            System.out.println("Error in conversion. Status code: " + responseEntity.getStatusCodeValue());
//        }
//        //System.out.println(ediString);
//    }
//
//    @PostMapping("/convertJsonToEdi")
//    public static ResponseEntity<String> convertJsonToEdi(@RequestBody String jsonString) {
//   // public static String convertJsonToEdi(@RequestBody String jsonString) {
//        try {
//            ObjectMapper objectMapper = new ObjectMapper();
//            JsonNode parentNode = objectMapper.readTree(jsonString);
//            StringBuilder ediBuilder = new StringBuilder();
//
////            if (parentNode.isArray()) {
////                for (JsonNode node : parentNode) {
////                    processEdiSegment(node, ediBuilder,null, true);
////                   // ediBuilder.append("~\n");
////                }
////            }
//
//            // Process ISA Segment
//            JsonNode isaNode = parentNode.path("ISA");
//            if (!isaNode.isMissingNode()) {
//                processEdiSegment("ISA", isaNode);
//            }
//            // Process GS Segment
//            JsonNode gsNode = parentNode.path("GS");
//            if (!gsNode.isMissingNode()) {
//                processEdiSegment("GS", gsNode);
//            }
//            // Process ST Segment
//            JsonNode stNode = parentNode.path("ST");
//            if (!stNode.isMissingNode()) {
//                processEdiSegment("ST", stNode);
//            }
//            // Process BHT Segment
//            JsonNode bhtNode = parentNode.path("BHT");
//            if (!bhtNode.isMissingNode()) {
//                processEdiSegment("BHT", bhtNode);
//            }
//            // Process LOOP1000A Segment
//            JsonNode loop1000ANode = parentNode.path("Loop1000A");
//            if (!loop1000ANode.isMissingNode()) { // Ensure the Loop1000A node exists
//                JsonNode nm1Node = loop1000ANode.path("NM1");
//                if (!nm1Node.isMissingNode()) { // Check if the HL segment exists within LOOP2000B
//                    processEdiSegment("NM1", nm1Node);
//                    if (!loop1000ANode.isMissingNode()) { // Ensure the LOOP2000C node exists
//                        JsonNode perNode = loop1000ANode.path("PER");
//                        if (!perNode.isMissingNode()) { // Check if the HL segment exists within LOOP2000B
//                            processEdiSegment("PER", perNode);
//                        }
//                    }
//                }
//            }
//            // Process LOOP1000B Segment
//            JsonNode loop1000BNode = parentNode.path("Loop1000B");
//            if (!loop1000BNode.isMissingNode()) { // Ensure the Loop1000A node exists
//                JsonNode nm1Node = loop1000BNode.path("NM1");
//                if (!nm1Node.isMissingNode()) { // Check if the NM1 segment exists within LOOP2000B
//                    processEdiSegment("NM1", nm1Node);
//                }
//            }
//            // Process Loop2000A Segment
//            JsonNode loop2000ANode = parentNode.path("Loop2000A");
//            if (!loop2000ANode.isMissingNode()) { // Ensure the Loop2000A node exists
//                // Process HL Segment within Loop2000A
//                JsonNode hlNode = loop2000ANode.path("HL");
//                if (!hlNode.isMissingNode()) { // Check if the HL segment exists within Loop2000A
//                    processEdiSegment("HL", hlNode);
//
//                    // Process PRV Segment within Loop2000A
//                    JsonNode prvNode = loop2000ANode.path("PRV");
//                    if (!prvNode.isMissingNode()) { // Check if the PRV segment exists within Loop2000A
//                        processEdiSegment("PRV", prvNode);
//                    }
//                }
//            }
//            // Process Loop2010AA Segment within Loop2000A
//            JsonNode loop2010AANode = parentNode.path("Loop2010AA");
//            if (!loop2010AANode.isMissingNode()) { // Ensure the Loop2010AA node exists within Loop2000A
//                // Process NM1 Segment within Loop2010AA
//                JsonNode nm1Node = loop2010AANode.path("NM1");
//                if (!nm1Node.isMissingNode()) { // Check if the NM1 segment exists within Loop2010AA
//                    processEdiSegment("NM1", nm1Node);
//                }
//
//                // Process N3 Segment within Loop2010AA
//                JsonNode n3Node = loop2010AANode.path("N3");
//                if (!n3Node.isMissingNode()) { // Check if the N3 segment exists within Loop2010AA
//                    processEdiSegment("N3", n3Node);
//                }
//
//                // Process N4 Segment within Loop2010AA
//                JsonNode n4Node = loop2010AANode.path("N4");
//                if (!n4Node.isMissingNode()) { // Check if the N4 segment exists within Loop2010AA
//                    processEdiSegment("N4", n4Node);
//                }
//
//                // Process REF Segment within Loop2010AA
//                JsonNode refNode = loop2010AANode.path("REF");
//                if (!refNode.isMissingNode()) { // Check if the REF segment exists within Loop2010AA
//                    processEdiSegment("REF", refNode);
//                }
//            }
//
//            // Process LOOP2000B Segment
//            JsonNode loop2000BNode = parentNode.path("Loop2000B");
//            if (!loop2000BNode.isMissingNode()) { // Ensure the Loop2000B node exists
//                // Process HL Segment within Loop2000B
//                JsonNode hlNode = loop2000BNode.path("HL");
//                if (!hlNode.isMissingNode()) { // Check if the HL segment exists within Loop2000B
//                    processEdiSegment("HL", hlNode);
//                }
//
//                // Process SBR Segment within Loop2000B
//                JsonNode sbrNode = loop2000BNode.path("SBR");
//                if (!sbrNode.isMissingNode()) { // Check if the SBR segment exists within Loop2000B
//                    processEdiSegment("SBR", sbrNode);
//                }
//            }
//            // Process LOOP2010BA Segment
//            JsonNode loop2010BANode = parentNode.path("Loop2010BA");
//            if (!loop2010BANode.isMissingNode()) { // Ensure the Loop2010BA node exists
//                // Process NM1 Segment within Loop2010BA
//                JsonNode nm1Node = loop2010BANode.path("NM1");
//                if (!nm1Node.isMissingNode()) { // Check if the NM1 segment exists within Loop2010BA
//                    processEdiSegment("NM1", nm1Node);
//                }
//
//                // Process DMG Segment within Loop2010BA
//                JsonNode dmgNode = loop2010BANode.path("DMG");
//                if (!dmgNode.isMissingNode()) { // Check if the DMG segment exists within Loop2010BA
//                    processEdiSegment("DMG", dmgNode);
//                }
//            }
//
//            // Process LOOP2010BB Segment
//            JsonNode loop2010BBNode = parentNode.path("Loop2010BB");
//            if (!loop2010BBNode.isMissingNode()) { // Ensure the Loop2010BB node exists
//                // Process NM1 Segment within Loop2010BB
//                JsonNode nm1Node = loop2010BBNode.path("NM1");
//                if (!nm1Node.isMissingNode()) { // Check if the NM1 segment exists within Loop2010BB
//                    processEdiSegment("NM1", nm1Node);
//                }
//                // Process N4 Segment within Loop2010BB
//                JsonNode n4Node = loop2010BBNode.path("N4");
//                if (!n4Node.isMissingNode()) { // Check if the N4 segment exists within Loop2010BB
//                    processEdiSegment("N4", n4Node);
//                }
//                // Process REF Segment within Loop2010BB
//                JsonNode refNode = loop2010BBNode.path("REF");
//                if (!refNode.isMissingNode()) { // Check if the REF segment exists within Loop2010BB
//                    processEdiSegment("REF", refNode);
//                }
//            }
//
//            // Process LOOP2000C Segment
//            JsonNode loop2000CNode = parentNode.path("Loop2000C");
//            if (!loop2000CNode.isMissingNode()) { // Ensure the Loop2000B node exists
//                // Process HL Segment within Loop2000C
//                JsonNode hlNode = loop2000CNode.path("HL");
//                if (!hlNode.isMissingNode()) { // Check if the HL segment exists within Loop2000C
//                    processEdiSegment("HL", hlNode);
//                }
//
//                // Process PAT Segment within Loop2000C
//                JsonNode patNode = loop2000CNode.path("PAT");
//                if (!patNode.isMissingNode()) { // Check if the SBR segment exists within Loop2000C
//                    processEdiSegment("PAT", patNode);
//                }
//            }
//            // Process LOOP2010CA Segment
//            JsonNode loop2010CANode = parentNode.path("Loop2010CA");
//            if (!loop2010CANode.isMissingNode()) { // Ensure the Loop2010CA node exists
//                // Process NM1 Segment within Loop2010CA
//                JsonNode nm1Node = loop2010CANode.path("NM1");
//                if (!nm1Node.isMissingNode()) { // Check if the NM1 segment exists within Loop2010CA
//                    processEdiSegment("NM1", nm1Node);
//                }
//                // Process N3 Segment within Loop2010CA
//                JsonNode n3Node = loop2010CANode.path("N3");
//                if (!n3Node.isMissingNode()) { // Check if the N3 segment exists within Loop2010CA
//                    processEdiSegment("N3", n3Node);
//                }
//
//                // Process N4 Segment within Loop2010CA
//                JsonNode n4Node = loop2010CANode.path("N4");
//                if (!n4Node.isMissingNode()) { // Check if the N4 segment exists within Loop2010CA
//                    processEdiSegment("N4", n4Node);
//                }
//                // Process DMG Segment within Loop2010CA
//                JsonNode dmgNode = loop2010CANode.path("DMG");
//                if (!dmgNode.isMissingNode()) { // Check if the DMG segment exists within Loop2010CA
//                    processEdiSegment("DMG", dmgNode);
//                }
//            }
//            return ResponseEntity.ok(ediBuilder.toString());
//
//        } catch (Exception e) {
//        e.printStackTrace();
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error converting JSON to EDI");
//    }
//    }
//        private static void processEdiSegment(String segmentName, JsonNode segmentNode) {
//            StringBuilder segmentBuilder = new StringBuilder(segmentName);
//            segmentNode.fields().forEachRemaining(field -> {
//                segmentBuilder.append("*").append(field.getValue().asText());
//            });
//            segmentBuilder.append("~");
//            System.out.println(segmentBuilder);
//        }
//}
//
