package by.etc.module6.task4;

import by.etc.module6.task4.component.Port;
import by.etc.module6.task4.component.Ship;

import java.util.ArrayList;
import java.util.List;

/**
 * Корабли заходят в порт для загрузки/разгрузки контейнеров. Число контейнеров, находящихся в текущий момент в
 * порту и на корабле, должно быть неотрицательным и непревышающим заданную грузоподъемность судна и вместимость порта.
 * В порту работает несколько причалов. У одного причала может стоять один корабль. Корабль может загружаться у причала,
 * Разгружаться или выполнять оба действия.
 */

public class Task4 {
    public static void main(String[] args) {
        Port port = new Port(4, 5000, 1000);
        List<Ship> ships = new ArrayList<>();

        for (int i = 1; i <= 4; i++) {
            ships.add(new Ship("Ship " + i, 50, 2, port));
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 5; i <= 8; i++) {
            ships.add(new Ship("Ship " + i, 0, 300, port));
        }

        for (Ship ship : ships) {
            try {
                ship.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nShips task completed");
    }
}
