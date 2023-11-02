package hexlet.code;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static net.javacrumbs.jsonunit.JsonAssert.assertJsonEquals;
import static org.assertj.core.api.Assertions.assertThat;

public class DifferTest {
    private static String resultJsonFormat;
    private static String resultPlainFormat;
    private static String resultStylishFormat;
    private static Path filepathJson1;
    private static Path filepathJson2;
    private static Path filepathYaml1;
    private static Path filepathYaml2;

    @BeforeAll
    public static void beforeAll() throws Exception {
        resultJsonFormat = fileToString(getFilePath("resultJsonFormat.json"));
        resultPlainFormat = fileToString(getFilePath("resultPlainFormat.txt"));
        resultStylishFormat = fileToString(getFilePath("resultStylishFormat.txt"));

        filepathJson1 = getFilePath("file1.json");
        filepathJson2 = getFilePath("file2.json");
        filepathYaml1 = getFilePath("file1.yaml");
        filepathYaml2 = getFilePath("file2.yaml");
    }

    @Test
    public void differTestWithFormat() throws Exception {
        assertThat(Differ.generate(filepathJson1.toString(), filepathJson2.toString(), "stylish")).isEqualTo(resultStylishFormat);
        assertThat(Differ.generate(filepathYaml1.toString(), filepathYaml2.toString(), "stylish")).isEqualTo(resultStylishFormat);
        assertThat(Differ.generate(filepathJson1.toString(), filepathJson2.toString(), "plain")).isEqualTo(resultPlainFormat);
        assertThat(Differ.generate(filepathYaml1.toString(), filepathYaml2.toString(), "plain")).isEqualTo(resultPlainFormat);

        assertJsonEquals(Differ.generate(filepathJson1.toString(), filepathJson2.toString(), "json"), resultJsonFormat);
        assertJsonEquals(Differ.generate(filepathYaml1.toString(), filepathYaml2.toString(), "json"), resultJsonFormat);
    }

    @Test
    public void differTestWithoutFormat() throws Exception {
        assertThat(Differ.generate(filepathJson1.toString(), filepathJson2.toString())).isEqualTo(resultStylishFormat);
        assertThat(Differ.generate(filepathYaml1.toString(), filepathYaml2.toString())).isEqualTo(resultStylishFormat);
    }

    private static Path getFilePath(String filename) {
        return Paths.get("src/test/resources/fixtures/" + filename).toAbsolutePath().normalize();
    }

    private static String fileToString(Path filepath) throws Exception {
        return Files.readString(filepath).trim();
    }

}
