package hexlet.code;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import java.util.Map;

public class Parser {
    public static Map<String, Object> parse(String fileContent, String fileExtension) throws Exception {
        if (fileExtension.equals("json")) {
            return parseJson(fileContent);
        } else if (fileExtension.equals("yaml") || fileExtension.equals("yml")) {
            return parseYaml(fileContent);
        }
        throw new Exception("File extension '" + fileExtension + "' is not supported!");
    }

    private static Map<String, Object> parseJson(String fileContent) throws Exception {
        ObjectMapper jsonObjectMapper = new ObjectMapper();
        return jsonObjectMapper.readValue(fileContent, new TypeReference<>() { });
    }

    private static Map<String, Object> parseYaml(String fileContent) throws Exception {
        ObjectMapper yamlObjectMapper = new YAMLMapper();
        return yamlObjectMapper.readValue(fileContent, new TypeReference<>() { });
    }
}
