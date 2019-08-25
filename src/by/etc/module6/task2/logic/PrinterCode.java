package by.etc.module6.task2.logic;

public enum PrinterCode {
    TEXT,
    EMAIL,
    DATE,
    WORD;

    @Override
    public String toString(){
        return this.name().toLowerCase();
    }
}
