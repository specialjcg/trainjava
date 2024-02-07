package org.example;


import java.util.Arrays;

class BirdWatcher {
    private int[] birdsPerDay= {0, 2, 5, 3, 7, 8, 4};

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
return birdsPerDay;
    }

    public int getToday() {
return birdsPerDay[birdsPerDay.length-1];    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]++;    }

    public boolean hasDayWithoutBirds() {
return Arrays.stream(getLastWeek()).filter(x -> x == 0).count() > 0;
    }

    public int getCountForFirstDays(int numberOfDays) {
        return Arrays.stream(getLastWeek()).limit(numberOfDays).sum();
    }

    public int getBusyDays() {
        return (int) Arrays.stream(getLastWeek()).filter(x -> x > 4).count();
    }
}

