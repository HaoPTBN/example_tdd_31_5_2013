package org.training.tdd.test;

/**
 * Created by IntelliJ IDEA.
 * User: haopt
 * Date: 5/31/13
 * Time: 2:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class MathService {
    public static int methodAdd(String string) {
        int resultReturn = 0;
        if (string == null || string.equals("")) {
            resultReturn = 0;
        } else {

            string = string.replace("\n", ",");
            string = string.replace("//", "");
            string = string.replace(";", ",");
            String[] arrayString = string.split(",");
            int index = arrayString.length;
            for (int i = 0; i < index; i++) {
                if(!arrayString[i].equals("")){
                    int value = Integer.valueOf(arrayString[i]);
                    if(value>=0){
                        resultReturn += value;
                    }else{
                        System.out.println((new ExpectedException("Negatives not allowed: number negative = " + value)).getMessage());
                        return -1;
                    }
                }
            }
        }
        return resultReturn;
    }
}

