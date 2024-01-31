//package com.edi;
//import com.edi.Segments.*;
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import java.util.Iterator;
//import java.util.Map;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//
//@RestController
//@RequestMapping("/api")
//public class JsonToEDI {
// private static boolean isFirstField;
//    public static void main(String[] args) {
//
//        String jsonString = "[{"
//                // ISA Segment
//                + "\"ISA\": {"
//                + "    \"ISA01\": \"00\","
//                + "    \"ISA02\": \"          \","
//                + "    \"ISA03\": \"00\","
//                + "    \"ISA04\": \"          \","
//                + "    \"ISA05\": \"ZZ\","
//                + "    \"ISA06\": \"SENDERID4567891\","
//                + "    \"ISA07\": \"ZZ\","
//                + "    \"ISA08\": \"77034\","
//                + "    \"ISA09\": \"210102\","
//                + "    \"ISA10\": \"1200\","
//                + "    \"ISA11\": \"^\","
//                + "    \"ISA12\": \"00501\","
//                + "    \"ISA13\": \"00\","
//                + "    \"ISA14\": \"0\","
//                + "    \"ISA15\": \"T\","
//                + "    \"ISA16\": \":\""
//                + "},"
//                // GS Segment
//                + "\"GS\": {"
//                + "    \"GS01\": \"HC\","
//                + "    \"GS02\": \"SENDERID4567891\","
//                + "    \"GS03\": \"77034\","
//                + "    \"GS04\": \"20210102\","
//                + "    \"GS05\": \"1200\","
//                + "    \"GS06\": \"1\","
//                + "    \"GS07\": \"X\","
//                + "    \"GS08\": \"005010X222A1\""
//                + "},"
//                // ST Segment
//                + "\"ST\": {"
//                + "    \"ST01\": \"837\","
//                + "    \"ST02\": \"000000001\","
//                + "    \"ST03\": \"005010X222A1\""
//                + "},"
//                // BHT Segment
//                + "\"BHT\": {"
//                + "    \"BHT01\": \"0019\","
//                + "    \"BHT02\": \"00\","
//                + "    \"BHT03\": \"2223254003792\","
//                + "    \"BHT04\": \"20230118\","
//                + "    \"BHT05\": \"1200\","
//                + "    \"BHT06\": \"CH\""
//                + "},"
//                // Loop 1000A
//                + "\"Loop1000A\": {"
//                + "    \"NM1\": {"
//                + "        \"NM101\": \"41\","
//                + "        \"NM102\": \"2\","
//                + "        \"NM103\": \"PREMIUM BILLING SERVICES\","
//                + "        \"NM104\": \"\","
//                + "        \"NM105\": \"\","
//                + "        \"NM106\": \"\","
//                + "        \"NM107\": \"\","
//                + "        \"NM108\": \"\","
//                + "        \"NM109\": \"XX\","
//                + "        \"NM110\": \"123456789\""
//                + "    },"
//                + "    \"PER\": {"
//                + "        \"PER01\": \"IC\","
//                + "        \"PER02\": \"TOM CRUISE\","
//                + "        \"PER03\": \"TE\","
//                + "        \"PER04\": \"3055552222\""
//                + "    }"
//                + "},"
//                // Loop 1000B
//                + "\"Loop1000B\": {"
//                + "    \"NM1\": {"
//                + "        \"NM101\": \"40\","
//                + "        \"NM102\": \"2\","
//                + "        \"NM103\": \"\","
//                + "        \"NM104\": \"GEORGIA FAMILIES\","
//                + "        \"NM105\": \"\","
//                + "        \"NM106\": \"\","
//                + "        \"NM107\": \"\","
//                + "        \"NM108\": \"46\","
//                + "        \"NM109\": \"77034\""
//                + "    }"
//                + "},"
//                // Loop 2000A
//                + "\"Loop2000A\": {"
//                + "\"HL\": {"
//                + "\"HL01\": \"1\","
//                + "\"HL02\": \"20\","
//                + "\"HL03\": \"1\""
//                + "},"
//                + "\"PRV\": {"
//                + "\"PRV01\": \"BI\","
//                + "\"PRV02\": \"PXC\","
//                + "\"PRV03\": \"453088947A\""
//                + "}"
//                + "},"
//                // Loop 2010AA
//                + "\"Loop2010AA\": {"
//                + "\"NM1\": {"
//                + "\"NM101\": \"85\","
//                + "\"NM102\": \"2\","
//                + "\"NM103\": \"LGREEN20\","
//                + "\"NM108\": \"XX\","
//                + "\"NM109\": \"9876543210\""
//                + "},"
//                + "\"N3\": {"
//                + "\"N301\": \"234 SEAWAY ST\""
//                + "},"
//                + "\"N4\": {"
//                + "\"N401\": \"MIAMI\","
//                + "\"N402\": \"FL\","
//                + "\"N403\": \"33111\""
//                + "},"
//                + "\"REF\": {"
//                + "\"REF01\": \"EI\","
//                + "\"REF02\": \"587654321\""
//                + "}"
//                + "},"
//                // Loop 2000B
//                + "\"Loop2000B\": {"
//                + "\"HL\": {"
//                + "\"HL01\": \"2\","
//                + "\"HL02\": \"1\","
//                + "\"HL03\": \"22\","
//                + "\"HL04\": \"1\""
//                + "},"
//                + "\"SBR\": {"
//                + "\"SBR01\": \"P\","
//                + "\"SBR02\": \"\","
//                + "\"SBR03\": \"2222-SJ\","
//                + "\"SBR04\": \"\","
//                + "\"SBR05\": \"\","
//                + "\"SBR06\": \"\","
//                + "\"SBR07\": \"\","
//                + "\"SBR08\": \"\","
//                + "\"SBR09\": \"CI\""
//                + "}"
//                + "},"
//                // Loop 2010BA
//                + "\"Loop2010BA\": {"
//                + "\"NM1\": {"
//                + "\"NM101\": \"IL\","
//                + "\"NM102\": \"1\","
//                + "\"NM103\": \"BRYANT\","
//                + "\"NM104\": \"AHMED\","
//                + "\"NM105\": \"\","
//                + "\"NM106\": \"\","
//                + "\"NM107\": \"\","
//                + "\"NM108\": \"MI\","
//                + "\"NM109\": \"222114962578\""
//                + "},"
//                + "\"DMG\": {"
//
//                + "\"DMG01\": \"D8\","
//                + "\"DMG02\": \"19740112\","
//                + "\"DMG03\": \"M\""
//                + "}"
//                + "},"
//                // Loop 2010BB
//                + "\"Loop2010BB\": {"
//                + "\"NM1\": {"
//                + "\"NM101\": \"PR\","
//                + "\"NM102\": \"2\","
//                + "\"NM103\": \"GEORGIA FAMILIES\","
//                + "\"NM104\": \"\","
//                + "\"NM105\": \"\","
//                + "\"NM106\": \"\","
//                + "\"NM107\": \"\","
//                + "\"NM108\": \"PI\","
//                + "\"NM109\": \"77034\""
//                + "},"
//                + "\"N4\": {"
//                + "\"N401\": \"TUCKER\","
//                + "\"N402\": \"GA\","
//                + "\"N403\": \"300855201\""
//                + "},"
//                + "\"REF\": {"
//                + "\"REF01\": \"G2\","
//                + "\"REF02\": \"KA6663\""
//                + "}"
//                + "},"
//                // Loop 2300
//                + "\"Loop2300\": {"
//                + "\"CLM\": {"
//                + "\"CLM00\": \"CLM\","
//                + "\"CLM01\": \"2223254003792\","
//                + "\"CLM02\": \"292.32\","
//                + "\"CLM05-1\": \"11\","
//                + "\"CLM05-2\": \"B\","
//                + "\"CLM05-03\": \"1\","
//                + "\"CLM09\": \"Y\","
//                + "\"CLM10\": \"A\","
//                + "\"CLM11\": \"Y\","
//                + "\"CLM12\": \"I\""
//                + "},"
//                // + "\"AllREF\": {"
//                + "\"REF\": {"
//                //Referral Number
//                + "\"REF01\": \"9F\","
//                + "\"REF02\": \"17312345600006351\""
//                + "},"
//                + "\"REF\": {"
//                //PriorAuthorization
//                + "\"REF01\": \"G1\","
//                + "\"REF02\": \"900019507620\""
//                + "},"
//                + "\"REF\": {"
//                //PayerClaimControlNumber
//                + "\"REF01\": \"1K\","
//                + "\"REF02\": \"50678356\""
//                + "},"
//                // + "},"
//                + "\"HI\": {"
//                + "\"HI01-1\": \"ABK\","
//                + "\"HI01-2\": \"0340\""
//                + "}, "
//                + "\"HI\": {"
//                + "\"HI01-1\": \"ABF\","
//                + "\"HI01-2\": \"V7389\""
//                + "}"
//                + "},"
//                // Loop 2310A
//                + "\"Loop2310A\": {"
//                + "\"NM1\": {"
//
//                + "\"NM101\": \"DN\","
//                + "\"NM108\": \"XX\","
//                + "\"NM109\": \"9876543210\""
//                + "}"
//                + "},"
//                // Loop 2310B
//                + "\"Loop2310B\": {"
//                + "\"NM1\": {"
//
//                + "\"NM108\": \"XX\","
//                + "\"NM109\": \"9876543280\""
//                + "},"
//                + "\"PRV\": {"
//
//                + "\"PRV01\": \"AT\","
//                + "\"PRV02\": \"PXC\","
//                + "\"PRV03\": \"453088947A\""
//                + "}"
//                + "},"
//                // Loop 2320
//                + "\"Loop2320\": {"
//                + "\"AMT\": {"
//
//                + "\"AMT01\": \"D\","
//                + "\"AMT02\": \"12.23\""
//                + "},"
//                + "\"AMT\": {"
//                + "\"AMT01\": \"EAF\","
//                + "\"AMT02\": \"17.25\""
//                + "}"
//                + "},"
//                // Loop 2330A
//                + "\"Loop2330A\": {"
//                + "\"NM1\": {"
//
//                + "\"NM101\": \"IL\","
//                + "\"NM102\": \"1\","
//                + "\"NM103\": \"SMITH\","
//                + "\"NM104\": \"JANE\","
//                + "\"NM105\": \"\","
//                + "\"NM106\": \"\","
//                + "\"NM107\": \"\","
//                + "\"NM108\": \"MI\","
//                + "\"NM109\": \"222114962579\""
//                + "},"
//                + "\"REF\": {"
//
//                + "\"REF01\": \"SY\","
//                + "\"REF02\": \"123456789001\""
//                + "}"
//                + "},"
//                + "\"Loop2400\": ["
//                + "{"
//                + "\"LX\": {"
//
//                + "\"LX01\": \"1\""
//                + "},"
//                + "\"SV1\": {"
//
//                + "\"SV101-1\": \"HC\","
//                + "\"SV101-2\": \"99213\","
//                + "\"SV102\": \"40\","
//                + "\"SV103\": \"UN\","
//                + "\"SV104\": \"1\","
//                + "\"SV105\": \"11\","
//                + "\"SV107\": \"N\","
//                + "\"SV109\": \"Y\","
//                + "\"SV110\": \"Y\""
//                + "},"
//                + "\"SV5\": {"
//
//                + "\"SV105-1\": \"HC\","
//                + "\"SV105-2\": \"H2017\""
//                + "},"
//                + "\"DTP\": {"
//                //   + "\"DTP_ServiceDate\": {"
//
//                + "\"DTP01\": \"472\","
//                + "\"DTP02\": \"D8\","
//                + "\"DTP03\": \"20230903\""
//
//                + "}"
//                + "},"
//                + "{"
//                + "\"LX\": {"
//                + "\"LX01\": \"2\""
//                + "},"
//                + "\"SV1\": {"
//                + "\"SV100\": \"SV1\","
//                + "\"SV101-1\": \"HC\","
//                + "\"SV101-2\": \"99214\","
//                + "\"SV102\": \"60\","
//                + "\"SV103\": \"UN\","
//                + "\"SV104\": \"1\","
//                + "\"SV105\": \"15\","
//                + "\"SV107\": \"N\","
//                + "\"SV109\": \"Y\","
//                + "\"SV110\": \"Y\""
//                + "},"
//                + "\"SV5\": {"
//
//                + "\"SV105-1\": \"HC\","
//                + "\"SV105-2\": \"H0004\""
//                + "},"
//                + "\"DTP\": {"
//                //  + "\"DTP_ServiceDate\": {"
//                + "\"DTP00\": \"DTP\","
//                + "\"DTP01\": \"472\","
//                + "\"DTP02\": \"D8\","
//                + "\"DTP03\": \"20230903\""
//
//                + "}"
//                + "}"
//                + "],"
//                + "\"SE\": {"
//
//                + "\"SE01\": \"42\","
//                + "\"SE02\": \"000000001\""
//                + "},"
//                + "\"GE\": {"
//                + "\"GE01\": \"1\","
//                + "\"GE02\": \"1\""
//                + "},"
//                + "\"IEA\": {"
//                + "\"IEA01\": \"1\","
//                + "\"IEA02\": \"000000001\""
//                + "}"
//                + "}]";
//
//        // Convert JSON to EDI
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
//        try {
//            ObjectMapper objectMapper = new ObjectMapper();
//            JsonNode parentNode = objectMapper.readTree(jsonString);
//            StringBuilder ediBuilder = new StringBuilder();
//
//            if (parentNode.isArray()) {
//                for (JsonNode node : parentNode) {
//                    convertNodeToEdi(node, ediBuilder,null, true);
//                   // ediBuilder.append("~\n");
//                }
//            }
//
//            String ediString = ediBuilder.toString();
//            return ResponseEntity.ok(ediString);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error converting JSON to EDI");
//        }
//    }
//
//    // Recursive method to convert each JSON node to EDI format
//    private static void convertNodeToEdi(JsonNode node, StringBuilder ediBuilder, String segmentName, boolean isFirstField) {
//        if (node.isObject()) {
//            String currentSegmentName = node.fieldNames().next(); // Get the segment name
//            if (segmentName != null && !segmentName.startsWith("Loop")) {
//                ediBuilder.append(segmentName);  // Append segment separator
//            }
//            // If the node is an object, iterate over its fields
//            for (Iterator<Map.Entry<String, JsonNode>> fields = node.fields(); fields.hasNext(); ) {
//                Map.Entry<String, JsonNode> field = fields.next();
//                ediBuilder.append("*");
//                if (!isFirstField) {
//                    ediBuilder.append("*");
//                }
//                // Append segment or data element identifier
//                // ediBuilder.append(field.getKey());
//
//                // Recursively process the value of each field
//                convertNodeToEdi(field.getValue(), ediBuilder, field.getKey(), isFirstField=true );
//
//                // Append element separator(*) after each field's value
//                // ediBuilder.append("*");
//            }
//            // Append segment terminator (~) after processing all fields
//            ediBuilder.append("~");
//            ediBuilder.append("\n");
//        } else if (node.isArray()) {
//            // If the node is an array, iterate over its elements, node.elements() returns an Iterator<JsonNode>
//            node.elements().forEachRemaining(arrayItem -> {
//                // Recursively process each element in the array
//                convertNodeToEdi(arrayItem, ediBuilder, segmentName, true);
//                // Append element separator after each array element
//               // ediBuilder.append("*");
//            });
//        } else {
//            // If the node is neither an object nor an array, it is a leaf node
//            ediBuilder.append(node.asText());
//        }
//    }
//}

