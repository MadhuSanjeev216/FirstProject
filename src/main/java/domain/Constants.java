package domain;

public class Constants {

    public static final int FIRST_SLAB = 0;
    public static final int SECOND_SLAB = 1;
    public static final int THIRD_SLAB = 2;
    public static final int INVALID_SLAB = -1;

    public static final int[] SLAB_TAX = {0, 2200, 10294, 32580};
    public static final int[] SLAB_MIN = {0, 22000, 89450, 190750};
    public static final int[] SLAB_MAX = {22000, 89450, 190750};
    public static final double[] SLAB_RATE = {0.1, 0.12, 0.22, 0.24};

    public static final int MAX_PERCENTAGE = 100;
}
