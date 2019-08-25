package by.etc.module4.aggegation_and_composition.task3;

import by.etc.module4.aggegation_and_composition.task3.components.City;
import by.etc.module4.aggegation_and_composition.task3.components.District;
import by.etc.module4.aggegation_and_composition.task3.components.Region;
import by.etc.module4.aggegation_and_composition.task3.components.State;

/**
 * Создать объект класса Государство, используя Область, Район, Город. Методы: вывести на консоль столицу, количество
 * областей, площадь, областные центры.
 */

public class AggregationAndComposition3 {
    public static void main(String[] args) {

        City lima = new City("Lima", 55, false, true);
        City minsk = new City("Minsk", 66, true, true);
        City paris = new City("Paris", 77, false, true);
        City hanoi = new City("Hanoi", 88, false, true);
        City dubai = new City("Dubai", 99, false, false);
        City ottawa = new City("Ottawa", 111, false, false);
        City london = new City("London", 122, false, false);
        City madrid = new City("Madrid", 133, false, false);
        City baghdad = new City("Baghdad", 144, false, false);
        City jakarta = new City("Jakarta", 100, false, true);
        City chicago = new City("Chicago", 155, false, false);
        City brussels = new City("Brussels", 166, false, true);


        District district4 = new District("Minsk", new City[]{minsk, ottawa});
        District district1 = new District("Stolin", new City[]{lima, chicago});
        District district2 = new District("Gantsevichi", new City[]{baghdad, brussels});
        District district3 = new District("Lyakhovichi", new City[]{dubai, hanoi});
        District district5 = new District("Bobruisk", new City[]{jakarta, madrid});
        District district6 = new District("Shklovsky", new City[]{paris, london});

        Region region1 = new Region("Minsk region", new District[]{district2, district4});
        Region region2 = new Region("Gomel region", new District[]{district5});
        Region region3 = new Region("Brest region", new District[]{district6});
        Region region4 = new Region("Grodno region", new District[]{district3});
        Region region5 = new Region("Vitebsk region", new District[]{district1});

        State bilirus = new State("Bilirus", new Region[]{region1, region2, region3, region4, region5});

        bilirus.capital();
        bilirus.numberOfRegions();
        bilirus.area();
        System.out.println("Regional centers: ");
        bilirus.regionalCenter();
    }
}
