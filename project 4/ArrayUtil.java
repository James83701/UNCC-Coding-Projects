public class ArrayUtil {

    int[] intArray;

    public ArrayUtil() {
        intArray = new int[10];
    }

    public ArrayUtil(int[] passInArray) {
        intArray = passInArray;
    }

    public void setIntArray(int[] value) {
        intArray = value;
    }

    public int returnValue(int i) {
        return intArray[i];
    }

    public int minValue() {
        int tester = 0;
        if (intArray.length > 0) {
            tester = intArray[0];
            for (int i = 0; i < intArray.length; i++) {

                if (intArray[i] < tester) {
                    tester = intArray[i];
                }
            }

        }
        return tester;
    }

    public int maxValue() {
        int tester = 0;
        if (intArray.length > 0) {
            tester = intArray[0];
            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] > tester) {
                    tester = intArray[i];
                }
            }
        }
        return tester;
    }

    public int countUniqueIntegers() {
        
        int unique=0;
        if (intArray.length > 0) {
            
            for (int i = 0; i < intArray.length; i++) {
                boolean identifier = true;
                for (int k = 0; k < i; k++) {
                    if (intArray[i] == intArray[k]) {
                        identifier = false;
                        break;
                    }
                }
                    if (identifier) {
                        unique++;

                    }
            }
        }
        return unique;
    }
}
