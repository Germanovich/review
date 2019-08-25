package by.etc.module4.classes_and_objects.task7;

class Triangle {
    double x0;
    double y0;
    double AB;
    double AC;
    double BC;
    double s;
    double p;
    double angleA;
    double angleB;
    double angleC;

    Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        AB = GetSideAB(x1, y1, x2, y2);
        BC = GetSideBC(x2, y2, x3, y3);
        AC = GetSideAC(x3, y3, x1, y1);
        p = GetPerimeter(AB, BC, AC);
        s = Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) / 2;
        x0 = GetX0(x1, x2, x3);
        y0 = GetY0(y1, y2, y3);
        angleA = GetAngleA(AB, BC, AC);
        angleB = GetAngleB(AB, BC, AC);
        angleC = GetAngleC(AB, BC, AC);
    }

    double GetSideAB(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    double GetSideBC(double x1, double y1, double x3, double y3) {
        return Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
    }

    double GetSideAC(double x3, double y3, double x2, double y2) {
        return Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
    }

    double GetPerimeter(double AB, double BC, double AC) {
        return AB + BC + AC;
    }

    double GetX0(double x1, double x2, double x3) {
        return (x1 + x2 + x3) / 3;
    }

    double GetY0(double y1, double y2, double y3) {
        return (y1 + y2 + y3) / 3;
    }

    double GetAngleA(double AB, double BC, double AC) {
        return Math.acos((AB * AB + AC * AC - BC * BC) / (2 * AB * AC)) * 180 / Math.PI;
    }

    double GetAngleB(double AB, double BC, double AC) {
        return Math.acos((AB * AB + BC * BC - AC * AC) / (2 * AB * BC)) * 180 / Math.PI;
    }

    double GetAngleC(double AB, double BC, double AC) {
        return Math.acos((BC * BC + AC * AC - AB * AB) / (2 * BC * AC)) * 180 / Math.PI;
    }
}
