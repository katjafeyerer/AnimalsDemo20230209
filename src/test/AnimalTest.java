import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnimalTest {

    private Animal loewe;

    @BeforeEach
    void setUp() {
        loewe = new Animal("Fitim", 1, "Löwe", "Roarr");
    }

    @Test
    @DisplayName("Test Konstruktor")
    void testConstructor() {
        Animal mausi = new Animal("mausi", -1, "Maus", "piep");
        Assertions.assertEquals("mausi", mausi.getName());
        Assertions.assertEquals(0, mausi.getAge());
        Assertions.assertEquals("Maus", mausi.getSpecies());
        Assertions.assertEquals("piep", mausi.getAnimalLoud());
    }

    @Test
    void giveAnimalLoud() {
        Assertions.assertEquals("Roarr", loewe.getAnimalLoud());
    }

    @Test
    void getNameAndAge() {
        String expected = "Name: Fitim Alter: 1";
        String actual = loewe.getNameAndAge();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ageCategory() {
        Assertions.assertEquals("baby animal", loewe.ageCategory());
    }
}