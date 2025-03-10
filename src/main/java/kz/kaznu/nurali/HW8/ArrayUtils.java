package kz.kaznu.nurali.HW8;

public class ArrayUtils {
    public static int checkArray(String[][] array) throws AppArraySizeException {
        for (int i=0; i<4; i++) {
            if (array.length != 4 || array[i].length != 4) {
                throw new AppArraySizeException("Массив должен иметь размер 4x4");
            }
        }
        return 0;
    }
    public static int calculateSum(String[][] array) throws AppArrayDataException{
        int sum=0;
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
                try{
                    sum+=Integer.parseInt(array[i][j]);
                }catch (NumberFormatException ex){
                    throw new AppArrayDataException("Некорректные данные в ячейке ["+i+"]["+j+"]: "+array[i][j]);
                }
            }
        }
        return sum;
    }
}
