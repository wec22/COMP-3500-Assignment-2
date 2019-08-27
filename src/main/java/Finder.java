public class Finder {
    public Integer findMax(int[] intArray) {
        if (intArray == null || intArray.length == 0)
            return null;
        int result = intArray[0];
        for (int i: intArray) {
            if (i > result)
                result = i;
        }
        return result;
    }

    public Integer findMin(int[] intArray) {
        if (intArray == null || intArray.length == 0)
            return null;
        int result = intArray[0];
        for (int i: intArray) {
            if (i < result)
                result = i;
        }
        return result;
    }
}
