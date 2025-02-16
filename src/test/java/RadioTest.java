import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseVolume() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolume(10);
        radioVolume.increaseVolume();
        int expected = 10;
        int actual = radioVolume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radioVolume = new Radio();
        radioVolume.decreaseVolume();
        int expected = 0;
        int actual = radioVolume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetCurrentVolume() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolume(10);
        int expected = radioVolume.getCurrentVolume();
        int actual = radioVolume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolume(9);
        radioVolume.increaseVolume();
        int expected = 10;
        int actual = radioVolume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseCurrentVolume() {
        Radio radioVolume = new Radio();
        radioVolume.setCurrentVolume(9);
        radioVolume.decreaseVolume();
        int expected = 8;
        int actual = radioVolume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseChannel() {
        Radio radioChannel = new Radio();
        radioChannel.setCurrentChannel(10);
        radioChannel.increaseChannel();
        int expected = 0;
        int actual = radioChannel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseChannel() {
        Radio radioChannel = new Radio();
        radioChannel.decreaseChannel();
        int expected = 10;
        int actual = radioChannel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldGetChannel() {
        Radio radioChannel = new Radio();
        radioChannel.setCurrentChannel(10);
        int expected = radioChannel.getCurrentChannel();
        int actual = radioChannel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentChannel() {
        Radio radioChannel = new Radio();
        radioChannel.setCurrentChannel(9);
        radioChannel.increaseChannel();
        int expected = 10;
        int actual = radioChannel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseCurrentChannel() {
        Radio radioChannel = new Radio();
        radioChannel.setCurrentChannel(9);
        radioChannel.decreaseChannel();
        int expected = 8;
        int actual = radioChannel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }



}