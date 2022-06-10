package netology.ru;

public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation = minStation;


    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    // от 0 до 9
    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
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
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation++;
        }
    }
    // уменьшить на 1

    public void prev() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }

    //Проверка и установка значения от 0 до 100
    public void setCurrentVolume(int currentVolume) {


        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {

        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() { //Получение значения
        return currentVolume;
    }

    public void volumePlus() { // Увеличение +1 до 100
        if (currentVolume == maxVolume) {

        }
        currentVolume++;
    }

    public void volumeMin() { // Уменьшение -1 до 0
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume--;
    }


}
