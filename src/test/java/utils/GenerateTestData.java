package utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

public class GenerateTestData {
    public static InputStream convertToInputStream(List<Map<String, String>> convertedData) throws Exception {
        ObjectMapper mapper = new ObjectMapper();


        String json = mapper.writeValueAsString(convertedData);


        return new ByteArrayInputStream(json.getBytes(StandardCharsets.UTF_8));
    }
}
