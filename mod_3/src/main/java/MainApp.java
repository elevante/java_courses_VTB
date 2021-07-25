public class MainApp {
    public static void main(String[] args) {
        String[][] correct = {
                {"1", "1", "2", "3"},
                {"1", "2", "1", "2"},
                {"1", "2", "4", "4"},
                {"1", "2", "5", "4"}
        };
        try {
            System.out.println(array(correct));
        } catch (Exception e) {
            System.out.println("ignore");;
        }
    }

    public static int array(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            if (array[i].length != 4)
                throw new MyArraySizeException();
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException();
                }
            }
        }
        return sum;
    }
}