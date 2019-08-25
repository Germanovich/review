package by.etc.module6.task4.component;

public class Ship extends Thread {
    private int containersToTake;
    private int containersToLeave;
    private final Port port;


    public Ship(String name, int containersToTake, int containersToLeave, Port port) {
        super(name);
        this.containersToTake = containersToTake;
        this.containersToLeave = containersToLeave;
        this.port = port;
        start();
    }

    @Override
    public void run() {
        boolean changes = false;

        try {
            while (true) {
                if (!changes) {
                    port.permissionCheck();
                }

                if (containersToLeave != 0 && containersToTake != 0) {
                    containersToTake--;
                    containersToLeave--;
                    changes = true;
                }
                else {
                    if (containersToLeave != 0) {
                        synchronized (port) {
                            if (port.getContainersCapacity() > port.getNumberOfContainers()) {
                                port.addContainer();
                                containersToLeave--;
                                changes = true;
                            }
                        }
                    }
                    else {
                        if (containersToTake != 0) {
                            synchronized (port) {
                                if (port.getNumberOfContainers() > 0) {
                                    port.takeContainer();
                                    containersToTake--;
                                    changes = true;
                                }
                            }
                        }
                        else {
                            port.returnPermission();
                            break;
                        }
                    }
                }

                if (changes) {
                    Thread.sleep(100);
                } else {
                    port.returnPermission();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}