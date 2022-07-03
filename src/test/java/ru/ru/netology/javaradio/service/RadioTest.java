package ru.ru.netology.javaradio.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void shouldSetNumberRadioStation() {
        Radio numberStation = new Radio(10);

        numberStation.setCurrentStation(7);

        int expected = 7;
        int actual = numberStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetNumberStationAboveMax() {
        Radio numberStation = new Radio(10);

        numberStation.setCurrentStation(11);

        int expected = 0;
        int actual = numberStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextRadioStationNumber() {
        Radio numberStation = new Radio(10);
        numberStation.setCurrentStation(3);

        numberStation.next();

        int expected = 4;
        int actual = numberStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceRadioStationNumber() {
        Radio numberStation = new Radio(10);
        numberStation.setCurrentStation(5);

        numberStation.prev();

        int expected = 4;
        int actual = numberStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void maxRadioStationNumber() {
        Radio numberStation = new Radio(10);
        numberStation.setCurrentStation(9);

        numberStation.next();

        int expected = 0;
        int actual = numberStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minRadioStationNumber() {
        Radio numberStation = new Radio(10);
        numberStation.setCurrentStation(0);

        numberStation.prev();

        int expected = 9;
        int actual = numberStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minMinRadioStationNumber() {
        Radio numberStation = new Radio();
        numberStation.setCurrentStation(-1);
        int expected = 0;
        int actual = numberStation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetSoundVolume() {
        Radio soundLevel = new Radio();

        soundLevel.setCurrentVolume(7);

        int expected = 7;
        int actual = soundLevel.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio soundLevel = new Radio();

        soundLevel.setCurrentVolume(100);

        int expected = 100;
        int actual = soundLevel.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextSoundVolume() {
        Radio soundLevel = new Radio();

        soundLevel.setCurrentVolume(44);
        soundLevel.increaseVolume();

        int expected = 45;
        int actual = soundLevel.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextSoundVolume1() {
        Radio soundLevel = new Radio();

        soundLevel.setCurrentVolume(99);
        soundLevel.increaseVolume();

        int expected = 100;
        int actual = soundLevel.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextSoundVolume2() {
        Radio soundLevel = new Radio();

        soundLevel.setCurrentVolume(200);
        soundLevel.increaseVolume();

        int expected = 100;
        int actual = soundLevel.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }






    @Test
    public void reduceSoundVolume() {
        Radio soundLevel = new Radio();

        soundLevel.setCurrentVolume(44);
        soundLevel.reduceVolume();

        int expected = 43;
        int actual = soundLevel.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void reduceSoundVolume1() {
        Radio soundLevel = new Radio();

        soundLevel.setCurrentVolume(1);
        soundLevel.reduceVolume();

        int expected = 0;
        int actual = soundLevel.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void reduceSoundVolume2() {
        Radio soundLevel = new Radio();

        soundLevel.setCurrentVolume(-1);
        soundLevel.reduceVolume();

        int expected = 0;
        int actual = soundLevel.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxSoundVolume() {
        Radio soundLevel = new Radio();

        soundLevel.setCurrentVolume(100);

        int expected = 100;
        int actual = soundLevel.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxMaxSoundVolume() {
        Radio soundLevel = new Radio();

        soundLevel.setCurrentVolume(101);

        int expected = 100;
        int actual = soundLevel.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void minSoundVolume() {
        Radio soundLevel = new Radio();

        soundLevel.setCurrentVolume(0);

        int expected = 0;
        int actual = soundLevel.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void minMinSoundVolume() {
        Radio soundLevel = new Radio();

        soundLevel.setCurrentVolume(-1);


        int expected = 0;
        int actual = soundLevel.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }


}