public class Radio {

    int currentVolume;
    int currentChannel;

    //увеличить громкость
    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;
        }
    }

    //уменьшить громкость
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }

    //получить текущую громкость
    public int getCurrentVolume() {
        return currentVolume;
    }

    //установить громкость
    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    //получить текущий канал
    public int getCurrentChannel() {
        return currentChannel;
    }

    //установить канал
    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    //следующий канал
    public void increaseChannel() {
        if (currentChannel < 10) {
            currentChannel = currentChannel + 1;
        } else {
            currentChannel = 0;
        }
    }

    //предыдущий канал
    public void decreaseChannel() {
        if (currentChannel > 0) {
            currentChannel = currentChannel - 1;
        } else {
            currentChannel = 10;
        }
    }


}