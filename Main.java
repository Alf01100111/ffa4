public class Main {

    public static int StrToInt(String[][] strArray) throws MyArrayDataException{

        int result = 0;
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray[0].length; j++) {

                try {
                    result += Integer.parseInt(strArray[i][j]);
                } catch (MyArrayDataException e) {
                    throw new MyArrayDataException("не удаётся конвертировать строку в число", i, j, strArray[i][j]);
                }

//                if (Integer.parseInt(strArray[i][j]) == (int)Integer.parseInt(strArray[i][j])) {
//                    result += Integer.parseInt(strArray[i][j]);
//                }
//                else {
//                    throw new MyArrayDataException("не удаётся конвертировать строку в число", i, j, strArray[i][j]);
//                }

            }
        }
        return result;
    }

    public static void main(String[] args) throws MyArrayDataException {
        String[][] myArray = {{"1","2","3","4"}, {"1","2","3","4"},{"kl","2","3","4"}, {"1","2","3","4"}};
        System.out.println(StrToInt(myArray));
    }


}
