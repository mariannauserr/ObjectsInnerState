package netology.ru;

public class Radio {
    private int currentStation;
    private int currentVolume;

    // от 0 до 9
    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    //получить значение
    public int getCurrentStation() {
        return currentStation;
    }

    // увеличить на 1
    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }
    // уменьшить на 1

    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    //Проверка и установка значения от 0 до 10
    public void setCurrentVolume(int currentVolume) {


        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() { //Получение значения
        return currentVolume;
    }

    public void volumePlus() { // Увеличение +1 до 10
        if (currentVolume == 10) {
            return;
        }
        currentVolume++;
    }

    public void volumeMin() { // Уменьшение -1 до 0
        if (currentVolume == 0) {
            return;
        }
        currentVolume--;
    }


}
