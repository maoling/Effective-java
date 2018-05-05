package com.base.interview;
/**
 * http://www.jianshu.com/p/b2c5b3d6a356
 * @author maoling
 *
 */
public enum Season {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER
}

/*public final class Season extends Enum {

    public static Season[] values() {
        return (Season[])$VALUES.clone();
    }

    public static Season valueOf(String s) {
        return (Season)Enum.valueOf(Season, s);
    }

    private Season(String s, int i) {
        super(s, i);
    }

    public static final Season SPRING;
    public static final Season SUMMER;
    public static final Season AUTUMN;
    public static final Season WINTER;
    private static final Season $VALUES[];

    static {
        SPRING = new Season("SPRING", 0);
        SUMMER = new Season("SUMMER", 1);
        AUTUMN = new Season("AUTUMN", 2);
        WINTER = new Season("WINTER", 3);
        $VALUES = (new Season[] {
            SPRING, SUMMER, AUTUMN, WINTER
        });
    }
}*/