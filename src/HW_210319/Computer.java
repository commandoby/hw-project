package HW_210319;

import java.util.Random;

public class Computer {

    //Создаём переменные
    private String processorType;
    private int sizeRAM;
    private int hardDiscSpace;
    private boolean state;
    private boolean workingCapacity;
    private Random random = new Random();

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public int getSizeRAM() {
        return sizeRAM;
    }

    public void setSizeRAM(int sizeRAM) {
        this.sizeRAM = sizeRAM;
    }

    public int getHardDiscSpace() {
        return hardDiscSpace;
    }

    public void setHardDiscSpace(int hardDiscSpace) {
        this.hardDiscSpace = hardDiscSpace;
    }

    public Computer() {
        processorType = "i3";
        sizeRAM = 4;
        hardDiscSpace = 1000;
        state = false;
        workingCapacity = true;
    }

    public Computer(String processorType, int sizeRAM, int hardDiscSpace) {
        this.processorType = processorType;
        this.sizeRAM = sizeRAM;
        this.hardDiscSpace = hardDiscSpace;
        state = false;
        workingCapacity = true;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean isWorkingCapacity() {
        return workingCapacity;
    }

    public void setWorkingCapacity(boolean workingCapacity) {
        this.workingCapacity = workingCapacity;
    }

    //Методы работы с компьютером
    public void printState() {
        System.out.printf("Процессор: %s; RAM: %d ГБ; Жёсткий диск: %d ГБ. ", processorType, sizeRAM, hardDiscSpace);
        if (isState()) {
            System.out.println("Компьютер включён.");
        } else {
            System.out.println("Компьютер выключен.");
        }
    }

    public void on(byte random) {
        byte randomOn = (byte) this.random.nextInt(2);
        if (randomOn == random) {
            setState(true);
            System.out.println("Компьютер включён.");
        } else {
            setWorkingCapacity(false);
        }
    }

    public void off(byte random) {
        byte randomeOff = (byte) this.random.nextInt(2);
        if (randomeOff == random) {
            setState(false);
            System.out.println("Компьютер выключен.");
        } else {
            setWorkingCapacity(false);
        }
    }
}
