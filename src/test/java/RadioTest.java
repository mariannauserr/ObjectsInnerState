import netology.ru.Radio;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio station = new Radio();

    @ParameterizedTest
    @CsvSource({"0,0", "1,1", "8,8", "9,9", "-1,0", "10,0"})
    public void setCurrentStationTest(int dataStation, int expected) {

        station.setCurrentStation(dataStation);

        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"0,1", "1,2", "9,0"})
    public void nextTest(int dataStation, int expected) {


        station.setCurrentStation(dataStation);
        station.next();

        int actual = station.getCurrentStation();

        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({"0,9", "1,0", "9,8"})
    public void prevTest(int dataStation, int expected) {


        station.setCurrentStation(dataStation);
        station.prev();

        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }

    Radio volume = new Radio();

    @ParameterizedTest
    @CsvSource({"0,0", "1,1", "8,8", "9,9", "-1,0", "98,98", "99,99", "100,100"})
    public void setCurrentVolumeTest(int dataVolume, int expected) {


        volume.setCurrentVolume(dataVolume);

        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({"0,1", "1,2", "9,10", "-1,1", "99,100", "98,99" })
    public void volumePlusTest(int dataVolume, int expected) {


        volume.setCurrentVolume(dataVolume);
        volume.volumePlus();

        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"0,0", "1,0", "10,9", "-1,0", "100,99", "99,98"})
    public void volumeMinTest(int dataVolume, int expected) {


        volume.setCurrentVolume(dataVolume);
        volume.volumeMin();

        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);
    }
}
