class Utils {
    static int[] parseToArray (String line){
        String[] temp = line.split(" ");
        int[] result = new int[temp.length];
        for (int i = 0; i<temp.length;i++){
            result[i] = Integer.parseInt(temp[i]);
        }
        return result;
    }
}
