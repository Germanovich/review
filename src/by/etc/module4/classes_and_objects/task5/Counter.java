package by.etc.module4.classes_and_objects.task5;

class Counter {
    int currentState;
    int max;
    int min;
    int step;

    public Counter() {
        this.currentState = this.min;
        this.max = 10;
        this.min = 0;
        this.step = 1;
    }

    public void setCurrentState(int currentState) {
        this.currentState = currentState;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public int getCurrentState() {
        return currentState;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public int getStep() {
        return step;
    }

    public void increase() {
        if (getCurrentState() < getMax()) {
            currentState += getStep();
        } else {
            System.out.println("Number > max");
        }
    }

    public void decrease() {
        if (getCurrentState() > getMin()) {
            currentState -= getStep();
        } else {
            System.out.println("Number < min");
        }
    }
}